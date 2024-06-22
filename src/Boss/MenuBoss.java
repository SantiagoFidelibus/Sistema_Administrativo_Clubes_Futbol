/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boss;

import Containers.ContenedoraEmpleado;
import Containers.ContenedoraSocio;
import Mail.Correos;
import Menuusages.ModifExitosa;
import Menuusages.TimeUpdater;
import Model.Cargo;
import Model.Categoria;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import Login.Login;
import Model.Empleado;
import Model.Socio;

/**
 *
 * @author sanch
 */
public class MenuBoss extends javax.swing.JFrame {
    int xMouse, yMouse;

    /**
     * Creates new form MenuBoss
     */

    public MenuBoss(int ventana) {

        initComponents();
        panelVentana.setSelectedIndex(ventana);
        try {
            File iconFile = new File("src/com/images/LOGO1.png"); // Ruta de tu imagen
            BufferedImage iconImage = ImageIO.read(iconFile);
            setIconImage(iconImage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        setTitle("Administracion Acantilados FC");

        TimeUpdater timeUpdater = new TimeUpdater(timeText);
        timeUpdater.start();
        setDate();


        cargoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoBoxActionPerformed(evt);
            }
        });
        categoriaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBoxActionPerformed(evt);
            }
        });

        // Agregar el WindowListener a esta instancia de JFrame (MenuBoss)
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Aquí cargas los datos en el ComboBox cuando la ventana se abre
                actualizarTablaSalario(); // Método que implementas para cargar los datos
                actualizarTablaCuota(); // Método que implementas para cargar los datos

                for (Categoria categoria : Categoria.values()) {
                    categoriaBox.addItem(categoria);
                }
                categoriaBox.setSelectedIndex(-1);


                for (Cargo cargo : Cargo.values()) {
                    cargoBox.addItem(cargo);
                }
                cargoBox.setSelectedIndex(-1);

            }
        });


    }

    private void CuoteNewTxt1KeyTyped(KeyEvent evt) {
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
            evt.consume();
    }

    private void salaryNewTxtKeyTyped(KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_telefonoTxtKeyTyped

    private void setDate() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText(dia + " de " + meses[month - 1] + " de " + year);
    }


    private void cargoBoxActionPerformed(java.awt.event.ActionEvent evt) {
        Object selectedItem = cargoBox.getSelectedItem();
        if (selectedItem != null) {
            // Hacer algo con selectedItem
            cargoModTxt.setText(selectedItem.toString());  // Ejemplo de uso seguro
        } else {
            // Manejar caso donde no hay nada seleccionado
            cargoModTxt.setText("");
        }
    }

    private void categoriaBoxActionPerformed(java.awt.event.ActionEvent evt) {
        Object selectedItem = categoriaBox.getSelectedItem();
        if (selectedItem != null) {
            // Hacer algo con selectedItem
            cargoModTxt1.setText(selectedItem.toString());  // Ejemplo de uso seguro
        } else {
            cargoModTxt1.setText("");
        }
    }

    private void actualizarTablaCuota() {
        DefaultTableModel modelo = new DefaultTableModel();

        // Añadir columnas al modelo
        modelo.addColumn("Categoria");
        modelo.addColumn("Valor");

        // Llenar datos del modelo desde el enum Categoria
        for (Categoria categoria : Categoria.values()) {
            modelo.addRow(new Object[]{categoria.name(), categoria.getCuota()});
        }


        // Establecer el modelo en la tabla de cuotas
        TablaCuota.setModel(modelo);
    }

    // Método para configurar el modelo de datos de la tabla de salarios
    private void actualizarTablaSalario() {
        DefaultTableModel modelo = new DefaultTableModel();

        // Añadir columnas al modelo
        modelo.addColumn("Cargo");
        modelo.addColumn("Valor");

        // Llenar datos del modelo desde el enum Cargo
        for (Cargo cargo : Cargo.values()) {
            modelo.addRow(new Object[]{cargo.name(), cargo.getSalario()});
        }

        // Establecer el modelo en la tabla de salarios
        TablaSalario.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitMenu = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        TotalBtn1 = new javax.swing.JLabel();
        verTxt = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        SalaryBtn = new javax.swing.JLabel();
        salaryTxt = new javax.swing.JLabel();
        cuoteBtn = new javax.swing.JLabel();
        CuoteTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        timeText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        administracionTxt = new javax.swing.JLabel();
        panelVentana = new javax.swing.JTabbedPane();
        ViewWindow = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCuota = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSalario = new javax.swing.JTable();
        tituloSocios = new javax.swing.JLabel();
        tituloSocios1 = new javax.swing.JLabel();
        SalaryWindow = new javax.swing.JPanel();
        SelecTitle = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        cardPrincipal = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        cargoModTxt = new javax.swing.JLabel();
        panelDatosSocio = new javax.swing.JPanel();
        pagarBtn = new javax.swing.JPanel();
        pagarTxt = new javax.swing.JLabel();
        salaryNewTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cargoBox = new javax.swing.JComboBox<>();
        CuoteWindow = new javax.swing.JPanel();
        SelecTitle1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        panelDatosModif = new javax.swing.JPanel();
        cardPrincipal1 = new javax.swing.JPanel();
        cardModif = new javax.swing.JPanel();
        cargoModTxt1 = new javax.swing.JLabel();
        panelDatosSocio1 = new javax.swing.JPanel();
        pagarTxt1 = new javax.swing.JLabel();
        pagarBtn1 = new javax.swing.JPanel();
        cuoteNewTxt1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        exitMenu.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 40));

        jPanel1.add(exitMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));
        jPanel1.add(TotalBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 40));

        verTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        verTxt.setForeground(new java.awt.Color(255, 255, 255));
        verTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/viewMoney.png"))); // NOI18N
        verTxt.setText("Ver Total");
        verTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTxtMouseExited(evt);
            }
        });
        jPanel1.add(verTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 40));

        Dashboard.setBackground(new java.awt.Color(80, 139, 166));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO1.png"))); // NOI18N
        Dashboard.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        SalaryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalaryBtnMouseClicked(evt);
            }
        });
        Dashboard.add(SalaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 40));

        salaryTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        salaryTxt.setForeground(new java.awt.Color(255, 255, 255));
        salaryTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salario.png"))); // NOI18N
        salaryTxt.setText("Modificar Sueldo");
        salaryTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salaryTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                salaryTxtMouseExited(evt);
            }
        });
        Dashboard.add(salaryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 40));
        Dashboard.add(cuoteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 170, 40));

        CuoteTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        CuoteTxt.setForeground(new java.awt.Color(255, 255, 255));
        CuoteTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cuota.png"))); // NOI18N
        CuoteTxt.setText("Modificar Cuota");
        CuoteTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CuoteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuoteTxtMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CuoteTxtMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                CuoteTxtMouseExited(evt);
            }
        });
        Dashboard.add(CuoteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cerrar Sesion");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 30));

        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 470));

        header.setBackground(new java.awt.Color(50, 115, 153));

        timeText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        timeText.setForeground(new java.awt.Color(255, 255, 255));
        timeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dateText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("{dayname} {day} de {month} de {year} ");

        administracionTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        administracionTxt.setForeground(new java.awt.Color(255, 255, 255));
        administracionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administracionTxt.setText("Jefe");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(headerLayout.createSequentialGroup()
                                                .addComponent(administracionTxt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(headerLayout.createSequentialGroup()
                                                .addComponent(dateText)
                                                .addGap(0, 111, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(administracionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(dateText)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 700, 130));

        ViewWindow.setBackground(new java.awt.Color(255, 255, 255));
        ViewWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaCuota.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Categoria", "Valor"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCuota);

        ViewWindow.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 195, 149));

        TablaSalario.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Cargo", "Valor"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaSalario);

        ViewWindow.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 272, 204, 149));

        tituloSocios.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloSocios.setForeground(new java.awt.Color(153, 153, 153));
        tituloSocios.setText("Cuota por categoria");
        ViewWindow.add(tituloSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 360, -1));

        tituloSocios1.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloSocios1.setForeground(new java.awt.Color(153, 153, 153));
        tituloSocios1.setText("Salario por cargo");
        ViewWindow.add(tituloSocios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, -1));

        panelVentana.addTab("tab1", ViewWindow);

        SalaryWindow.setBackground(new java.awt.Color(255, 255, 255));
        SalaryWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelecTitle.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        SelecTitle.setText("Seleccione el cargo");
        SelecTitle.setToolTipText("");
        SalaryWindow.add(SelecTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 20));

        Title.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 153, 153));
        Title.setText("Modificar Salario por Cargo");
        SalaryWindow.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 590, -1));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setLayout(new java.awt.CardLayout());

        cardPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cardPrincipalLayout = new javax.swing.GroupLayout(cardPrincipal);
        cardPrincipal.setLayout(cardPrincipalLayout);
        cardPrincipalLayout.setHorizontalGroup(
                cardPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        cardPrincipalLayout.setVerticalGroup(
                cardPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE)
        );

        panelDatos.add(cardPrincipal, "cardPrincipal");

        card1.setBackground(new java.awt.Color(255, 255, 255));
        card1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargoModTxt.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        cargoModTxt.setForeground(new java.awt.Color(153, 153, 153));
        card1.add(cargoModTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 170, 40));

        panelDatosSocio.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pagarBtn.setBackground(new java.awt.Color(50, 115, 153));

        pagarTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pagarTxt.setForeground(new java.awt.Color(255, 255, 255));
        pagarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarTxt.setText("MODIFICAR");
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pagarBtnLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(pagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        pagarBtnLayout.setVerticalGroup(
                pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pagarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pagarBtnLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(pagarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelDatosSocio.add(pagarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 50));

        salaryNewTxt.setText("Ingrese el nuevo valor");
        salaryNewTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelDatosSocio.add(salaryNewTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 268, Short.MAX_VALUE)
        );

        panelDatosSocio.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        card1.add(panelDatosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        panelDatos.add(card1, "card1");

        SalaryWindow.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 250, 270));

        cargoBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargoBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cargoBoxMousePressed(evt);
            }
        });
        SalaryWindow.add(cargoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 40));

        panelVentana.addTab("tab2", SalaryWindow);

        CuoteWindow.setBackground(new java.awt.Color(255, 255, 255));
        CuoteWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelecTitle1.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        SelecTitle1.setText("Seleccione la categoria");
        SelecTitle1.setToolTipText("");
        CuoteWindow.add(SelecTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 20));

        Title1.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        Title1.setForeground(new java.awt.Color(153, 153, 153));
        Title1.setText("Modificar Cuota por Categoria");
        CuoteWindow.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 590, -1));

        categoriaBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoriaBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaBoxMousePressed(evt);
            }
        });
        CuoteWindow.add(categoriaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 40));

        panelDatosModif.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosModif.setLayout(new java.awt.CardLayout());

        cardPrincipal1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cardPrincipal1Layout = new javax.swing.GroupLayout(cardPrincipal1);
        cardPrincipal1.setLayout(cardPrincipal1Layout);
        cardPrincipal1Layout.setHorizontalGroup(
                cardPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        cardPrincipal1Layout.setVerticalGroup(
                cardPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE)
        );

        panelDatosModif.add(cardPrincipal1, "cardPrincipal1");

        cardModif.setBackground(new java.awt.Color(255, 255, 255));
        cardModif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        cardModif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargoModTxt1.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        cargoModTxt1.setForeground(new java.awt.Color(153, 153, 153));
        cardModif.add(cargoModTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 40));

        panelDatosSocio1.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pagarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        pagarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        pagarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pagarTxt1.setText("MODIFICAR");
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
        panelDatosSocio1.add(pagarTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 50));

        pagarBtn1.setBackground(new java.awt.Color(50, 115, 153));

        javax.swing.GroupLayout pagarBtn1Layout = new javax.swing.GroupLayout(pagarBtn1);
        pagarBtn1.setLayout(pagarBtn1Layout);
        pagarBtn1Layout.setHorizontalGroup(
                pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        pagarBtn1Layout.setVerticalGroup(
                pagarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        panelDatosSocio1.add(pagarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 50));

        cuoteNewTxt1.setText("Ingrese el nuevo valor");
        cuoteNewTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cuoteNewTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuoteNewTxt1MouseClicked(evt);
            }
        });
        cuoteNewTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuoteNewTxt1ActionPerformed(evt);
            }
        });
        panelDatosSocio1.add(cuoteNewTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 268, Short.MAX_VALUE)
        );

        panelDatosSocio1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        cardModif.add(panelDatosSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        panelDatosModif.add(cardModif, "card2");

        CuoteWindow.add(panelDatosModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 250, 270));

        panelVentana.addTab("tab3", CuoteWindow);

        jPanel1.add(panelVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -40, 630, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

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

    private void exitMenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_exitMenuMouseDragged

    private void exitMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_exitMenuMousePressed

    private void verTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTxtMouseClicked
        panelVentana.setSelectedIndex(0);
        actualizarTablaCuota();
        actualizarTablaSalario();
    }//GEN-LAST:event_verTxtMouseClicked

    private void verTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTxtMouseEntered
        TotalBtn1.setBackground(new Color(50, 115, 153));
    }//GEN-LAST:event_verTxtMouseEntered

    private void verTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTxtMouseExited
        TotalBtn1.setBackground(new Color(80, 139, 166));
    }//GEN-LAST:event_verTxtMouseExited

    private void salaryTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTxtMouseClicked

    private void salaryTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTxtMouseEntered

    private void salaryTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryTxtMouseExited

    private void CuoteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuoteTxtMouseClicked
        panelVentana.setSelectedIndex(2);

        categoriaBox.setSelectedIndex(-1);
        CardLayout cardLayout = (CardLayout) panelDatosModif.getLayout();
        cardLayout.show(panelDatosModif, "cardPrincipal1");

    }//GEN-LAST:event_CuoteTxtMouseClicked

    private void CuoteTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuoteTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_CuoteTxtMouseEntered

    private void CuoteTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuoteTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CuoteTxtMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void pagarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseClicked
        Cargo c = (Cargo) cargoBox.getSelectedItem();

// Obtener el texto del salario ingresado por el usuario
        String salaryText = salaryNewTxt.getText().trim();

// Verificar si el texto no está vacío y es un número válido
        if (!salaryText.isEmpty()) {
            try {
                // Convertir el texto del salario a un número entero
                int salario = Integer.parseInt(salaryText);

                // Actualizar el salario del objeto Cargo
                c.setSalario(salario);

                // Guardar la configuración actualizada
                ConfigSandC.actualizarArchivoDePropiedades();
                ContenedoraEmpleado cs = new ContenedoraEmpleado();
                cs.cargarEmpleadosDeJson("Empleados.json");

                // Lista para almacenar empleados de la categoría seleccionada
                ArrayList<Empleado> empleadosCategoria = new ArrayList<>();

                // Iterar sobre el HashMap para filtrar empleados por categoría
                for (Empleado empleado : cs.listar().values()) {
                    if (empleado.getCargo().equals(c)) {
                        empleadosCategoria.add(empleado);
                    }
                }
                Correos mail = new Correos();
                new Thread(() -> {
                    try {
                        for (Empleado e : empleadosCategoria) {
                             mail.CorreoModifSueldo(e.getEmail(), e.getCargo().getSalario());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        // Manejo de errores durante el envío del correo
                    }
                }).start();
                // Mostrar ventana de modificación exitosa
                ModifExitosa modifEx = new ModifExitosa(2);
                modifEx.setVisible(true);
                modifEx.pack();
                modifEx.setLocationRelativeTo(null);

                // Cerrar la ventana actual
                this.dispose();


        } catch(NumberFormatException e){
            // Manejar la excepción si el texto no es un número válido
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el salario.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch(IOException e){
            throw new RuntimeException(e);

        }
    }


    }//GEN-LAST:event_pagarTxtMouseClicked

    private void pagarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseEntered
        pagarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_pagarTxtMouseEntered

    private void pagarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxtMouseExited
        pagarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_pagarTxtMouseExited

    private void cargoBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoBoxMousePressed
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cargoBox.setSelectedIndex(0);
        cardLayout.show(panelDatos, "card1");


    }//GEN-LAST:event_cargoBoxMousePressed

    private void SalaryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalaryBtnMouseClicked
        panelVentana.setSelectedIndex(1);
        cargoBox.setSelectedIndex(-1);
          categoriaBox.setSelectedIndex(0);
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cardLayout.show(panelDatos, "cardPrincipal");
    }//GEN-LAST:event_SalaryBtnMouseClicked

    private void pagarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseClicked
        Categoria c = (Categoria) categoriaBox.getSelectedItem();

// Obtener el texto del salario ingresado por el usuario
        String salaryText = cuoteNewTxt1.getText().trim();

// Verificar si el texto no está vacío y es un número válido
        if (!salaryText.isEmpty()) {
            try {
                // Convertir el texto del salario a un número entero
                int cuota = Integer.parseInt(salaryText);

                // Actualizar el salario del objeto Cargo
                c.setCuota(cuota);

                // Guardar la configuración actualizada
                ConfigSandC.actualizarArchivoDePropiedades();
                ContenedoraSocio cs = new ContenedoraSocio();
                cs.cargarSociosDeJson("Socios.json");

                // Lista para almacenar empleados de la categoría seleccionada
                ArrayList<Socio> sociosCategoria = new ArrayList<>();

                // Iterar sobre el HashMap para filtrar empleados por categoría
                for (Socio socio : cs.listar().values()) {
                    if (socio.getCategoria().equals(c)) {
                        sociosCategoria.add(socio);
                    }
                }
                Correos mail = new Correos();
                new Thread(() -> {
                    try {
                        for (Socio s : sociosCategoria) {
                            mail.CorreoModifCuota(s.getEmail(), s.getCategoria().getCuota());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        // Manejo de errores durante el envío del correo
                    }
                }).start();
                // Mostrar ventana de modificación exitosa
                ModifExitosa modifEx = new ModifExitosa(2);
                modifEx.setVisible(true);
                modifEx.pack();
                modifEx.setLocationRelativeTo(null);

                // Cerrar la ventana actual
                this.dispose();


            } catch (NumberFormatException e) {
                // Manejar la excepción si el texto no es un número válido
                JOptionPane.showMessageDialog(this, "Ingrese un número válido para el salario.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                throw new RuntimeException(e);

            }

        }
    }//GEN-LAST:event_pagarTxt1MouseClicked

    private void pagarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarTxt1MouseEntered

    private void pagarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarTxt1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pagarTxt1MouseExited

    private void categoriaBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaBoxMousePressed

        CardLayout cardLayout = (CardLayout) panelDatosModif.getLayout();
        categoriaBox.setSelectedIndex(0);
            cardLayout.show(panelDatosModif, "card2");

    }//GEN-LAST:event_categoriaBoxMousePressed

    private void cuoteNewTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuoteNewTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuoteNewTxt1ActionPerformed

    private void cuoteNewTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuoteNewTxt1MouseClicked
      if(cuoteNewTxt1.getText().equals("Ingrese el nuevo valor")){
          cuoteNewTxt1.setText("");
      }else if(cuoteNewTxt1.getText().equals("")){
          cuoteNewTxt1.setText("Ingrese el nuevo valor");
      }
    }//GEN-LAST:event_cuoteNewTxt1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuoteTxt;
    private javax.swing.JPanel CuoteWindow;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JLabel SalaryBtn;
    private javax.swing.JPanel SalaryWindow;
    private javax.swing.JLabel SelecTitle;
    private javax.swing.JLabel SelecTitle1;
    private javax.swing.JTable TablaCuota;
    private javax.swing.JTable TablaSalario;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel TotalBtn1;
    private javax.swing.JPanel ViewWindow;
    private javax.swing.JLabel administracionTxt;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel cardModif;
    private javax.swing.JPanel cardPrincipal;
    private javax.swing.JPanel cardPrincipal1;
    private javax.swing.JComboBox<Cargo> cargoBox;
    private javax.swing.JLabel cargoModTxt;
    private javax.swing.JLabel cargoModTxt1;
    private javax.swing.JComboBox<Categoria> categoriaBox;
    private javax.swing.JLabel cuoteBtn;
    private javax.swing.JTextField cuoteNewTxt1;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitMenu;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pagarBtn;
    private javax.swing.JPanel pagarBtn1;
    private javax.swing.JLabel pagarTxt;
    private javax.swing.JLabel pagarTxt1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosModif;
    private javax.swing.JPanel panelDatosSocio;
    private javax.swing.JPanel panelDatosSocio1;
    private javax.swing.JTabbedPane panelVentana;
    private javax.swing.JTextField salaryNewTxt;
    private javax.swing.JLabel salaryTxt;
    private javax.swing.JLabel timeText;
    private javax.swing.JLabel tituloSocios;
    private javax.swing.JLabel tituloSocios1;
    private javax.swing.JLabel verTxt;
    // End of variables declaration//GEN-END:variables
}
