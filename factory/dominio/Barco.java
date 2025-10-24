package factory.dominio;

import factory.dominio.contractos.ITransporte;

// Producto concreto
public class Barco implements ITransporte{

    @Override
    public String entregar() {
        return "Entrega maritima de contenedores en el puerto.";    
    }

    
}