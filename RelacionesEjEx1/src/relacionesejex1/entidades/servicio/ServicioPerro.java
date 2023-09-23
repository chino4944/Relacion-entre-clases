package relacionesejex1.entidades.servicio;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesejex1.entidades.Perro;

public class ServicioPerro {

    private ArrayList<Perro> perros;
    private ArrayList<Perro> perrosAdoptados;
    private Scanner leer;

    public ServicioPerro() {
        perros = new ArrayList<>();
        perrosAdoptados = new ArrayList<>();
        leer = new Scanner(System.in);

    }

    public void agregarPerros() {
        perros.add(new Perro("koko", "callejero", 5, 1.20f));
        perros.add(new Perro("chiquito", "callejero", 5, 1.20f));
        perros.add(new Perro("fefe", "callejero", 5, 1.20f));
        perros.add(new Perro("santiago", "callejero", 5, 1.20f));
        perros.add(new Perro("jose", "callejero", 5, 1.20f));
        perros.add(new Perro("luciano", "callejero", 5, 1.20f));
        perros.add(new Perro("fren", "callejero", 5, 1.20f));
    }

    public boolean buscarPerro(String nombre) {
        boolean aux = false;
        while (perros.iterator().hasNext()) {
            if (nombre.equalsIgnoreCase(perros.iterator().next().getNombre())){
                System.out.println("el perro "+nombre+" esta disponible para adopcion");
                aux = true;
                break;
            } 
        }
        return aux;
    }
    
    public boolean buscarPerroAdoptado(String nombre){
        
        boolean aux = false;
        while (perrosAdoptados.iterator().hasNext()) {
            if (nombre.equalsIgnoreCase(perrosAdoptados.iterator().next().getNombre())){
                System.out.println("el perro "+nombre+" ya fue adoptado");
                aux = true;
                break;
            } 
        }
        return aux;        
    }

    public void perroAdoptado(String nombre){
        while (perros.iterator().hasNext()){
            if (perros.iterator().next().getNombre().equalsIgnoreCase(nombre)){
                perrosAdoptados.add(perros.iterator().next());
                perros.iterator().remove();
            }
        }
    }
    
}
