/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menuusages;

import java.awt.*;

import MenuIU.Menu;
import Webcam.WebcamClass;
import Model.Categoria;
import Mail.Correos;
import Model.Socio;

import java.awt.event.*;
import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.*;


import Containers.ContenedoraSocio;
import com.fasterxml.jackson.databind.ObjectMapper;
import rsdragdropfiles.RSDragDropFiles;

import static java.lang.Long.parseLong;

/**
 *
 * @author sanch
 */
public class ModificarSocio extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form ModificarSocio
     */
    LocalDate fechaVen;
    LocalDate fechaRe;
    public ModificarSocio(LocalDate fechaV,LocalDate fechaR, int legajo,String nombre, String apellido, int documento,String fechaNac,String email,long telefono,String domicilio, String genero, String ObraSocial, Categoria categoriaSeleccionada) {
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
        fechaVen = fechaV;
        fechaRe = fechaR;
        legajoTxt.setDisabledTextColor(Color.BLACK);
        legajoTxt.setText(String.valueOf(legajo));
        legajoTxt.setEditable(false);
        legajoTxt.setForeground(Color.black);

        fechaNacTxt.setText(fechaNac);
        fechaNacTxt.setForeground(Color.black);

        nombreTxt.setText(nombre);
        nombreTxt.setForeground(Color.black);

        apellidoTxt.setText(apellido);
        apellidoTxt.setForeground(Color.black);

        dniTxt.setText(String.valueOf(documento));
        dniTxt.setForeground(Color.black);

        emailTxt.setText(email);
        emailTxt.setForeground(Color.black);

        telefonoTxt.setText(String.valueOf(telefono));
        telefonoTxt.setForeground(Color.black);

        domicilioTxt.setText(domicilio);
        domicilioTxt.setForeground(Color.black);


        obraSocialTxt.setText(ObraSocial);
        obraSocialTxt.setForeground(Color.black);

        categoriaBox.setSelectedItem(categoriaSeleccionada);
        categoriaBox.setForeground(Color.black);

        generoComboBox.setSelectedItem(genero);
        generoComboBox.setForeground(Color.black);
        String filePath = "src/com/imagesPersonas/" + legajo + ".png";
        File file = new File(filePath);
        if (file.exists()) {
            ImageIcon icon = new ImageIcon(new ImageIcon(filePath).getImage().getScaledInstance(fotoUsuario.getWidth(), fotoUsuario.getHeight(), Image.SCALE_SMOOTH));
            fotoUsuario.setIcon(icon);
        }


        setDate();
        for (Categoria categoria : Categoria.values()) {
            categoriaBox.addItem(String.valueOf(categoria));
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

// Agrega FocusListener para telefonoTxt
        telefonoTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (telefonoTxt.getText().equals("Ingrese el numero de teléfono")) {
                    telefonoTxt.setText("");
                    telefonoTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (telefonoTxt.getText().equals("")) {
                    telefonoTxt.setText("Ingrese el numero de teléfono");
                    telefonoTxt.setForeground(Color.gray);
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

// Agrega FocusListener para domicilioTxt
        domicilioTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (domicilioTxt.getText().equals("Ingrese el domicilio")) {
                    domicilioTxt.setText("");
                    domicilioTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (domicilioTxt.getText().equals("")) {
                    domicilioTxt.setText("Ingrese el domicilio");
                    domicilioTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega FocusListener para obraSocialTxt
        obraSocialTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (obraSocialTxt.getText().equals("Ingrese la obra social")) {
                    obraSocialTxt.setText("");
                    obraSocialTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (obraSocialTxt.getText().equals("")) {
                    obraSocialTxt.setText("Ingrese la obra social");
                    obraSocialTxt.setForeground(Color.gray);
                }
            }
        });

// Agrega ActionListener para generoComboBox
        generoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obraSocialTxt.requestFocus();
            }
        });

// Muestra las opciones del ComboBox al presionar Enter
        generoComboBox.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "showPopup");
        generoComboBox.getActionMap().put("showPopup", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generoComboBox.showPopup();
            }
        });

// Agrega ActionListener para categoriaBox
        categoriaBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreTxt.requestFocus();
            }
        });

// Muestra las opciones del ComboBox al presionar Enter
        categoriaBox.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "showPopup");
        categoriaBox.getActionMap().put("showPopup", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                categoriaBox.showPopup();
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

        background = new javax.swing.JPanel();
        exitMenu = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        administracionTxt = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        timeText = new javax.swing.JLabel();
        panelVentanas = new javax.swing.JTabbedPane();
        ventana1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        nombreSep = new javax.swing.JSeparator();
        apellido = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        apellidoSep = new javax.swing.JSeparator();
        dni = new javax.swing.JLabel();
        dniTxt = new javax.swing.JTextField();
        dniSep = new javax.swing.JSeparator();
        legajo = new javax.swing.JLabel();
        legajoTxt = new javax.swing.JTextField();
        legajoSep = new javax.swing.JSeparator();
        email = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        emailSep = new javax.swing.JSeparator();
        telefono = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        telefonoSep = new javax.swing.JSeparator();
        fechaNac = new javax.swing.JLabel();
        fechaNacTxt = new javax.swing.JTextField();
        fechaNacSep = new javax.swing.JSeparator();
        domicilio = new javax.swing.JLabel();
        domicilioTxt = new javax.swing.JTextField();
        domicilioSep = new javax.swing.JSeparator();
        generoComboBox = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JLabel();
        obraSocial = new javax.swing.JLabel();
        obraSocialTxt = new javax.swing.JTextField();
        obraSocialSep = new javax.swing.JSeparator();
        categoria = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        modifBtn = new javax.swing.JPanel();
        modifTxt = new javax.swing.JLabel();
        recharg = new javax.swing.JLabel();
        Marco = new javax.swing.JLabel();
        fotoUsuario = new javax.swing.JLabel();
        cargarImgBtn = new javax.swing.JPanel();
        cargarImgTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitMenu.setBackground(new java.awt.Color(255, 255, 255));
        exitMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                exitMenuMouseDragged(evt);
            }
        });
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMenuMousePressed(evt);
            }
        });
        exitMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(0, 0, 0));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(exitBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        exitMenu.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, -1, -1));

        background.add(exitMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        header.setBackground(new java.awt.Color(50, 115, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        administracionTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        administracionTxt.setForeground(new java.awt.Color(255, 255, 255));
        administracionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administracionTxt.setText("SOCIOS");
        header.add(administracionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 40, -1, 32));

        dateText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("{dayname} {day} de {month} de {year} ");
        header.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 90, -1, -1));

        timeText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        timeText.setForeground(new java.awt.Color(255, 255, 255));
        timeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 170, 40));

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1280, 160));

        ventana1.setBackground(new java.awt.Color(255, 255, 255));
        ventana1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MODIFICAR SOCIO");
        ventana1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 280, 50));

        nombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nombre.setText("NOMBRE");
        ventana1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        nombreTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(153, 153, 153));
        nombreTxt.setText("Ingrese el nombre");
        nombreTxt.setBorder(null);
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreTxtMousePressed(evt);
            }
        });
        nombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxtActionPerformed(evt);
            }
        });
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTxtKeyTyped(evt);
            }
        });
        ventana1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 30));
        ventana1.add(nombreSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 180, 10));

        apellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        apellido.setText("APELLIDO");
        ventana1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        apellidoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(153, 153, 153));
        apellidoTxt.setText("Ingrese el apellido");
        apellidoTxt.setBorder(null);
        apellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoTxtMousePressed(evt);
            }
        });
        apellidoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTxtActionPerformed(evt);
            }
        });
        apellidoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoTxtKeyTyped(evt);
            }
        });
        ventana1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, 30));
        ventana1.add(apellidoSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 180, 10));

        dni.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        dni.setText("DOCUMENTO");
        ventana1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        dniTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dniTxt.setForeground(new java.awt.Color(153, 153, 153));
        dniTxt.setText("Ingrese el documento");
        dniTxt.setBorder(null);
        dniTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dniTxtMousePressed(evt);
            }
        });
        dniTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniTxtActionPerformed(evt);
            }
        });
        dniTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniTxtKeyTyped(evt);
            }
        });
        ventana1.add(dniTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 180, 30));
        ventana1.add(dniSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 180, 10));

        legajo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        legajo.setText("LEGAJO");
        ventana1.add(legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        legajoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        legajoTxt.setForeground(new java.awt.Color(153, 153, 153));
        legajoTxt.setText("Ingrese el legajo");
        legajoTxt.setBorder(null);
        legajoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        legajoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                legajoTxtMousePressed(evt);
            }
        });
        legajoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoTxtActionPerformed(evt);
            }
        });
        legajoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                legajoTxtKeyTyped(evt);
            }
        });
        ventana1.add(legajoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 180, 30));
        ventana1.add(legajoSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 180, 10));

        email.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        email.setText("CORREO ELECTRONICO");
        ventana1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        emailTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(153, 153, 153));
        emailTxt.setText("Ingrese el email");
        emailTxt.setBorder(null);
        emailTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                emailTxtMousePressed(evt);
            }
        });
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        ventana1.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 180, 30));
        ventana1.add(emailSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 180, 10));

        telefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        telefono.setText("TELEFONO");
        ventana1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        telefonoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(153, 153, 153));
        telefonoTxt.setText("Ingrese el numero de teléfono");
        telefonoTxt.setBorder(null);
        telefonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telefonoTxtMousePressed(evt);
            }
        });
        telefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTxtActionPerformed(evt);
            }
        });
        telefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyTyped(evt);
            }
        });
        ventana1.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 180, 30));
        ventana1.add(telefonoSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 180, 10));

        fechaNac.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        fechaNac.setText("FECHA DE NACIMIENTO");
        ventana1.add(fechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        fechaNacTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fechaNacTxt.setForeground(new java.awt.Color(153, 153, 153));
        fechaNacTxt.setText("dd/mm/aaaa");
        fechaNacTxt.setBorder(null);
        fechaNacTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechaNacTxtMousePressed(evt);
            }
        });
        fechaNacTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacTxtActionPerformed(evt);
            }
        });
        ventana1.add(fechaNacTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 180, 30));
        ventana1.add(fechaNacSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 180, 10));

        domicilio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        domicilio.setText("DOMICILIO");
        ventana1.add(domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        domicilioTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        domicilioTxt.setForeground(new java.awt.Color(153, 153, 153));
        domicilioTxt.setText("Ingrese el domicilio");
        domicilioTxt.setBorder(null);
        domicilioTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                domicilioTxtMousePressed(evt);
            }
        });
        domicilioTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioTxtActionPerformed(evt);
            }
        });
        ventana1.add(domicilioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 180, 30));
        ventana1.add(domicilioSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 180, 10));

        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Otro" }));
        generoComboBox.setSelectedIndex(-1);
        generoComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generoComboBoxMousePressed(evt);
            }
        });
        ventana1.add(generoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 342, 180, 30));

        sexo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        sexo.setText("GENERO");
        ventana1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        obraSocial.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        obraSocial.setText("OBRA SOCIAL");
        ventana1.add(obraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, -1, -1));

        obraSocialTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        obraSocialTxt.setForeground(new java.awt.Color(153, 153, 153));
        obraSocialTxt.setText("Ingrese la obra social");
        obraSocialTxt.setBorder(null);
        obraSocialTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                obraSocialTxtMousePressed(evt);
            }
        });
        obraSocialTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obraSocialTxtActionPerformed(evt);
            }
        });
        ventana1.add(obraSocialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 180, 30));
        ventana1.add(obraSocialSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 180, 10));

        categoria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        categoria.setText("CATEGORIA");
        ventana1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, -1));

        categoriaBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoriaBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaBoxMousePressed(evt);
            }
        });
        ventana1.add(categoriaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 180, 30));

        modifBtn.setBackground(new java.awt.Color(50, 115, 153));

        modifTxt.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        modifTxt.setForeground(new java.awt.Color(255, 255, 255));
        modifTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifTxt.setText("MODIFICAR");
        modifTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modifBtnLayout = new javax.swing.GroupLayout(modifBtn);
        modifBtn.setLayout(modifBtnLayout);
        modifBtnLayout.setHorizontalGroup(
            modifBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        modifBtnLayout.setVerticalGroup(
            modifBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modifTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        ventana1.add(modifBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 560, 240, 50));

        recharg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/reload-icon.png"))); // NOI18N
        recharg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recharg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechargMouseClicked(evt);
            }
        });
        ventana1.add(recharg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 390, 20, 30));

        Marco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagesPersonas/marcoPerso.png"))); // NOI18N
        ventana1.add(Marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, 250, 200));

        fotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/FotoCarnet.png"))); // NOI18N
        fotoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoUsuarioMouseClicked(evt);
            }
        });
        ventana1.add(fotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 150, 140));

        cargarImgBtn.setBackground(new java.awt.Color(255, 255, 255));

        cargarImgTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cargarImgTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargarImgTxt.setText("Cargar Imagen");
        cargarImgTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargarImgTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarImgTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cargarImgBtnLayout = new javax.swing.GroupLayout(cargarImgBtn);
        cargarImgBtn.setLayout(cargarImgBtnLayout);
        cargarImgBtnLayout.setHorizontalGroup(
            cargarImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(cargarImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cargarImgBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cargarImgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        cargarImgBtnLayout.setVerticalGroup(
            cargarImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(cargarImgBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cargarImgBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cargarImgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ventana1.add(cargarImgBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, -1, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Volver al Menu");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        ventana1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, -1, -1));

        panelVentanas.addTab("tab1", ventana1);

        background.add(panelVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1280, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        String auxFilePath = "src/com/imagesPersonas/" + legajoTxt.getText() + "_aux.png";
        File auxFile = new File(auxFilePath);
        if (auxFile.exists()) {
            auxFile.delete();
        }
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxtMousePressed

    private void exitMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_exitMenuMouseDragged

    private void exitMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_exitMenuMousePressed

    private void nombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }
        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nombreTxtMousePressed

    private void nombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtActionPerformed

    private void nombreTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_nombreTxtKeyTyped

    private void apellidoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("dd/mm/aaaa")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }
        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_apellidoTxtMousePressed

    private void apellidoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtActionPerformed

    private void apellidoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTxtKeyTyped
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ')
        evt.consume();
    }//GEN-LAST:event_apellidoTxtKeyTyped

    private void dniTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_dniTxtMousePressed

    private void dniTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniTxtActionPerformed

    private void dniTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_dniTxtKeyTyped

    private void legajoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legajoTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_legajoTxtMousePressed

    private void legajoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoTxtActionPerformed

    private void legajoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_legajoTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_legajoTxtKeyTyped

    private void emailTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_emailTxtMousePressed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void telefonoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoTxtMousePressed
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
        if (telefonoTxt.getText().equals("Ingrese el numero de teléfono")) {
            telefonoTxt.setText("");
            telefonoTxt.setForeground(Color.black);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_telefonoTxtMousePressed

    private void telefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtActionPerformed

    private void telefonoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        evt.consume();
    }//GEN-LAST:event_telefonoTxtKeyTyped

    private void fechaNacTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaNacTxtMousePressed

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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("dd/mm/aaaa")) {
            fechaNacTxt.setText("");
            fechaNacTxt.setForeground(Color.black);
        }

        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fechaNacTxtMousePressed

    private void fechaNacTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacTxtActionPerformed

    private void domicilioTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domicilioTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("Ingrese el domicilio")) {
            domicilioTxt.setText("");
            domicilioTxt.setForeground(Color.black);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_domicilioTxtMousePressed

    private void domicilioTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domicilioTxtActionPerformed

    private void obraSocialTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obraSocialTxtMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("Ingrese la obra social")) {
            obraSocialTxt.setText("");
            obraSocialTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_obraSocialTxtMousePressed

    private void obraSocialTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obraSocialTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obraSocialTxtActionPerformed

    private void categoriaBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaBoxMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }

        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_categoriaBoxMousePressed

    private void modifTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifTxtMouseClicked
        ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
        Correos mail = new Correos();
        try {
            contenedoraSocio.cargarSociosDeJson("Socios.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        String dateOfBirthStr = fechaNacTxt.getText();
        String email = emailTxt.getText();
        LocalDate dateOfBirth = parseDate(dateOfBirthStr);
        String selectedCategoriaString = categoriaBox.getSelectedItem().toString();
        String dniStr = dniTxt.getText();
        // Crear el mapa de categorías
        Map<String, Categoria> categoriaMap = new HashMap<>();
        for (Categoria categoria : Categoria.values()) {
            categoriaMap.put(categoria.toString(), categoria);
        }

        // Obtener la categoría seleccionada del mapa
        Categoria selectedCategoria = categoriaMap.get(selectedCategoriaString);
        if (isAnyFieldEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "La direccion de Email no es valida, ingrese nuevamente.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (dateOfBirth == null) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento no es válida. Use el formato dd/MM/yyyy.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if (dniStr.length() != 8) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 caracteres.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if(!isValidDni(Integer.parseInt(dniTxt.getText()), Integer.parseInt(legajoTxt.getText()))){
            JOptionPane.showMessageDialog(this, "El DNI ya se encuentra registrado.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Socio s = new Socio(nombreTxt.getText(), apellidoTxt.getText(), Integer.parseInt(dniStr), Integer.parseInt(legajoTxt.getText()), emailTxt.getText(), fechaNacTxt.getText(), parseLong(telefonoTxt.getText()), domicilioTxt.getText(), generoComboBox.getSelectedItem().toString(), false, obraSocialTxt.getText(), true, selectedCategoria);
                s.setFechaRegistroPago(fechaRe);
                s.setFechaVencimientoPago(fechaVen);
                contenedoraSocio.modificacion(s);

                contenedoraSocio.guardarSociosEnJson("Socios.json");

                //Barra de carga antes de mandar a registro exitoso (Opcional)
                ModifExitosa modifEx = new ModifExitosa(1);
                modifEx.setVisible(true);
                modifEx.pack();
                modifEx.setLocationRelativeTo(null);


                String newFilePath = "src/com/imagesPersonas/" + legajoTxt.getText() + ".png";
                String auxFilePath = "src/com/imagesPersonas/" + legajoTxt.getText() + "_aux.png";
                File auxFile = new File(auxFilePath);
                File oldFile = new File(newFilePath);
                if (auxFile.exists()) {
                    oldFile.delete();
                    renameFile(auxFilePath, newFilePath);
                }
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error de modificacion", JOptionPane.ERROR_MESSAGE);}
            String auxFilePath = "src/com/imagesPersonas/" + legajoTxt.getText() + "_aux.png";
            deleteFile(auxFilePath);

            }

        }
    //GEN-LAST:event_modifTxtMouseClicked


    public static void renameFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        sourceFile.renameTo(destFile);
    }

    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        file.delete();
    }


    private void modifTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifTxtMouseEntered
        modifBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_modifTxtMouseEntered

    private void modifTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifTxtMouseExited
        modifBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_modifTxtMouseExited

    private void rechargMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargMouseClicked
        String filePath = "src/com/imagesPersonas/" + legajoTxt.getText() + "_aux.png";
        File file = new File(filePath);
        ImageIcon icon = new ImageIcon(new ImageIcon(filePath).getImage().getScaledInstance(fotoUsuario.getWidth(), fotoUsuario.getHeight(), Image.SCALE_SMOOTH));
        fotoUsuario.setIcon(icon);
    }//GEN-LAST:event_rechargMouseClicked

    private void cargarImgTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarImgTxtMouseClicked
        JFileChooser jf = new JFileChooser();
        jf.setMultiSelectionEnabled(false);
        if (jf.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            RSDragDropFiles.setCopiar(jf.getSelectedFile().toString(), "src/com/imagesPersonas/"+legajoTxt.getText()+"_aux.png");
            fotoUsuario.setIcon(new ImageIcon(jf.getSelectedFile().toString()));
            fotoUsuario.setCursor(new java.awt.Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cargarImgTxtMouseClicked

    private void fotoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoUsuarioMouseClicked
        WebcamClass webcamInstance = new WebcamClass(legajoTxt.getText(),this);
        // Ocultar la ventana actual (Infosocio)
        setVisible(false);

        // Crear una instancia de WebcamClass si aún no existe
        if (webcamInstance == null) {
            webcamInstance = new WebcamClass(legajoTxt.getText(),this);
        }

        // Mostrar la GUI de la webcam
        webcamInstance.createAndShowGUI();

        // Agregar un WindowListener para manejar la visibilidad al cerrar la ventana de WebcamClass
        webcamInstance.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Mostrar la ventana Infosocio al cerrar la webcam
                setVisible(true);
            }
        });
    }//GEN-LAST:event_fotoUsuarioMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String auxFilePath = "src/com/imagesPersonas/" + legajoTxt.getText() + "_aux.png";
        File auxFile = new File(auxFilePath);
        if (auxFile.exists()) {
            auxFile.delete();
        }
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void generoComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generoComboBoxMousePressed
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
        if (telefonoTxt.getText().equals("")) {
            telefonoTxt.setText("Ingrese el numero de teléfono");
            telefonoTxt.setForeground(Color.gray);
        }
        if (fechaNacTxt.getText().equals("")) {
            fechaNacTxt.setText("dd/mm/aaaa");
            fechaNacTxt.setForeground(Color.gray);
        }
        if (domicilioTxt.getText().equals("")) {
            domicilioTxt.setText("Ingrese el domicilio");
            domicilioTxt.setForeground(Color.gray);
        }
       
        if (obraSocialTxt.getText().equals("")) {
            obraSocialTxt.setText("Ingrese la obra social");
            obraSocialTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_generoComboBoxMousePressed

    public static boolean isValidEmail(String email) {
        // Expresión regular para validar el correo electrónico
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
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
                || telefonoTxt.getText().isEmpty() || telefonoTxt.getText().equals("Ingrese el numero de teléfono")
                || fechaNacTxt.getText().isEmpty() || fechaNacTxt.getText().equals("dd/mm/aaaa")
                || domicilioTxt.getText().isEmpty() || domicilioTxt.getText().equals("Ingrese el domicilio")
                || obraSocialTxt.getText().isEmpty() || obraSocialTxt.getText().equals("Ingrese la obra social");

        Object selectedCategoria = categoriaBox.getSelectedItem();
        if (selectedCategoria == null || selectedCategoria.toString().isEmpty()) {
            anyFieldEmpty = true;
        }
        Object selectedGenero = generoComboBox.getSelectedItem();
        if (selectedGenero == null || selectedGenero.toString().isEmpty()) {
            anyFieldEmpty = true;
        }
        return anyFieldEmpty;
    }

    public static boolean isValidDni(int dninuevo, int legajo) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Leer el archivo JSON y convertirlo a un arreglo de enteros (DNIs)
            ContenedoraSocio aux = new ContenedoraSocio();
            aux.cargarSociosDeJson("Socios.json");
            Socio sAux = aux.buscar(legajo);
            if(sAux.getDni()==dninuevo){
            return true;
            }
            Set<Integer> dniSet = new HashSet<>();
            for(Socio s1 : aux.listar().values()){
                dniSet.add(s1.getDni());
            }

            if (dniSet.contains(dninuevo)) {
                return false;
            }
            dniSet.add(dninuevo);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Marco;
    private javax.swing.JLabel administracionTxt;
    private javax.swing.JLabel apellido;
    private javax.swing.JSeparator apellidoSep;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel cargarImgBtn;
    private javax.swing.JLabel cargarImgTxt;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<String> categoriaBox;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel dni;
    private javax.swing.JSeparator dniSep;
    private javax.swing.JTextField dniTxt;
    private javax.swing.JLabel domicilio;
    private javax.swing.JSeparator domicilioSep;
    private javax.swing.JTextField domicilioTxt;
    private javax.swing.JLabel email;
    private javax.swing.JSeparator emailSep;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitMenu;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fechaNac;
    private javax.swing.JSeparator fechaNacSep;
    private javax.swing.JTextField fechaNacTxt;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel legajo;
    private javax.swing.JSeparator legajoSep;
    private javax.swing.JTextField legajoTxt;
    private javax.swing.JPanel modifBtn;
    private javax.swing.JLabel modifTxt;
    private javax.swing.JLabel nombre;
    private javax.swing.JSeparator nombreSep;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JLabel obraSocial;
    private javax.swing.JSeparator obraSocialSep;
    private javax.swing.JTextField obraSocialTxt;
    private javax.swing.JTabbedPane panelVentanas;
    private javax.swing.JLabel recharg;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel telefono;
    private javax.swing.JSeparator telefonoSep;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JLabel timeText;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel ventana1;
    // End of variables declaration//GEN-END:variables
}
