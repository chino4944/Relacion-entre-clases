package relacionesejex4.entidades;

public class Alumno {

private String nombreCompleto;
private int dni;
private int votos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni, int votos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }



}
