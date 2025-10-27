package bridge;

public class Mago extends Enemigo  {

    public Mago(){
        setPeleador(new MagoPeleadorImp());
    }

    @Override
    public int getSalud() {
        
        return super.getSalud();
    }

    @Override
    public void setSalud(int salud) {
        
        super.setSalud(salud);
    }

    
    public void atacar() {
    System.out.println("mago ataca");    
    getPeleador().atacar();
    }

    
    public void proteger() {
        System.out.println("mago se protege");
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
