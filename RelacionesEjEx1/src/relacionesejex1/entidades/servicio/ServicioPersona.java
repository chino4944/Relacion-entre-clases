package relacionesejex1.entidades.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import relacionesejex1.entidades.Perro;
import relacionesejex1.entidades.Persona;

public class ServicioPersona {
    
    private ArrayList<Persona> personas;
    private Scanner leer;
    
    public ServicioPersona(){
        personas = new ArrayList<>();
        leer = new Scanner(System.in);
        
    }
    
    public void anadirPersonasAutomatico(){
        personas.add(new Persona("jose","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("rafael","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("juan","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("astrid","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("michell","ramirez",20,"v21346927", new Perro()));
    }
    
    public void adoptarPerro(Persona adoptante, Perro perro){
        adoptante.setMascota(perro);
    }

    public Integer longitud(){
        return personas.size();
    }

    public String nombre(Integer posicion){
        return personas.get(posicion).getNombre();
    }
    
    public Persona personaQueAdopta(int posicion){
        return personas.get(posicion);
    }
    
    @Override
    public String toString() {
        return "ServicioPersona{" + "personas=" + personas + ", leer=" + leer + '}';
    }
    
    
}
