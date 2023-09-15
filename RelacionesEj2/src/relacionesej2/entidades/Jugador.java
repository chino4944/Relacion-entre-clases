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
        System.out.println("turno del "+nombre+" "+id);
        if (revolver.mojar()){
            mojado = true;
            System.out.println("el "+nombre+" "+id+" fue mojado");
        } else {
            System.out.println("el "+nombre+" "+ id +" no fue mojado, turno del siguiente");
            revolver.siguienteChorro();
        }       
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
}
