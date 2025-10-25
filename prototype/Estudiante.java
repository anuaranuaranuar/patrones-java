package prototype;

public class Estudiante extends Persona {

    private String facultad;

    public Estudiante(String nombre, Integer edad, String facultad) {
        super(nombre, edad);
        this.facultad = facultad;
    }

    public Estudiante(Estudiante estudiante) {
        super(estudiante);
        if (estudiante != null) {
            setFacultad(estudiante.getFacultad());
        }
    }

    @Override
    public Persona clone() {
        return new Estudiante(this);
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Estudiante [facultad=" + facultad + ", getFacultad()=" + getFacultad() + ", getNombre()=" + getNombre()
                + ", getEdad()=" + getEdad() + "]";
    }

}
