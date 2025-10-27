package bridge;

public class GuerreroPeleadorImp implements Peleador  {

    @Override
    public void atacar() {
    System.out.println("ataque fisico");    
    }

    @Override
    public void proteger() {
        System.out.println("protecion fisica");
    }
    
}
