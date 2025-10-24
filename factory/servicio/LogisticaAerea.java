package factory.servicio;

import factory.dominio.Avion;
import factory.dominio.contractos.ITransporte;
import factory.dominio.contractos.Logistica;


//Creador concreto
public class LogisticaAerea extends Logistica{

    @Override
    public ITransporte crearTransporte() {
        return new Avion();    
    }
    
}
