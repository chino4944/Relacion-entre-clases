package relacionesej2.entidades;

import java.util.ArrayList;

public class Juego {
    ArrayList <Jugador> jugadores;
    RevolverDeAgua revolver;
    
    public Juego(){
        jugadores = new ArrayList<>();
    }
    
    public void llenarJuego(){
        for (int i = 1; i<7;i++){
            jugadores.add(new Jugador(i,"jugador",false));
        }
    }
}
/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
•
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
9•
ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
*/