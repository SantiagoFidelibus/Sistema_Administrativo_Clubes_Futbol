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

        background = new javax.swing.JPanel();
        exitMenu = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        verTotalBtn = new javax.swing.JPanel();
        verTotalTxt = new javax.swing.JLabel();
        modificarSueldoBtn = new javax.swing.JPanel();
        modificarSueldoTxt = new javax.swing.JLabel();
        modificarCuotaBtn = new javax.swing.JPanel();
        modificarCuotaTxt = new javax.swing.JLabel();
        cerrarSesionBtn = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        timeText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        administracionTxt = new javax.swing.JLabel();
        panelVentana = new javax.swing.JTabbedPane();
        ViewWindow = new javax.swing.JPanel();
        tituloCargo = new javax.swing.JLabel();
        tituloCategoria = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSalario = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCuota = new javax.swing.JTable();
        SalaryWindow = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        SelecTitle = new javax.swing.JLabel();
        cargoBox = new javax.swing.JComboBox<>();
        panelDatos = new javax.swing.JPanel();
        cardPrincipal = new javax.swing.JPanel();
        card1 = new javax.swing.JPanel();
        panelDatosSocio = new javax.swing.JPanel();
        cargoModTxt = new javax.swing.JLabel();
        salaryNewTxt = new javax.swing.JTextField();
        modificarBtn = new javax.swing.JPanel();
        modificarTxt = new javax.swing.JLabel();
        CuoteWindow = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        SelecTitle1 = new javax.swing.JLabel();
        categoriaBox = new javax.swing.JComboBox<>();
        panelDatosModif = new javax.swing.JPanel();
        cardPrincipal1 = new javax.swing.JPanel();
        cardModif = new javax.swing.JPanel();
        panelDatosSocio1 = new javax.swing.JPanel();
        cargoModTxt1 = new javax.swing.JLabel();
        cuoteNewTxt1 = new javax.swing.JTextField();
        modificarBtn1 = new javax.swing.JPanel();
        modificarTxt1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        exitMenu.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, 40));

        background.add(exitMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        Dashboard.setBackground(new java.awt.Color(80, 139, 166));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO1.png"))); // NOI18N
        Dashboard.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        verTotalBtn.setBackground(new java.awt.Color(80, 139, 166));
        verTotalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verTotalBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verTotalTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        verTotalTxt.setForeground(new java.awt.Color(255, 255, 255));
        verTotalTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/viewMoney.png"))); // NOI18N
        verTotalTxt.setText("Ver Total");
        verTotalTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verTotalTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verTotalTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verTotalTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verTotalTxtMouseExited(evt);
            }
        });
        verTotalBtn.add(verTotalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        Dashboard.add(verTotalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 40));

        modificarSueldoBtn.setBackground(new java.awt.Color(80, 139, 166));
        modificarSueldoBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarSueldoTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        modificarSueldoTxt.setForeground(new java.awt.Color(255, 255, 255));
        modificarSueldoTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/salario.png"))); // NOI18N
        modificarSueldoTxt.setText("Modificar Sueldo");
        modificarSueldoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarSueldoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarSueldoTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarSueldoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarSueldoTxtMouseExited(evt);
            }
        });
        modificarSueldoBtn.add(modificarSueldoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 174, 40));

        Dashboard.add(modificarSueldoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 40));

        modificarCuotaBtn.setBackground(new java.awt.Color(80, 139, 166));
        modificarCuotaBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarCuotaTxt.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        modificarCuotaTxt.setForeground(new java.awt.Color(255, 255, 255));
        modificarCuotaTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cuota.png"))); // NOI18N
        modificarCuotaTxt.setText("Modificar Cuota");
        modificarCuotaTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarCuotaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarCuotaTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarCuotaTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarCuotaTxtMouseExited(evt);
            }
        });
        modificarCuotaBtn.add(modificarCuotaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 174, 40));

        Dashboard.add(modificarCuotaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 180, 40));

        cerrarSesionBtn.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cerrarSesionBtn.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesionBtn.setText("Cerrar Sesion");
        cerrarSesionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionBtnMouseClicked(evt);
            }
        });
        Dashboard.add(cerrarSesionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, 30));

        background.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 470));

        header.setBackground(new java.awt.Color(50, 115, 153));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        timeText.setForeground(new java.awt.Color(255, 255, 255));
        timeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.add(timeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 14, 170, 40));

        dateText.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("{dayname} {day} de {month} de {year} ");
        header.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        administracionTxt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        administracionTxt.setForeground(new java.awt.Color(255, 255, 255));
        administracionTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administracionTxt.setText("JEFE");
        header.add(administracionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 32));

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 700, 130));

        ViewWindow.setBackground(new java.awt.Color(255, 255, 255));
        ViewWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCargo.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloCargo.setForeground(new java.awt.Color(153, 153, 153));
        tituloCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCargo.setText("Salario por cargo");
        ViewWindow.add(tituloCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 250, -1));

        tituloCategoria.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        tituloCategoria.setForeground(new java.awt.Color(153, 153, 153));
        tituloCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCategoria.setText("Cuota por categoria");
        ViewWindow.add(tituloCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 250, -1));

        TablaSalario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cargo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaSalario);

        ViewWindow.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 250, 180));

        TablaCuota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCuota);

        ViewWindow.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 250, 180));

        panelVentana.addTab("tab1", ViewWindow);

        SalaryWindow.setBackground(new java.awt.Color(255, 255, 255));
        SalaryWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 153, 153));
        Title.setText("Modificar Salario por Cargo");
        SalaryWindow.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, -1));

        SelecTitle.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        SelecTitle.setForeground(new java.awt.Color(153, 153, 153));
        SelecTitle.setText("SELECCIONE EL CARGO");
        SelecTitle.setToolTipText("");
        SalaryWindow.add(SelecTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 20));

        cargoBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargoBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cargoBoxMousePressed(evt);
            }
        });
        SalaryWindow.add(cargoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 40));

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

        panelDatosSocio.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDatosSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargoModTxt.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        cargoModTxt.setForeground(new java.awt.Color(153, 153, 153));
        panelDatosSocio.add(cargoModTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 40));

        salaryNewTxt.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        salaryNewTxt.setText(" Ingrese el nuevo valor.");
        salaryNewTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        salaryNewTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaryNewTxtFocusLost(evt);
            }
        });
        salaryNewTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salaryNewTxtMousePressed(evt);
            }
        });
        panelDatosSocio.add(salaryNewTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 40));

        modificarBtn.setBackground(new java.awt.Color(50, 115, 153));

        modificarTxt.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        modificarTxt.setForeground(new java.awt.Color(255, 255, 255));
        modificarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarTxt.setText("MODIFICAR");
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
            .addGroup(modificarBtnLayout.createSequentialGroup()
                .addComponent(modificarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        modificarBtnLayout.setVerticalGroup(
            modificarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarBtnLayout.createSequentialGroup()
                .addComponent(modificarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelDatosSocio.add(modificarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 50));

        card1.add(panelDatosSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        panelDatos.add(card1, "card1");

        SalaryWindow.add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 250, 270));

        panelVentana.addTab("tab2", SalaryWindow);

        CuoteWindow.setBackground(new java.awt.Color(255, 255, 255));
        CuoteWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        Title1.setForeground(new java.awt.Color(153, 153, 153));
        Title1.setText("Modificar Cuota por Categoria");
        CuoteWindow.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 350, -1));

        SelecTitle1.setFont(new java.awt.Font("Roboto Light", 1, 15)); // NOI18N
        SelecTitle1.setForeground(new java.awt.Color(153, 153, 153));
        SelecTitle1.setText("SELECCIONE LA CATEGORIA");
        SelecTitle1.setToolTipText("");
        CuoteWindow.add(SelecTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 20));

        categoriaBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoriaBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                categoriaBoxMousePressed(evt);
            }
        });
        CuoteWindow.add(categoriaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 40));

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

        panelDatosSocio1.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosSocio1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelDatosSocio1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargoModTxt1.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        cargoModTxt1.setForeground(new java.awt.Color(153, 153, 153));
        panelDatosSocio1.add(cargoModTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 40));

        cuoteNewTxt1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cuoteNewTxt1.setText(" Ingrese el nuevo valor.");
        cuoteNewTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cuoteNewTxt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cuoteNewTxt1FocusLost(evt);
            }
        });
        cuoteNewTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuoteNewTxt1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuoteNewTxt1MousePressed(evt);
            }
        });
        cuoteNewTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuoteNewTxt1ActionPerformed(evt);
            }
        });
        panelDatosSocio1.add(cuoteNewTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 40));

        modificarBtn1.setBackground(new java.awt.Color(50, 115, 153));

        modificarTxt1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        modificarTxt1.setForeground(new java.awt.Color(255, 255, 255));
        modificarTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificarTxt1.setText("MODIFICAR");
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
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(modificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(modificarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );
        modificarBtn1Layout.setVerticalGroup(
            modificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(modificarBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(modificarTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        panelDatosSocio1.add(modificarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 50));

        cardModif.add(panelDatosSocio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        panelDatosModif.add(cardModif, "card2");

        CuoteWindow.add(panelDatosModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 250, 270));

        panelVentana.addTab("tab3", CuoteWindow);

        background.add(panelVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, -40, 630, 500));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

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

    private void cerrarSesionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionBtnMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cerrarSesionBtnMouseClicked

    private void modificarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxtMouseClicked
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


    }//GEN-LAST:event_modificarTxtMouseClicked

    private void modificarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxtMouseEntered
        modificarBtn.setBackground(new Color(80,139,166));
    }//GEN-LAST:event_modificarTxtMouseEntered

    private void modificarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxtMouseExited
        modificarBtn.setBackground(new Color(59,132,173));
    }//GEN-LAST:event_modificarTxtMouseExited

    private void cargoBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoBoxMousePressed
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cargoBox.setSelectedIndex(0);
        cardLayout.show(panelDatos, "card1");


    }//GEN-LAST:event_cargoBoxMousePressed

    private void modificarTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseClicked
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
    }//GEN-LAST:event_modificarTxt1MouseClicked

    private void modificarTxt1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseEntered
        modificarBtn1.setBackground(new Color(50, 115, 153));
    }//GEN-LAST:event_modificarTxt1MouseEntered

    private void modificarTxt1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarTxt1MouseExited
        modificarBtn1.setBackground(new Color(80, 139, 166));
    }//GEN-LAST:event_modificarTxt1MouseExited

    private void categoriaBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoriaBoxMousePressed

        CardLayout cardLayout = (CardLayout) panelDatosModif.getLayout();
        categoriaBox.setSelectedIndex(0);
            cardLayout.show(panelDatosModif, "card2");

    }//GEN-LAST:event_categoriaBoxMousePressed

    private void cuoteNewTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuoteNewTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuoteNewTxt1ActionPerformed

    private void cuoteNewTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuoteNewTxt1MouseClicked

    }//GEN-LAST:event_cuoteNewTxt1MouseClicked

    private void verTotalTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTotalTxtMouseClicked
        panelVentana.setSelectedIndex(0);
        actualizarTablaCuota();
        actualizarTablaSalario();
    }//GEN-LAST:event_verTotalTxtMouseClicked

    private void verTotalTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTotalTxtMouseEntered
        verTotalBtn.setBackground(new Color(50, 115, 153));
    }//GEN-LAST:event_verTotalTxtMouseEntered

    private void verTotalTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verTotalTxtMouseExited
         verTotalBtn.setBackground(new Color(80, 139, 166));
    }//GEN-LAST:event_verTotalTxtMouseExited

    private void modificarSueldoTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarSueldoTxtMouseClicked
         panelVentana.setSelectedIndex(1);
        cargoBox.setSelectedIndex(-1);
          categoriaBox.setSelectedIndex(0);
        CardLayout cardLayout = (CardLayout) panelDatos.getLayout();
        cardLayout.show(panelDatos, "cardPrincipal");
    }//GEN-LAST:event_modificarSueldoTxtMouseClicked

    private void modificarSueldoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarSueldoTxtMouseEntered
       modificarSueldoBtn.setBackground(new Color(50, 115, 153));
    }//GEN-LAST:event_modificarSueldoTxtMouseEntered

    private void modificarSueldoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarSueldoTxtMouseExited
        modificarSueldoBtn.setBackground(new Color(80, 139, 166));
    }//GEN-LAST:event_modificarSueldoTxtMouseExited

    private void modificarCuotaTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCuotaTxtMouseClicked
         panelVentana.setSelectedIndex(2);

        categoriaBox.setSelectedIndex(-1);
        CardLayout cardLayout = (CardLayout) panelDatosModif.getLayout();
        cardLayout.show(panelDatosModif, "cardPrincipal1");
    }//GEN-LAST:event_modificarCuotaTxtMouseClicked

    private void modificarCuotaTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCuotaTxtMouseEntered
        modificarCuotaBtn.setBackground(new Color(50, 115, 153));
    }//GEN-LAST:event_modificarCuotaTxtMouseEntered

    private void modificarCuotaTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarCuotaTxtMouseExited
        modificarCuotaBtn.setBackground(new Color(80, 139, 166));
    }//GEN-LAST:event_modificarCuotaTxtMouseExited

    private void salaryNewTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryNewTxtMousePressed
        if (salaryNewTxt.getText().equals(" Ingrese el nuevo valor.")) {
            salaryNewTxt.setText("");
            salaryNewTxt.setForeground(Color.black);
        }
    }//GEN-LAST:event_salaryNewTxtMousePressed

    private void salaryNewTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salaryNewTxtFocusLost
        if (salaryNewTxt.getText().isEmpty()) {
        salaryNewTxt.setText(" Ingrese el nuevo valor.");
        salaryNewTxt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_salaryNewTxtFocusLost

    private void cuoteNewTxt1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuoteNewTxt1MousePressed
        if (cuoteNewTxt1.getText().equals(" Ingrese el nuevo valor.")) {
            cuoteNewTxt1.setText("");
            cuoteNewTxt1.setForeground(Color.black);
        }
    }//GEN-LAST:event_cuoteNewTxt1MousePressed

    private void cuoteNewTxt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuoteNewTxt1FocusLost
        if (cuoteNewTxt1.getText().isEmpty()) {
        cuoteNewTxt1.setText(" Ingrese el nuevo valor.");
        cuoteNewTxt1.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_cuoteNewTxt1FocusLost

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CuoteWindow;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel SalaryWindow;
    private javax.swing.JLabel SelecTitle;
    private javax.swing.JLabel SelecTitle1;
    private javax.swing.JTable TablaCuota;
    private javax.swing.JTable TablaSalario;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel ViewWindow;
    private javax.swing.JLabel administracionTxt;
    private javax.swing.JPanel background;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel cardModif;
    private javax.swing.JPanel cardPrincipal;
    private javax.swing.JPanel cardPrincipal1;
    private javax.swing.JComboBox<Cargo> cargoBox;
    private javax.swing.JLabel cargoModTxt;
    private javax.swing.JLabel cargoModTxt1;
    private javax.swing.JComboBox<Categoria> categoriaBox;
    private javax.swing.JLabel cerrarSesionBtn;
    private javax.swing.JTextField cuoteNewTxt1;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel exitMenu;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel modificarBtn;
    private javax.swing.JPanel modificarBtn1;
    private javax.swing.JPanel modificarCuotaBtn;
    private javax.swing.JLabel modificarCuotaTxt;
    private javax.swing.JPanel modificarSueldoBtn;
    private javax.swing.JLabel modificarSueldoTxt;
    private javax.swing.JLabel modificarTxt;
    private javax.swing.JLabel modificarTxt1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosModif;
    private javax.swing.JPanel panelDatosSocio;
    private javax.swing.JPanel panelDatosSocio1;
    private javax.swing.JTabbedPane panelVentana;
    private javax.swing.JTextField salaryNewTxt;
    private javax.swing.JLabel timeText;
    private javax.swing.JLabel tituloCargo;
    private javax.swing.JLabel tituloCategoria;
    private javax.swing.JPanel verTotalBtn;
    private javax.swing.JLabel verTotalTxt;
    // End of variables declaration//GEN-END:variables
}
