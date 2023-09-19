package relacionesej3.entidades;

import java.util.HashSet;

public class Espada {
    
    private HashSet<Integer> espadas;

    public Espada(){
        espadas = new HashSet<>();
        for (int i = 1; i<11;i++){
            if (i!=8&&i!=9){
                espadas.add(i); 
            }
        }
    }
    
    public void mostrarEspada(){
        System.out.println(espadas);
    }
}
