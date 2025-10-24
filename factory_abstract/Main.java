package factory_abstract;

import factory_abstract.dominio.contratos.IDocumento;
import factory_abstract.dominio.contratos.IEnvio;
import factory_abstract.dominio.contratos.ILogisticaFactory;
import factory_abstract.servicio.LogisticaColombiana;
import factory_abstract.servicio.LogisticaMexicana;

public class Main {

    public static void ejecutarLogistica(ILogisticaFactory fabrica){
        IEnvio vehiculo = fabrica.crearTransporte();
        IDocumento DNI = fabrica.crearDocumento();
        
        System.out.println("El pedido sera enviado en:  \n" +
                            vehiculo.entregar() +"\n" +
                            "Para: " + DNI.adjuntar());
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {

        ILogisticaFactory logistica;

        logistica = new LogisticaColombiana();
        
        ejecutarLogistica(logistica);

        logistica = new LogisticaMexicana();

        ejecutarLogistica(logistica);
    }
}
