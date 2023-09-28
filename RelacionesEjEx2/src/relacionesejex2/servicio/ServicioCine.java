package relacionesejex2.servicio;

import java.util.ArrayList;
import relacionesejex2.entidades.Cine;
import relacionesejex2.entidades.Espectador;
import relacionesejex2.entidades.Pelicula;

public class ServicioCine {

    private Cine cine ;
    private ArrayList<Espectador> posiblesEspectadores;
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;
    
    public ServicioCine(){
        cine = new Cine();
        posiblesEspectadores = new ArrayList();
        espectadores = new ArrayList();
        pelicula = new Pelicula();        
    }
    
    public void llenarPosiblesEspectadores(){
        int aux;
        aux = 20 + (int) (Math.random()*80+1);
        while (posiblesEspectadores.size()<aux){
            posiblesEspectadores.add(new Espectador(("espectador "+(posiblesEspectadores.size()+1)),(int)(Math.random()*60),(float)(Math.random()*1000)));
        }
    }
    
    public void llenarSala() {
        for (int i = 0; i < posiblesEspectadores.size(); i++) {
            if (posiblesEspectadores.get(i).getDinero() > cine.getEntrada() && posiblesEspectadores.get(i).getEdad() > cine.getPeli().getEdadMinima()) {
                posiblesEspectadores.get(i).setDinero(posiblesEspectadores.get(i).getDinero() - cine.getEntrada());
                int fila = (int) (Math.random() * 8);
                int columna = (int) (Math.random() * 6);
                    if (cine.getSala().noEstaOcupado(fila, columna)) {
                        cine.getSala().anadirEspectador(fila, columna, posiblesEspectadores.get(i));
                        espectadores.add(posiblesEspectadores.get(i));
                    } else {
                        System.out.println("no hay puesto");
                    }

            }
        }
    }    
}
