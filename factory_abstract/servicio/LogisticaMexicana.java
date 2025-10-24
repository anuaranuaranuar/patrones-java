package factory_abstract.servicio;

import factory_abstract.dominio.CamionMexicano;
import factory_abstract.dominio.DocumentoMexicano;
import factory_abstract.dominio.contratos.IDocumento;
import factory_abstract.dominio.contratos.IEnvio;
import factory_abstract.dominio.contratos.ILogisticaFactory;

public class LogisticaMexicana implements ILogisticaFactory {

    @Override
    public IEnvio crearTransporte() {
        return new CamionMexicano();    
    }

    @Override
    public IDocumento crearDocumento() {
        return new DocumentoMexicano();
    }
    
}
