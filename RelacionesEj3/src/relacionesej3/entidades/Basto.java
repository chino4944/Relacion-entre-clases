package relacionesej3.entidades;

import java.util.HashSet;

public class Basto {
    
    private HashSet<Integer> bastos;
    
    public Basto(){
        bastos = new HashSet<>();
        for (int i = 1; i<11;i++){
            if (i!=8&&i!=9){
                bastos.add(i); 
            }
        }
    }
    
    public void mostrarBastos(){
        System.out.println(bastos);
    }

}
