package bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------GUERRERO------------------");
        Guerrero g = new Guerrero();
        g.atacar();
        g.proteger();
        g.setPeleador(new MagoPeleadorImp());
        g.atacar();
        g.proteger();

        System.out.println("-----------------Mago------------------");
        Mago m = new Mago();
        m.atacar();
        m.proteger();
        m.setPeleador(new GuerreroPeleadorImp());
        m.atacar();
        m.proteger();
    }
    
}
