package observer;

public class Guerrero extends Enemigo implements MyObserver{


   

    public Guerrero(String nombre) {
        super(nombre);
        setActivo(false);
        
    }

    @Override
    public void ataque() {
        System.out.println(getNombre() + " guerrero en ataque");    
    }

    @Override
    public void activado() {
       setActivo(true);
       System.out.println("guerrero activado");
    }

    @Override
    public void update() {
        activado();
        ataque();
    }
    
}
