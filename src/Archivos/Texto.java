package Archivos;

import Clases.Actividad;
import Clases.Arrays;
import Controllers.ControladorActividad;
import Controllers.ControladorAlumnoXActividad;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import Controllers.ControladorUsuarioXCurso;
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
    
    /************************************************Usuarios************************************************/
    
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
        int size = listado.length;
        int rol;
        
        String correo;

        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            String c1 = valores[2].toLowerCase();
            c1 = c1.replaceAll("\\s","");
            correo = c1 + "@gmail.com";
                        
            rol = convertir(valores[5]);
            String g = valores[5].toUpperCase();
            
            valores[4] = valores[4].toUpperCase();
            if (rol == 0) usuario.addAdmin(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
            if (rol == 1) usuario.addProfesor(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
            if (rol == 2) usuario.addAlumno(convertir(valores[0]), "1234", valores[2], correo, valores[4], convertir(valores[5]));
        }
    }
    
    /********************************************************************************************************/
    /*************************************************Cursos*************************************************/
    
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
    
    /********************************************************************************************************/
    /**********************************************Actividades***********************************************/
    
    public void cargarActividades(String path, ControladorActividad actividades, int curso){
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
            cargarDatosActividades(contenido, actividades, curso);
        } catch (Exception e) {
        
        }
    }   
    
    private void cargarDatosActividades(String contenido, ControladorActividad actividades, int curso){
        String [] listado = contenido.split("\n");
        int size = listado.length;
        
        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            valores[0].replaceAll("^[0-9]", "");
            int codigo = Integer.parseInt(valores[0]);
            
            valores[3].replaceAll("^[0-9]", "");
            int punteo = Integer.parseInt(valores[3]);
            
            actividades.addActividad(codigo, valores[1], valores[2], punteo, curso);
        }
    }
    
    /********************************************************************************************************/
    /********************************************Alumnos a Curso*********************************************/
    
    public void cargarAlumnosCurso(String path, ControladorUsuarioXCurso userxcurso, int curso){
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
            cargarDatosAlumnosCurso(contenido, userxcurso, curso);
        } catch (Exception e) {
        
        }
    }   
    
    private void cargarDatosAlumnosCurso(String contenido, ControladorUsuarioXCurso userxcurso, int curso){
        String [] listado = contenido.split("\n");
        int size = listado.length;
        
        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            valores[0].replaceAll("^[0-9]", "");
            int usuario = Integer.parseInt(valores[0]);
            
            userxcurso.asignarAlumno(usuario, curso);
        }
    }
    
    /********************************************************************************************************/
    /******************************************Alumnos a Actividad*******************************************/
    
    public void cargarAlumnoActividad(String path, ControladorAlumnoXActividad almxact, int actividad){
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
            cargarDatosAlumnoActividad(contenido, almxact, actividad);
        } catch (Exception e) {
        
        }
    }
    
    private void cargarDatosAlumnoActividad(String contenido, ControladorAlumnoXActividad almxact, int curso){
        String [] listado = contenido.split("\n");
        int size = listado.length;
        
        for (int i = 0; i < size; i++) {
            String [] valores = listado[i].split(",");
            
            valores[0].replaceAll("^[0-9]", "");
            int usuario = Integer.parseInt(valores[0]);
            
            almxact.añadirAlmActividades(usuario, curso);
        }
    }
    
    /********************************************************************************************************/
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
