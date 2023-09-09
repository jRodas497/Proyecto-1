package Archivos;

import Controllers.ControladorUsuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Binario {
    private String pathUsuarios;
    
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    
    private FileInputStream fis;
    private ObjectInputStream  ois;

    public Binario() {
        this.pathUsuarios = "Archivos//Usuarios.bin";
    }
        
    public boolean guardarUsuarios(ControladorUsuario usuario){
        try{
            fos = new FileOutputStream(pathUsuarios);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(usuario);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public ControladorUsuario obtenerUsuarios(){
        ControladorUsuario usuario;
        try{
        File f = new File(pathUsuarios);
            if (f.exists()) {
                fis = new FileInputStream(pathUsuarios);
                ois = new ObjectInputStream(fis);
                usuario = (ControladorUsuario) ois.readObject();
                ois.close();
                fis.close();
                return usuario;
            }
        return new ControladorUsuario();
        } catch (Exception e){
            return new ControladorUsuario();
        }
    }
}
