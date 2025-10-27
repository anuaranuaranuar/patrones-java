package observer;

public class Mago extends Enemigo implements MyObserver{


   

    public Mago(String nombre) {
        super(nombre);
        setActivo(false);
        
    }

    @Override
    public void ataque() {
        System.out.println(getNombre() + " Mago en ataque");    
    }

    @Override
    public void activado() {
       setActivo(true);
       System.out.println(getNombre() + " Mago activado");
    }

    @Override
    public void update() {
        activado();
        ataque();
    }
    
    
}
