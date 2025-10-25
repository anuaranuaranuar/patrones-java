package singleton;

public class Usuario {

    private String nombre;

    private static Usuario usuario;

    private Usuario(String nombre) {
        this.nombre = nombre;
    }

    public static Usuario getUsuario(String nombre) {
        if (usuario == null) {
            usuario = new Usuario(nombre);
        }
        return usuario;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + "]";
    }

    

}
