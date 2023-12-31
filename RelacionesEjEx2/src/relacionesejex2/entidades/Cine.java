package relacionesejex2.entidades;

public class Cine {
    private Sala sala;
    private Pelicula peli;
    private Float entrada;
    
    public Cine(){
       sala = new Sala();
       peli =new Pelicula("Star Wars",206,15,"George Lucas");
       entrada = 3.5f;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }
    
    public Float getEntrada(){
        return entrada;
    }
    
    public void setEntrada(Float entrada){
        this.entrada = entrada;
    }
       
}
/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
*/