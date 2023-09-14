package Grafico;

import Clases.Listas;
import Clases.Usuarios;
import Grafico.Admin.Notas;
import javax.swing.table.DefaultTableModel;

public class MenuAlumno extends javax.swing.JFrame {
    private int curso;
    
    Listas listas;
    Usuarios usuario;
    DefaultTableModel modeloTabla;
    
    public MenuAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        txtCurso.setText(String.valueOf("Detalles del curso " + listas.controladorCurso.cursoExist(curso).getNombreCurso()));
        txtPond.setText(String.valueOf(listas.controladorCurso.cursoExist(curso).getAcumulado()));
        llenarTabla();        
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public void codigoCurso(int curso){
        this.curso = curso;
    }
    
    public void llenarTabla(){
        int suma = 0;
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Actividad");
        modeloTabla.addColumn("Descripcion");
        modeloTabla.addColumn("Ponderacion");
        modeloTabla.addColumn("Nota Final");
        
        int size = listas.controladorAlmXAct.size();
        
        for (int i = 0; i < size; i++) {
            if (listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getCurso() == curso && listas.controladorAlmXAct.getElement(i).getAlumno() == usuario.getCode()) {
                agregaFila(listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getNombre(),
                listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getDescripcion(),
                listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getPunteo(),
                ((listas.controladorAlmXAct.getElement(i).getPunteo())*(listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getPunteo()))/100
                );
                suma = suma + ((listas.controladorAlmXAct.getElement(i).getPunteo())*(listas.controladorActividad.actividadExist(listas.controladorAlmXAct.getElement(i).getActividad()).getPunteo()))/100;
                txtNota.setText(String.valueOf(suma));
            }
        }
    }
    
    private void agregaFila(String nombre, String descripcion, int ponderacion, int nota){
        this.modeloTabla.addRow(new Object[]{nombre, descripcion, ponderacion, nota});
        this.tabNotas.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCurso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabNotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        txtPond = new javax.swing.JTextField();
        btnMenuNotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tabNotas.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        tabNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabNotas.setRowHeight(24);
        jScrollPane1.setViewportView(tabNotas);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Nota");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel2.setText("Ponderación");

        txtNota.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtNota.setBorder(null);
        txtNota.setFocusable(false);
        txtNota.setOpaque(false);
        txtNota.setRequestFocusEnabled(false);

        txtPond.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtPond.setBorder(null);
        txtPond.setFocusable(false);
        txtPond.setOpaque(false);
        txtPond.setRequestFocusEnabled(false);

        btnMenuNotas.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btnMenuNotas.setText("Regresar ←");
        btnMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtPond, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(126, 126, 126)
                            .addComponent(btnMenuNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPond, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoActionPerformed

    private void btnMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuNotasActionPerformed
        VistaAlumno v = new VistaAlumno();
        v.rebirUsuario(usuario);
        v.recibirListas(listas);
        
        v.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnMenuNotasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabNotas;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtPond;
    // End of variables declaration//GEN-END:variables
}
