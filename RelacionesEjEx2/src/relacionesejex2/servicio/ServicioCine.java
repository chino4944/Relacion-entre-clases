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
        aux = 20 + (int) (Math.random() * 39+1);
        while (posiblesEspectadores.size() < aux) {
            posiblesEspectadores.add(new Espectador(("espectador " + (posiblesEspectadores.size() + 1)), (int) (Math.random() * 60), (float) (Math.random() * 50)));
        }
    }
    
    public void llenarSala() {
        for (int i = 0; i < posiblesEspectadores.size(); i++) {
            if (posiblesEspectadores.get(i).getDinero() > cine.getEntrada() && posiblesEspectadores.get(i).getEdad() > cine.getPeli().getEdadMinima()) {
                asignarAsiento(i);
            }
        }
    }
    
    public void asignarAsiento(int espectador) {
        boolean repetir = false;
        do {
            int fila = fila();
            int columna = columna();
            if (cine.getSala().noEstaOcupado(fila, columna)) {
                cine.getSala().anadirEspectador(fila, columna, posiblesEspectadores.get(espectador));
                posiblesEspectadores.get(espectador).setDinero(posiblesEspectadores.get(espectador).getDinero() - cine.getEntrada());
                espectadores.add(posiblesEspectadores.get(espectador));
                repetir = false;
            } else {
                repetir = true;
            }
        } while (repetir);   
    }           
    
    private int fila(){
        return (int) (Math.random() * 8);
    }
    
    private int columna(){
        return (int) (Math.random() * 6);
    }
    
    public void mostrarSala(){
        for (int i = cine.getSala().fila()-1;i>=0;i--){
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
    
    public void nombrePelicula(){
        System.out.println(cine.getPeli().getTitulo());
    }
    
    public void nombreDirector(){
        System.out.println(cine.getPeli().getDirector());
    }
    
    public void nombreDuracion(){
        System.out.println(cine.getPeli().getDuracion());
    }
    
    public void edadMinimaPelicula(){
        System.out.println(cine.getPeli().getEdadMinima());
    }
    
    public void precioDeEntrada(){
        System.out.println(cine.getEntrada());
    }
    
    public void consultarDatos(String posicion){
    int fila = Integer.parseInt(posicion.substring(0, 1))-1; 
    int columna= 0;
    switch (posicion.substring(1, 2)) {
        case "A":
        columna = 0;
        break;
        case "B":
        columna = 1;
        break;
        case "C":
        columna = 2;
        break;
        case "D":
        columna = 3;
        break;
        case "E":
        columna = 4;
        break;
        case "F":
        columna = 5;
        break;
    }
        if (cine.getSala().verEspectador(fila, columna) == null){
            System.out.println("Aqui no hay ningun espectador");
        } else {
        System.out.println(cine.getSala().verEspectador(fila, columna).getNombre());
        System.out.println(cine.getSala().verEspectador(fila, columna).getEdad());
        System.out.println(cine.getSala().verEspectador(fila, columna).getDinero());
        }
    }
    
}
