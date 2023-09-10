package Clases;

public class DataSetValor {
    public String genero;
    int contador;
    int total;

    public DataSetValor(String genero, int total) {
        this.genero = genero;
        this.contador = 1;
    }
    
    public void incrementar(){
        this.contador ++;
    }
    
    public boolean mismoGenero(String genero){
        boolean ok = this.genero == genero;
        if (ok) incrementar();
        return ok;
    }
    
    public int getCantidad(){
        return this.contador;
    }
    
    public int getPorcentaje(){
        return 100*this.contador/total;
    }
}
