package observer;

public abstract class Enemigo {
    public String nombre;
    public boolean activo;

    

    public Enemigo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void ataque();

    public abstract void activado();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

}
