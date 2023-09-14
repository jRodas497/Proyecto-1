package Grafico.Admin;

import Archivos.Binario;
import Archivos.PDF;
import Archivos.Texto;
import Clases.Listas;
import Clases.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Alumnos extends javax.swing.JFrame {
    private String code;
    private String nombre;
    private String correo;
    private String password;
    private PanelGraficaPie panelGrafica;
    
    Listas listas;
    DefaultTableModel modeloTabla;
    Binario binario;
    Texto texto;
    Usuarios usuario;
    
    public Alumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.binario = new Binario();
        this.texto = new Texto();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
//        paneles();
        llenarTabla();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlumnos = new javax.swing.JTable();
        btnCargaMasiva = new javax.swing.JButton();
        btnAddAlumno = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        panelGraficaAlumnos = new javax.swing.JPanel();

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("Listado Oficial de Alumnos");

        tabAlumnos.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabAlumnos.setIntercellSpacing(new java.awt.Dimension(2, 5));
        tabAlumnos.setRowHeight(24);
        tabAlumnos.setUpdateSelectionOnSort(false);
        tabAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAlumnos);
        tabAlumnos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnCargaMasiva.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnAddAlumno.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnAddAlumno.setText("Agregar");
        btnAddAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlumnoActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnModificar.setText("Editar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        pdf.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        pdf.setText("Generar PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnMenu.setText("Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        txtcorreo.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Correo");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        txtpassword.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel6.setText("Código");

        txtcode.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtcode.setFocusable(false);
        txtcode.setOpaque(false);
        txtcode.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelGraficaAlumnosLayout = new javax.swing.GroupLayout(panelGraficaAlumnos);
        panelGraficaAlumnos.setLayout(panelGraficaAlumnosLayout);
        panelGraficaAlumnosLayout.setHorizontalGroup(
            panelGraficaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGraficaAlumnosLayout.setVerticalGroup(
            panelGraficaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtnombre)
                                                .addComponent(txtcorreo)
                                                .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelGraficaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGraficaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Contraseña");
        modeloTabla.addColumn("Genero");
        
        int tam = this.listas.controladorUsuario.size();
        
        Usuarios usuarios;
        for (int i = 0; i < tam; i++) {
            if (this.listas.controladorUsuario.getElemento(i).getRol() == 2) {
                usuarios = this.listas.controladorUsuario.getElemento(i);
                agregaFila(usuarios.getCode(), usuarios.getNombre(), usuarios.getCorreo(), usuarios.getPassword(), usuarios.getGenero());
            }            
        }
        
        this.tabAlumnos.setModel(modeloTabla);
    }
    
    private void agregaFila(int code, String nombre, String correo, String password, String genero){
        this.modeloTabla.addRow(new Object[]{code, nombre, correo, password, genero});
        
        this.tabAlumnos.setModel(modeloTabla);
    }
    
    private void paneles(){
        this.panelGrafica = new PanelGraficaPie();
        this.panelGrafica.setVisible(true);
        this.panelGrafica.setSize(326, 305);
        this.panelGrafica.recibirListas(listas);
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    private void btnAddAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlumnoActionPerformed
        AgregarAlumno agregar = new AgregarAlumno();
        agregar.recibirListas(listas);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAddAlumnoActionPerformed

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        //GUARDAR DATOS
        boolean ok = this.listas.almacenarUsuariosBin();
        if (ok) System.out.println("Se guardaron los datos");
        else System.out.println("Al parecer, ocurrio un problema :(");
        
        //RECUPERAR DATOS 
//        listas.obtenerUsuarios();
//        llenarTabla();

        String parh = texto.Buscar();
        texto.cargarUsuarios(parh, listas.controladorUsuario);
        llenarTabla();
        mensaje("Carga masiva realizada");
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.code = txtcode.getText();
        this.nombre = txtnombre.getText();
        this.correo = txtcorreo.getText();
        this.password = txtpassword.getText();
        
        int number = Integer.parseInt(code);       
        if (listas.controladorUsuario.editarUsuario(number, nombre, correo, password)) {
            mensaje("Se modifico al usuario con el código: " + number);
            llenarTabla();
        }else{
            mensaje("Opps! Aún no encuentro una solución a ese error XD");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.code = txtcode.getText();
        this.nombre = txtnombre.getText();
        
        int number = Integer.parseInt(code);   
        
        int respuesta = JOptionPane.showConfirmDialog(
            null,
            "¿Quieres eliminar a " + nombre + "?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Acción a realizar si el usuario selecciona "Sí"
            if (listas.controladorUsuario.eliminarUsuario(number)) {
            mensaje("Se elimino al usuario " + nombre);
            txtcode.setText("");
            txtnombre.setText("");
            txtcorreo.setText("");
            txtpassword.setText("");
            llenarTabla();
            }else{
                mensaje("Opps! Aún no encuentro una solución a ese error XD");
            }
        } else {
            // Acción a realizar si el usuario selecciona "No" o cierra el cuadro de diálogo
            JOptionPane.showMessageDialog(null, "El usuario no ha sido eliminado :)");
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        PDF pdf = new PDF();
        pdf.crearDocUsuarios("Archivos//Listado de Alumnos", listas.controladorUsuario, 2); 
        mensaje("Se creo el pdf con el listado!");
    }//GEN-LAST:event_pdfActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VistaAdmin admin = new VistaAdmin();
        admin.rebirUsuario(usuario);
        admin.recibirListas(listas);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void tabAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnosMouseClicked
        int seleccionar = tabAlumnos.rowAtPoint(evt.getPoint());
        txtcode.setText(String.valueOf(tabAlumnos.getValueAt(seleccionar, 0)));
        txtnombre.setText(String.valueOf(tabAlumnos.getValueAt(seleccionar, 1)));
        txtcorreo.setText(String.valueOf(tabAlumnos.getValueAt(seleccionar, 2)));
        txtpassword.setText(String.valueOf(tabAlumnos.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_tabAlumnosMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAlumno;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGraficaAlumnos;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tabAlumnos;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
