
package Register;

import MenuIU.Menu;
import Model.Socio;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Register extends javax.swing.JFrame implements Serializable {

    int xMouse, yMouse;
    public Register() {
        initComponents();
        try{
            File iconFile = new File("src/com/images/LOGO1.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        setTitle("Administracion Acantilados FC");
        ocultPassTxt.setVisible(false);
        ocultPassTxt1.setVisible(false);
        Background.requestFocusInWindow();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        iniciarSesion = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nameSeparator = new javax.swing.JSeparator();
        lastName = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        lastNameSeparator = new javax.swing.JSeparator();
        legajo = new javax.swing.JLabel();
        legajoTxt = new javax.swing.JTextField();
        legajoSeparator = new javax.swing.JSeparator();
        dni = new javax.swing.JLabel();
        dniTxt = new javax.swing.JTextField();
        dniSeparator = new javax.swing.JSeparator();
        email = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        dateBirthday = new javax.swing.JLabel();
        dateBirthdayTxt = new javax.swing.JTextField();
        dateBirthdaySeparator = new javax.swing.JSeparator();
        password = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        viewPassTxt = new javax.swing.JLabel();
        ocultPassTxt = new javax.swing.JLabel();
        passSeparator = new javax.swing.JSeparator();
        confirmPass = new javax.swing.JLabel();
        confirmPassTxt = new javax.swing.JPasswordField();
        viewPassTxt1 = new javax.swing.JLabel();
        ocultPassTxt1 = new javax.swing.JLabel();
        confirmPassSeparator = new javax.swing.JSeparator();
        crearBtn = new javax.swing.JPanel();
        crearBtnTxt = new javax.swing.JLabel();
        backMenuBtn = new javax.swing.JPanel();
        backMenuBtnTxt = new javax.swing.JLabel();
        emailSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setForeground(new java.awt.Color(204, 204, 204));
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setForeground(new java.awt.Color(0, 0, 0));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Bg.png"))); // NOI18N
        Background.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setBackground(new java.awt.Color(0, 0, 0));
        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        iniciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        iniciarSesion.setText("CREAR CUENTA");
        Background.add(iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        name.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("NOMBRE");
        Background.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 70, -1));

        nameTxt.setBackground(new java.awt.Color(255, 255, 255));
        nameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(153, 153, 153));
        nameTxt.setText("Ingrese su nombre");
        nameTxt.setBorder(null);
        nameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameTxtMousePressed(evt);
            }
        });
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtKeyTyped(evt);
            }
        });
        Background.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 30));
        Background.add(nameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 10));

        lastName.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(0, 0, 0));
        lastName.setText("APELLIDO");
        Background.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, -1));

        lastNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        lastNameTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lastNameTxt.setForeground(new java.awt.Color(153, 153, 153));
        lastNameTxt.setText("Ingrese su apellido");
        lastNameTxt.setBorder(null);
        lastNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lastNameTxtMousePressed(evt);
            }
        });
        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });
        lastNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameTxtKeyTyped(evt);
            }
        });
        Background.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 190, 30));
        Background.add(lastNameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 10));

        legajo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        legajo.setForeground(new java.awt.Color(0, 0, 0));
        legajo.setText("LEGAJO");
        Background.add(legajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, -1));

        legajoTxt.setBackground(new java.awt.Color(255, 255, 255));
        legajoTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        legajoTxt.setForeground(new java.awt.Color(153, 153, 153));
        legajoTxt.setText("Ingrese su legajo");
        legajoTxt.setBorder(null);
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
        Background.add(legajoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, 30));
        Background.add(legajoSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 10));

        dni.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.setText("DOCUMENTO");
        Background.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, -1));

        dniTxt.setBackground(new java.awt.Color(255, 255, 255));
        dniTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dniTxt.setForeground(new java.awt.Color(153, 153, 153));
        dniTxt.setText("Ingrese su documento");
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
        Background.add(dniTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 190, 30));
        Background.add(dniSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 190, 10));

        email.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("EMAIL");
        Background.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));

        emailTxt.setBackground(new java.awt.Color(255, 255, 255));
        emailTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        emailTxt.setForeground(new java.awt.Color(153, 153, 153));
        emailTxt.setText("Ingrese su correo electronico");
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
        Background.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 30));

        dateBirthday.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        dateBirthday.setForeground(new java.awt.Color(0, 0, 0));
        dateBirthday.setText("FECHA DE NACIMIENTO");
        Background.add(dateBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 160, -1));

        dateBirthdayTxt.setBackground(new java.awt.Color(255, 255, 255));
        dateBirthdayTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateBirthdayTxt.setForeground(new java.awt.Color(153, 153, 153));
        dateBirthdayTxt.setText("dd/mm/aaaa");
        dateBirthdayTxt.setBorder(null);
        dateBirthdayTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dateBirthdayTxtMousePressed(evt);
            }
        });
        dateBirthdayTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateBirthdayTxtActionPerformed(evt);
            }
        });
        Background.add(dateBirthdayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 190, 30));
        Background.add(dateBirthdaySeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 190, 10));

        password.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("CONTRASEÑA");
        Background.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, -1));

        passTxt.setBackground(new java.awt.Color(255, 255, 255));
        passTxt.setForeground(new java.awt.Color(153, 153, 153));
        passTxt.setText("************");
        passTxt.setToolTipText("");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        Background.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 190, 30));

        viewPassTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ver.png"))); // NOI18N
        viewPassTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPassTxtMouseClicked(evt);
            }
        });
        Background.add(viewPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 20, 30));

        ocultPassTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ocultar.png"))); // NOI18N
        ocultPassTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultPassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultPassTxtMouseClicked(evt);
            }
        });
        Background.add(ocultPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 20, 30));
        Background.add(passSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 190, 10));

        confirmPass.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        confirmPass.setForeground(new java.awt.Color(0, 0, 0));
        confirmPass.setText("CONFIRMAR CONTRASEÑA");
        Background.add(confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, -1));

        confirmPassTxt.setBackground(new java.awt.Color(255, 255, 255));
        confirmPassTxt.setForeground(new java.awt.Color(153, 153, 153));
        confirmPassTxt.setText("************");
        confirmPassTxt.setToolTipText("");
        confirmPassTxt.setBorder(null);
        confirmPassTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmPassTxtMousePressed(evt);
            }
        });
        confirmPassTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassTxtActionPerformed(evt);
            }
        });
        Background.add(confirmPassTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 190, 30));

        viewPassTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ver.png"))); // NOI18N
        viewPassTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPassTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPassTxt1MouseClicked(evt);
            }
        });
        Background.add(viewPassTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 20, 30));

        ocultPassTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ocultar.png"))); // NOI18N
        ocultPassTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultPassTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultPassTxt1MouseClicked(evt);
            }
        });
        Background.add(ocultPassTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 20, 30));
        Background.add(confirmPassSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 190, 10));

        crearBtn.setBackground(new java.awt.Color(59, 132, 173));

        crearBtnTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        crearBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        crearBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearBtnTxt.setText("CREAR");
        crearBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearBtnLayout = new javax.swing.GroupLayout(crearBtn);
        crearBtn.setLayout(crearBtnLayout);
        crearBtnLayout.setHorizontalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Background.add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 130, 40));

        backMenuBtn.setBackground(new java.awt.Color(255, 255, 255));

        backMenuBtnTxt.setBackground(new java.awt.Color(59, 132, 173));
        backMenuBtnTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        backMenuBtnTxt.setForeground(new java.awt.Color(59, 132, 173));
        backMenuBtnTxt.setText("Volver al menu");
        backMenuBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backMenuBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMenuBtnTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backMenuBtnLayout = new javax.swing.GroupLayout(backMenuBtn);
        backMenuBtn.setLayout(backMenuBtnLayout);
        backMenuBtnLayout.setHorizontalGroup(
            backMenuBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backMenuBtnLayout.createSequentialGroup()
                .addComponent(backMenuBtnTxt)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backMenuBtnLayout.setVerticalGroup(
            backMenuBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backMenuBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Background.add(backMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, 20));
        Background.add(emailSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
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

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void nameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTxtMousePressed
        if(nameTxt.getText().equals("Ingrese su nombre")){
            nameTxt.setText("");
            nameTxt.setForeground(Color.black);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nameTxtMousePressed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(String.valueOf(passTxt.getPassword()).equals("************")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        } 
       if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }

    }//GEN-LAST:event_passTxtMousePressed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void viewPassTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassTxtMouseClicked
        viewPassTxt.setVisible(false);
        ocultPassTxt.setVisible(true);
        passTxt.setEchoChar((char)0);
    }//GEN-LAST:event_viewPassTxtMouseClicked

    private void ocultPassTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultPassTxtMouseClicked
        viewPassTxt.setVisible(true);
        ocultPassTxt.setVisible(false);
        passTxt.setEchoChar('*');
    }//GEN-LAST:event_ocultPassTxtMouseClicked

    private void crearBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseClicked
        String password = String.valueOf(passTxt.getPassword());
        String confPass = String.valueOf(confirmPassTxt.getPassword());
        String dateOfBirthStr = dateBirthdayTxt.getText();
        String email = emailTxt.getText();
        LocalDate dateOfBirth = parseDate(dateOfBirthStr);
        if (isAnyFieldEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.", "Error de registro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }else if (!password.equals(confPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error de contraseña", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if(!isValidPassword(password)){
            javax.swing.JOptionPane.showMessageDialog(this, "La contraseña debe contener al menos una letra mayúscula y un número.", "Error de contraseña", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if(password.length() < 8){
            javax.swing.JOptionPane.showMessageDialog(this, "La contraseña debe tener minimo 8 caracteres.", "Error de contraseña", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if(dateOfBirth == null) {
            JOptionPane.showMessageDialog(this, "La fecha de nacimiento no es válida. Use el formato dd/MM/yyyy.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        } else if(!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "La direccion de Email no es valida, ingrese nuevamente.", "Error de registro", JOptionPane.ERROR_MESSAGE);
        }else{
            RegistroExitoso regExitoso = new RegistroExitoso();
            regExitoso.setVisible(true);
            regExitoso.pack();
            regExitoso.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_crearBtnTxtMouseClicked
    
    // Método para verificar si el correo electrónico es válido
    public static boolean isValidEmail(String email) {
        // Expresión regular para validar el correo electrónico
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    // Método para verificar si la contraseña es válida
    private boolean isValidPassword(String password) {
        // Verificar que contenga al menos una letra mayúscula y un número
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            // Si ya encontramos ambas, podemos salir del bucle
            if (hasUpperCase && hasNumber) {
                return true;
            }
        }
        return false;
    }
    
    private void crearBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseEntered
        crearBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_crearBtnTxtMouseEntered

    private void crearBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseExited
        crearBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_crearBtnTxtMouseExited

    private void backMenuBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuBtnTxtMouseClicked
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.pack();
            menu.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_backMenuBtnTxtMouseClicked

    private void lastNameTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameTxtMousePressed
        if(lastNameTxt.getText().equals("Ingrese su apellido")){
            lastNameTxt.setText("");
            lastNameTxt.setForeground(Color.black);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_lastNameTxtMousePressed

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void legajoTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legajoTxtMousePressed
        if(legajoTxt.getText().equals("Ingrese su legajo")){
            legajoTxt.setText("");
            legajoTxt.setForeground(Color.black);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_legajoTxtMousePressed

    private void legajoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legajoTxtActionPerformed

    private void confirmPassTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPassTxtMousePressed
        if(String.valueOf(confirmPassTxt.getPassword()).equals("************")){
            confirmPassTxt.setText("");
            confirmPassTxt.setForeground(Color.black);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_confirmPassTxtMousePressed

    private void confirmPassTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassTxtActionPerformed

    private void viewPassTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPassTxt1MouseClicked
        viewPassTxt1.setVisible(false);
        ocultPassTxt1.setVisible(true);
        confirmPassTxt.setEchoChar((char)0);
    }//GEN-LAST:event_viewPassTxt1MouseClicked

    private void ocultPassTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultPassTxt1MouseClicked
        viewPassTxt1.setVisible(true);
        ocultPassTxt1.setVisible(false);
        confirmPassTxt.setEchoChar('*');
    }//GEN-LAST:event_ocultPassTxt1MouseClicked

    private void dniTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dniTxtMousePressed
        if(dniTxt.getText().equals("Ingrese su documento")){
            dniTxt.setText("");
            dniTxt.setForeground(Color.black);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_dniTxtMousePressed

    private void dniTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniTxtActionPerformed

    private void emailTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTxtMousePressed
        if(emailTxt.getText().equals("Ingrese su correo electronico")){
            emailTxt.setText("");
            emailTxt.setForeground(Color.black);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(dateBirthdayTxt.getText().equals("")){
            dateBirthdayTxt.setText("dd/mm/aaaa");
            dateBirthdayTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_emailTxtMousePressed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void dateBirthdayTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateBirthdayTxtMousePressed
        if(dateBirthdayTxt.getText().equals("dd/mm/aaaa")){
            dateBirthdayTxt.setText("");
            dateBirthdayTxt.setForeground(Color.black);
        }
        if(nameTxt.getText().equals("")){
            nameTxt.setText("Ingrese su nombre");
            nameTxt.setForeground(Color.gray);
        }
        if(lastNameTxt.getText().equals("")){
            lastNameTxt.setText("Ingrese su apellido");
            lastNameTxt.setForeground(Color.gray);
        }
        if(legajoTxt.getText().equals("")){
            legajoTxt.setText("Ingrese su legajo");
            legajoTxt.setForeground(Color.gray);
        }
        if(dniTxt.getText().equals("")){
            dniTxt.setText("Ingrese su documento");
            dniTxt.setForeground(Color.gray);
        }
        if(emailTxt.getText().equals("")){
            emailTxt.setText("Ingrese su correo electronico");
            emailTxt.setForeground(Color.gray);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
        if(String.valueOf(confirmPassTxt.getPassword()).isEmpty()){
            confirmPassTxt.setText("************");
            confirmPassTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_dateBirthdayTxtMousePressed

    private void dateBirthdayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateBirthdayTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateBirthdayTxtActionPerformed

     // Método para parsear y validar la fecha
     private LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
    
    private void legajoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_legajoTxtKeyTyped
        char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_legajoTxtKeyTyped

    private void dniTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniTxtKeyTyped
        char c = evt.getKeyChar();
        
        if(c < '0' || c > '9') evt.consume();
    }//GEN-LAST:event_dniTxtKeyTyped

    private void nameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyTyped
        char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_nameTxtKeyTyped

    private void lastNameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTxtKeyTyped
        char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_lastNameTxtKeyTyped

    // Método para verificar si algún campo está vacío
    private boolean isAnyFieldEmpty() {
    return nameTxt.getText().isEmpty() || nameTxt.getText().equals("Ingrese su nombre") ||
           legajoTxt.getText().isEmpty() || legajoTxt.getText().equals("Ingrese su legajo") ||
           lastNameTxt.getText().isEmpty() || lastNameTxt.getText().equals("Ingrese su apellido") ||
           emailTxt.getText().isEmpty() || emailTxt.getText().equals("Ingrese su correo electronico") ||
           dateBirthdayTxt.getText().isEmpty() || dateBirthdayTxt.getText().equals("dd/mm/aaaa") ||
           dniTxt.getText().isEmpty() || dniTxt.getText().equals("Ingrese su documento") ||
           String.valueOf(passTxt.getPassword()).isEmpty() || String.valueOf(passTxt.getPassword()).equals("************") ||
           String.valueOf(confirmPassTxt.getPassword()).isEmpty() || String.valueOf(confirmPassTxt.getPassword()).equals("************");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel backMenuBtn;
    private javax.swing.JLabel backMenuBtnTxt;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JSeparator confirmPassSeparator;
    private javax.swing.JPasswordField confirmPassTxt;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel crearBtnTxt;
    private javax.swing.JLabel dateBirthday;
    private javax.swing.JSeparator dateBirthdaySeparator;
    private javax.swing.JTextField dateBirthdayTxt;
    private javax.swing.JLabel dni;
    private javax.swing.JSeparator dniSeparator;
    private javax.swing.JTextField dniTxt;
    private javax.swing.JLabel email;
    private javax.swing.JSeparator emailSeparator1;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel lastName;
    private javax.swing.JSeparator lastNameSeparator;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JLabel legajo;
    private javax.swing.JSeparator legajoSeparator;
    private javax.swing.JTextField legajoTxt;
    private javax.swing.JLabel name;
    private javax.swing.JSeparator nameSeparator;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel ocultPassTxt;
    private javax.swing.JLabel ocultPassTxt1;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel password;
    private javax.swing.JLabel viewPassTxt;
    private javax.swing.JLabel viewPassTxt1;
    // End of variables declaration//GEN-END:variables
}
