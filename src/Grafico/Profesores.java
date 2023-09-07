package Grafico;

import Clases.Listas;
import Clases.Usuarios;
import javax.swing.table.DefaultTableModel;

public class Profesores extends javax.swing.JPanel {
    Listas listas;
    DefaultTableModel modeloTabla;
    
    public Profesores() {
        initComponents();
    }
     
     public void recibirListas(Listas listas){
        this.listas = listas;
        llenarTabla();
    }

    /***********************************************************
     TABLA DE PROFESORES
    ************************************************************/
    
    private void llenarTabla(){
        this.modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Género"); 
        
        int size = listas.controladorUsuario.size();
        Usuarios prof;
        
        for (int i = 0; i < size; i++) {
            prof = this.listas.controladorUsuario.mostrarProfesores();
            addRow(prof.getCode(), prof.getNombre(), prof.getCorreo(), prof.getGenero());
        }
        this.tablaProfesores.setModel(modeloTabla);
        
    }
    
    private void addRow(int code, String nombre, String correo, String genero){
        String cod = code + "";
        this.modeloTabla.addRow(new Object[]{datos(cod), datos(nombre), datos(correo), datos(genero)});
        this.tablaProfesores.setModel(modeloTabla);
    }
    
    private String datos(String val){
        return String.valueOf(val);
    }
    /***********************************************************
     TABLA DE PROFESORES
    ************************************************************/
   
     
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(670, 350));

        jButton1.setText("Carga de Datos");

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProfesores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProfesores;
    // End of variables declaration//GEN-END:variables
}
