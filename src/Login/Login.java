/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;
import IUEmpleado.IngresoSocios;
import Medico.Medico;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import MenuIU.Menu;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login extends JFrame {

    int xMouse, yMouse;
    public Login()  {
        initComponents(); // Aquí inicializas los componentes de la ventana
        try{
            File iconFile = new File("src/com/images/LOGO1.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        this.setVisible(true);
        ocultPassTxt.setVisible(false);

        Background.requestFocusInWindow();

        // KeyBindings para capturar la tecla Tab
        InputMap inputMapUser = userTxt.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap actionMapUser = userTxt.getActionMap();
        inputMapUser.put(KeyStroke.getKeyStroke("TAB"), "moveFocusToPassword");

        actionMapUser.put("moveFocusToPassword", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                passTxt.requestFocus();
                if (String.valueOf(passTxt.getPassword()).equals("************")) {
                    passTxt.setText("");
                    passTxt.setForeground(Color.black);
                }
            }
        });

        InputMap inputMapPass = passTxt.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap actionMapPass = passTxt.getActionMap();
        inputMapPass.put(KeyStroke.getKeyStroke("TAB"), "moveFocusToUser");

        actionMapPass.put("moveFocusToUser", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTxt.requestFocus();
                if (userTxt.getText().equals("Ingrese el usuario")) {
                    userTxt.setText("");
                    userTxt.setForeground(Color.black);
                }
            }
        });

        // FocusListener para limpiar el texto cuando el campo obtiene el foco
        userTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (userTxt.getText().equals("Ingrese el usuario")) {
                    userTxt.setText("");
                    userTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (userTxt.getText().isEmpty()) {
                    userTxt.setText("Ingrese el usuario");
                    userTxt.setForeground(Color.gray);
                }
            }
        });

        passTxt.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passTxt.getPassword()).equals("************")) {
                    passTxt.setText("");
                    passTxt.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passTxt.getPassword()).isEmpty()) {
                    passTxt.setText("************");
                    passTxt.setForeground(Color.gray);
                }
            }
        });

            KeyListener enterKeyListener = new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        String password = String.valueOf(passTxt.getPassword());

                        if ((userTxt.getText().equals("Admin")) && (password.equals("Admin"))) {
                            Menu menu = new Menu();
                            menu.setVisible(true);
                            menu.pack();
                            menu.setLocationRelativeTo(null);
                            Login.this.dispose();

                        } else if ((userTxt.getText().equals("Medico")) && (password.equals("Medico"))) {
                            Medico medico = new Medico();
                            medico.setVisible(true);
                            medico.pack();
                            medico.setLocationRelativeTo(null);
                            Login.this.dispose();

                        } else if ((userTxt.getText().equals("Empleado")) && (password.equals("Recepcionista"))) {
                            IngresoSocios ingreso = new IngresoSocios();
                            ingreso.setVisible(true);
                            ingreso.pack();
                            ingreso.setLocationRelativeTo(null);
                            Login.this.dispose();

                        } else {
                            JOptionPane.showMessageDialog(Login.this, "El usuario o la contraseña es incorrecta, vuelva a intentarlo.", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

};
       userTxt.addKeyListener(enterKeyListener);
       passTxt.addKeyListener(enterKeyListener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new JPanel();
        bg = new JLabel();
        header = new JPanel();
        exitBtn = new JPanel();
        exitTxt = new JLabel();
        patrocinios = new JLabel();
        iniciarSesion = new JLabel();
        user = new JLabel();
        userTxt = new JTextField();
        userSeparator = new JSeparator();
        password = new JLabel();
        passTxt = new JPasswordField();
        viewPassTxt = new JLabel();
        ocultPassTxt = new JLabel();
        passSeparator = new JSeparator();
        loginBtn = new JPanel();
        loginBtnTxt = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new Color(255, 255, 255));
        Background.setForeground(new Color(204, 204, 204));
        Background.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        Background.setLayout(new AbsoluteLayout());

        bg.setForeground(new Color(0, 0, 0));
        bg.setIcon(new ImageIcon(getClass().getResource("/com/images/Bg.png"))); // NOI18N
        Background.add(bg, new AbsoluteConstraints(530, 0, 270, 500));

        header.setBackground(new Color(255, 255, 255));
        header.setForeground(new Color(255, 255, 255));
        header.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new Color(255, 255, 255));

        exitTxt.setBackground(new Color(0, 0, 0));
        exitTxt.setFont(new Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new Color(0, 0, 0));
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
            .addGroup(GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout headerLayout = new GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(header, new AbsoluteConstraints(0, 0, 800, 40));

        patrocinios.setIcon(new ImageIcon(getClass().getResource("/com/images/patrocinios.png"))); // NOI18N
        Background.add(patrocinios, new AbsoluteConstraints(60, 70, 410, 50));

        iniciarSesion.setFont(new Font("Roboto Black", 1, 24)); // NOI18N
        iniciarSesion.setForeground(new Color(0, 0, 0));
        iniciarSesion.setText("INICIAR SESIÓN");
        Background.add(iniciarSesion, new AbsoluteConstraints(60, 160, -1, -1));

        user.setFont(new Font("Roboto Light", 1, 14)); // NOI18N
        user.setForeground(new Color(0, 0, 0));
        user.setText("USUARIO");
        user.setToolTipText("");
        Background.add(user, new AbsoluteConstraints(60, 220, 70, -1));

        userTxt.setBackground(new Color(255, 255, 255));
        userTxt.setFont(new Font("Roboto", 0, 12)); // NOI18N
        userTxt.setForeground(new Color(153, 153, 153));
        userTxt.setText("Ingrese el usuario");
        userTxt.setBorder(null);
        userTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        userTxt.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                userTxtKeyTyped(evt);
            }
        });
        Background.add(userTxt, new AbsoluteConstraints(60, 240, 380, 30));
        Background.add(userSeparator, new AbsoluteConstraints(60, 270, 380, 10));

        password.setFont(new Font("Roboto Light", 1, 14)); // NOI18N
        password.setForeground(new Color(0, 0, 0));
        password.setText("CONTRASEÑA");
        Background.add(password, new AbsoluteConstraints(60, 300, 100, -1));

        passTxt.setBackground(new Color(255, 255, 255));
        passTxt.setForeground(new Color(153, 153, 153));
        passTxt.setText("************");
        passTxt.setToolTipText("");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        Background.add(passTxt, new AbsoluteConstraints(60, 320, 380, 30));

        viewPassTxt.setIcon(new ImageIcon(getClass().getResource("/com/images/ver.png"))); // NOI18N
        viewPassTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        viewPassTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                viewPassTxtMouseClicked(evt);
            }
        });
        Background.add(viewPassTxt, new AbsoluteConstraints(450, 320, 20, 30));

        ocultPassTxt.setIcon(new ImageIcon(getClass().getResource("/com/images/ocultar.png"))); // NOI18N
        ocultPassTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ocultPassTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ocultPassTxtMouseClicked(evt);
            }
        });
        Background.add(ocultPassTxt, new AbsoluteConstraints(450, 320, 20, 30));
        Background.add(passSeparator, new AbsoluteConstraints(60, 350, 380, 10));

        loginBtn.setBackground(new Color(59, 132, 173));

        loginBtnTxt.setFont(new Font("Roboto Light", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(SwingConstants.CENTER);
        loginBtnTxt.setText("INGRESAR");
        loginBtnTxt.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        GroupLayout loginBtnLayout = new GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Background.add(loginBtn, new AbsoluteConstraints(60, 390, 130, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean loginSuccessful = false;

    // Este método será llamado desde fuera para verificar si el inicio de sesión fue exitoso
    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    // Este método será llamado cuando el inicio de sesión sea exitoso
    public void setLoginSuccessful(boolean loginSuccessful) {
        this.loginSuccessful = loginSuccessful;
    }
    
    private void userTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void exitTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_exitTxtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTxtMousePressed

    private void headerMouseDragged(MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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

    private void loginBtnTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void passTxtActionPerformed(ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void userTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        if(userTxt.getText().equals("Ingrese el usuario")){
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("************");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if(String.valueOf(passTxt.getPassword()).equals("************")){
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if(userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese el usuario");
            userTxt.setForeground(Color.gray);
        }


    }//GEN-LAST:event_passTxtMousePressed

    private void loginBtnTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        String password = String.valueOf(passTxt.getPassword());

        // Verificar que la contraseña contenga al menos una letra mayúscula y un número
        if((userTxt.getText().equals("Admin")) && (password.equals("Admin"))){
            Menu menu = new Menu();
            menu.setVisible(true);
            menu.pack();
            menu.setLocationRelativeTo(null);
            this.dispose();
            
        }else if((userTxt.getText().equals("Medico")) && (password.equals("Medico"))){
            Medico medico = new Medico();
            medico.setVisible(true);
            medico.pack();
            medico.setLocationRelativeTo(null);
            this.dispose();
            
        }else if((userTxt.getText().equals("Empleado")) && (password.contains("Recepcionista"))){
            IngresoSocios ingreso = new IngresoSocios();
            ingreso.setVisible(true);
            ingreso.pack();
            ingreso.setLocationRelativeTo(null);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "El usuario o la contraseña es incorrecta, vuelva a intentarlo.", "Error de contraseña", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void viewPassTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_viewPassTxtMouseClicked
        viewPassTxt.setVisible(false);
        ocultPassTxt.setVisible(true);
        passTxt.setEchoChar((char)0);
    }//GEN-LAST:event_viewPassTxtMouseClicked

    private void ocultPassTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_ocultPassTxtMouseClicked
        viewPassTxt.setVisible(true);
        ocultPassTxt.setVisible(false);
        passTxt.setEchoChar('*');
    }//GEN-LAST:event_ocultPassTxtMouseClicked

    private void userTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_userTxtKeyTyped
        char c = evt.getKeyChar();
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) evt.consume();
    }//GEN-LAST:event_userTxtKeyTyped

   
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel Background;
    private JLabel bg;
    private JPanel exitBtn;
    private JLabel exitTxt;
    private JPanel header;
    private JLabel iniciarSesion;
    private JPanel loginBtn;
    private JLabel loginBtnTxt;
    private JLabel ocultPassTxt;
    private JSeparator passSeparator;
    private JPasswordField passTxt;
    private JLabel password;
    private JLabel patrocinios;
    private JLabel user;
    private JSeparator userSeparator;
    private JTextField userTxt;
    private JLabel viewPassTxt;
    // End of variables declaration//GEN-END:variables
}
