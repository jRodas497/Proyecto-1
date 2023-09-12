package Archivos;

import Clases.Curso;
import Clases.Usuarios;
import Controllers.ControladorCurso;
import Controllers.ControladorUsuario;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PDF {
    String nombre;

    public PDF() {
    }
    
    /************************************************Usuarios************************************************/
    
    public boolean crearDocUsuarios(String nombre, ControladorUsuario usuarios, int rol){
        this.nombre = nombre;
        Document documento = null;
        
        try {
            FileOutputStream archivo = new FileOutputStream(this.nombre + ".pdf");
            documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
                   
            if(rol == 1) documento.add(crearTitulo("Listado de Profesores\n\n"));
            if(rol == 2) documento.add(crearTitulo("Listado de Alumnos\n\n"));            
            
            documento.add(crearTablaUsuario(usuarios, rol));
            
            documento.close();
        } catch (Exception e) {
        }
        return true;
    }
    
    private PdfPTable crearTablaUsuario(ControladorUsuario usuario, int rol){
        PdfPTable tabla = new PdfPTable(5);
        tabla.addCell(crearCeldaEncabezado("Código"));
        tabla.addCell(crearCeldaEncabezado("Contraseña"));
        tabla.addCell(crearCeldaEncabezado("Nombre"));
        tabla.addCell(crearCeldaEncabezado("Correo"));
        tabla.addCell(crearCeldaEncabezado("Gén"));
        
        int [] dimensiones = {150, 200, 200, 300, 150};
        
        try {
            tabla.setWidths(dimensiones);
        } catch (Exception e) {
        }
        
        agregarDatosUsuarios(tabla, usuario, rol);
        
        return tabla;
    }
    
    private void agregarDatosUsuarios(PdfPTable tabla, ControladorUsuario usuario, int rol){
        Usuarios u;
        int size = usuario.size();
        
        for (int i = 0; i < size; i++) {
            u = usuario.getElemento(i);
            
            if (u.getRol() == rol) {
                tabla.addCell(crearCeldaContenido(String.valueOf(u.getCode()), i));
                tabla.addCell(crearCeldaContenido(u.getPassword(), i));
                tabla.addCell(crearCeldaContenido(u.getNombre(), i));
                tabla.addCell(crearCeldaContenido(u.getCorreo(), i));
                tabla.addCell(crearCeldaContenido(u.getGenero(), i));
            }
        }
    }
    
    /********************************************************************************************************/
    
    /*************************************************Cursos*************************************************/    
    
    public boolean crearDocCursos(String nombre, ControladorCurso cursos){
        this.nombre = nombre;
        Document documento = null;
        
        try {
            FileOutputStream archivo = new FileOutputStream(this.nombre + ".pdf");
            documento = new Document();
            PdfWriter.getInstance(documento, archivo);
            
            documento.open();
                   
            documento.add(crearTitulo("Listado de Cursos\n\n"));
            
            documento.add(crearTablaCurso(cursos));
            
            documento.close();
        } catch (Exception e) {
        }
        return true;
    }
    
    private PdfPTable crearTablaCurso(ControladorCurso cursos){
        PdfPTable tabla = new PdfPTable(5);
        
        tabla.addCell(crearCeldaEncabezado("Nombre"));
        tabla.addCell(crearCeldaEncabezado("Código"));
        tabla.addCell(crearCeldaEncabezado("ID Profesor"));
        tabla.addCell(crearCeldaEncabezado("Creditos"));
        tabla.addCell(crearCeldaEncabezado("Alm. Inscritos"));
        
        int [] dimensiones = {150, 150, 150, 150, 200};
        
        try {
            tabla.setWidths(dimensiones);
        } catch (Exception e) {
        }
        
        agregarDatosCursos(tabla, cursos);
        
        return tabla;
    }
    
    private void agregarDatosCursos(PdfPTable tabla, ControladorCurso cursos){
        Curso c;
        int size = cursos.size();
        
        for (int i = 0; i < size; i++) {
            c = cursos.getElemento(i);
            
            tabla.addCell(crearCeldaContenido(c.getNombreCurso(), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(c.getCodigo()), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(c.getProfesor()), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(c.getCreditos()), i));
            tabla.addCell(crearCeldaContenido(String.valueOf(c.getAlumnos()), i));
            
        }
    }
    
    /********************************************************************************************************/
    
    
    private Paragraph crearTitulo(String titulo){
        Font fuente = new Font();
        fuente.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
        fuente.setSize(24);
        fuente.setStyle(Font.BOLDITALIC);
        
        Paragraph parrafo = new Paragraph(titulo, fuente);
        parrafo.setAlignment(1);
        return parrafo;
    }
    
    private PdfPCell crearCeldaEncabezado(String texto){
        Chunk contenido = new Chunk(texto);
        contenido.setFont(new Font(Font.FontFamily.TIMES_ROMAN,12,Phrase.ALIGN_CENTER, BaseColor.BLACK));
        
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        celda.setBackgroundColor(BaseColor.WHITE);
        aplicaEstiloCeldas(celda);
        
        return celda;
    }
    
    private PdfPCell crearCeldaContenido(String texto, int i){
        Chunk contenido = new Chunk(texto);
        contenido.setFont(new Font(Font.FontFamily.TIMES_ROMAN, 12, Phrase.ALIGN_CENTER, BaseColor.BLACK));
        
        PdfPCell celda = new PdfPCell(new Phrase(contenido));
        
        if((i%2)==0) celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
        else         celda.setBackgroundColor(BaseColor.WHITE);
        
        aplicaEstiloCeldas(celda);
        
        return celda;
    }    
    
    private void aplicaEstiloCeldas(PdfPCell celda){
        celda.setBorderColor(BaseColor.BLACK);
        celda.setBorder(5);
        celda.setPadding(5);
        celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
    }
}
