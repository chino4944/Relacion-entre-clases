package relacionesej3.entidades;

import java.util.ArrayList;

public class Oro {
    
    private ArrayList<String> monedas = new ArrayList<>();
    
    public Oro(){
        for (int i = 1; i<13;i++){
            if (i!=8&&i!=9){
                monedas.add("o"+i); 
            }
        }
    }

    public ArrayList<String> getMonedas() {
        return monedas;
    }
    
        public Integer Longitud(){
        return monedas.size();
    }
    
    public void mostrarMonedas(){
        System.out.println(monedas);
    }

}
