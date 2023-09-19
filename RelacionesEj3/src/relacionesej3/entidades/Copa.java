package relacionesej3.entidades;

import java.util.HashSet;

public class Copa {

    private HashSet <Integer> copas;
    
    public Copa(){
        copas = new HashSet<>();
        for (int i = 1; i<11;i++){
            if (i!=8&&i!=9){
                copas.add(i); 
            }
        }
    }
    
    public void mostrarCopas(){
        System.out.println(copas);
    }
    
}
