package relacionesej2;

import java.util.ArrayList;
import relacionesej2.entidades.Juego;
import relacionesej2.entidades.Jugador;
import relacionesej2.entidades.RevolverDeAgua;

public class RelacionesEj2 {

    public static void main(String[] args) {
        ArrayList <Jugador> jugadores = new ArrayList();
        for (int i = 1;i<7;i++){
            jugadores.add(new Jugador(i, "jugador", false));
        }
        Juego game = new Juego();
        RevolverDeAgua revolver = new RevolverDeAgua();
        game.llenarJuego(jugadores, revolver);
        game.ronda();
    }
    
}

