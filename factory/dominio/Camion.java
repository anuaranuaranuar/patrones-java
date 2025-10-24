package factory.dominio;

import factory.dominio.contractos.ITransporte;

// Producto concreto
public class Camion implements ITransporte {

    @Override
    public String entregar() {
        return "Entrega terrestre de mercancia en caja";
    }
    
}
