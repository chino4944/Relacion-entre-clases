package relacionesej2.entidades;

import java.util.ArrayList;

public class Juego {
    ArrayList <Jugador> jugadores;
    RevolverDeAgua revolver;
    
    public Juego(){
        jugadores = new ArrayList<>();
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores,RevolverDeAgua revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public void ronda(){
        revolver.llenarRevolver();
        for (Jugador jugador : jugadores) {
            jugador.disparo(revolver);
            revolver.siguienteChorro();
        }
        System.out.println(jugadores.toString());
    }
}
/*
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
*/