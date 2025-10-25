package singleton;

public class Main {
     
    public static void main(String[] args) {
        Usuario usuario = Usuario.getUsuario("Juan");
        System.out.println(usuario);
        
        usuario = Usuario.getUsuario("Pepe");
        System.out.println(usuario);


    }

    
} 
