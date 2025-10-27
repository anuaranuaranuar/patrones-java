package bridge;

public abstract class Enemigo {

    protected Peleador peleador;
    protected int salud;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Peleador getPeleador() {
        return peleador;
    }

    public void setPeleador(Peleador peleador) {
        this.peleador = peleador;
    }

    
    
} 
