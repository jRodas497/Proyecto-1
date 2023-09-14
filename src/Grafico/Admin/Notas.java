package Grafico.Admin;

import Clases.Listas;
import Clases.Usuarios;
import Grafico.Login;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Notas extends javax.swing.JFrame {
    private String curso = "0";
    private int code;
    
    Listas listas;
    Usuarios usuario;
    DefaultTableModel modeloTabla;
    
    public Notas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        txtProf.setText(String.valueOf("Notas del curso"));
        this.code = usuario.getCode();
        llenarTabla();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID del Curso");
        modeloTabla.addColumn("Nombre del Curso");
        modeloTabla.addColumn("Profesor");
        
        int size = this.listas.controladorCurso.size();
        
        for (int i = 0; i < size; i++) {
            agregaFila(listas.controladorCurso.getElemento(i).getCodigo(),
                        listas.controladorCurso.getElemento(i).getNombreCurso(), 
                listas.controladorUsuario.usuarioExist(listas.controladorCurso.getElemento(i).getProfesor()).getNombre());
        }
    }
    
    private void agregaFila(int codigo, String nombre, String profesor){
        this.modeloTabla.addRow(new Object[]{codigo, nombre, profesor});
        this.tabCursos.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabCursos = new javax.swing.JTable();
        btnInfo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtProf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabCursos.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabCursos.setRowHeight(24);
        tabCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCursos);

        btnInfo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnInfo.setText("Más Información");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        btnCerrar.setText("Regresar");
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

        txtProf.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        txtProf.setBorder(null);
        txtProf.setFocusable(false);
        txtProf.setOpaque(false);
        txtProf.setRequestFocusEnabled(false);
        txtProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtProf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtProf, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        System.out.println(curso);

        if (curso != "0") {
            ListaNotas n = new ListaNotas();
            n.rebirUsuario(listas.controladorUsuario.usuarioExist(code));

            int number = Integer.parseInt(curso);

            n.codigoCurso(number);
            n.recibirListas(listas);

            n.setVisible(true);

            this.dispose();
        }else{
            mensaje("Seleccione antes un curso");
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarAdmin actualizar = new ActualizarAdmin();
        actualizar.rebirUsuario(usuario);
        actualizar.recibirListas(listas);
        actualizar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        VistaAdmin admin = new VistaAdmin();
        admin.rebirUsuario(usuario);
        admin.recibirListas(listas);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tabCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCursosMouseClicked
        int seleccionar = tabCursos.rowAtPoint(evt.getPoint());
        this.curso = String.valueOf(tabCursos.getValueAt(seleccionar, 0));
    }//GEN-LAST:event_tabCursosMouseClicked

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCursos;
    private javax.swing.JTextField txtProf;
    // End of variables declaration//GEN-END:variables
}
