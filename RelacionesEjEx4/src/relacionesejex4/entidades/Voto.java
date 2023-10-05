package relacionesejex4.entidades;

public class Voto {

    private Alumno alumno;
    private String[] votos;

    public Voto() {
        votos= new String[3];
    }
    
    

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String[] getVotos() {
        return votos;
    }

    public void setVotos(String[] votos) {
        this.votos = votos;
    }
    
    
    
}
