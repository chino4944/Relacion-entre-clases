package relacionesejex2.entidades;

public class Sala {
    private Integer fila;
    private Integer columna;
    private Espectador [][] espec;
    
    public Sala(){
        fila = 8;
        columna = 6;
        espec = new Espectador[fila][columna];
    }

    public Espectador[][] getEspec() {
        return espec;
    }

    public void setEspec(Espectador[][] espec) {
        this.espec = espec;
    }
    
    
    
}
