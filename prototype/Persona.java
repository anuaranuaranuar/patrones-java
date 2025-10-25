package prototype;

public abstract class Persona {
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    

    public Persona(Persona persona) {
        if(persona != null){
            setNombre(persona.getNombre());
            setEdad(persona.getEdad());
        }
    }

    public abstract Persona clone();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    } 

    

    
}
