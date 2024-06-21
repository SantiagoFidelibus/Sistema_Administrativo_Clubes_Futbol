package Webcam;

import IUEmpleado.IngresoSocios;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class WebCamScan extends JFrame {

    private Webcam webcam;
    private WebcamPanel panel;
    private JLabel cameraStatusLabel;
    private Runnable onScanComplete;

    public WebCamScan(Runnable onScanComplete) {
        super();
        this.onScanComplete = onScanComplete;
        initComponents();
        seleccionarPrimeraCamaraDisponible();
    }

    private void initComponents() {
        cameraStatusLabel = new JLabel("Estado de la Cámara: No seleccionada");
    }

    public void createAndShowGUI() {
        setTitle("WebCam for Scan AFC");
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel.setBackground(Color.WHITE);

        JButton selectCameraButton = new JButton("Seleccionar Cámara");
        configurarBoton(selectCameraButton);
        selectCameraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarCamara();
            }
        });
        controlPanel.add(selectCameraButton);

        ImageIcon icon = new ImageIcon("src/com/images/voltHoriz.png");
        JButton voltButton = new JButton(icon);
        voltButton.setPreferredSize(new Dimension(64, 64));
        voltButton.setBackground(new Color(50, 115, 153)); // Color RGB 50, 115, 153
        voltButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Cursor de mano
        voltButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panel != null) {
                    panel.setMirrored(!panel.isMirrored());
                }
            }
        });
        controlPanel.add(voltButton);
        JButton iniciarEscaneoButton = new JButton("Iniciar Escaneo");
        configurarBoton(iniciarEscaneoButton);
        iniciarEscaneoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarEscaneo();
            }
        });
        controlPanel.add(iniciarEscaneoButton);

        mainPanel.add(controlPanel, BorderLayout.NORTH);

        cameraStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cameraStatusLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        mainPanel.add(cameraStatusLabel, BorderLayout.CENTER);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.NORTH);

        setTitle("Visor de Webcam con Escaneo en Tiempo Real");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        try {
            File iconFile = new File("src/com/images/iconWebcam.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
        setSize(800, 600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarCamara();
            }
        });
    }

    private void configurarBoton(JButton button) {
        button.setPreferredSize(new Dimension(200, 64));
        button.setBackground(new Color(32, 73, 99));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Roboto", Font.PLAIN, 12));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void seleccionarPrimeraCamaraDisponible() {
        new Thread(new Runnable() {
            public void run() {
                List<Webcam> webcams = Webcam.getWebcams();
                if (!webcams.isEmpty()) {
                    abrirCamara(webcams.get(0)); // Abre la primera cámara automáticamente
                } else {
                    JOptionPane.showMessageDialog(WebCamScan.this, "No se encontraron cámaras disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }).start();
    }

    private void seleccionarCamara() {
        List<Webcam> webcams = Webcam.getWebcams();
        if (webcams.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron cámaras disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] cameraNames = new String[webcams.size()];
        for (int i = 0; i < webcams.size(); i++) {
            cameraNames[i] = webcams.get(i).getName();
        }

        String selectedCamera = (String) JOptionPane.showInputDialog(
                this,
                "Selecciona una cámara",
                "Selección de Cámara",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cameraNames,
                cameraNames[0]
        );

        if (selectedCamera != null) {
            // Verificar si la cámara seleccionada es diferente a la actualmente abierta
            if (webcam != null && webcam.getName().equals(selectedCamera) && webcam.isOpen()) {
                // La cámara seleccionada es la misma que ya está abierta, no hacer nada
                return;
            }

            for (Webcam cam : webcams) {
                if (cam.getName().equals(selectedCamera)) {
                    abrirCamara(cam);
                    break;
                }
            }
        }
    }

    private void abrirCamara(Webcam cam) {
        cerrarCamara(); // Cerrar la cámara actual si está abierta

        webcam = cam;
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.open();

        panel = new WebcamPanel(webcam);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);

        JPanel cameraPanel = new JPanel(new BorderLayout());
        cameraPanel.add(panel, BorderLayout.CENTER);

        getContentPane().add(cameraPanel, BorderLayout.CENTER);
        revalidate();

        cameraStatusLabel.setText("Cámara seleccionada: " + webcam.getName());
    }

    private void cerrarCamara() {
        if (webcam != null && webcam.isOpen()) {
            webcam.close();
            webcam = null; // Liberar la referencia a la cámara actual
            if (panel != null) {
                getContentPane().remove(panel.getParent());
                panel.stop(); // Detener el panel de la cámara
                panel = null; // Liberar la referencia al panel de la cámara
                repaint();
            }
            cameraStatusLabel.setText("Estado de la Cámara: No seleccionada");
        }
    }

    public void iniciarEscaneo() {
        Map<DecodeHintType, Object> hints = new HashMap<>();
        hints.put(DecodeHintType.POSSIBLE_FORMATS, Arrays.asList(BarcodeFormat.QR_CODE, BarcodeFormat.ITF));

        boolean isScanned = false;
        int maxAttempts = 10; // Número máximo de intentos para escanear
        int attempts = 0;

        while (!isScanned && attempts < maxAttempts) {
            BufferedImage image = webcam.getImage();
            if (image != null) {
                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                try {
                    Result result = new MultiFormatReader().decode(bitmap, hints);
                    String decodedText = result.getText();
                    System.out.println("Código decodificado: " + decodedText);
                    if(decodedText!=null){
                        escribirEnArchivo(decodedText);
                    cerrarCamara(); // Cierra la cámara y la ventana principal
                    isScanned = true;
                    this.dispose();
                    }

                    if (onScanComplete != null) {
                        onScanComplete.run(); // Ejecuta la tarea después de que el escaneo se complete
                    }
                } catch (NotFoundException ex) {
                    // No se encontró ningún código de barras o QR en la imagen
                    attempts++;
                }
            }
        }

        if (!isScanned) {
            JOptionPane.showMessageDialog(this, "No se encontró ningún código.", "Error de Escaneo", JOptionPane.ERROR_MESSAGE);
            cerrarCamara();
            IngresoSocios ingreso = new IngresoSocios();
            ingreso.setVisible(true);
            ingreso.pack();
            ingreso.setLocationRelativeTo(null);
            this.dispose();
        }
    }

    private void escribirEnArchivo(String texto) {
        String rutaArchivo = "src/com/temp/datoIngreso.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            writer.write(texto);
        } catch (IOException e) {
            e.printStackTrace();
            // Manejo de errores si no se puede escribir en el archivo
        }
    }
}
