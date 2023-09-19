package relacionesej3.entidades;

import java.util.HashSet;

public class Oro {
    
    private HashSet<Integer> monedas;
    
    public Oro(){
        monedas = new HashSet<>();
        for (int i = 1; i<11;i++){
            if (i!=8&&i!=9){
                monedas.add(i); 
            }
        }
    }
    
    
    public void mostrarMonedas(){
        System.out.println(monedas);
    }

}
