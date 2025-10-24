package factory.servicio;

import factory.dominio.Camion;
import factory.dominio.contractos.ITransporte;
import factory.dominio.contractos.Logistica;

//Creador concreto
public class LogisticaTerrestre extends Logistica{

    @Override
    public ITransporte crearTransporte() {
        return new Camion();    
    }

}