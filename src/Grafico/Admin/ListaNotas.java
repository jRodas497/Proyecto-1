package Grafico.Admin;

import Clases.Listas;
import Clases.Usuarios;
import Controllers.ControladorAlumnoXActividad;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaNotas extends javax.swing.JFrame {
    private int curso;
    private int code;
    private String nota = "0";
    private String alumno = "0";
    private String act = "0";
    
    Listas listas;
    Usuarios usuario;
    DefaultTableModel modeloTabla;
    
    public ListaNotas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        llenarTabla();
        txtCurso.setText(String.valueOf("Detalles del curso " + listas.controladorCurso.cursoExist(curso).getNombreCurso()));
        this.code = usuario.getCode();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public void codigoCurso(int curso){
        this.curso = curso;
    }
    
    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Codigo Actividad");
        modeloTabla.addColumn("Codigo Alumno");
        modeloTabla.addColumn("Nombre Actividad");
        modeloTabla.addColumn("Alumno");
        modeloTabla.addColumn("Punteo");
        
        int size = listas.controladorAlmXAct.size();
        
        for (int i = 0; i < size; i++) {
            
            if (listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getCurso() == curso) {
                agregaFila(
                listas.controladorAlmXAct.getElement(i).getActividad(),
                listas.controladorAlmXAct.getElement(i).getAlumno(),
                listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getNombre(),
                listas.controladorUsuario.usuarioExist(listas.controladorAlmXAct.getElement(i).getAlumno()).getNombre(),
                listas.controladorAlmXAct.getElement(i).getPunteo()
                );
            }
        }
    }
    
    private void agregaFila(int codigoAct,int codigoAlm, String actividad, String alumno, int punteo){
        this.modeloTabla.addRow(new Object[]{codigoAct,codigoAlm , actividad, alumno, punteo});
        this.tabNotas.setModel(modeloTabla);
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabNotas = new javax.swing.JTable();
        txtCurso = new javax.swing.JTextField();
        btnMenuNotas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabNotas.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabNotas.setRowHeight(24);
        tabNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabNotas);

        txtCurso.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        txtCurso.setBorder(null);
        txtCurso.setFocusable(false);
        txtCurso.setOpaque(false);
        txtCurso.setRequestFocusEnabled(false);
        txtCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoActionPerformed(evt);
            }
        });

        btnMenuNotas.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMenuNotas.setText("Regresar ←");
        btnMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuNotasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel1.setText("Nota:");

        txtNota.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        txtNota.setToolTipText("");
        txtNota.setBorder(null);
        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(btnMenuNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuNotasActionPerformed
        Notas n = new Notas();
        n.rebirUsuario(usuario);
        n.recibirListas(listas);
        
        n.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnMenuNotasActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaActionPerformed

    private void tabNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNotasMouseClicked
        int seleccionar = tabNotas.rowAtPoint(evt.getPoint());
        this.act = String.valueOf(tabNotas.getValueAt(seleccionar, 0));
        this.alumno = String.valueOf(tabNotas.getValueAt(seleccionar, 1));
        txtNota.setText(String.valueOf(tabNotas.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_tabNotasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nota = txtNota.getText();
        nota.replaceAll("^[0-9]", "");
        int note = Integer.parseInt(nota);

        int alm = Integer.parseInt(alumno);

        int acti = Integer.parseInt(act);

        if (listas.controladorAlmXAct.cambiarNota(alm, acti, note)) {
            mensaje("Nota actualizada");
            llenarTabla();
        }else{
            mensaje("Nota no valida");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabNotas;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
