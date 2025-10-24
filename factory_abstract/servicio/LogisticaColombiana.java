package factory_abstract.servicio;

import factory_abstract.dominio.DocumentoColombiano;
import factory_abstract.dominio.TrailerColombiano;
import factory_abstract.dominio.contratos.IDocumento;
import factory_abstract.dominio.contratos.IEnvio;
import factory_abstract.dominio.contratos.ILogisticaFactory;

public class LogisticaColombiana implements ILogisticaFactory {

    @Override
    public IEnvio crearTransporte() {
        return new TrailerColombiano();    
    }

    @Override
    public IDocumento crearDocumento() {
        return new DocumentoColombiano();
    }

}