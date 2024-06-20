/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuIU;

import Containers.ContenedoraEmpleado;
import Mail.Correos;
import Menuusages.ModificarSocio;
import Menuusages.PagoExitoso;
import Model.*;
import Model.Categoria;

import Login.Login;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Menuusages.InfoSocio;
import Containers.ContenedoraSocio;
import Menuusages.InfoEmpleado;
import Menuusages.ModificarEmpleado;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends JFrame {

    int xMouse, yMouse;
    public Menu() {
        initComponents();
        setDate();
        textoSocio.setText("<html><span style='color: gray; font-family: Corbel; font-size: 16pt;'>Gestiona el registro, modificación y eliminación de socios.</span></html>");
        textoEmpleado.setText("<html><span style='color: gray; font-family: Corbel; font-size: 16pt;'>Administra el registro, modificación y eliminación de empleados.</span></html>");
        textoPagosSocios.setText("<html><span style='color: gray; font-family: Corbel; font-size: 16pt;'>Procesa los pagos de los socios del club.</span></html>");
        textoSueldosEmpleados.setText("<html><span style='color: gray; font-family: Corbel; font-size: 16pt;'>Gestiona el pago de sueldos a los empleados.</span></html>");
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        tablaDeudas.getTableHeader().setReorderingAllowed(false);
        tablaPagos.getTableHeader().setReorderingAllowed(false);
        
    }

    private void setDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText(dia+" de "+meses[month -1]+" de "+year);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        exitMenu = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        menuBtn = new javax.swing.JPanel();
        menuTxt = new javax.swing.JLabel();
        sociosBtn = new javax.swing.JPanel();
        sociosTxt = new javax.swing.JLabel();
        empleadosBtn = new javax.swing.JPanel();
        empleadosTxt = new javax.swing.JLabel();
        pagosSociosBtn = new javax.swing.JPanel();
        pagosSociosTxt = new javax.swing.JLabel();
        sueldosEmpleadosBtn = new javax.swing.JPanel();
        sueldosEmpleadosTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        administracionTxt = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        panelVentanas = new javax.swing.JTabbedPane();
        ventana1 = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        tituloSocio = new javax.swing.JLabel();
        textoSocio = new javax.swing.JLabel();
        btnSocios = new javax.swing.JPanel();
        txtSocios = new javax.swing.JLabel();
        fotoSocio1 = new javax.swing.JLabel();
        fondoSocio = new javax.swing.JLabel();
        tituloEmpleado = new javax.swing.JLabel();
        textoEmpleado = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JPanel();
        txtEmpleados = new javax.swing.JLabel();
        fotoEmpleado = new javax.swing.JLabel();
        fondoEmpleado = new javax.swing.JLabel();
        tituloPagosSocios = new javax.swing.JLabel();
        textoPagosSocios = new javax.swing.JLabel();
        btnPagosSocio = new javax.swing.JPanel();
        txtPagosSocio = new javax.swing.JLabel();
        fotoPagosSocio = new javax.swing.JLabel();
        fondoPagosSocio = new javax.swing.JLabel();
        tituloSueldosEmpleados = new javax.swing.JLabel();
        textoSueldosEmpleados = new javax.swing.JLabel();
        btnSueldosEmpleados = new javax.swing.JPanel();
        txtSueldosEmpleados = new javax.swing.JLabel();
        fotoSueldosEmpleados = new javax.swing.JLabel();
        fondoSueldosEmpleados = new javax.swing.JLabel();
        ventana2 = new javax.swing.JPanel();
        tituloSocios = new javax.swing.JLabel();
        buscarLabel = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JPanel();
        buscarTxt = new javax.swing.JLabel();
        modificarBtn = new javax.swing.JPanel();
        modificarTxt = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JPanel();
        eliminarTxt = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JPanel();
        agregarTxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ventana3 = new javax.swing.JPanel();
        tituloSocios1 = new javax.swing.JLabel();
        buscarLabel1 = new javax.swing.JTextField();
        buscarBtn1 = new javax.swing.JPanel();
        buscarTxt1 = new javax.swing.JLabel();
        modificarBtn1 = new javax.swing.JPanel();
        modificarTxt1 = new javax.swing.JLabel();
        agregarBtn1 = new javax.swing.JPanel();
        agregarTxt1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        eliminarBtn1 = new javax.swing.JPanel();
        eliminarTxt1 = new javax.swing.JLabel();
        ventana4 = new javax.swing.JPanel();
        tituloPagoSocios = new javax.swing.JLabel();
        legajoTitulo = new javax.swing.JLabel();
        buscarLegajo = new javax.swing.JTextField();
        buscarBtn2 = new javax.swing.JPanel();
        buscarTxt2 = new javax.swing.JLabel();
        mostrarListadoTitulo = new javax.swing.JLabel();
        mostrarDeudoresBtn = new javax.swing.JPanel();
        mostrarDeudoresTxt = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        cardPrincipal = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        tituloDatosSocio = new javax.swing.JLabel();
        panelDatosSocio = new javax.swing.JPanel();
        nomTxt = new javax.swing.JLabel();
        docTxt = new javax.swing.JLabel();
        totalPagarTxt = new javax.swing.JLabel();
        vencTxt = new javax.swing.JLabel();
        pagarBtn = new javax.swing.JPanel();
        pagarTxt = new javax.swing.JLabel();
        card2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeudas = new javax.swing.JTable();
        tituloDeudores = new javax.swing.JLabel();
        enviarDeudaBtn = new javax.swing.JPanel();
        enviarDeudaTxt = new javax.swing.JLabel();
        enviarDeudaSep = new javax.swing.JSeparator();
        ventana5 = new javax.swing.JPanel();
        tituloPagoEmpleado = new javax.swing.JLabel();
        legajoTitulo1 = new javax.swing.JLabel();
        buscarLegajoEmpl = new javax.swing.JTextField();
        mostrarListadoTitulo1 = new javax.swing.JLabel();
        mostrarSueldEmplBtn = new javax.swing.JPanel();
        mostrarSueldEmplTxt = new javax.swing.JLabel();
        panelDatos1 = new javax.swing.JPanel();
        cardPrincipal1 = new javax.swing.JPanel();
        card3 = new javax.swing.JPanel();
        tituloDatosSocio1 = new javax.swing.JLabel();
        panelDatosSocio1 = new javax.swing.JPanel();
        nomTxt1 = new javax.swing.JLabel();
        docTxt1 = new javax.swing.JLabel();
        cargoTxt = new javax.swing.JLabel();
        totalPagarTxt1 = new javax.swing.JLabel();
        vencTxt1 = new javax.swing.JLabel();
        pagarBtn1 = new javax.swing.JPanel();
        pagarTxt1 = new javax.swing.JLabel();
        card4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPagos = new javax.swing.JTable();
        tituloPagos = new javax.swing.JLabel();
        buscarBtn5 = new javax.swing.JPanel();
        buscarTxt5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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

        dashboard.setBackground(new java.awt.Color(80, 139, 166));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO1.png"))); // NOI18N
        dashboard.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 62, -1, -1));

        menuBtn.setBackground(new java.awt.Color(80, 139, 166));
        menuBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        menuTxt.setForeground(new java.awt.Color(255, 255, 255));
        menuTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/menu 32.png"))); // NOI18N
        menuTxt.setText("  Menu");
        menuTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuTxtMouseExited(evt);
            }
        });
        menuBtn.add(menuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        dashboard.add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 40));

        sociosBtn.setBackground(new java.awt.Color(80, 139, 166));
        sociosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sociosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        sociosTxt.setForeground(new java.awt.Color(255, 255, 255));
        sociosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/socios 32.png"))); // NOI18N
        sociosTxt.setText("  Socios");
        sociosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sociosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sociosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sociosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sociosTxtMouseExited(evt);
            }
        });
        sociosBtn.add(sociosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        dashboard.add(sociosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, 40));

        empleadosBtn.setBackground(new java.awt.Color(80, 139, 166));
        empleadosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empleadosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        empleadosTxt.setForeground(new java.awt.Color(255, 255, 255));
        empleadosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/empleados 32.png"))); // NOI18N
        empleadosTxt.setText("  Empleados");
        empleadosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleadosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empleadosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empleadosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empleadosTxtMouseExited(evt);
            }
        });
        empleadosBtn.add(empleadosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        dashboard.add(empleadosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 230, 40));

        pagosSociosBtn.setBackground(new java.awt.Color(80, 139, 166));
        pagosSociosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pagosSociosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        pagosSociosTxt.setForeground(new java.awt.Color(255, 255, 255));
        pagosSociosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/pagos socios 32.png"))); // NOI18N
        pagosSociosTxt.setText("  Pagos socios");
        pagosSociosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagosSociosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagosSociosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagosSociosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagosSociosTxtMouseExited(evt);
            }
        });
        pagosSociosBtn.add(pagosSociosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        dashboard.add(pagosSociosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 250, 40));

        sueldosEmpleadosBtn.setBackground(new java.awt.Color(80, 139, 166));
        sueldosEmpleadosBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sueldosEmpleadosTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        sueldosEmpleadosTxt.setForeground(new java.awt.Color(255, 255, 255));
        sueldosEmpleadosTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/sueldos empleados 32.png"))); // NOI18N
        sueldosEmpleadosTxt.setText("  Sueldos empleados");
        sueldosEmpleadosTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sueldosEmpleadosTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sueldosEmpleadosTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sueldosEmpleadosTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sueldosEmpleadosTxtMouseExited(evt);
            }
        });
        sueldosEmpleadosBtn.add(sueldosEmpleadosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, 240, 40));

        dashboard.add(sueldosEmpleadosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 250, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar Sesion");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        background.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 720));

        header.setBackground(new java.awt.Color(50, 115, 153));

        administracionTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        administracionTxt.setForeground(new java.awt.Color(255, 255, 255));
        administracionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administracionTxt.setText("ADMINISTRACIÓN");

        dateText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("{dayname} {day} de {month} de {year} ");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText)
                    .addComponent(administracionTxt))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(administracionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateText)
                .addGap(34, 34, 34))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 1010, 160));

        panelVentanas.setBackground(new java.awt.Color(255, 255, 255));
        panelVentanas.setForeground(new java.awt.Color(204, 204, 204));

        ventana1.setBackground(new java.awt.Color(255, 255, 255));
        ventana1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMenu.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloMenu.setForeground(new java.awt.Color(153, 153, 153));
        tituloMenu.setText("Menu principal");
        ventana1.add(tituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tituloSocio.setFont(new java.awt.Font("Corbel", 0, 22)); // NOI18N
        tituloSocio.setForeground(new java.awt.Color(153, 153, 153));
        tituloSocio.setText("Socios");
        ventana1.add(tituloSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        textoSocio.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        textoSocio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoSocio.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ventana1.add(textoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 180, 80));

        btnSocios.setBackground(new java.awt.Color(50, 115, 153));

        txtSocios.setBackground(new java.awt.Color(255, 255, 255));
        txtSocios.setForeground(new java.awt.Color(204, 204, 204));
        txtSocios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSocios.setText("Más info");
        txtSocios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSociosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSociosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSociosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSociosLayout = new javax.swing.GroupLayout(btnSocios);
        btnSocios.setLayout(btnSociosLayout);
        btnSociosLayout.setHorizontalGroup(
            btnSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnSociosLayout.setVerticalGroup(
            btnSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ventana1.add(btnSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 80, 30));

        fotoSocio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/pavon.png"))); // NOI18N
        fotoSocio1.setPreferredSize(new java.awt.Dimension(200, 180));
        ventana1.add(fotoSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 180));

        fondoSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/PanelSombreado2.png"))); // NOI18N
        ventana1.add(fondoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 420));

        tituloEmpleado.setFont(new java.awt.Font("Corbel", 0, 22)); // NOI18N
        tituloEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tituloEmpleado.setText("Empleados");
        ventana1.add(tituloEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        textoEmpleado.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        textoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoEmpleado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ventana1.add(textoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 180, 80));

        btnEmpleados.setBackground(new java.awt.Color(50, 115, 153));

        txtEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpleados.setForeground(new java.awt.Color(204, 204, 204));
        txtEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmpleados.setText("Más info");
        txtEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEmpleadosLayout = new javax.swing.GroupLayout(btnEmpleados);
        btnEmpleados.setLayout(btnEmpleadosLayout);
        btnEmpleadosLayout.setHorizontalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnEmpleadosLayout.setVerticalGroup(
            btnEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ventana1.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 80, 30));

        fotoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ZINEDINE_CENTURION.png"))); // NOI18N
        ventana1.add(fotoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 200, 180));

        fondoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/PanelSombreado2.png"))); // NOI18N
        ventana1.add(fondoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, 420));

        tituloPagosSocios.setFont(new java.awt.Font("Corbel", 0, 22)); // NOI18N
        tituloPagosSocios.setForeground(new java.awt.Color(153, 153, 153));
        tituloPagosSocios.setText("Pagos Socios");
        ventana1.add(tituloPagosSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        textoPagosSocios.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        textoPagosSocios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoPagosSocios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ventana1.add(textoPagosSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 180, 80));

        btnPagosSocio.setBackground(new java.awt.Color(50, 115, 153));

        txtPagosSocio.setBackground(new java.awt.Color(255, 255, 255));
        txtPagosSocio.setForeground(new java.awt.Color(204, 204, 204));
        txtPagosSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagosSocio.setText("Más info");
        txtPagosSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPagosSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPagosSocioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPagosSocioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPagosSocioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPagosSocioLayout = new javax.swing.GroupLayout(btnPagosSocio);
        btnPagosSocio.setLayout(btnPagosSocioLayout);
        btnPagosSocioLayout.setHorizontalGroup(
            btnPagosSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPagosSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnPagosSocioLayout.setVerticalGroup(
            btnPagosSocioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPagosSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ventana1.add(btnPagosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 80, 30));

        fotoPagosSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/infantiles.png"))); // NOI18N
        ventana1.add(fotoPagosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 200, 180));

        fondoPagosSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/PanelSombreado2.png"))); // NOI18N
        ventana1.add(fondoPagosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 240, 420));

        tituloSueldosEmpleados.setFont(new java.awt.Font("Corbel", 0, 22)); // NOI18N
        tituloSueldosEmpleados.setForeground(new java.awt.Color(153, 153, 153));
        tituloSueldosEmpleados.setText("Sueldos Empleados");
        ventana1.add(tituloSueldosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, -1, -1));

        textoSueldosEmpleados.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        textoSueldosEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textoSueldosEmpleados.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ventana1.add(textoSueldosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 180, 80));

        btnSueldosEmpleados.setBackground(new java.awt.Color(50, 115, 153));

        txtSueldosEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        txtSueldosEmpleados.setForeground(new java.awt.Color(204, 204, 204));
        txtSueldosEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSueldosEmpleados.setText("Más info");
        txtSueldosEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSueldosEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSueldosEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtSueldosEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSueldosEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSueldosEmpleadosLayout = new javax.swing.GroupLayout(btnSueldosEmpleados);
        btnSueldosEmpleados.setLayout(btnSueldosEmpleadosLayout);
        btnSueldosEmpleadosLayout.setHorizontalGroup(
            btnSueldosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSueldosEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        btnSueldosEmpleadosLayout.setVerticalGroup(
            btnSueldosEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSueldosEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        ventana1.add(btnSueldosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, 80, 30));

        fotoSueldosEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/tele.png"))); // NOI18N
        ventana1.add(fotoSueldosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 200, 180));

        fondoSueldosEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/PanelSombreado2.png"))); // NOI18N
        ventana1.add(fondoSueldosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 240, 420));

        panelVentanas.addTab("tab1", ventana1);

        ventana2.setBackground(new java.awt.Color(255, 255, 255));
        ventana2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ventana2FocusGained(evt);
            }
        });
        ventana2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloSocios.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloSocios.setForeground(new java.awt.Color(153, 153, 153));
        tituloSocios.setText("Socios");
        ventana2.add(tituloSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        buscarLabel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        buscarLabel.setForeground(new java.awt.Color(153, 153, 153));
        buscarLabel.setText(" Ingrese el legajo del socio a buscar.");
        buscarLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscarLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarLabelFocusLost(evt);
            }
        });
        buscarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarLabelMousePressed(evt);
            }
        });
        buscarLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLabelActionPerformed(evt);
            }
        });
        ventana2.add(buscarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 780, 40));

        buscarBtn.setBackground(new java.awt.Color(50, 115, 153));

        buscarTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buscarTxt.setForeground(new java.awt.Color(255, 255, 255));
        buscarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarTxt.setText("Buscar");
        buscarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtnLayout = new javax.swing.GroupLayout(buscarBtn);
        buscarBtn.setLayout(buscarBtnLayout);
        buscarBtnLayout.setHorizontalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buscarBtnLayout.setVerticalGroup(
            buscarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana2.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 110, 40));

        modificarBtn.setBackground(new java.awt.Color(50, 115, 153));

        modificarTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modificarTxt.setForeground(new java.awt.Color(255, 255, 255));
        modificarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarTxt.setText("Modificar");
        modificarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout modificarBtnLayout = new javax.swing.GroupLayout(modificarBtn);
        modificarBtn.setLayout(modificarBtnLayout);
        modificarBtnLayout.setHorizontalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modificarBtnLayout.setVerticalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana2.add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 110, 40));

        eliminarBtn.setBackground(new java.awt.Color(50, 115, 153));
        eliminarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBtnMouseClicked(evt);
            }
        });

        eliminarTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eliminarTxt.setForeground(new java.awt.Color(255, 255, 255));
        eliminarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarTxt.setText("Eliminar");
        eliminarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarBtnLayout = new javax.swing.GroupLayout(eliminarBtn);
        eliminarBtn.setLayout(eliminarBtnLayout);
        eliminarBtnLayout.setHorizontalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        eliminarBtnLayout.setVerticalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana2.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 110, 40));

        agregarBtn.setBackground(new java.awt.Color(50, 115, 153));
        agregarBtn.setForeground(new java.awt.Color(255, 255, 255));

        agregarTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agregarTxt.setForeground(new java.awt.Color(255, 255, 255));
        agregarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarTxt.setText("Agregar");
        agregarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout agregarBtnLayout = new javax.swing.GroupLayout(agregarBtn);
        agregarBtn.setLayout(agregarBtnLayout);
        agregarBtnLayout.setHorizontalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        agregarBtnLayout.setVerticalGroup(
            agregarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana2.add(agregarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 110, 40));

        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Legajo", "Nombre", "Apellido", "Email", "Documento", "Fecha de nacimiento", "Telefono", "Domicilio", "Sexo", "Obra Social", "Apto Medico", "Categoria", "Fecha de venc cuota "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable2FocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        ventana2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 930, 280));

        panelVentanas.addTab("tab2", ventana2);

        ventana3.setBackground(new java.awt.Color(255, 255, 255));
        ventana3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ventana3FocusGained(evt);
            }
        });
        ventana3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloSocios1.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloSocios1.setForeground(new java.awt.Color(153, 153, 153));
        tituloSocios1.setText("Empleado");
        ventana3.add(tituloSocios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 204, -1, -1));

        buscarLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        buscarLabel1.setForeground(new java.awt.Color(153, 153, 153));
        buscarLabel1.setText(" Ingrese el legajo del empleado a buscar.");
        buscarLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscarLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarLabel1FocusLost(evt);
            }
        });
        buscarLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarLabel1MousePressed(evt);
            }
        });
        buscarLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLabel1ActionPerformed(evt);
            }
        });
        ventana3.add(buscarLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 244, 780, 40));

        buscarBtn1.setBackground(new java.awt.Color(50, 115, 153));

        buscarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buscarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        buscarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarTxt1.setText("Buscar");
        buscarTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtn1Layout = new javax.swing.GroupLayout(buscarBtn1);
        buscarBtn1.setLayout(buscarBtn1Layout);
        buscarBtn1Layout.setHorizontalGroup(
            buscarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buscarBtn1Layout.setVerticalGroup(
            buscarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana3.add(buscarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 244, -1, -1));

        modificarBtn1.setBackground(new java.awt.Color(50, 115, 153));

        modificarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        modificarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        modificarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarTxt1.setText("Modificar");
        modificarTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout modificarBtn1Layout = new javax.swing.GroupLayout(modificarBtn1);
        modificarBtn1.setLayout(modificarBtn1Layout);
        modificarBtn1Layout.setHorizontalGroup(
            modificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        modificarBtn1Layout.setVerticalGroup(
            modificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modificarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana3.add(modificarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 624, -1, -1));

        agregarBtn1.setBackground(new java.awt.Color(50, 115, 153));
        agregarBtn1.setForeground(new java.awt.Color(255, 255, 255));

        agregarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agregarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        agregarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarTxt1.setText("Agregar");
        agregarTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout agregarBtn1Layout = new javax.swing.GroupLayout(agregarBtn1);
        agregarBtn1.setLayout(agregarBtn1Layout);
        agregarBtn1Layout.setHorizontalGroup(
            agregarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        agregarBtn1Layout.setVerticalGroup(
            agregarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana3.add(agregarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 624, -1, -1));

        jTable3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Legajo", "Nombre", "Apellido", "Email", "Documento", "Fecha de nacimiento", "Cargo", "Cobro Sueldo", "Fecha de Pago", "Proximo vencimiento de sueldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTable3);

        ventana3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 314, 930, 280));

        eliminarBtn1.setBackground(new java.awt.Color(50, 115, 153));
        eliminarBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBtn1MouseClicked(evt);
            }
        });

        eliminarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eliminarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        eliminarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarTxt1.setText("Eliminar");
        eliminarTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout eliminarBtn1Layout = new javax.swing.GroupLayout(eliminarBtn1);
        eliminarBtn1.setLayout(eliminarBtn1Layout);
        eliminarBtn1Layout.setHorizontalGroup(
            eliminarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        eliminarBtn1Layout.setVerticalGroup(
            eliminarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana3.add(eliminarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, -1, 40));

        panelVentanas.addTab("tab3", ventana3);

        ventana4.setBackground(new java.awt.Color(255, 255, 255));
        ventana4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPagoSocios.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloPagoSocios.setForeground(new java.awt.Color(153, 153, 153));
        tituloPagoSocios.setText("Pago de Cuotas Sociales");
        ventana4.add(tituloPagoSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        legajoTitulo.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        legajoTitulo.setText("BUSCAR SOCIO");
        legajoTitulo.setToolTipText("");
        ventana4.add(legajoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, 20));

        buscarLegajo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        buscarLegajo.setForeground(new java.awt.Color(153, 153, 153));
        buscarLegajo.setText(" Ingrese el legajo del socio a buscar.");
        buscarLegajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscarLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarLegajoFocusLost(evt);
            }
        });
        buscarLegajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarLegajoMousePressed(evt);
            }
        });
        buscarLegajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLegajoActionPerformed(evt);
            }
        });
        ventana4.add(buscarLegajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 40));

        buscarBtn2.setBackground(new java.awt.Color(50, 115, 153));

        buscarTxt2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buscarTxt2.setForeground(new java.awt.Color(255, 255, 255));
        buscarTxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarTxt2.setText("Buscar");
        buscarTxt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarTxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTxt2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarTxt2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarTxt2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtn2Layout = new javax.swing.GroupLayout(buscarBtn2);
        buscarBtn2.setLayout(buscarBtn2Layout);
        buscarBtn2Layout.setHorizontalGroup(
            buscarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buscarBtn2Layout.setVerticalGroup(
            buscarBtn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana4.add(buscarBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 40));

        mostrarListadoTitulo.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        mostrarListadoTitulo.setText("MOSTRAR LISTADO DE DEUDORES");
        mostrarListadoTitulo.setToolTipText("");
        ventana4.add(mostrarListadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 290, 20));

        mostrarDeudoresBtn.setBackground(new java.awt.Color(50, 115, 153));

        mostrarDeudoresTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        mostrarDeudoresTxt.setForeground(new java.awt.Color(255, 255, 255));
        mostrarDeudoresTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarDeudoresTxt.setText("Mostrar");
        mostrarDeudoresTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarDeudoresTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarDeudoresTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarDeudoresTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarDeudoresTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mostrarDeudoresBtnLayout = new javax.swing.GroupLayout(mostrarDeudoresBtn);
        mostrarDeudoresBtn.setLayout(mostrarDeudoresBtnLayout);
        mostrarDeudoresBtnLayout.setHorizontalGroup(
            mostrarDeudoresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarDeudoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        mostrarDeudoresBtnLayout.setVerticalGroup(
            mostrarDeudoresBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarDeudoresTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana4.add(mostrarDeudoresBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, 40));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new java.awt.CardLayout());

        cardPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cardPrincipalLayout = new javax.swing.GroupLayout(cardPrincipal);
        cardPrincipal.setLayout(cardPrincipalLayout);
        cardPrincipalLayout.setHorizontalGroup(
            cardPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        cardPrincipalLayout.setVerticalGroup(
            cardPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        panelDatos.add(cardPrincipal, "cardPrincipal");

        card1.setBackground(new java.awt.Color(255, 255, 255));
        card1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloDatosSocio.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloDatosSocio.setForeground(new java.awt.Color(153, 153, 153));
        tituloDatosSocio.setText("Datos del Socio");
        card1.add(tituloDatosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        panelDatosSocio.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomTxt.setText("Nombre y Apellido: ");
        panelDatosSocio.add(nomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        docTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docTxt.setText("Documento:");
        panelDatosSocio.add(docTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 40));

        totalPagarTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalPagarTxt.setText("Total a pagar: ");
        panelDatosSocio.add(totalPagarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 40));

        vencTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vencTxt.setText("Fecha de vencimiento: ");
        panelDatosSocio.add(vencTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));

        pagarBtn.setBackground(new java.awt.Color(50, 115, 153));

        pagarTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pagarTxt.setForeground(new java.awt.Color(255, 255, 255));
        pagarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarTxt.setText("PAGAR");
        pagarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pagarBtnLayout = new javax.swing.GroupLayout(pagarBtn);
        pagarBtn.setLayout(pagarBtnLayout);
        pagarBtnLayout.setHorizontalGroup(
            pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pagarBtnLayout.setVerticalGroup(
            pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagarBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelDatosSocio.add(pagarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 210, 50));

        card1.add(panelDatosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 320));

        panelDatos.add(card1, "card1");

        card2.setBackground(new java.awt.Color(255, 255, 255));
        card2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDeudas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaDeudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Legajo", "Nombre", "Apellido", "Fecha de Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDeudas.setName(""); // NOI18N
        tablaDeudas.setShowGrid(true);
        tablaDeudas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaDeudasFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDeudas);

        card2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 220));

        tituloDeudores.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloDeudores.setForeground(new java.awt.Color(153, 153, 153));
        tituloDeudores.setText("Listado de Deudores");
        card2.add(tituloDeudores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        enviarDeudaBtn.setBackground(new java.awt.Color(255, 255, 255));
        enviarDeudaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarDeudaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarDeudaBtnMouseClicked(evt);
            }
        });

        enviarDeudaTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enviarDeudaTxt.setForeground(new java.awt.Color(255, 51, 51));
        enviarDeudaTxt.setText("Enviar Informe de deuda por Email");

        enviarDeudaSep.setBackground(new java.awt.Color(255, 0, 0));
        enviarDeudaSep.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout enviarDeudaBtnLayout = new javax.swing.GroupLayout(enviarDeudaBtn);
        enviarDeudaBtn.setLayout(enviarDeudaBtnLayout);
        enviarDeudaBtnLayout.setHorizontalGroup(
            enviarDeudaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(enviarDeudaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarDeudaBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(enviarDeudaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enviarDeudaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enviarDeudaSep, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        enviarDeudaBtnLayout.setVerticalGroup(
            enviarDeudaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(enviarDeudaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(enviarDeudaBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(enviarDeudaTxt)
                    .addGap(5, 5, 5)
                    .addComponent(enviarDeudaSep, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        card2.add(enviarDeudaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 70));

        panelDatos.add(card2, "card2");

        ventana4.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 390, 430));

        panelVentanas.addTab("tab4", ventana4);

        ventana5.setBackground(new java.awt.Color(255, 255, 255));
        ventana5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPagoEmpleado.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloPagoEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        tituloPagoEmpleado.setText("Pago de Cuotas Sociales");
        ventana5.add(tituloPagoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        legajoTitulo1.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        legajoTitulo1.setText("BUSCAR EMPLEADO");
        legajoTitulo1.setToolTipText("");
        ventana5.add(legajoTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 20));

        buscarLegajoEmpl.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        buscarLegajoEmpl.setForeground(new java.awt.Color(153, 153, 153));
        buscarLegajoEmpl.setText(" Ingrese el legajo del empleado a buscar.");
        buscarLegajoEmpl.setToolTipText("");
        buscarLegajoEmpl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buscarLegajoEmpl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarLegajoEmplFocusLost(evt);
            }
        });
        buscarLegajoEmpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscarLegajoEmplMousePressed(evt);
            }
        });
        buscarLegajoEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLegajoEmplActionPerformed(evt);
            }
        });
        ventana5.add(buscarLegajoEmpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 40));

        mostrarListadoTitulo1.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        mostrarListadoTitulo1.setText("MOSTRAR LISTADO DE SUELDOS A PAGAR");
        mostrarListadoTitulo1.setToolTipText("");
        ventana5.add(mostrarListadoTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 310, 20));

        mostrarSueldEmplBtn.setBackground(new java.awt.Color(50, 115, 153));

        mostrarSueldEmplTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        mostrarSueldEmplTxt.setForeground(new java.awt.Color(255, 255, 255));
        mostrarSueldEmplTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarSueldEmplTxt.setText("Mostrar");
        mostrarSueldEmplTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarSueldEmplTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSueldEmplTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSueldEmplTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarSueldEmplTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mostrarSueldEmplBtnLayout = new javax.swing.GroupLayout(mostrarSueldEmplBtn);
        mostrarSueldEmplBtn.setLayout(mostrarSueldEmplBtnLayout);
        mostrarSueldEmplBtnLayout.setHorizontalGroup(
            mostrarSueldEmplBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarSueldEmplTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        mostrarSueldEmplBtnLayout.setVerticalGroup(
            mostrarSueldEmplBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarSueldEmplTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana5.add(mostrarSueldEmplBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, 40));

        panelDatos1.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos1.setLayout(new java.awt.CardLayout());

        cardPrincipal1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cardPrincipal1Layout = new javax.swing.GroupLayout(cardPrincipal1);
        cardPrincipal1.setLayout(cardPrincipal1Layout);
        cardPrincipal1Layout.setHorizontalGroup(
            cardPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        cardPrincipal1Layout.setVerticalGroup(
            cardPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        panelDatos1.add(cardPrincipal1, "cardPrincipal1");

        card3.setBackground(new java.awt.Color(255, 255, 255));
        card3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloDatosSocio1.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloDatosSocio1.setForeground(new java.awt.Color(153, 153, 153));
        tituloDatosSocio1.setText("Datos del Empleado");
        card3.add(tituloDatosSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        panelDatosSocio1.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomTxt1.setText("Nombre y Apellido: ");
        panelDatosSocio1.add(nomTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 310, 40));

        docTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        docTxt1.setText("Documento:");
        panelDatosSocio1.add(docTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 40));

        cargoTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cargoTxt.setText("Cargo: ");
        panelDatosSocio1.add(cargoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 40));

        totalPagarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalPagarTxt1.setText("Sueldo a pagar: ");
        panelDatosSocio1.add(totalPagarTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 40));

        vencTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vencTxt1.setText("Fecha de vencimiento: ");
        panelDatosSocio1.add(vencTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, 40));

        pagarBtn1.setBackground(new java.awt.Color(50, 115, 153));

        pagarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pagarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        pagarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarTxt1.setText("PAGAR SUELDO");
        pagarTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagarTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarTxt1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pagarTxt1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pagarTxt1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pagarBtn1Layout = new javax.swing.GroupLayout(pagarBtn1);
        pagarBtn1.setLayout(pagarBtn1Layout);
        pagarBtn1Layout.setHorizontalGroup(
            pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagarBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pagarTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pagarBtn1Layout.setVerticalGroup(
            pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagarBtn1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pagarTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelDatosSocio1.add(pagarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 50));

        card3.add(panelDatosSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 320));

        panelDatos1.add(card3, "card3");

        card4.setBackground(new java.awt.Color(255, 255, 255));
        card4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPagos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Legajo", "Nombre", "Apellido", "Fecha de Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPagos.setName(""); // NOI18N
        tablaPagos.setShowGrid(true);
        tablaPagos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaPagosFocusGained(evt);
            }
        });
        jScrollPane4.setViewportView(tablaPagos);

        card4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 330));

        tituloPagos.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloPagos.setForeground(new java.awt.Color(153, 153, 153));
        tituloPagos.setText("Listado de Empleados");
        card4.add(tituloPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelDatos1.add(card4, "card4");

        ventana5.add(panelDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 390, 430));

        buscarBtn5.setBackground(new java.awt.Color(50, 115, 153));

        buscarTxt5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        buscarTxt5.setForeground(new java.awt.Color(255, 255, 255));
        buscarTxt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscarTxt5.setText("Buscar");
        buscarTxt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarTxt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarTxt5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarTxt5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarTxt5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscarBtn5Layout = new javax.swing.GroupLayout(buscarBtn5);
        buscarBtn5.setLayout(buscarBtn5Layout);
        buscarBtn5Layout.setHorizontalGroup(
            buscarBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt5, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        buscarBtn5Layout.setVerticalGroup(
            buscarBtn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarTxt5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ventana5.add(buscarBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 40));

        panelVentanas.addTab("tab5", ventana5);

        background.add(panelVentanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 720));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void menuTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseEntered
        menuBtn.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_menuTxtMouseEntered

    private void menuTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseExited
        menuBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_menuTxtMouseExited

    private void sociosTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_sociosTxtMouseEntered
        sociosBtn.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_sociosTxtMouseEntered

    private void sociosTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_sociosTxtMouseExited
        sociosBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_sociosTxtMouseExited

    private void empleadosTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_empleadosTxtMouseEntered
        empleadosBtn.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_empleadosTxtMouseEntered

    private void empleadosTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_empleadosTxtMouseExited
        empleadosBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_empleadosTxtMouseExited

    private void pagosSociosTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_pagosSociosTxtMouseEntered
        pagosSociosBtn.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_pagosSociosTxtMouseEntered

    private void pagosSociosTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_pagosSociosTxtMouseExited
        pagosSociosBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_pagosSociosTxtMouseExited

    private void sueldosEmpleadosTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_sueldosEmpleadosTxtMouseEntered
        sueldosEmpleadosBtn.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_sueldosEmpleadosTxtMouseEntered

    private void sueldosEmpleadosTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_sueldosEmpleadosTxtMouseExited
        sueldosEmpleadosBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_sueldosEmpleadosTxtMouseExited

    private void menuTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_menuTxtMouseClicked
        panelVentanas.setSelectedIndex(0);
    }//GEN-LAST:event_menuTxtMouseClicked

    private void sociosTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_sociosTxtMouseClicked
        HashMap<Integer, Socio> array = obtenerListaDeSocios();
        llenarTablaConSocios(array);
        actualizarTabla();
        panelVentanas.setSelectedIndex(1);
        background.requestFocusInWindow();
    }//GEN-LAST:event_sociosTxtMouseClicked

    private void empleadosTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_empleadosTxtMouseClicked

        HashMap<Integer, Empleado> array = obtenerListaDeEmpleados();
        llenarTablaConEmpleados(array);
        actualizarTablaEmpleados();
        panelVentanas.setSelectedIndex(2);
        background.requestFocusInWindow();
    }//GEN-LAST:event_empleadosTxtMouseClicked

    private void pagosSociosTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_pagosSociosTxtMouseClicked
        panelVentanas.setSelectedIndex(3);
        background.requestFocusInWindow();
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cardLayout.show(panelDatos, "cardPrincipal");
    }//GEN-LAST:event_pagosSociosTxtMouseClicked

    private void sueldosEmpleadosTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_sueldosEmpleadosTxtMouseClicked
        panelVentanas.setSelectedIndex(4);
        background.requestFocusInWindow();
        CardLayout cardLayout = (CardLayout) panelDatos1.getLayout();
        cardLayout.show(panelDatos1, "cardPrincipal1");
    }//GEN-LAST:event_sueldosEmpleadosTxtMouseClicked

    private void txtSociosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_txtSociosMouseClicked
        HashMap<Integer, Socio> array = obtenerListaDeSocios();
        llenarTablaConSocios(array);
        actualizarTabla();
        panelVentanas.setSelectedIndex(1);
        background.requestFocusInWindow();
    }//GEN-LAST:event_txtSociosMouseClicked

    private void txtEmpleadosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_txtEmpleadosMouseClicked

        HashMap<Integer, Empleado> array = obtenerListaDeEmpleados();
        llenarTablaConEmpleados(array);
        actualizarTablaEmpleados();
        panelVentanas.setSelectedIndex(2);
        background.requestFocusInWindow();
    }//GEN-LAST:event_txtEmpleadosMouseClicked

    private void txtPagosSocioMouseClicked(MouseEvent evt) {//GEN-FIRST:event_txtPagosSocioMouseClicked
        panelVentanas.setSelectedIndex(3);
        background.requestFocusInWindow();
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cardLayout.show(panelDatos, "cardPrincipal");
    }//GEN-LAST:event_txtPagosSocioMouseClicked

    private void txtSueldosEmpleadosMouseClicked(MouseEvent evt) {//GEN-FIRST:event_txtSueldosEmpleadosMouseClicked
        panelVentanas.setSelectedIndex(4);
        background.requestFocusInWindow();
        CardLayout cardLayout = (CardLayout) panelDatos1.getLayout();
        cardLayout.show(panelDatos1, "cardPrincipal1");
    }//GEN-LAST:event_txtSueldosEmpleadosMouseClicked

    private void txtSociosMouseEntered(MouseEvent evt) {//GEN-FIRST:event_txtSociosMouseEntered
        btnSocios.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_txtSociosMouseEntered

    private void txtSociosMouseExited(MouseEvent evt) {//GEN-FIRST:event_txtSociosMouseExited
        btnSocios.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_txtSociosMouseExited

    private void txtEmpleadosMouseEntered(MouseEvent evt) {//GEN-FIRST:event_txtEmpleadosMouseEntered
        btnEmpleados.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_txtEmpleadosMouseEntered

    private void txtEmpleadosMouseExited(MouseEvent evt) {//GEN-FIRST:event_txtEmpleadosMouseExited
        btnEmpleados.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_txtEmpleadosMouseExited

    private void txtPagosSocioMouseEntered(MouseEvent evt) {//GEN-FIRST:event_txtPagosSocioMouseEntered
        btnPagosSocio.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_txtPagosSocioMouseEntered

    private void txtPagosSocioMouseExited(MouseEvent evt) {//GEN-FIRST:event_txtPagosSocioMouseExited
        btnPagosSocio.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_txtPagosSocioMouseExited

    private void txtSueldosEmpleadosMouseEntered(MouseEvent evt) {//GEN-FIRST:event_txtSueldosEmpleadosMouseEntered
        btnSueldosEmpleados.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_txtSueldosEmpleadosMouseEntered

    private void txtSueldosEmpleadosMouseExited(MouseEvent evt) {//GEN-FIRST:event_txtSueldosEmpleadosMouseExited
        btnSueldosEmpleados.setBackground(new Color(50,115,153));
    }//GEN-LAST:event_txtSueldosEmpleadosMouseExited

    private void buscarLabelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buscarLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarLabelActionPerformed

    private void ventana2FocusGained(FocusEvent evt) {                                     
        // Obtener los datos de los socios
        HashMap<Integer, Socio> array = obtenerListaDeSocios();

        // Llenar la tabla con los datos de los socios
        llenarTablaConSocios(array);

        // Actualizar la tabla
        actualizarTabla();



    }                                    

    private void modificarTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_modificarTxtMouseEntered
        modificarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_modificarTxtMouseEntered

    private void modificarTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_modificarTxtMouseExited
        modificarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_modificarTxtMouseExited

    private void eliminarTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_eliminarTxtMouseEntered
        eliminarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_eliminarTxtMouseEntered

    private void eliminarTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_eliminarTxtMouseExited
        eliminarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_eliminarTxtMouseExited

    private void agregarTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseEntered
        agregarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_agregarTxtMouseEntered

    private void agregarTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseExited
        agregarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_agregarTxtMouseExited

    private void buscarTxtMouseEntered(MouseEvent evt) {//GEN-FIRST:event_buscarTxtMouseEntered
        buscarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_buscarTxtMouseEntered

    private void buscarTxtMouseExited(MouseEvent evt) {//GEN-FIRST:event_buscarTxtMouseExited
        buscarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_buscarTxtMouseExited

    private void buscarLabelMousePressed(MouseEvent evt) {//GEN-FIRST:event_buscarLabelMousePressed
        if(buscarLabel.getText().equals(" Ingrese el legajo del socio a buscar.")){
            buscarLabel.setText("");
            buscarLabel.setForeground(Color.black);
        }
    }//GEN-LAST:event_buscarLabelMousePressed

    private void buscarLabelFocusLost(FocusEvent evt) {//GEN-FIRST:event_buscarLabelFocusLost
        if (buscarLabel.getText().isEmpty()) {
                buscarLabel.setText(" Ingrese el legajo del socio a buscar.");
                buscarLabel.setForeground(Color.GRAY);
            }
    }//GEN-LAST:event_buscarLabelFocusLost

    private void agregarTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_agregarTxtMouseClicked
        HashMap<Integer, Socio> listaDeSocios = obtenerListaDeSocios();
        int proximoLegajo = encontrarProximoLegajoDisponibleSocio(listaDeSocios);
            InfoSocio infoSocio = new InfoSocio(proximoLegajo);
            infoSocio.setVisible(true);
            infoSocio.pack();
            infoSocio.setLocationRelativeTo(null);  
            this.dispose();
    }//GEN-LAST:event_agregarTxtMouseClicked

    
    
    
    public int encontrarProximoLegajoDisponibleSocio(HashMap<Integer, Socio> listaDeSocios) {
        // Inicializar el próximo legajo a 1
        int proximoLegajo = 1;

        // Recorrer los legajos existentes para encontrar el próximo libre
        while (listaDeSocios.containsKey(proximoLegajo)) {
            proximoLegajo++;
        }

        return proximoLegajo;
    }
    
    
    public int encontrarProximoLegajoDisponibleEmpleado(HashMap<Integer, Empleado> listaDeEmpleados) {
        // Inicializar el próximo legajo a 1
        int proximoLegajo = 1;

        // Recorrer los legajos existentes para encontrar el próximo libre
        while (listaDeEmpleados.containsKey(proximoLegajo)) {
            proximoLegajo++;
        }

        return proximoLegajo;
    }
    

    private void buscarTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_buscarTxtMouseClicked
        try {
            ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
            contenedoraSocio.cargarSociosDeJson("Socios.json");
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            String legajoStr = buscarLabel.getText().trim();

            if (legajoStr.isEmpty() || legajoStr.equals("Ingrese el legajo del socio a buscar.")) {
                contenedoraSocio.listar().values().forEach(this::addSocioToTable);
            } else {
                int legajo = Integer.parseInt(legajoStr);
                Socio socio = contenedoraSocio.buscar(legajo);
                addSocioToTable(socio);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buscarTxtMouseClicked

    private void eliminarTxtMouseClicked(MouseEvent evt) {//GEN-FIRST:event_eliminarTxtMouseClicked
 ContenedoraSocio contenedora = new ContenedoraSocio();
    try {
        contenedora.cargarSociosDeJson("Socios.json");
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    int[] selectedRows = jTable2.getSelectedRows();
    
    if (selectedRows.length < 1) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más socios a eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
    } else {
        // Construir el mensaje de confirmación
        String message = "¿Estás seguro de eliminar el/los siguiente(s) socio(s)?\n\n";
        for (int i = 0; i < selectedRows.length; i++) {
            int legajo = (int) jTable2.getValueAt(selectedRows[i], 0);
            String nombre = (String) jTable2.getValueAt(selectedRows[i], 1);
            message += "Nombre: " + nombre + ", Legajo: " + legajo + "\n";
        }

        // Mostrar el cuadro de diálogo de confirmación
        int option = JOptionPane.showConfirmDialog(this, message, "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Eliminar los socios seleccionados
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                try {
                    int legajo = (int) jTable2.getValueAt(selectedRows[i], 0);
                    contenedora.baja(legajo);
                    contenedora.guardarSociosEnJson("Socios.json");
                    model.removeRow(selectedRows[i]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
            }//GEN-LAST:event_eliminarTxtMouseClicked

    private void eliminarBtnMouseClicked(MouseEvent evt) {//GEN-FIRST:event_eliminarBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBtnMouseClicked

    private void modificarTxtMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int filaSeleccionada = jTable2.getSelectedRowCount();

        if (filaSeleccionada != 1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un solo socio para modificar a la vez.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = jTable2.getSelectedRow();

            int legajo = (int) jTable2.getValueAt(fila, 0);
            String nombre = (String) jTable2.getValueAt(fila, 1);
            String apellido = (String) jTable2.getValueAt(fila, 2);
            String email = (String) jTable2.getValueAt(fila, 3);
            int dni = (int) jTable2.getValueAt(fila, 4);
            String fechaNac = (String) jTable2.getValueAt(fila, 5);
            int telefono = (int) jTable2.getValueAt(fila, 6);
            String domicilio = (String) jTable2.getValueAt(fila, 7);
            String sexo = (String) jTable2.getValueAt(fila, 8);
            String obraSocial = (String) jTable2.getValueAt(fila, 9);
            Categoria categoriaFilaSelec = (Categoria) jTable2.getValueAt(fila, 11);


            HashMap<Integer,Socio> socios = new HashMap<>();
            socios = obtenerListaDeSocios();

                Socio socio = socios.get(legajo);
                // Aquí puedes acceder a los atributos del socio
                LocalDate fechaVencimiento = socio.getFechaVencimientoPago();
                LocalDate fechaRegistro = socio.getFechaRegistroPago();
                // Hacer algo con fechaVencimiento, por ejemplo:
                System.out.println("Fecha de vencimiento del socio: " + fechaVencimiento);

            ModificarSocio modifSoc = new ModificarSocio(fechaVencimiento,fechaRegistro,legajo, nombre, apellido, dni, fechaNac, email, telefono, domicilio, sexo, obraSocial, categoriaFilaSelec);
            modifSoc.setVisible(true);
            modifSoc.pack();
            modifSoc.setLocationRelativeTo(null);
            this.dispose();
        }
    }
    private void addSocioToTable(Socio socio) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[]{socio.getLegajo(), socio.getNombre(), socio.getApellido(), socio.getEmail(), socio.getDni(), socio.getFechaDeNacimiento(), socio.getTelefono(), socio.getDomicilio(), socio.getSexo(), socio.getObraSocial(), socio.isAptoMedico(), socio.getCategoria(), socio.getFechaVencimientoPago()});
    }

    public Object[] socioToRow(Socio socio) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return new Object[] {
            socio.getLegajo(),
            socio.getNombre(),
            socio.getApellido(),
            socio.getEmail(),
            socio.getDni(),
            socio.getFechaDeNacimiento(),
            socio.getTelefono(),
            socio.getDomicilio(),
            socio.getSexo(),
            socio.getObraSocial(),
            socio.isAptoMedico(),
            socio.getCategoria(),
            socio.getFechaVencimientoPago().format(formatter)
        };
    }

public HashMap<Integer, Socio> obtenerListaDeSocios() {
    ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
    try {
        contenedoraSocio.cargarSociosDeJson("Socios.json");
    } catch (IOException e) {
        e.printStackTrace();
    }
    return contenedoraSocio.listar();
}



    public void llenarTablaConSocios(HashMap<Integer, Socio> listaDeSocios) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Limpia la tabla existente

        // Convertir los valores del mapa a una lista para ordenar por legajo
        List<Socio> sociosOrdenados = new ArrayList<>(listaDeSocios.values());
        sociosOrdenados.sort(Comparator.comparingInt(Socio::getLegajo)); // Ordenar por legajo ascendente

        // Agregar los socios ordenados a la tabla
        for (Socio socio : sociosOrdenados) {
            model.addRow(socioToRow(socio));
        }
    }
    
    // Llamada al método para llenar la tabla
    public void actualizarTabla() {
    HashMap<Integer, Socio> socios = obtenerListaDeSocios(); // Método que devuelve la lista de socios
    llenarTablaConSocios(socios);
}

    //Añadir deudores a la tabla
    public void addDeudoresToTable(Socio socio){
    DefaultTableModel model = (DefaultTableModel) tablaDeudas.getModel();
    model.addRow(new Object[]{socio.getLegajo(), socio.getNombre(), socio.getApellido(), socio.getFechaVencimientoPago()});
    }
    
    //Metodo para agregar los deudores ordenados a la tabla
    public Object[] deudToRow(Socio socio){
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    return new Object[]{socio.getLegajo(), socio.getNombre(), socio.getApellido(), socio.getFechaVencimientoPago().format(formatter)};
    }
    
    //Obtener Lista de Socios que todavia no pagaron la cuota
    public HashMap<Integer, Socio> obtenerListaDeudores(){
        ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
        HashMap<Integer, Socio> deudores = new HashMap<>();
        try {
            contenedoraSocio.cargarSociosDeJson("Socios.json");
            HashMap<Integer, Socio> socios = contenedoraSocio.listar();
            LocalDate hoy = LocalDate.now();

            for (Map.Entry<Integer, Socio> entry : socios.entrySet()) {
                Socio socio = entry.getValue();
                // Si la fecha de vencimiento de pago es anterior a hoy, el socio es deudor
                if (socio.getFechaVencimientoPago().isBefore(hoy)) {
                    deudores.put(entry.getKey(), socio);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deudores;
    }

    //Llenar la table de Socios Deudores
    public void llenarTablaDeudores(HashMap<Integer, Socio> listaDeDeudores){
        DefaultTableModel model = (DefaultTableModel) tablaDeudas.getModel();
        model.setRowCount(0);

        List<Socio> deudoresOrdenados = new ArrayList<>(listaDeDeudores.values());
        deudoresOrdenados.sort(Comparator.comparingInt(Socio::getLegajo));

        for(Socio socio : deudoresOrdenados){
            model.addRow(deudToRow(socio));
        }
    }
    
    //Actualizar la tabla
    public void actualizarTablaDeudores(){
        HashMap<Integer, Socio> deudores = obtenerListaDeudores();
        llenarTablaDeudores(deudores);
    }

     //Añadir empleados a los que no se les pago el sueldo a la tabla
    public void addEmpleadosSinPagarToTable(Empleado empleado){
        DefaultTableModel model = (DefaultTableModel) tablaPagos.getModel();
        model.addRow(new Object[]{empleado.getLegajo(), empleado.getNombre(), empleado.getApellido(), empleado.getFechaVencimientoPago()});
    }

    //Metodo para agregar los empleados a los que se deben pagar el sueldo a la tabla
    public Object[] empleadoAPagarToRow(Empleado empleado){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return new Object[]{empleado.getLegajo(), empleado.getNombre(), empleado.getApellido(), empleado.getFechaVencimientoPago().format(formatter)};
    }

    //Obtener lista de empleados a los que todavia no se les pago el sueldo
    public HashMap<Integer, Empleado> obtenerListaDeEmpleadosAPagar(){
        ContenedoraEmpleado contenedoraEmpleado = new ContenedoraEmpleado();
        HashMap<Integer, Empleado> empleadosAPagar = new HashMap<>();
        try{
            contenedoraEmpleado.cargarEmpleadosDeJson("Empleados.json");
            HashMap<Integer, Empleado> empleados = contenedoraEmpleado.listar();
            LocalDate hoy = LocalDate.now();
            for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
                Empleado empleado = entry.getValue();
                if(empleado.getFechaVencimientoPago().isBefore(hoy)){
                    empleadosAPagar.put(entry.getKey(), empleado);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return empleadosAPagar;
    }

    //Llenar la tabla de empleados a los que todavia no se les pago
    public void llenarTablaEmpleadosAPagar(HashMap<Integer, Empleado> listaDeEmpleadosAPagar){
        DefaultTableModel model = (DefaultTableModel) tablaPagos.getModel();
        model.setRowCount(0);

        List<Empleado> empleadosAPagarOrdenados = new ArrayList<>(listaDeEmpleadosAPagar.values());
        empleadosAPagarOrdenados.sort(Comparator.comparingInt(Empleado::getLegajo));

        for(Empleado empleado : empleadosAPagarOrdenados){
            model.addRow(empleadoAPagarToRow(empleado));
        }
    }

    //Actualizar la tabla
    public void actualizarTablaEmpleadosAPagar(){
        HashMap<Integer, Empleado> empleadosAPagar = obtenerListaDeEmpleadosAPagar();
        llenarTablaEmpleadosAPagar(empleadosAPagar);
    }

    
    private void buscarLabel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarLabel1FocusLost
        if (buscarLabel1.getText().isEmpty()) {
                buscarLabel1.setText(" Ingrese el legajo del empleado a buscar.");
                buscarLabel1.setForeground(Color.GRAY);
            }
    }//GEN-LAST:event_buscarLabel1FocusLost

    private void buscarLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLabel1MousePressed
        if(buscarLabel1.getText().equals(" Ingrese el legajo del empleado a buscar.")){
            buscarLabel1.setText("");
            buscarLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_buscarLabel1MousePressed

    private void buscarLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLabel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarLabel1ActionPerformed

    private void buscarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt1MouseClicked
        try {
            ContenedoraEmpleado contenedoraEmpleado = new ContenedoraEmpleado();
            contenedoraEmpleado.cargarEmpleadosDeJson("Empleados.json");
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            String legajoStr = buscarLabel1.getText().trim();

            if (legajoStr.isEmpty() || legajoStr.equals("Ingrese el legajo del empleado a buscar.")) {
                contenedoraEmpleado.listar().values().forEach(this::addEmpleadoToTable);
            } else {
                int legajo = Integer.parseInt(legajoStr);
                Empleado empleado = contenedoraEmpleado.buscar(legajo);
                addEmpleadoToTable(empleado);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buscarTxt1MouseClicked

    private void buscarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt1MouseEntered
        buscarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_buscarTxt1MouseEntered

    private void buscarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt1MouseExited
        buscarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_buscarTxt1MouseExited

    private void modificarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseClicked
         int filaSeleccionada = jTable3.getSelectedRowCount();

        if (filaSeleccionada != 1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un solo empleado para modificar a la vez.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
        } else {
            int fila = jTable3.getSelectedRow();

            int legajo = (int) jTable3.getValueAt(fila, 0);
            String nombre = (String) jTable3.getValueAt(fila, 1);
            String apellido = (String) jTable3.getValueAt(fila, 2);
            String email = (String) jTable3.getValueAt(fila, 3);
            int dni = (int) jTable3.getValueAt(fila, 4);
            String fechaNac = (String) jTable3.getValueAt(fila, 5);
            Cargo cargoFilaSelec = (Cargo) jTable3.getValueAt(fila, 6);


            HashMap<Integer,Empleado> empleados = new HashMap<>();
            empleados = obtenerListaDeEmpleados();

                Empleado empleado = empleados.get(legajo);
                // Aquí puedes acceder a los atributos del socio
                LocalDate fechaVencimiento = empleado.getFechaVencimientoPago();
                LocalDate fechaRegistro = empleado.getFechaRegistroPago();
                // Hacer algo con fechaVencimiento, por ejemplo:
                System.out.println("Fecha de vencimiento del empleado: " + fechaVencimiento);

            ModificarEmpleado modifEmp = null;
             try {
                 modifEmp = new ModificarEmpleado(fechaVencimiento,fechaRegistro,legajo, nombre, apellido, dni, fechaNac, email, cargoFilaSelec);
             } catch (UnsupportedLookAndFeelException ex) {
                 Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
             }
            modifEmp.setVisible(true);
            modifEmp.pack();
            modifEmp.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_modificarTxt1MouseClicked

    private void modificarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseEntered
         modificarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_modificarTxt1MouseEntered

    private void modificarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseExited
        modificarBtn.setBackground(new Color(59,132,173));    }//GEN-LAST:event_modificarTxt1MouseExited

    private void agregarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxt1MouseClicked
         HashMap<Integer, Empleado> listaDeEmpleados = obtenerListaDeEmpleados();
        int proximoLegajo = encontrarProximoLegajoDisponibleEmpleado(listaDeEmpleados);
            InfoEmpleado infoEmpleado = new InfoEmpleado(proximoLegajo);
            infoEmpleado.setVisible(true);
            infoEmpleado.pack();
            infoEmpleado.setLocationRelativeTo(null);  
            this.dispose();
    }//GEN-LAST:event_agregarTxt1MouseClicked

    private void agregarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTxt1MouseEntered

    private void agregarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTxt1MouseExited

    private void jTable2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2FocusGained

    private void ventana3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ventana3FocusGained
        // Obtener los datos de los socios
        HashMap<Integer, Empleado> array = obtenerListaDeEmpleados();

        // Llenar la tabla con los datos de los socios
        llenarTablaConEmpleados(array);

        // Actualizar la tabla
        actualizarTablaEmpleados();

        jTable3.getTableHeader().setReorderingAllowed(false);
    }//GEN-LAST:event_ventana3FocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void buscarLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarLegajoFocusLost
         if (buscarLegajo.getText().isEmpty()) {
                buscarLegajo.setText(" Ingrese el legajo del socio a buscar.");
                buscarLegajo.setForeground(Color.GRAY);
            }
    }//GEN-LAST:event_buscarLegajoFocusLost

    private void buscarLegajoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLegajoMousePressed
        if(buscarLegajo.getText().equals(" Ingrese el legajo del socio a buscar.")){
            buscarLegajo.setText("");
            buscarLegajo.setForeground(Color.black);
        }
    }//GEN-LAST:event_buscarLegajoMousePressed

    private void buscarLegajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLegajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarLegajoActionPerformed

    private void buscarTxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt2MouseClicked
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        try {

            ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
            contenedoraSocio.cargarSociosDeJson("Socios.json");
           
            String legajoStr = buscarLegajo.getText().trim();

            if (legajoStr.isEmpty() || legajoStr.equals("Ingrese el legajo del socio a buscar.")) {
                /// EN EL CASO QUE NO SE ENCUENTRE
                JOptionPane.showMessageDialog(this, "Debe ingresar un legajo valido para buscar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
                cardLayout.show(panelDatos, "cardPrincipal");
            } else {
                int legajo = Integer.parseInt(legajoStr);
                Socio socio = contenedoraSocio.buscar(legajo);
                socio.calcularPago();

                // EN EL CASO QUE SE ENCUENTRE Y SEA VALIDO
                nomTxt.setText("Nombre y Apellido: " + socio.getNombre() + " " + socio.getApellido());
                docTxt.setText("Documento: " + socio.getDni());
                totalPagarTxt.setText("Total a pagar: $" + socio.pagarCuota(0));
                vencTxt.setText("Fecha de vencimiento: " + socio.getFechaVencimientoPago().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                cardLayout.show(panelDatos, "card1");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "No se ha encontrado un socio con el legajo ingresado.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            cardLayout.show(panelDatos, "cardPrincipal");
        }
    }//GEN-LAST:event_buscarTxt2MouseClicked

    private void buscarTxt2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt2MouseEntered
        buscarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_buscarTxt2MouseEntered

    private void buscarTxt2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt2MouseExited
        buscarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_buscarTxt2MouseExited

    private void mostrarDeudoresTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDeudoresTxtMouseEntered
         mostrarDeudoresBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_mostrarDeudoresTxtMouseEntered

    private void mostrarDeudoresTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDeudoresTxtMouseExited
        mostrarDeudoresBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_mostrarDeudoresTxtMouseExited

    private void mostrarDeudoresTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarDeudoresTxtMouseClicked
        HashMap<Integer, Socio> mapa = obtenerListaDeudores();

                // Llenar la tabla con los datos de los socios
                llenarTablaDeudores(mapa);

                // Actualizar la tabla
                actualizarTablaDeudores();        
        //Llenar la tabla que esta en el card2 con los datos de los socios que todavia no hayan pagado la cuota (deudores)
        //Enviar mail a TODOS los socios que esten en esta tabla
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cardLayout.show(panelDatos, "card2");
    }//GEN-LAST:event_mostrarDeudoresTxtMouseClicked

    private void pagarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseEntered
        pagarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_pagarTxtMouseEntered

    private void pagarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseExited
        pagarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_pagarTxtMouseExited

    private void pagarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseClicked
        try {
            ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
            contenedoraSocio.cargarSociosDeJson("Socios.json");
            String legajoStr = buscarLegajo.getText().trim();
            int legajo = Integer.parseInt(legajoStr);
            Socio socio = contenedoraSocio.buscar(legajo);
            socio.calcularPago();
            int valorTotal = socio.pagarCuota(0);
            socio.registrarPago();
            Correos mail = new Correos();
            new Thread(() -> {
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    String fechaRegistroPagoComoCadena = socio.getFechaRegistroPago().format(formatter);
                    mail.CorreoPagoSocio(socio.getEmail(), socio.getNombre(), fechaRegistroPagoComoCadena, valorTotal);
                } catch (Exception e) {
                    e.printStackTrace();
                    // Manejo de errores durante el envío del correo
                }
            }).start();

            contenedoraSocio.guardarSociosEnJson("Socios.json");

            PagoExitoso pagoExitoso = new PagoExitoso();
            pagoExitoso.setVisible(true);
            pagoExitoso.pack();
            pagoExitoso.setLocationRelativeTo(null);
            this.dispose();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_pagarTxtMouseClicked

    private void tablaDeudasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaDeudasFocusGained
        
    }//GEN-LAST:event_tablaDeudasFocusGained

    private void enviarDeudaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarDeudaBtnMouseClicked
        ContenedoraSocio contenedoraSocio = new ContenedoraSocio();
        try {
            contenedoraSocio.cargarSociosDeJson("Socios.json");
            HashMap<Integer, Socio> socios = contenedoraSocio.listar();
            for(Socio socio : socios.values()){
                if(socio.getFechaVencimientoPago().isBefore(LocalDate.now())){
                    Correos mail = new Correos();
                    new Thread(() -> {
                        try {
                            mail.CorreoDeuda(socio.getEmail());
                        } catch (Exception e) {
                            e.printStackTrace();
                            // Manejo de errores durante el envío del correo
                        }
                    }).start();
                }
            }
            JOptionPane.showMessageDialog(this, "Se han enviado correctamente los mails de deuda.\n", "CONFIRMACION", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enviarDeudaBtnMouseClicked

    private void buscarLegajoEmplFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarLegajoEmplFocusLost
        if (buscarLegajoEmpl.getText().isEmpty()) {
            buscarLegajoEmpl.setText(" Ingrese el legajo del empleado a buscar.");
            buscarLegajoEmpl.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_buscarLegajoEmplFocusLost

    private void buscarLegajoEmplMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLegajoEmplMousePressed
        if(buscarLegajoEmpl.getText().equals(" Ingrese el legajo del empleado a buscar.")){
            buscarLegajoEmpl.setText("");
            buscarLegajoEmpl.setForeground(Color.black);
        }
    }//GEN-LAST:event_buscarLegajoEmplMousePressed

    private void buscarLegajoEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLegajoEmplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarLegajoEmplActionPerformed

    private void mostrarSueldEmplTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSueldEmplTxtMouseClicked
        HashMap<Integer, Empleado> mapa = obtenerListaDeEmpleadosAPagar();

        // Llenar la tabla con los datos de los socios
        llenarTablaEmpleadosAPagar(mapa);

        // Actualizar la tabla
        actualizarTablaEmpleadosAPagar();
        //Llenar la tabla que esta en el card2 con los datos de los socios que todavia no hayan pagado la cuota (deudores)
        //Enviar mail a TODOS los socios que esten en esta tabla
        CardLayout cardLayout = (CardLayout) panelDatos1.getLayout();
        cardLayout.show(panelDatos1, "card4");
    }//GEN-LAST:event_mostrarSueldEmplTxtMouseClicked

    private void mostrarSueldEmplTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSueldEmplTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarSueldEmplTxtMouseEntered

    private void mostrarSueldEmplTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSueldEmplTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarSueldEmplTxtMouseExited

    private void pagarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseClicked
        // ENVIAR MAIL DE QUE SE PAGO
        // SUMAR UN MES A LA FECHA DE COBRO
        // ACTUALIZAR JSON DE EMPLEADOS
    }//GEN-LAST:event_pagarTxt1MouseClicked

    private void pagarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseEntered
        pagarBtn1.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_pagarTxt1MouseEntered

    private void pagarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseExited
        pagarBtn1.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_pagarTxt1MouseExited

    private void tablaPagosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaPagosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPagosFocusGained

    private void buscarTxt5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt5MouseEntered
        buscarBtn5.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_buscarTxt5MouseEntered

    private void buscarTxt5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt5MouseExited
        buscarBtn5.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_buscarTxt5MouseExited

    private void buscarTxt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarTxt5MouseClicked
                CardLayout cardLayout = (CardLayout) panelDatos1.getLayout();
        try {

            ContenedoraEmpleado contenedoraEmpleado = new ContenedoraEmpleado();
            contenedoraEmpleado.cargarEmpleadosDeJson("Empleados.json");
           
            String legajoStr = buscarLegajoEmpl.getText().trim();

            if (legajoStr.isEmpty() || legajoStr.equals("Ingrese el legajo del empleado a buscar.")) {
                /// EN EL CASO QUE NO SE ENCUENTRE
                JOptionPane.showMessageDialog(this, "Debe ingresar un legajo valido para buscar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
                cardLayout.show(panelDatos1, "cardPrincipal1");
            } else {
                int legajo = Integer.parseInt(legajoStr);
                Empleado empleado = contenedoraEmpleado.buscar(legajo);
                empleado.calcularPago();

                // EN EL CASO QUE SE ENCUENTRE Y SEA VALIDO
                nomTxt1.setText("Nombre y Apellido: " + empleado.getNombre() + " " + empleado.getApellido());
                docTxt1.setText("Documento: " + empleado.getDni());
                cargoTxt.setText("Cargo: " + empleado.getCargo());
                totalPagarTxt1.setText("Total a pagar: $" + empleado.calcularPagoConInteres());
                vencTxt1.setText("Fecha de vencimiento: " + empleado.getFechaVencimientoPago().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                cardLayout.show(panelDatos1, "card3");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "No se ha encontrado un empleado con el legajo ingresado.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
            cardLayout.show(panelDatos1, "cardPrincipal1");
        }    
    }//GEN-LAST:event_buscarTxt5MouseClicked

    private void eliminarBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtn1MouseClicked
        ContenedoraEmpleado contenedora = new ContenedoraEmpleado();
    try {
        contenedora.cargarEmpleadosDeJson("Empleados.json");
    } catch (IOException ex) {
        ex.printStackTrace();
    }

    DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    int[] selectedRows = jTable3.getSelectedRows();

    if (selectedRows.length < 1) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más empleados a eliminar.\n", "AVISO", JOptionPane.ERROR_MESSAGE);
    } else {
        // Construir el mensaje de confirmación
        String message = "¿Estás seguro de eliminar el/los siguiente(s) empleado(s)?\n\n";
        for (int i = 0; i < selectedRows.length; i++) {
            int legajo = (int) jTable3.getValueAt(selectedRows[i], 0);
            String nombre = (String) jTable3.getValueAt(selectedRows[i], 1);
            message += "Nombre: " + nombre + ", Legajo: " + legajo + "\n";
        }

        // Mostrar el cuadro de diálogo de confirmación
        int option = JOptionPane.showConfirmDialog(this, message, "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Eliminar los socios seleccionados
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                try {
                    int legajo = (int) jTable3.getValueAt(selectedRows[i], 0);
                    contenedora.baja(legajo);
                    contenedora.guardarEmpleadosEnJson("Empleados.json");
                    model.removeRow(selectedRows[i]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_eliminarBtn1MouseClicked
    }
    
    
    
    private void addEmpleadoToTable(Empleado empleado) {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.addRow(new Object[]{empleado.getLegajo(), empleado.getNombre(), empleado.getApellido(), empleado.getEmail(), empleado.getDni(), empleado.getFechaDeNacimiento(), empleado.getCargo(), empleado.isCobro(), empleado.getFechaRegistroPago(), empleado.getFechaVencimientoPago()});
    }


    public Object[] empleadoToRow(Empleado empleado) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return new Object[]{
                empleado.getLegajo(),
                empleado.getNombre(),
                empleado.getApellido(),
                empleado.getEmail(),
                empleado.getDni(),
                empleado.getFechaDeNacimiento(),
                empleado.getCargo(),
                empleado.isCobro(),
                empleado.getFechaRegistroPago().format(formatter),
                empleado.getFechaVencimientoPago().format(formatter)
        };
    }

    public HashMap<Integer, Empleado> obtenerListaDeEmpleados() {
        ContenedoraEmpleado contenedoraEmpleado = new ContenedoraEmpleado();
        try {
            contenedoraEmpleado.cargarEmpleadosDeJson("Empleados.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenedoraEmpleado.listar();
    }

    public void llenarTablaConEmpleados(HashMap<Integer, Empleado> listaDeEmpleados) {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0); // Limpia la tabla existente

        // Convertir los valores del mapa a una lista para ordenar por legajo
        List<Empleado> empleadosOrdenados = new ArrayList<>(listaDeEmpleados.values());
        empleadosOrdenados.sort(Comparator.comparingInt(Empleado::getLegajo)); // Ordenar por legajo ascendente

        // Agregar los empleados ordenados a la tabla
        for (Empleado empleado : empleadosOrdenados) {
            model.addRow(empleadoToRow(empleado));
        }
    }

    // Llamada al método para llenar la tabla
    public void actualizarTablaEmpleados() {
        HashMap<Integer, Empleado> empleados = obtenerListaDeEmpleados(); // Método que devuelve la lista de empleados
        llenarTablaConEmpleados(empleados);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administracionTxt;
    private javax.swing.JPanel agregarBtn;
    private javax.swing.JPanel agregarBtn1;
    private javax.swing.JLabel agregarTxt;
    private javax.swing.JLabel agregarTxt1;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnEmpleados;
    private javax.swing.JPanel btnPagosSocio;
    private javax.swing.JPanel btnSocios;
    private javax.swing.JPanel btnSueldosEmpleados;
    private javax.swing.JPanel buscarBtn;
    private javax.swing.JPanel buscarBtn1;
    private javax.swing.JPanel buscarBtn2;
    private javax.swing.JPanel buscarBtn5;
    private javax.swing.JTextField buscarLabel;
    private javax.swing.JTextField buscarLabel1;
    private javax.swing.JTextField buscarLegajo;
    private javax.swing.JTextField buscarLegajoEmpl;
    private javax.swing.JLabel buscarTxt;
    private javax.swing.JLabel buscarTxt1;
    private javax.swing.JLabel buscarTxt2;
    private javax.swing.JLabel buscarTxt5;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JPanel card3;
    private javax.swing.JPanel card4;
    private javax.swing.JPanel cardPrincipal;
    private javax.swing.JPanel cardPrincipal1;
    private javax.swing.JLabel cargoTxt;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel docTxt;
    private javax.swing.JLabel docTxt1;
    private javax.swing.JPanel eliminarBtn;
    private javax.swing.JPanel eliminarBtn1;
    private javax.swing.JLabel eliminarTxt;
    private javax.swing.JLabel eliminarTxt1;
    private javax.swing.JPanel empleadosBtn;
    private javax.swing.JLabel empleadosTxt;
    private javax.swing.JPanel enviarDeudaBtn;
    private javax.swing.JSeparator enviarDeudaSep;
    private javax.swing.JLabel enviarDeudaTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitMenu;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoEmpleado;
    private javax.swing.JLabel fondoPagosSocio;
    private javax.swing.JLabel fondoSocio;
    private javax.swing.JLabel fondoSueldosEmpleados;
    private javax.swing.JLabel fotoEmpleado;
    private javax.swing.JLabel fotoPagosSocio;
    private javax.swing.JLabel fotoSocio1;
    private javax.swing.JLabel fotoSueldosEmpleados;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel legajoTitulo;
    private javax.swing.JLabel legajoTitulo1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menuBtn;
    private javax.swing.JLabel menuTxt;
    private javax.swing.JPanel modificarBtn;
    private javax.swing.JPanel modificarBtn1;
    private javax.swing.JLabel modificarTxt;
    private javax.swing.JLabel modificarTxt1;
    private javax.swing.JPanel mostrarDeudoresBtn;
    private javax.swing.JLabel mostrarDeudoresTxt;
    private javax.swing.JLabel mostrarListadoTitulo;
    private javax.swing.JLabel mostrarListadoTitulo1;
    private javax.swing.JPanel mostrarSueldEmplBtn;
    private javax.swing.JLabel mostrarSueldEmplTxt;
    private javax.swing.JLabel nomTxt;
    private javax.swing.JLabel nomTxt1;
    private javax.swing.JPanel pagarBtn;
    private javax.swing.JPanel pagarBtn1;
    private javax.swing.JLabel pagarTxt;
    private javax.swing.JLabel pagarTxt1;
    private javax.swing.JPanel pagosSociosBtn;
    private javax.swing.JLabel pagosSociosTxt;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatos1;
    private javax.swing.JPanel panelDatosSocio;
    private javax.swing.JPanel panelDatosSocio1;
    private javax.swing.JTabbedPane panelVentanas;
    private javax.swing.JPanel sociosBtn;
    private javax.swing.JLabel sociosTxt;
    private javax.swing.JPanel sueldosEmpleadosBtn;
    private javax.swing.JLabel sueldosEmpleadosTxt;
    private javax.swing.JTable tablaDeudas;
    private javax.swing.JTable tablaPagos;
    private javax.swing.JLabel textoEmpleado;
    private javax.swing.JLabel textoPagosSocios;
    private javax.swing.JLabel textoSocio;
    private javax.swing.JLabel textoSueldosEmpleados;
    private javax.swing.JLabel tituloDatosSocio;
    private javax.swing.JLabel tituloDatosSocio1;
    private javax.swing.JLabel tituloDeudores;
    private javax.swing.JLabel tituloEmpleado;
    private javax.swing.JLabel tituloMenu;
    private javax.swing.JLabel tituloPagoEmpleado;
    private javax.swing.JLabel tituloPagoSocios;
    private javax.swing.JLabel tituloPagos;
    private javax.swing.JLabel tituloPagosSocios;
    private javax.swing.JLabel tituloSocio;
    private javax.swing.JLabel tituloSocios;
    private javax.swing.JLabel tituloSocios1;
    private javax.swing.JLabel tituloSueldosEmpleados;
    private javax.swing.JLabel totalPagarTxt;
    private javax.swing.JLabel totalPagarTxt1;
    private javax.swing.JLabel txtEmpleados;
    private javax.swing.JLabel txtPagosSocio;
    private javax.swing.JLabel txtSocios;
    private javax.swing.JLabel txtSueldosEmpleados;
    private javax.swing.JLabel vencTxt;
    private javax.swing.JLabel vencTxt1;
    private javax.swing.JPanel ventana1;
    private javax.swing.JPanel ventana2;
    private javax.swing.JPanel ventana3;
    private javax.swing.JPanel ventana4;
    private javax.swing.JPanel ventana5;
    // End of variables declaration//GEN-END:variables
}

