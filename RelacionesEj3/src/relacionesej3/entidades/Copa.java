package relacionesej3.entidades;

import java.util.ArrayList;

public class Copa {

    private ArrayList <String> copas = new ArrayList<>();
    
    public Copa(){
        for (int i = 1; i<13;i++){
            if (i!=8&&i!=9){
                copas.add("c"+i); 
            }
        }
    }

    public ArrayList<String> getCopas() {
        return copas;
    }
    
        public Integer Longitud(){
        return copas.size();
    }
        
        
    
    public void mostrarCopas(){
        System.out.println(copas);
    }
    
}
