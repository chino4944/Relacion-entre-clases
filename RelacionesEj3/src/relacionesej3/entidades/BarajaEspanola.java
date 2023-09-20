package relacionesej3.entidades;

import java.util.ArrayList;

public class BarajaEspanola {
    
    private ArrayList<String> baraja;
    private Espada e = new Espada();
    private Basto b = new Basto();
    private Copa c = new Copa();
    private Oro o = new Oro();
    
    public BarajaEspanola(){
        baraja = new ArrayList<>();
            baraja.addAll(e.getEspadas());
            baraja.addAll(b.getBastos());
            baraja.addAll(c.getCopas());
            baraja.addAll(o.getMonedas());
        }
    
    public void barajar(){
        ArrayList<String> aux = new ArrayList<>();
        int random;
        while (!baraja.isEmpty()){
            random = (int) (Math.random()*baraja.size());
            aux.add(baraja.get(random));
            baraja.remove(random);
        }
        baraja = aux;
    }
    
    public void mostrarBaraja(){
        for (String string : baraja) {
            System.out.println(string);
        }
        }

    @Override
    public String toString() {
        return "BarajaEspanola{" + "baraja=" + baraja + '}';
    }
    
    
    }

/*
•barajar(): cambia de posición todas las cartas aleatoriamente.

•siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.

•cartasDisponibles(): indica el número de cartas que aún se puede repartir.

•darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.

•cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario

•mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/