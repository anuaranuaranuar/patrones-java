package factory.dominio;

import factory.dominio.contractos.ITransporte;

// Producto concreto
public class Avion implements ITransporte {

    @Override
    public String entregar() {
        return "Entrega por via aerea.";
    }
    
}
