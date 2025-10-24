package factory_simple.dominio;

import factory_simple.dominio.contractos.ITransporte;

// Producto concreto
public class Avion implements ITransporte {

    @Override
    public String entregar() {
        return "Entrega por via aerea.";
    }
    
}
