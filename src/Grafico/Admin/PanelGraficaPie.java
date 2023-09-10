package Grafico.Admin;

import Clases.DataSetGrafica;
import Clases.Listas;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

public class PanelGraficaPie extends javax.swing.JPanel {
    Listas listas;
    DefaultPieDataset datos;
    DataSetGrafica dg;
    int total;

    public PanelGraficaPie() {
        initComponents();
    }

    public void recibirListas(Listas listas){
        this.listas = listas;
        this.total = listas.controladorUsuario.size();
        generarGraficaAlumnos();
        
    }
    
    private void generarGraficaAlumnos(){
        this.panelGrafica.removeAll();
        
        datos = new DefaultPieDataset();
        dg = new DataSetGrafica(this.listas.controladorUsuario);
        dg.calcularDatosAlumnos();
        
        int size = dg.cantidad();
        
        for (int i = 0; i < size; i++) {
            agregarDatos(String.valueOf(dg.getVal(i).genero), dg.getVal(i).getCantidad());
        }
        
        JFreeChart c = ChartFactory.createPieChart("Grafica de Pie de Alumnos", datos);
        ChartPanel p = new ChartPanel(c);
        p.setPreferredSize(new Dimension(326, 305));
        
        this.panelGrafica.setLayout(new BorderLayout());
        this.panelGrafica.add(p, BorderLayout.NORTH);
        this.panelGrafica.repaint();    }
    
    private void agregarDatos(String nombre, int porcentaje){
        datos.setValue(nombre, porcentaje);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGrafica = new javax.swing.JPanel();

        javax.swing.GroupLayout panelGraficaLayout = new javax.swing.GroupLayout(panelGrafica);
        panelGrafica.setLayout(panelGraficaLayout);
        panelGraficaLayout.setHorizontalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        panelGraficaLayout.setVerticalGroup(
            panelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelGrafica;
    // End of variables declaration//GEN-END:variables
}
