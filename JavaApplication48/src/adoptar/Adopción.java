package adoptar;

import adoptar.Entidades.Perro;
import adoptar.Entidades.Persona;

public class Adopción {

    public static void main(String[] args) {
        Perro m1 = new Perro("rocky","casero,",4,66.5);
        Perro m2 = new Perro("pulgoso","callejero,",2,1.2);
        Persona p1 = new Persona("fernando","figueroa",30,"21346927",m1);
        Persona p2 = new Persona("Stefany","Perez",33,"19478955",m2);
        int aux = (int) (Math.random()*2+1);
        System.out.println(aux);
        if (aux == 2){
            p1.setMascota(m2);
            p2.setMascota(m1);
        }
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/