/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Register;

import Login.Login;
import MenuIU.Menu;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class RegistroExitoso extends javax.swing.JFrame {

    /**
     * Creates new form RegistroExitoso
     */
    public RegistroExitoso() {
        initComponents();
        try{
            File iconFile = new File("src/com/images/Tick 60x60.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
            setTitle("Administracion Acantilados FC");
        }catch (IOException ex) {
            ex.printStackTrace();
        }

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
        Tick = new javax.swing.JLabel();
        regExitoso = new javax.swing.JLabel();
        regExitosoTxt = new javax.swing.JLabel();
        okBtn = new javax.swing.JPanel();
        okBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Tick 60x60.png"))); // NOI18N
        background.add(Tick, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 60, 60));

        regExitoso.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        regExitoso.setForeground(new java.awt.Color(0, 0, 0));
        regExitoso.setText("Registro Exitoso");
        background.add(regExitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, 50));

        regExitosoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regExitosoTxt.setForeground(new java.awt.Color(0, 0, 0));
        regExitosoTxt.setText("Registro finalizado con exito.");
        background.add(regExitosoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, 30));

        okBtn.setBackground(new java.awt.Color(67, 159, 70));

        okBtnTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        okBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        okBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        okBtnTxt.setText("MENU");
        okBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout okBtnLayout = new javax.swing.GroupLayout(okBtn);
        okBtn.setLayout(okBtnLayout);
        okBtnLayout.setHorizontalGroup(
            okBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(okBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        okBtnLayout.setVerticalGroup(
            okBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(okBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnTxtMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_okBtnTxtMouseClicked

    private void okBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnTxtMouseEntered
        okBtn.setBackground(new Color(67,185,70));
    }//GEN-LAST:event_okBtnTxtMouseEntered

    private void okBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okBtnTxtMouseExited
        okBtn.setBackground(new Color(67,159,70));
    }//GEN-LAST:event_okBtnTxtMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tick;
    private javax.swing.JPanel background;
    private javax.swing.JPanel okBtn;
    private javax.swing.JLabel okBtnTxt;
    private javax.swing.JLabel regExitoso;
    private javax.swing.JLabel regExitosoTxt;
    // End of variables declaration//GEN-END:variables
}

