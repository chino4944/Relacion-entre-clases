package relacionesejex2.entidades;

public class Espectador {
    private String nombre;
    private Interger edad;
    private Float dinero;
    
    public Espectador(){
        
    }
    
    public Espectador(String nombre, Integer edad, Float dinero){
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Interger getEdad() {
        return edad;
    }

    public void setEdad(Interger edad) {
        this.edad = edad;
    }

    public Float getDinero() {
        return dinero;
    }

    public void setDinero(Float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
    
}s