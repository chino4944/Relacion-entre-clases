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
        for (int i = 0; i<perros.size();i++){
            if (nombre.equalsIgnoreCase(perros.get(i).getNombre())){
                System.out.println("el perro "+nombre+" esta disponible para adopcion");
                aux = true;
                break;
            } 
        }
        return aux;
    }
    
    public Integer buscarPerroAAdoptar(String nombre) {
        Integer aux = 0;
        for (int i = 0; i < perros.size(); i++) {
            if (nombre.equalsIgnoreCase(perros.get(i).getNombre())) {
                aux = i;
                break;
            }
        }
        return aux;
    }
    
    public boolean buscarPerroAdoptado(String nombre){
        
        boolean aux = false;
        for (int i = 0;i<perrosAdoptados.size();i++) {
            if (nombre.equalsIgnoreCase(perrosAdoptados.get(i).getNombre())){
                System.out.println("el perro "+nombre+" ya fue adoptado");
                aux = true;
                break;
            } 
        }
        return aux;        
    }
    
    public Perro adoptarPerro(String nombre){
        int i = buscarPerroAAdoptar(nombre);
        System.out.println(i);
        return perros.get(i);
    }

    public void perroAdoptado(String nombre){
        for (int i = 0;i<perros.size();i++){
            if (perros.get(i).getNombre().equalsIgnoreCase(nombre)){
                perrosAdoptados.add(perros.get(i));
                break;
            }
        }
    }
    
    public void mostrarPerros(){
        for (Perro perro : perros) {
            System.out.println(perro.getNombre());
        }
    }
    
}
