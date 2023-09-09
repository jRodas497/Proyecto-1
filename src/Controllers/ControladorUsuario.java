package Controllers;

import Clases.Listas;
import Clases.Usuarios;
import java.io.Serializable;
import java.util.ArrayList;

public class ControladorUsuario implements Serializable{
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
    
    public boolean addProfesor(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 1
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 1));
            mensaje("Se registro el usuario (Profesor): "  + code + ", " + nombre + ", " + correo + ", " + genero);
            return true;
        }else{
            mensaje("El usuario ya existe");
        }
        return false;
    }
    
    public boolean addAlumno(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 2
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "1234", nombre, c1 + "@gmail.com", genero, 2));
            mensaje("Se registro el usuario (Alumno): " + code + ", " + nombre + ", " + correo + ", " + genero);
            return true;
        }else{
            mensaje("El usuario ya existe");
        }
        return false;
    }
    
    public boolean addAdmin(int code, String password, String nombre, String correo, String genero, int rol){
        //rol == 0
        String c1 = nombre.toLowerCase();
        c1 = c1.replaceAll("\\s","");
        
        if (usuarioExist(code) == null) {
            usuarios.add(new Usuarios(code, "admin", nombre,c1 + "@admin.com", genero, 0));
            mensaje("Se registro el usuario (Administrador): " + code + ", " + nombre + ", " + correo + ", " + genero);
            return true;
        }else{
            mensaje("El usuario ya existe");
        }
        return false;
    }
    
    public Usuarios login(int code, String password){
        int size = usuarios.size();
        
            for (int i = 0; i < size; i++) {
                if(usuarios.get(i).getCode() == code) return usuarios.get(i);
            }
        
        return null;
    }
    
    public boolean editarUsuario(int code, String nombre, String correo, String password){
        int size = usuarios.size();
        for (int i = 0; i < size; i++) {
            if (usuarios.get(i).getCode() == code) {
                if(correo != "") usuarios.get(i).setCorreo(correo);
                if(nombre != "") usuarios.get(i).setNombre(nombre);
                if(password != "") usuarios.get(i).setPassword(password);
                mensaje("Usuarios editado con exito!");
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarUsuario(int code){
        int size = usuarios.size();
        
        for (int i = 0; i < size; i++) {
            if (usuarios.get(i).getCode() == code) {
                usuarios.remove(i);
                
                mensaje("Usuario aliminado con exito!");
                return true;
            }
        }
        return false;
    }
    
    
    
    public Usuarios getElemento(int i){
        return this.usuarios.get(i);
    }
 
    public int cantidadGenero(){
        int size = usuarios.size();
        int count = 0;
        
        for (int i = 0; i < size; i++) {
            if(usuarios.get(i).getGenero().equals("M")) count ++;
        }
        int resultado = size - count;
        System.out.print("Cantidad de hombres: " + count + "\n");
        System.out.print("Cantidad de mujeres: " + resultado + "\n");
        
        return count;
    }
    
    private void mensaje(String msj){
        System.out.println(msj);
    }
}
