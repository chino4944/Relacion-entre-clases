package relacionesejex1;

import java.util.Scanner;
import relacionesejex1.entidades.servicio.ServicioPerro;
import relacionesejex1.entidades.servicio.ServicioPersona;

public class RelacionesEjEx1 {

    public static void main(String[] args) {

        ServicioPersona personas = new ServicioPersona();
        ServicioPerro perros = new ServicioPerro();
        Scanner leer = new Scanner(System.in);
        personas.anadirPersonasAutomatico();
        perros.agregarPerros();

        for (int i = 0; i < personas.longitud(); i++) {
            System.out.println("hola " + personas.nombre(i) + " elige uno de los perros de la siguiente lista para adoptar");
            perros.mostrarPerros();
            String aux = leer.nextLine();
            if (perros.buscarPerroAdoptado(aux)) {
                System.out.println("el perro ya fue adoptado");
            } else if (perros.buscarPerro(aux)) {
                personas.adoptarPerro(personas.personaQueAdopta(i), perros.adoptarPerro(aux));
                perros.perroAdoptado(aux);
                System.out.println("felicitaciones " + personas.nombre(i) + " adoptaste a " + aux);
            } else {
                System.out.println("el nombre del perro introducido no esta en nuestra lista de perros por adoptar");
            }
        }
        for (int i = 0; i < personas.longitud(); i++) {
            if (personas.nombreMascota(i).equalsIgnoreCase("")) {
                System.out.println("la persona " + personas.nombre(i) + " adopto al perro no adopto a un perro");
            } else {
                System.out.println("la persona " + personas.nombre(i) + " adopto al perro " + personas.nombreMascota(i));
            }
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