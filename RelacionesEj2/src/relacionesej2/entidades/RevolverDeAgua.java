package relacionesej2.entidades;

public class RevolverDeAgua {
    private Integer posicionActual;
    private Integer posicionAgua;
    
    public RevolverDeAgua(){
        
    }
    
    public void llenarRevolver(){
       posicionActual =(int) (Math.random()*6+1);
       posicionAgua =(int) (Math.random()*6+1);
    }
    
    public Boolean mojar(){
        return (posicionActual == posicionAgua);
    }
    
    public void siguienteChorro(){
       posicionActual =(int) (Math.random()*6+1); 
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}