package Grafico.Admin;

import Archivos.Binario;
import Archivos.PDF;
import Archivos.Texto;
import Clases.Curso;
import Clases.Listas;
import Clases.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Cursos extends javax.swing.JFrame {
    private String nombreCurso;
    private String codigo;
    private String profesor;
    private String creditos;
    private int acumulado;
    
    Listas listas;
    DefaultTableModel modeloTabla;
    Binario binario;
    Texto texto;
    Usuarios usuario;
    
    public Cursos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.binario = new Binario();
        this.texto = new Texto();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        //paneles();
        llenarTabla();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCursos = new javax.swing.JTable();
        btnCargaMasiva = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtprof = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        panelGraficaAlumnos = new javax.swing.JPanel();
        txtcreds = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setText("Listado Oficial de Cursos");

        tabCursos.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabCursos.setIntercellSpacing(new java.awt.Dimension(2, 5));
        tabCursos.setRowHeight(24);
        tabCursos.setUpdateSelectionOnSort(false);
        tabCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCursos);

        btnCargaMasiva.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnCargaMasiva.setText("Carga Masiva");
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        btnAdd.setText("Crear");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        pdf.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        pdf.setText("PDF");
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

        txtprof.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtprof.setFocusable(false);
        txtprof.setOpaque(false);
        txtprof.setRequestFocusEnabled(false);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Creditos");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel5.setText("Profesor");

        txtnombre.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel6.setText("Código");

        txtcode.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtcode.setFocusable(false);
        txtcode.setOpaque(false);
        txtcode.setRequestFocusEnabled(false);

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

        javax.swing.GroupLayout panelGraficaAlumnosLayout = new javax.swing.GroupLayout(panelGraficaAlumnos);
        panelGraficaAlumnos.setLayout(panelGraficaAlumnosLayout);
        panelGraficaAlumnosLayout.setHorizontalGroup(
            panelGraficaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
        panelGraficaAlumnosLayout.setVerticalGroup(
            panelGraficaAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        txtcreds.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcreds)
                                    .addComponent(txtprof, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(panelGraficaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargaMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcreds, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtprof, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelGraficaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
//        //GUARDAR DATOS
//        boolean ok = this.listas.almacenarUsuariosBin();
//        if (ok) System.out.println("Se guardaron los datos");
//        else System.out.println("Al parecer, ocurrio un problema :(");
//
//        //RECUPERAR DATOS
//        //        listas.obtenerUsuarios();
//        //        llenarTabla();
//
        String parh = texto.Buscar();
        texto.cargarCursos(parh, listas.controladorCurso);
        llenarTabla();
        mensaje("Carga masiva realizada");
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AgregarCurso agregar = new AgregarCurso();
        agregar.recibirListas(listas);
        agregar.setVisible(true);
        llenarTabla();
    }//GEN-LAST:event_btnAddActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        PDF pdf = new PDF();
        pdf.crearDocCursos("Archivos//Listado de Cursos", listas.controladorCurso);
        mensaje("Se creo el pdf con el listado!");
    }//GEN-LAST:event_pdfActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        VistaAdmin admin = new VistaAdmin();
        admin.rebirUsuario(usuario);
        admin.recibirListas(listas);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.codigo = txtcode.getText();
        this.nombreCurso = txtnombre.getText();

        int number = Integer.parseInt(codigo);

        int respuesta = JOptionPane.showConfirmDialog(
            null,
            "¿Quieres eliminar el curso " + nombreCurso + "?",
            "Confirmación",
            JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            // Acción a realizar si el usuario selecciona "Sí"
            if (listas.controladorCurso.eliminarCurso(number)) {
                mensaje("Se elimino al curso " + nombreCurso);
                txtcode.setText("");
                txtnombre.setText("");
                txtcreds.setText("");
                txtprof.setText("");
                llenarTabla();
            }else{
                mensaje("Opps! Aún no encuentro una solución a ese error XD");
            }
        } else {
            // Acción a realizar si el usuario selecciona "No" o cierra el cuadro de diálogo
            JOptionPane.showMessageDialog(null, "El curso no ha sido eliminado :)");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.codigo = txtcode.getText();
        this.nombreCurso = txtnombre.getText();
        this.creditos = txtcreds.getText();

        int number = Integer.parseInt(codigo);
        int creds = Integer.parseInt(creditos);
        if (listas.controladorCurso.editarCurso(number, nombreCurso, creds)) {
            mensaje("Se modifico al curso con el código: " + number);
            llenarTabla();
        }else{
            mensaje("Opps! Aún no encuentro una solución a ese error XD");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tabCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCursosMouseClicked
        int seleccionar = tabCursos.rowAtPoint(evt.getPoint());
        txtcode.setText(String.valueOf(tabCursos.getValueAt(seleccionar, 1)));
        txtnombre.setText(String.valueOf(tabCursos.getValueAt(seleccionar, 0)));
        txtcreds.setText(String.valueOf(tabCursos.getValueAt(seleccionar, 3)));
        txtprof.setText(String.valueOf(tabCursos.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tabCursosMouseClicked

    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Profesor");
        modeloTabla.addColumn("Creditos");
        modeloTabla.addColumn("Alumnos");
        
        int size = listas.controladorCurso.size();
        
        Curso cursos;
        for (int i = 0; i < size; i++) {
            cursos = listas.controladorCurso.getElemento(i);
            agregaFila(cursos.getNombreCurso(), cursos.getCodigo(), cursos.getProfesor(), cursos.getCreditos(), cursos.getAlumnos());
        }
    }
    
    public void agregaFila(String nombre, int codigo, int profesor, int creditos, int alumnos){
        this.modeloTabla.addRow(new Object[]{nombre, codigo, profesor, creditos, alumnos});
        this.tabCursos.setModel(modeloTabla);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelGraficaAlumnos;
    private javax.swing.JButton pdf;
    private javax.swing.JTable tabCursos;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcreds;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprof;
    // End of variables declaration//GEN-END:variables
}
