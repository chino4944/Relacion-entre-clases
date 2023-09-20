package relacionesej3.entidades;

import java.util.ArrayList;

public class Espada {
    
    private ArrayList<String> espadas = new ArrayList<>();

    public Espada(){
        for (int i = 1; i<13;i++){
            if (i!=8&&i!=9){
                espadas.add("e"+i); 
            }
        }
    }

    public ArrayList<String> getEspadas() {
        return espadas;
    }
}
