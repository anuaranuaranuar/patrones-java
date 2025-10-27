package strategy;

public class PagoPaypal implements EstrategiaPago{
    private String email;

    public PagoPaypal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal " + email);    
     }

    
}
