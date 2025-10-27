package strategy;

public class TarjetaCredito implements EstrategiaPago
{
    private String numeroTarjeta;
    
    

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }



    @Override
    public void pay(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta " + numeroTarjeta);    
    }
    
}
