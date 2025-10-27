package strategy;

public class Main {
    public static void main(String[] args) {
        ContextoPago contexto =new ContextoPago();

        contexto.setEstrategiaPago(new TarjetaCredito("1234-5678-9876"));
        contexto.pay(150.0);

        contexto.setEstrategiaPago(new PagoPaypal("anuar@gmail.com"));
        contexto.pay(2000.00);
    }
}
