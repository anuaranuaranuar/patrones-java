package factory_simple.dominio;

import factory_simple.dominio.contractos.ITransporte;

public class Camion implements ITransporte {

    @Override
    public String entregar() {
        return "Entrega terrestre de mercancia en caja";
    }
    
}
