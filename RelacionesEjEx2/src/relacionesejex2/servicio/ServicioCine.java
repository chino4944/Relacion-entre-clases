package relacionesejex2.servicio;

import java.util.ArrayList;
import relacionesejex2.entidades.Cine;
import relacionesejex2.entidades.Espectador;
import relacionesejex2.entidades.Pelicula;

public class ServicioCine {

    private Cine cine;
    private ArrayList<Espectador> posiblesEspectadores;
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;

    public ServicioCine() {
        cine = new Cine();
        posiblesEspectadores = new ArrayList();
        espectadores = new ArrayList();
        pelicula = new Pelicula();
    }

    public void llenarPosiblesEspectadores() {
        int aux;
        aux = 20 + (int) (Math.random() * 80 + 1);
        while (posiblesEspectadores.size() < aux) {
            posiblesEspectadores.add(new Espectador(("espectador " + (posiblesEspectadores.size() + 1)), (int) (Math.random() * 60), (float) (Math.random() * 1000)));
        }
    }
    
    public void llenarSala() {
        for (int i = 0; i < posiblesEspectadores.size(); i++) {
            if (posiblesEspectadores.get(i).getDinero() > cine.getEntrada() && posiblesEspectadores.get(i).getEdad() > cine.getPeli().getEdadMinima()) {

                int fila = fila();
                int columna = columna();
                if (cine.getSala().noEstaOcupado(fila, columna)) {
                    cine.getSala().anadirEspectador(fila, columna, posiblesEspectadores.get(i));
                    posiblesEspectadores.get(i).setDinero(posiblesEspectadores.get(i).getDinero() - cine.getEntrada());
                    espectadores.add(posiblesEspectadores.get(i));
                }
            }
        }
    }
    
    public void mostrarPosibleEspectadores(){
        for (Espectador posibleEspectador : posiblesEspectadores) {
            System.out.println(posibleEspectador.getNombre());
        }
    }
    public void mostrarEspectares(){
        for (Espectador espectador : espectadores) {
            System.out.println(espectador.getNombre());
        }
    }           
    
    private int fila(){
        return (int) (Math.random() * 8);
    }
    
    private int columna(){
        return (int) (Math.random() * 6);
    }
    
    public void mostrarSala(){
        for (int i = 0;i<cine.getSala().fila();i++){
            for (int j = 0; j<cine.getSala().columnas();j++){
                switch (j){
                    case 0:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"A |");
                        } else {
                            System.out.print((i+1)+"AX|");
                        }
                    break;
                    case 1:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"B |");
                        } else {
                            System.out.print((i+1)+"BX|");
                        }
                    break;
                    case 2:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"C |");
                        } else {
                            System.out.print((i+1)+"CX|");
                        }
                    break;
                    case 3:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"D |");
                        } else {
                            System.out.print((i+1)+"DX|");
                        }
                    break;
                    case 4:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"E |");
                        } else {
                            System.out.print((i+1)+"EX|");
                        }
                    break;
                    case 5:
                        if (cine.getSala().noEstaOcupado(i, j)){
                            System.out.print((i+1)+"F |");
                        } else {
                            System.out.print((i+1)+"FX|");
                        }
                    break;                        
                }
            }
            System.out.println(" ");
        }
    }
    
}
