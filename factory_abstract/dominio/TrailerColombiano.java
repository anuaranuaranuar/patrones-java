package factory_abstract.dominio;

import factory_abstract.dominio.contratos.IEnvio;

public class TrailerColombiano implements IEnvio {

    @Override
    public String entregar() {
        return "Trailer colombiano";
    }
    
}