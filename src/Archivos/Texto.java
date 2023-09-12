package Archivos;

import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Texto {

    public Texto() {
    }
    
    public String Buscar(){
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt","txt");
        
        int resp = jfc.showOpenDialog(jfc);
        if (resp == JFileChooser.APPROVE_OPTION) {
            return jfc.getSelectedFile().getPath();
        }
        return "";
    }
    
    public void cargarUsuarios(String path, ControladorUsuario usuario){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = "";
            String contenido = "";
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";
            }
            br.close();
            fr.close();
            
            System.out.println(contenido);
            cargarDatosUsuario(contenido, usuario);
        } catch (Exception e) {
        
        }
    }    
    
    private void cargarDatosUsuario(String contenido, ControladorUsuario usuario){
        String [] listado = contenido.split("\n");
        int size = usuario.size();
        int rol;
        
        String correo;

        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            String c1 = valores[2].toLowerCase();
            c1 = c1.replaceAll("\\s","");
            correo = c1 + "@gmail.com";
                        
            rol = convertir(valores[5]);
            
            valores[4] = valores[4].toUpperCase();
            if (rol == 0) usuario.addAdmin(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
            if (rol == 1) usuario.addProfesor(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
            if (rol == 2) usuario.addAlumno(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
        }
    }
    
    public void cargarCursos(String path, ControladorCurso cursos){
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = "";
            String contenido = "";
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";
            }
            br.close();
            fr.close();
            
            System.out.println(contenido);
            cargarDatosCursos(contenido, cursos);
        } catch (Exception e) {
        
        }
    }
    
    private void cargarDatosCursos(String contenido, ControladorCurso cursos){
        String [] listado = contenido.split("\n");
        int size = cursos.size();
        
        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            valores[1].replaceAll("^[0-9]", "");
            int codigo = Integer.parseInt(valores[1]);
            
            valores[2].replaceAll("^[0-9]", "");
            int prof = Integer.parseInt(valores[2]);
            
            valores[3].replaceAll("^[0-9]", "");
            int creds = Integer.parseInt(valores[3]);
            
            cursos.addCurso(valores[0], codigo, prof, creds, 0, 0);
        }
    }
    
    private int convertir(String val){
            val.replaceAll("\\n","");
            val.replaceAll("^[0-9]","");
        try {            
            return Integer.parseInt(val);
        } catch (Exception e) {
            System.out.println("Solo se aceptan valores númericos");
            return -1;
        }
    }
    
}
