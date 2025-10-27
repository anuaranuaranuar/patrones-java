package bridge;

public class Guerrero extends Enemigo implements Peleador{

    public Guerrero(){
        setPeleador(new GuerreroPeleadorImp());
    }
    
    @Override
    public int getSalud() {
        
        return super.getSalud();
    }

    @Override
    public void setSalud(int salud) {
        
        super.setSalud(salud);
    }

    @Override
    public void atacar() {
    System.out.println("guerrero: ");
    getPeleador().atacar();    
    }

    @Override
    public void proteger() {
        System.out.println("guerrero: ");
        getPeleador().proteger();
    }

    @Override
    public Peleador getPeleador() {
        
        return super.getPeleador();
    }

    @Override
    public void setPeleador(Peleador peleador) {
        
        super.setPeleador(peleador);
    }
    
    
}
