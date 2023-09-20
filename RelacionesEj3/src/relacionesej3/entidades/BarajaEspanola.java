package relacionesej3.entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class BarajaEspanola {

    private ArrayList<String> baraja;
    private HashSet<String> fueraBaraja;
    private Espada e = new Espada();
    private Basto b = new Basto();
    private Copa c = new Copa();
    private Oro o = new Oro();
    Scanner leer;

    public BarajaEspanola() {
        baraja = new ArrayList<>();
        fueraBaraja = new HashSet<>();
        baraja.addAll(e.getEspadas());
        baraja.addAll(b.getBastos());
        baraja.addAll(c.getCopas());
        baraja.addAll(o.getMonedas());
        leer = new Scanner(System.in);
    }

    public void barajar() {
        ArrayList<String> aux = new ArrayList<>();
        int random;
        while (!baraja.isEmpty()) {
            random = (int) (Math.random() * baraja.size());
            aux.add(baraja.get(random));
            baraja.remove(random);
        }
        baraja = aux;
    }

    public void mostrarBaraja() {
        for (String string : baraja) {
            System.out.println(string);
        }
    }

    public void siguienteCarta() {
        if (!baraja.isEmpty()) {
            System.out.println(baraja.get(0));
            fueraBaraja.add(baraja.get(0));
            baraja.remove(0);
            cartasDisponibles();
        } else {
            cartasDisponibles();
        }
    }

    public void darCartas() {
        System.out.println("cuantas cartas desea!?");
        int aux = leer.nextInt();
        if (aux < baraja.size()) {
            for (int i = 0; i < aux; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("la cantidad de cartas que pide no estan disponibles en la baraja");
        }
    }
    
    public void cartasMonton(){
        if (fueraBaraja.isEmpty()){
            System.out.println("No hay cartas en el monton aún");
        } else {
            for (String carta : fueraBaraja) {
                System.out.println(carta);
            }
        }
    }

    public void cartasDisponibles() {
        if (baraja.isEmpty()) {
            System.out.println("ya no quedan cartas en la baraja");
        } else {
            System.out.println("quedan " + baraja.size() + " cartas en la baraja");
        }
    }

    @Override
    public String toString() {
        return "BarajaEspanola{" + "baraja=" + baraja + '}';
    }

}

/*
•cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuariousuario

•mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/