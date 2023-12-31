package relacionesejex1.entidades;

public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private Float tamaño;

    public Perro() {
        nombre = "";
    }

    
    
    public Perro(String nombre, String raza, Integer edad, Float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getTamaño() {
        return tamaño;
    }

    public void setTamaño(Float tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
