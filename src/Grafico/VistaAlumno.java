package Grafico;

import Archivos.Binario;
import Archivos.Texto;
import Clases.Listas;
import Clases.UsuarioXCurso;
import Clases.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaAlumno extends javax.swing.JFrame {
    Listas listas;
    DefaultTableModel modeloTabla;

    Usuarios usuario;

    
    public VistaAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void recibirListas(Listas listas){
        this.listas = listas;
        //paneles();
        llenarTabla();
        txtAlumno.setText(String.valueOf("Cursos del Alumno " + usuario.getNombre()));
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID del Curso");
        modeloTabla.addColumn("Nombre del Curso");
        modeloTabla.addColumn("Profesor");
        
        int size = this.listas.controladorUserXCurso.size();
        
        for (int i = 0; i < size; i++) {
            if (this.listas.controladorUserXCurso.getElemento(i).getUsuario() == usuario.getCode()) {
                agregaFila(this.listas.controladorUserXCurso.getElemento(i).getCurso(),
                        listas.controladorCurso.cursoExist(this.listas.controladorUserXCurso.getElemento(i).getCurso()).getNombreCurso(), 
                this.listas.controladorUsuario.usuarioExist(this.listas.controladorCurso.cursoExist(this.listas.controladorUserXCurso.getElemento(i).getCurso()).getProfesor()).getNombre());
            }
        }
    }
    
    public void agregaFila(int codigo, String nombre, String profesor){
        this.modeloTabla.addRow(new Object[]{codigo, nombre, profesor});
        this.tabCursos.setModel(modeloTabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAlumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCursos = new javax.swing.JTable();
        btnInfo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(null);

        txtAlumno.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        txtAlumno.setBorder(null);
        txtAlumno.setFocusable(false);
        txtAlumno.setOpaque(false);
        txtAlumno.setRequestFocusEnabled(false);

        tabCursos.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabCursos);

        btnInfo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnInfo.setText("Más Información");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login login = new Login();
        login.recibirListas(listas);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarAlumno actualizar = new ActualizarAlumno();
        actualizar.rebirUsuario(usuario);
        actualizar.recibirListas(listas);
        actualizar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCursos;
    private javax.swing.JTextField txtAlumno;
    // End of variables declaration//GEN-END:variables
}
