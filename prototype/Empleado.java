package prototype;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String nombre, Integer edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    public Empleado(Empleado empleado) {
        super(empleado);
        if (empleado != null) {
            setCargo(empleado.getCargo());
        }
    }
    
    @Override
    public Persona clone() {
       return new Empleado(this);
    }

    public String getCargo() {
        return cargo;
    }

    public Empleado setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    @Override
    public String toString() {
        return "Empleado [cargo=" + cargo + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
    }

    

    
    
    
    
}
