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
        return mojado;
    }
}
