package Clases;

import Controllers.ControladorUsuario;
import java.util.ArrayList;

public class DataSetGrafica {
    ControladorUsuario listas;
    public ArrayList<DataSetValor> datos;

    public DataSetGrafica(ControladorUsuario listas) {
        this.listas = listas;
        this.datos = new ArrayList<>();
    }
    
    public void calcularDatosAlumnos(){
        int size = listas.size();
        int cantidad;
        
        Usuarios u;
        boolean agregado;
        
        for (int i = 0; i < size; i++) {
            u = listas.getElemento(i);
            agregado = false;
            
            cantidad = datos.size();
            for (int j = 0; j < cantidad; j++) {
                if (u.getRol() == 2 && (datos.get(i).mismoGenero(u.getGenero()) == true)) {
                    agregado = true;
                    break;
                }
            }
            
            if (!agregado) {
                
                datos.add(new DataSetValor(u.getGenero(),cantidad));
            }
            System.out.println("Gráfica generada");
        }
    }
    
    public void calcularDatosProfesores(){
        int size = listas.size();
        int cantidad;
        
        Usuarios u;
        boolean agregado;
        
        for (int i = 0; i < size; i++) {
            u = listas.getElemento(i);
            agregado = false;
            
            cantidad = datos.size();
            for (int j = 0; j < cantidad; j++) {
                if (datos.get(i).mismoGenero(u.getGenero()) && u.getRol() == 1) {
                    agregado = true;
                    break;
                }
            }
            
            if (!agregado) {
                
                datos.add(new DataSetValor(u.getGenero(),cantidad));
            }
            System.out.println("Gráfica generada");
        }
    }
    
    public int cantidad(){
        return this.datos.size();
    }
     
    public DataSetValor getVal(int i){
        return this.datos.get(i);
    }    
}
