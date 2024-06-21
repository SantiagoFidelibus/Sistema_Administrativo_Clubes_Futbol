/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menuusages;

import Containers.ContenedoraEmpleado;
import Mail.Correos;
import MenuIU.Menu;
import Model.Cargo;
import Model.Categoria;
import Model.Empleado;
import Register.RegistroExitoso;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class InfoEmpleado extends JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form InfoEmpleado
     */
    public InfoEmpleado(int legajo) {
        initComponents();
        setTitle("Administracion Acantilados FC");
        try{
            File iconFile = new File("src/com/images/LOGO1.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        TimeUpdater timeUpdater = new TimeUpdater(timeText);
        timeUpdater.start();
        legajoTxt.setDisabledTextColor(Color.BLACK);
        legajoTxt.setText(String.valueOf(legajo));
        legajoTxt.setEditable(false);
        legajoTxt.setForeground(Color.black);
        setDate();
        for (Cargo cargo : Cargo.values()) {
            cargoBox.addItem(String.valueOf(cargo));
        }
        nombreTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nombreTxt.getText().equals("Ingrese el nombre")) {
                    nombreTxt.setText("");
                    nombreTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nombreTxt.getText().equals("")) {
                    nombreTxt.setText("Ingrese el nombre");
                    nombreTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega FocusListener para apellidoTxt
        apellidoTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (apellidoTxt.getText().equals("Ingrese el apellido")) {
                    apellidoTxt.setText("");
                    apellidoTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (apellidoTxt.getText().equals("")) {
                    apellidoTxt.setText("Ingrese el apellido");
                    apellidoTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega FocusListener para dniTxt
        dniTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (dniTxt.getText().equals("Ingrese el documento")) {
                    dniTxt.setText("");
                    dniTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (dniTxt.getText().equals("")) {
                    dniTxt.setText("Ingrese el documento");
                    dniTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega FocusListener para emailTxt
        emailTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (emailTxt.getText().equals("Ingrese el email")) {
                    emailTxt.setText("");
                    emailTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (emailTxt.getText().equals("")) {
                    emailTxt.setText("Ingrese el email");
                    emailTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega FocusListener para fechaNacTxt
        fechaNacTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (fechaNacTxt.getText().equals("dd/mm/aaaa")) {
                    fechaNacTxt.setText("");
                    fechaNacTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (fechaNacTxt.getText().equals("")) {
                    fechaNacTxt.setText("dd/mm/aaaa");
                    fechaNacTxt.setForeground(Color.gray);
                }
            }
        });



// Agrega ActionListener para categoriaBox
        cargoBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreTxt.requestFocus();
            }
        });

// Muestra las opciones del ComboBox al presionar Enter
        cargoBox.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "showPopup");
        cargoBox.getActionMap().put("showPopup", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargoBox.showPopup();
            }
        });
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InfoSocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(InfoSocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InfoSocio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(InfoSocio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText(dia+" de "+meses[month -1]+" de "+year);
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new JPanel();
        exitMenu1 = new JPanel();
        header = new JPanel();
        administracionTxt = new JLabel();
        dateText = new JLabel();
        timeText = new JLabel();
        ventana1 = new JPanel();
        titulo = new JLabel();
        nombre = new JLabel();
        nombreTxt = new JTextField();
        nombreSep = new JSeparator();
        apellido = new JLabel();
        apellidoTxt = new JTextField();
        apellidoSep = new JSeparator();
        dni = new JLabel();
        dniTxt = new JTextField();
        dniSep = new JSeparator();
        legajo = new JLabel();
        legajoTxt = new JTextField();
        legajoSep = new JSeparator();
        email = new JLabel();
        emailTxt = new JTextField();
        emailSep = new JSeparator();
        fechaNac = new JLabel();
        fechaNacTxt = new JTextField();
        fechaNacSep = new JSeparator();
        cargo = new JLabel();
        cargoBox = new JComboBox<>();
        registerBtn = new JPanel();
        registerTxt = new JLabel();
        jLabel1 = new JLabel();
        exitMenu = new JPanel();
        exitBtn = new JPanel();
        exitTxt = new JLabel();
        emailSep1 = new JSeparator();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background1.setBackground(new Color(255, 255, 255));
        background1.setLayout(new AbsoluteLayout());

        exitMenu1.setBackground(new Color(255, 255, 255));
        exitMenu1.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                exitMenu1MouseDragged(evt);
            }
        });
        exitMenu1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                exitMenu1MousePressed(evt);
            }
        });
        exitMenu1.setLayout(new AbsoluteLayout());
        background1.add(exitMenu1, new AbsoluteConstraints(0, 0, 580, -1));

        header.setBackground(new Color(50, 115, 153));
        header.setLayout(new AbsoluteLayout());

        administracionTxt.setFont(new Font("Roboto", 1, 18)); // NOI18N
        administracionTxt.setForeground(new Color(255, 255, 255));
        administracionTxt.setHorizontalAlignment(SwingConstants.CENTER);
        administracionTxt.setText("EMPLEADOS");
        header.add(administracionTxt, new AbsoluteConstraints(38, 40, -1, 32));

        dateText.setFont(new Font("Roboto", 1, 30)); // NOI18N
        dateText.setForeground(new Color(255, 255, 255));
        dateText.setHorizontalAlignment(SwingConstants.CENTER);
        dateText.setText("{dayname} {day} de {month} de {year} ");
        header.add(dateText, new AbsoluteConstraints(38, 90, -1, -1));

        timeText.setFont(new Font("Roboto", 1, 30)); // NOI18N
        timeText.setForeground(new Color(255, 255, 255));
        timeText.setHorizontalAlignment(SwingConstants.CENTER);
        header.add(timeText, new AbsoluteConstraints(410, 40, 160, 40));

        background1.add(header, new AbsoluteConstraints(0, 40, 600, 160));

        ventana1.setBackground(new Color(255, 255, 255));
        ventana1.setPreferredSize(new Dimension(599, 720));
        ventana1.setLayout(new AbsoluteLayout());

        titulo.setFont(new Font("Roboto Black", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setText("AGREGAR NUEVO EMPLEADO");
        ventana1.add(titulo, new AbsoluteConstraints(0, 230, 600, 50));

        nombre.setFont(new Font("Roboto", 1, 14)); // NOI18N
        nombre.setText("NOMBRE");
        ventana1.add(nombre, new AbsoluteConstraints(60, 320, -1, -1));

        nombreTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        nombreTxt.setForeground(new Color(153, 153, 153));
        nombreTxt.setText("Ingrese el nombre");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        nombreTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                nombreTxtKeyTyped(evt);
            }
        });
        ventana1.add(nombreTxt, new AbsoluteConstraints(60, 340, 180, 30));
        ventana1.add(nombreSep, new AbsoluteConstraints(60, 370, 180, 10));

        apellido.setFont(new Font("Roboto", 1, 14)); // NOI18N
        apellido.setText("APELLIDO");
        ventana1.add(apellido, new AbsoluteConstraints(60, 400, -1, -1));

        apellidoTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        apellidoTxt.setForeground(new Color(153, 153, 153));
        apellidoTxt.setText("Ingrese el apellido");
        apellidoTxt.setBorder(null);
        apellidoTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                apellidoTxtMousePressed(evt);
            }
        });
        apellidoTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        apellidoTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                apellidoTxtKeyTyped(evt);
            }
        });
        ventana1.add(apellidoTxt, new AbsoluteConstraints(60, 420, 180, 30));
        ventana1.add(apellidoSep, new AbsoluteConstraints(60, 450, 180, 10));

        dni.setFont(new Font("Roboto", 1, 14)); // NOI18N
        dni.setText("DOCUMENTO");
        ventana1.add(dni, new AbsoluteConstraints(60, 480, -1, -1));

        dniTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        dniTxt.setForeground(new Color(153, 153, 153));
        dniTxt.setText("Ingrese el documento");
        dniTxt.setBorder(null);
        dniTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                dniTxtMousePressed(evt);
            }
        });
        dniTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dniTxtActionPerformed(evt);
            }
        });
        dniTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                dniTxtKeyTyped(evt);
            }
        });
        ventana1.add(dniTxt, new AbsoluteConstraints(60, 500, 180, 30));
        ventana1.add(dniSep, new AbsoluteConstraints(60, 530, 180, 10));

        legajo.setFont(new Font("Roboto", 1, 14)); // NOI18N
        legajo.setText("LEGAJO");
        ventana1.add(legajo, new AbsoluteConstraints(60, 560, -1, -1));

        legajoTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        legajoTxt.setForeground(new Color(153, 153, 153));
        legajoTxt.setText("Ingrese el legajo");
        legajoTxt.setBorder(null);
        legajoTxt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        legajoTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                legajoTxtMousePressed(evt);
            }
        });
        legajoTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                legajoTxtActionPerformed(evt);
            }
        });
        legajoTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                legajoTxtKeyTyped(evt);
            }
        });
        ventana1.add(legajoTxt, new AbsoluteConstraints(60, 580, 180, 30));
        ventana1.add(legajoSep, new AbsoluteConstraints(60, 610, 180, 10));

        email.setFont(new Font("Roboto", 1, 14)); // NOI18N
        email.setText("CORREO ELECTRONICO");
        ventana1.add(email, new AbsoluteConstraints(360, 320, -1, -1));

        emailTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        emailTxt.setForeground(new Color(153, 153, 153));
        emailTxt.setText("Ingrese el email");
        emailTxt.setBorder(null);
        emailTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                emailTxtMousePressed(evt);
            }
        });
        emailTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        ventana1.add(emailTxt, new AbsoluteConstraints(360, 340, 180, 30));
        ventana1.add(emailSep, new AbsoluteConstraints(360, 450, 180, 10));

        fechaNac.setFont(new Font("Roboto", 1, 14)); // NOI18N
        fechaNac.setText("FECHA DE NACIMIENTO");
        ventana1.add(fechaNac, new AbsoluteConstraints(360, 400, -1, -1));

        fechaNacTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        fechaNacTxt.setForeground(new Color(153, 153, 153));
        fechaNacTxt.setText("dd/mm/aaaa");
        fechaNacTxt.setBorder(null);
        fechaNacTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                fechaNacTxtMousePressed(evt);
            }
        });
        fechaNacTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                fechaNacTxtActionPerformed(evt);
            }
        });
        ventana1.add(fechaNacTxt, new AbsoluteConstraints(360, 420, 180, 30));
        ventana1.add(fechaNacSep, new AbsoluteConstraints(360, 530, 180, 10));

        cargo.setFont(new Font("Roboto", 1, 14)); // NOI18N
        cargo.setText("CARGO");
        ventana1.add(cargo, new AbsoluteConstraints(360, 470, -1, -1));

        cargoBox.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cargoBox.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                cargoBoxMousePressed(evt);
            }
        });
        ventana1.add(cargoBox, new AbsoluteConstraints(360, 500, 180, 30));

        registerBtn.setBackground(new Color(50, 115, 153));

        registerTxt.setFont(new Font("Roboto Light", 1, 18)); // NOI18N
        registerTxt.setForeground(new Color(255, 255, 255));
        registerTxt.setHorizontalAlignment(SwingConstants.CENTER);
        registerTxt.setText("REGISTRAR");
        registerTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                registerTxtMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                registerTxtMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                registerTxtMouseExited(evt);
            }
        });

        GroupLayout registerBtnLayout = new GroupLayout(registerBtn);
        registerBtn.setLayout(registerBtnLayout);
        registerBtnLayout.setHorizontalGroup(
            registerBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(registerTxt, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        registerBtnLayout.setVerticalGroup(
            registerBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(registerTxt, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ventana1.add(registerBtn, new AbsoluteConstraints(310, 660, 240, 50));

        jLabel1.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Volver al Menu");
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        ventana1.add(jLabel1, new AbsoluteConstraints(60, 670, -1, -1));

        exitMenu.setBackground(new Color(255, 255, 255));
        exitMenu.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                exitMenuMouseDragged(evt);
            }
        });
        exitMenu.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                exitMenuMousePressed(evt);
            }
        });
        exitMenu.setLayout(new AbsoluteLayout());

        exitBtn.setBackground(new Color(255, 255, 255));

        exitTxt.setBackground(new Color(0, 0, 0));
        exitTxt.setFont(new Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        GroupLayout exitBtnLayout = new GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        exitMenu.add(exitBtn, new AbsoluteConstraints(560, 0, -1, -1));

        ventana1.add(exitMenu, new AbsoluteConstraints(0, 0, 600, 40));
        ventana1.add(emailSep1, new AbsoluteConstraints(360, 370, 180, 10));

        background1.add(ventana1, new AbsoluteConstraints(0, 0, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(background1, GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(background1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenu1MouseDragged(MouseEvent evt) {//GEN-FIRST:event_exitMenu1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_exitMenu1MouseDragged

    private void exitMenu1MousePressed(MouseEvent evt) {//GEN-FIRST:event_exitMenu1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_exitMenu1MousePressed

    private void jLabel1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void registerTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseExited
        registerBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_registerTxtMouseExited

    private void registerTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseEntered
        registerBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_registerTxtMouseEntered

    private void registerTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseClicked
        ContenedoraEmpleado contenedoraEmpleado = new ContenedoraEmpleado();

        Correos mail = new Correos();
        try {
            contenedoraEmpleado.cargarEmpleadosDeJson("Empleados.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dateOfBirthStr = fechaNacTxt.getText();
        String email = emailTxt.getText();
        LocalDate dateOfBirth = parseDate(dateOfBirthStr);
        String selectedCargoString = cargoBox.getSelectedItem().toString();
        String dniStr = dniTxt.getText();
        String contraseña= legajo.getText()+selectedCargoString;
        // Crear el mapa de cargo
        Map<String, Cargo> cargoMap = new HashMap<>();
        for (Cargo cargo : Cargo.values()) {
            cargoMap.put(cargo.toString(), cargo);
        }

        // Obtener el cargo seleccionada del mapa
        Cargo selectedCargo = cargoMap.get(selectedCargoString);

        if (isAnyFieldEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "La dirección de Email no es válida, ingrese nuevamente.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (dateOfBirth == null) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento no es válida. Use el formato dd/MM/yyyy.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (dniStr.length() != 8) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 caracteres.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if(!isValidDni(Integer.parseInt(dniTxt.getText()))){
            JOptionPane.showMessageDialog(this, "El DNI ya se encuentra registrado.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        }else {
            try {
                Empleado nuevoEmpleado = new Empleado(
                    nombreTxt.getText(),
                    apellidoTxt.getText(),
                    Integer.parseInt(dniStr),
                    Integer.parseInt(legajoTxt.getText()), // Temporal placeholder para legajo, será asignado en `alta`
                    emailTxt.getText(),
                    fechaNacTxt.getText(),
                      contraseña,
                    selectedCargo,
                    true
                );
                contenedoraEmpleado.alta(nuevoEmpleado);
                contenedoraEmpleado.guardarEmpleadosEnJson("Empleados.json");

                new Thread(() -> {
                    try {
                        mail.CorreoBienvenida(email, nombreTxt.getText());
                    } catch (Exception e) {
                        e.printStackTrace();
                        // Manejo de errores durante el envío del correo
                    }
                }).start();

                // Barra de carga antes de mandar a registro exitoso (Opcional)
                RegistroExitoso regExitoso = new RegistroExitoso();
                regExitoso.setVisible(true);
                regExitoso.pack();
                regExitoso.setLocationRelativeTo(null);

                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de registro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_registerTxtMouseClicked

    private void cargoBoxMousePressed(MouseEvent evt) {//GEN-FIRST:event_cargoBoxMousePressed
        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }


    }//GEN-LAST:event_cargoBoxMousePressed

    private void fechaNacTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_fechaNacTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacTxtActionPerformed

    private void fechaNacTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_fechaNacTxtMousePressed

        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("dd/mm/aaaa")) {
            fechaNacTxt.setText("");
            fechaNacTxt.setForeground(Color.black);
        }

    }//GEN-LAST:event_fechaNacTxtMousePressed

    private void emailTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void emailTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_emailTxtMousePressed
        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("Ingrese el email")) {
            emailTxt.setText("");
            emailTxt.setForeground(Color.black);
        }

        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }


    }//GEN-LAST:event_emailTxtMousePressed

    private void legajoTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_legajoTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_legajoTxtKeyTyped

    private void legajoTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_legajoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoTxtActionPerformed

    private void legajoTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_legajoTxtMousePressed
        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("Ingrese el legajo")) {
            legajoTxt.setText("");
            legajoTxt.setForeground(Color.black);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }


    }//GEN-LAST:event_legajoTxtMousePressed

    private void dniTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_dniTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_dniTxtKeyTyped

    private void dniTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_dniTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniTxtActionPerformed

    private void dniTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_dniTxtMousePressed
        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("Ingrese el documento")) {
            dniTxt.setText("");
            dniTxt.setForeground(Color.black);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }



    }//GEN-LAST:event_dniTxtMousePressed

    private void apellidoTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_apellidoTxtKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_apellidoTxtKeyTyped

    private void apellidoTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void apellidoTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMousePressed
        if (apellidoTxt.getText().equals("Ingrese el apellido")) {
            apellidoTxt.setText("");
            apellidoTxt.setForeground(Color.black);
        }
        if (nombreTxt.getText().equals("")) {
            nombreTxt.setText("Ingrese el nombre");
            nombreTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("dd/mm/aaaa")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }



    }//GEN-LAST:event_apellidoTxtMousePressed

    private void nombreTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_nombreTxtKeyTyped

    private void nombreTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void nombreTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
        if (nombreTxt.getText().equals("Ingrese el nombre")) {
            nombreTxt.setText("");
            nombreTxt.setForeground(Color.black);
        }
        if (apellidoTxt.getText().equals("")) {
            apellidoTxt.setText("Ingrese el apellido");
            apellidoTxt.setForeground(Color.gray);
        }
        if (dniTxt.getText().equals("")) {
            dniTxt.setText("Ingrese el documento");
            dniTxt.setForeground(Color.gray);
        }
        if (legajoTxt.getText().equals("")) {
            legajoTxt.setText("Ingrese el legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if (emailTxt.getText().equals("")) {
            emailTxt.setText("Ingrese el email");
            emailTxt.setForeground(Color.gray);
        }

        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }



    }//GEN-LAST:event_nombreTxtMousePressed

    private void exitMenuMouseDragged(MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_exitMenuMouseDragged

    private void exitMenuMousePressed(MouseEvent evt) {//GEN-FIRST:event_exitMenuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_exitMenuMousePressed

    private void exitTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxtMousePressed

    public static boolean isValidEmail(String email) {
        // Expresión regular para validar el correo electrónico
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidDni(int dninuevo) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Leer el archivo JSON y convertirlo a un arreglo de enteros (DNIs)
           ContenedoraEmpleado aux = new ContenedoraEmpleado();
           aux.cargarEmpleadosDeJson("Empleados.json");
            Set<Integer> dniSet = new HashSet<>();
         for(Empleado e1 : aux.listar().values()){
             dniSet.add(e1.getDni());
         }

                if (dniSet.contains(dninuevo)) {
                    return false;
                }
                dniSet.add(dninuevo);
                return true;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para parsear y validar la fecha
    private LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    //Metodo para saber si algun campo quedo vacio
    private boolean isAnyFieldEmpty() {
        boolean anyFieldEmpty = nombreTxt.getText().isEmpty() || nombreTxt.getText().equals("Ingrese el nombre")
                || apellidoTxt.getText().isEmpty() || apellidoTxt.getText().equals("Ingrese el apellido")
                || dniTxt.getText().isEmpty() || dniTxt.getText().equals("Ingrese el documento")
                || legajoTxt.getText().isEmpty() || legajoTxt.getText().equals("Ingrese el legajo")
                || emailTxt.getText().isEmpty() || emailTxt.getText().equals("Ingrese el email")
                || fechaNacTxt.getText().isEmpty() || fechaNacTxt.getText().equals("dd/mm/aaaa");

        Object selectedCargo = cargoBox.getSelectedItem();
        if (selectedCargo == null || selectedCargo.toString().isEmpty()) {
            anyFieldEmpty = true;
        }

        return anyFieldEmpty;
    }
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel administracionTxt;
    private JLabel apellido;
    private JSeparator apellidoSep;
    private JTextField apellidoTxt;
    private JPanel background1;
    private JLabel cargo;
    private JComboBox<String> cargoBox;
    private JLabel dateText;
    private JLabel dni;
    private JSeparator dniSep;
    private JTextField dniTxt;
    private JLabel email;
    private JSeparator emailSep;
    private JSeparator emailSep1;
    private JTextField emailTxt;
    private JPanel exitBtn;
    private JPanel exitMenu;
    private JPanel exitMenu1;
    private JLabel exitTxt;
    private JLabel fechaNac;
    private JSeparator fechaNacSep;
    private JTextField fechaNacTxt;
    private JPanel header;
    private JLabel jLabel1;
    private JLabel legajo;
    private JSeparator legajoSep;
    private JTextField legajoTxt;
    private JLabel nombre;
    private JSeparator nombreSep;
    private JTextField nombreTxt;
    private JPanel registerBtn;
    private JLabel registerTxt;
    private JLabel timeText;
    private JLabel titulo;
    private JPanel ventana1;
    // End of variables declaration//GEN-END:variables
}
