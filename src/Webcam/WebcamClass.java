package Webcam;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.imageio.ImageIO;

import Menuusages.ModificarSocio;
import com.github.sarxos.webcam.*;
import com.google.zxing.*;
import com.google.zxing.client.j2se.*;
import com.google.zxing.common.*;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import Menuusages.InfoSocio;


public class WebcamClass extends JFrame {

    private Webcam webcam;
    private WebcamPanel panel;
    private JLabel cameraStatusLabel;
    private String legajo;
    private boolean isVerticalFlipped = false;
    private InfoSocio infosocio=null;
    private ModificarSocio modsocio=null;

    public WebcamClass(String legajo,  InfoSocio infosocio) {
        this.legajo = legajo;
        seleccionarPrimeraCamaraDisponible();
        this.infosocio=infosocio;
    }
    public WebcamClass(String legajo,  ModificarSocio modsocio) {
        this.legajo = legajo;
        seleccionarPrimeraCamaraDisponible();
        this.modsocio=modsocio;
    }

    public void createAndShowGUI() {
        setTitle("WebCam for Picture AFC");
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE); // Fondo blanco
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        controlPanel.setBackground(Color.WHITE); // Fondo blanco

        getContentPane().setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE); // Fondo blanco
        // Botón para seleccionar cámara
        JButton selectCameraButton = new JButton("Seleccionar Cámara");
        configurarBoton(selectCameraButton);
        selectCameraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarCamara();
            }
        });
        controlPanel.add(selectCameraButton);

        // Botón para capturar foto
        JButton captureButton = new JButton("Capturar Foto");
        configurarBoton(captureButton);
        captureButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                capturarFoto();
            }
        });
        controlPanel.add(captureButton);

        ImageIcon iconVertical = new ImageIcon("src/com/images/voltVert.png");
        JButton voltVerticalButton = new JButton(iconVertical);
        voltVerticalButton.setPreferredSize(new Dimension(64, 64));
        voltVerticalButton.setBackground(new Color(50, 115, 153));
        voltVerticalButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        voltVerticalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isVerticalFlipped = !isVerticalFlipped;
                if (panel != null) {

                    panel.repaint();
                }
            }
        });
        controlPanel.add(voltVerticalButton);
        // Botón para cambiar la visualización de la cámara
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




        mainPanel.add(controlPanel, BorderLayout.NORTH);

        cameraStatusLabel = new JLabel("Estado de la Cámara: No seleccionada");
        cameraStatusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cameraStatusLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        mainPanel.add(cameraStatusLabel, BorderLayout.CENTER);

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


        setSize(800, 600); // Tamaño ajustado
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                cerrarCamara();
                if(infosocio!=null) {
                    infosocio.setVisible(true);
                }
                if(modsocio!=null) {
                    modsocio.setVisible(true);
                }
            }
        });
    }
    private BufferedImage flipVertical(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage flippedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); // Usar un tipo estándar
        Graphics2D g = flippedImage.createGraphics();
        g.drawImage(image, 0, 0, width, height, 0, height, width, 0, null);
        g.dispose();
        return flippedImage;
    }
    private void configurarBoton(JButton button) {


        button.setPreferredSize(new Dimension(200, 64));
        button.setBackground(new Color(32, 73, 99)); // Fondo azul (RGB 32, 73, 99)
        button.setForeground(Color.BLACK); // Texto blanco
        button.setFont(new Font("Roboto", Font.PLAIN, 12));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


    }

    private void seleccionarPrimeraCamaraDisponible() {
        new Thread(new Runnable() {
            public void run() {
                List<Webcam> webcams = Webcam.getWebcams();
                if (!webcams.isEmpty()) {
                    abrirCamara(webcams.get(0)); // Abre la primera cámara automáticamente
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
            for (Webcam cam : webcams) {
                if (cam.getName().equals(selectedCamera)) {
                    abrirCamara(cam);
                    break;
                }
            }
        }
    }

    private void abrirCamara(Webcam cam) {
        cerrarCamara();
        webcam = cam;
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.open();

        panel = new WebcamPanel(webcam) {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isVerticalFlipped) {
                    try {
                        BufferedImage flippedImage = flipVertical(webcam.getImage());
                        g.drawImage(flippedImage, 0, 0, getWidth(), getHeight(), this);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
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
            if (panel != null) {
                getContentPane().remove(panel.getParent());
                repaint();
            }
            cameraStatusLabel.setText("Estado de la Cámara: No seleccionada");
        }
    }

    private void capturarFoto() {
        if (webcam != null && webcam.isOpen()) {
            BufferedImage image = webcam.getImage();
            if (image != null) {
                if (isVerticalFlipped) {
                    image = flipVertical(image);
                }
                try {
                    // Guardar la imagen con el nombre de legajo
                    String fileName = legajo + "_aux.png";

                    // Directorio donde se guardará la imagen
                    String directoryPath = "src/com/imagesPersonas/";
                    File directory = new File(directoryPath);
                    if (!directory.exists()) {
                        directory.mkdirs(); // Crea el directorio si no existe
                    }

                    // Guardar la imagen en el directorio especificado
                    File file = new File(directoryPath + fileName);
                    ImageIO.write(image, "PNG", file);

                    JOptionPane.showMessageDialog(this, "¡Foto capturada y guardada correctamente!", "Captura exitosa", JOptionPane.INFORMATION_MESSAGE);
                    if(infosocio!=null){
                        cerrarCamara();
                        this.dispose();
                        infosocio.setVisible(true);
                    } else if (modsocio!=null) {
                        cerrarCamara();
                        this.dispose();
                        modsocio.setVisible(true);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error al guardar la foto.", "Error", JOptionPane.ERROR_MESSAGE);
                    if(infosocio!=null){
                        cerrarCamara();
                        this.dispose();
                        infosocio.setVisible(true);
                    } else if (modsocio!=null) {
                        cerrarCamara();
                        this.dispose();
                        modsocio.setVisible(true);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se puede capturar la foto porque la cámara no está abierta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
