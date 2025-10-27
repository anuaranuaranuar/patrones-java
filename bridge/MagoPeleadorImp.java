package bridge;

public class MagoPeleadorImp implements Peleador  {

    @Override
    public void atacar() {
    System.out.println("ataque magico");    
    }

    @Override
    public void proteger() {
        System.out.println("proteccion magica");
    }
    
}
