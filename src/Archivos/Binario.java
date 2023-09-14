package Archivos;

import Clases.Arrays;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Binario {
    private String pathUsuarios;
    private String pathArrays;
    private String pathCursos;
    
    private FileOutputStream fos;
    private ObjectOutputStream oos;
    
    private FileInputStream fis;
    private ObjectInputStream  ois;

    public Binario() {
        this.pathUsuarios = "Archivos//Usuarios.bin";
        this.pathArrays = "Archivos//Arrays.bin";
        this.pathCursos = "Archivos//Cursos.bin";
    }

    /******************************************************************************/
    
    public boolean guardarUsuarios(ControladorUsuario usuario){
        try{
            fos = new FileOutputStream(pathUsuarios);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(usuario);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
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
    
    /******************************************************************************/
    
    public boolean guardarCursos(ControladorCurso curso){
        try{
            fos = new FileOutputStream(pathCursos);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(curso);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public ControladorCurso obtenerCursos(){
        ControladorCurso curso;
        try{
        File f = new File(pathCursos);
            if (f.exists()) {
                fis = new FileInputStream(pathCursos);
                ois = new ObjectInputStream(fis);
                curso = (ControladorCurso) ois.readObject();
                ois.close();
                fis.close();
                return curso;
            }
        return new ControladorCurso();
        } catch (Exception e){
            return new ControladorCurso();
        }
    }
    
    /******************************************************************************/
    
    public boolean guardarArrays(Arrays arrays){
        try{
            fos = new FileOutputStream(pathArrays);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrays);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public Arrays obtenerArrays(){
        Arrays arrays;
        try{
        File f = new File(pathArrays);
            if (f.exists()) {
                fis = new FileInputStream(pathArrays);
                ois = new ObjectInputStream(fis);
                arrays = (Arrays) ois.readObject();
                ois.close();
                fis.close();
                return arrays;
            }
        return new Arrays();
        } catch (Exception e){
            return new Arrays();
        }
    }
}
