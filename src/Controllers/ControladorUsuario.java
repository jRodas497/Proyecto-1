package Controllers;

import Clases.Listas;
import Clases.Usuarios;
import java.util.ArrayList;

public class ControladorUsuario {
    private ArrayList <Usuarios> usuarios;
    Listas listas;

    public ControladorUsuario() {
        usuarios = new ArrayList<>();
    }
    
    public void recibirListas(Listas listas){
        this.listas = listas;
    }
    
    public Usuarios usuarioExist(int code){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            if(usuarios.get(i).getCode() == code) return usuarios.get(i);
        }
        return null;
    }
    
    public int size(){
        int size = usuarios.size();
        return size;
    }
        
    public Usuarios mostrarUsuarios(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarDatos();
        }   
        return null;
    }
    
    public Usuarios mostrarProfesores(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarProfesores();
        }      
        return null;
    }
    
    public Usuarios mostrarAlumnos(){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).mostrarAlumnos();
        }        
        return null;
    }
    
    public Usuarios datosUsuario(int code){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            usuarios.get(i).datosUsuario(code);
        }        
        return null;
    }
    
    public void addProfesor(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 1
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 1));
            mensaje("Se registro el usuario (Profesor): "  + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public void addAlumno(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 2
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 2));
            mensaje("Se registro el usuario (Alumno): " + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public void addAdmin(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 0
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "admin", nombre,c1 + "@admin.com", genero, 0));
            mensaje("Se registro el usuario (Alumno): " + code + ", " + nombre + ", " + correo + ", " + genero);
        }else{
            mensaje("El usuario ya existe");
        }
    }
    
    public Usuarios login(int code, String password){
        int size = usuarios.size();
        
            for (int i = 0; i < size; i++) {
                if(usuarios.get(i).getCode() == code) return usuarios.get(i);
            }
        
        return null;
    }
    
    public void editarUsuario(int code, String password, String nombre, String correo){
        int size = usuarios.size();
        for (int i = 0; i < size; i++) {
            if (usuarios.get(i).getCode() == code) {
                if(correo != "") usuarios.get(i).setCorreo(correo);
                if(nombre != "") usuarios.get(i).setNombre(nombre);
                if(password != "") usuarios.get(i).setPassword(password);
                mensaje("Usuarios editado con exito!");
            }
        }
    }
 
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
