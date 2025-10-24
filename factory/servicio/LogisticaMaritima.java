package factory.servicio;

import factory.dominio.Barco;
import factory.dominio.contractos.ITransporte;
import factory.dominio.contractos.Logistica;

//Creador concreto
public class LogisticaMaritima extends Logistica{

    @Override
    public ITransporte crearTransporte() {
        return new Barco();    
    }
    
}
