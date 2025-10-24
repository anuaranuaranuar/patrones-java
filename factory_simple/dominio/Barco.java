package factory_simple.dominio;

import factory_simple.dominio.contractos.ITransporte;

// Producto concreto
public class Barco implements ITransporte{

    @Override
    public String entregar() {
        return "Entrega maritima de contenedores en el puerto.";    
    }

    
}