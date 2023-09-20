package relacionesej3.entidades;

import java.util.ArrayList;

public class Basto {

    private ArrayList<String> bastos = new ArrayList<>();

    public Basto() {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                bastos.add("b" + i);
            }
        }

    }

    public ArrayList<String> getBastos() {
        return bastos;
    }
}
