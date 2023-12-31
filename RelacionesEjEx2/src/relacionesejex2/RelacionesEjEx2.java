package relacionesejex2;

import java.util.Scanner;
import relacionesejex2.servicio.ServicioCine;

public class RelacionesEjEx2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCine funcion = new ServicioCine();
        funcion.llenarPosiblesEspectadores();
        funcion.llenarSala();
        System.out.println("El nombre de la pelicula es: ");
        funcion.nombrePelicula();
        System.out.println("El director de la pelicula es: ");
        funcion.nombreDirector();
        System.out.println("la duracion de la pelicula es ");
        funcion.nombreDuracion();
        System.out.println("la entrada tiene un costo de $");
        funcion.precioDeEntrada();
        funcion.mostrarSala();
        do{
            System.out.println("introduzaca los datos de la persona a consultar");
            funcion.consultarDatos(leer.nextLine());
            System.out.println("desea consutar los datos de otro asiento");
        } while("Si".equalsIgnoreCase(leer.nextLine()));
        System.out.println("gracias por utilizar nuestros cines");
    }
    
}
/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.

Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.

8AX|8BX|8CX|8D |8EX|8FX
7AX|7BX|7CX |7DX|7E |7FX
6AX|6BX|6C |6DX|6EX|6F
5AX|5BX|5CX|5DX|5EX|5FX
4AX|4BX|4CX|4DX|4EX|4FX
3AX|3BX|3CX|3D |3EX|3FX
2AX|2B |2CX|2DX|2EX|2F
1AX|1BX |1CX |1DX |1EX |1FX

Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).

Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.

Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
*/

