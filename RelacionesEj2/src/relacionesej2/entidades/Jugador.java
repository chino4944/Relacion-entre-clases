package relacionesej2.entidades;

public class Jugador {
    private Integer id;
    private String nombre;
    private Boolean mojado;
    
    public Jugador(){
        
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public Boolean disparo(RevolverDeAgua revolver){
        if (revolver.mojar()){
            mojado = true;
        } else {
            revolver.siguienteChorro();
        }
        
        System.out.println(revolver.toString());
        
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
