package strategy;

public class ContextoPago {
    private EstrategiaPago estrategia;

    public void setEstrategiaPago(EstrategiaPago estrategia){
        this.estrategia=estrategia;
    }

    public void pay(double monto){
        if (estrategia == null){
            System.out.println("No hay metodo de pago seleccionado");
            return;
        }
        estrategia.pay(monto);
    }
}
