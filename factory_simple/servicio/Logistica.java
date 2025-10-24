package factory_simple.servicio;

import factory_simple.dominio.Avion;
import factory_simple.dominio.Barco;
import factory_simple.dominio.Camion;
import factory_simple.dominio.contractos.ITransporte;

//El creador (la logica de creacion aqui esta centralizada y estatica)
public class Logistica {

    public static ITransporte crearTransporte(String via) {
        switch (via) {
            case "maritimo":
                return new Barco();
                
            case "carretera":
                return new Camion();
               
            case "aereo":
                return new Avion();
                
            default:
                throw new IllegalArgumentException(
                        "El tipo de transporte: "+ via +" no soportado");
                
        }

       
    };
}
