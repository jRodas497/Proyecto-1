package Grafico;

import Archivos.Binario;
import Archivos.Texto;
import Clases.Curso;
import Clases.Listas;
import Clases.Usuarios;
import Grafico.Admin.VistaAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaProfesor extends javax.swing.JFrame {
    private int code;
    private String nombre;
    private String correo;
    private String password;
    private String curso = "0";
    
    Listas listas;
    Usuarios usuario;
    DefaultTableModel modeloTabla;
    Binario binario;
    Texto texto;
    
    public VistaProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.binario = new Binario();
        this.texto = new Texto();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
        //paneles();
        llenarTabla();
        txtProf.setText(String.valueOf("Cursos del Prof. "+usuario.getNombre()));
        this.code = usuario.getCode();
    }
    
    public void rebirUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    private void mensaje(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }

    public void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID del curso");
        modeloTabla.addColumn("Nombre del Curso");
        modeloTabla.addColumn("Alumnos Inscritos");
        
        int size = this.listas.controladorCurso.size();
        
        Curso cursos;
        
        for (int i = 0; i < size; i++) {
            if (this.listas.controladorCurso.getElemento(i).getProfesor() == usuario.getCode()) {
                cursos = listas.controladorCurso.getElemento(i);
                agregaFila(cursos.getCodigo(), cursos.getNombreCurso(),cursos.getAlumnos());
            }            
        }
    }
    
    public void agregaFila(int codigo, String nombre, int alumnos){
        this.modeloTabla.addRow(new Object[]{codigo, nombre, alumnos});
        this.tabCursos.setModel(modeloTabla);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCursos = new javax.swing.JTable();
        txtProf = new javax.swing.JTextField();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        txtProf.setFont(new java.awt.Font("Bookman Old Style", 3, 20)); // NOI18N
        txtProf.setBorder(null);
        txtProf.setFocusable(false);
        txtProf.setOpaque(false);
        txtProf.setRequestFocusEnabled(false);

        btnInfo.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        btnInfo.setText("Más Información");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProf)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProf, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ActualizarProfesor actualizar = new ActualizarProfesor();
        actualizar.rebirUsuario(usuario);
        actualizar.recibirListas(listas);
        actualizar.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login login = new Login();
        login.recibirListas(listas);
        login.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        System.out.println(curso);
        
        if (curso != "0") {
            MenuProfesor menuP = new MenuProfesor();
            menuP.rebirUsuario(listas.controladorUsuario.usuarioExist(code));

            int number = Integer.parseInt(curso);

            menuP.codigoCurso(number);
            menuP.recibirListas(listas);

            menuP.setVisible(true);

            this.dispose();
        }else{
            mensaje("Seleccione antes un curso");
        }        
    }//GEN-LAST:event_btnInfoActionPerformed

    private void tabCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCursosMouseClicked
        int seleccionar = tabCursos.rowAtPoint(evt.getPoint());
        this.curso = String.valueOf(tabCursos.getValueAt(seleccionar, 0));
    }//GEN-LAST:event_tabCursosMouseClicked

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
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProfesor().setVisible(true);
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
