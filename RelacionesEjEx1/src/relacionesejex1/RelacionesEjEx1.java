package relacionesejex1;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesejex1.entidades.Perro;
import relacionesejex1.entidades.Persona;

public class RelacionesEjEx1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> mascotas =new ArrayList<>();
        ArrayList<Perro> mascotasAdoptadas = new ArrayList<>();
        personas.add(new Persona("jose","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("rafael","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("juan","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("astrid","ramirez",20,"v21346927", new Perro()));
        personas.add(new Persona("michell","ramirez",20,"v21346927", new Perro()));
        mascotas.add(new Perro("raul","callejero",5,1.52f));
        mascotas.add(new Perro("carita","callejero",5,1.52f));
        mascotas.add(new Perro("manchas","callejero",5,1.52f));
        mascotas.add(new Perro("paula","callejero",5,1.52f));
        mascotas.add(new Perro("frana","callejero",5,1.52f));
        mascotas.add(new Perro("misha","callejero",5,1.52f));
        System.out.println("desean adoptar algún perro!?(si/no)");
        while (leer.nextLine().equalsIgnoreCase("si")){
            for (int i = 0; i < personas.size();i++){
                System.out.println(personas.get(i).getNombre()+" quieres adoptar una mascota?");
                if (leer.nextLine().equalsIgnoreCase("si")){
                    System.out.println("las mascotas disponibles para adoptar son: ");
                    mostrarMascotas(mascotas, mascotasAdoptadas);
                    System.out.println("que mascota desea adoptar?(introduzca el nombre)");
                    if (leer.nextLine().equalsIgnoreCase(anotherString))
                }
            }
        }
    }
    
    
    public static void mostrarMascotas(ArrayList mascotas, ArrayList mascotasAdoptadas){
        for (int i = 0;i<mascotas.size();i++){
            System.out.println(mascotas.get(i).toString());
        }
        for (int i = 0;i<mascotasAdoptadas.size();i++){
            System.out.println(mascotasAdoptadas.get(i).toString());
        }
    }
}
/*Perro : nombre, raza, edad y tamaño
Persona : nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/