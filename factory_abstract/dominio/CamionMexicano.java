package factory_abstract.dominio;

import factory_abstract.dominio.contratos.IEnvio;

public class CamionMexicano implements IEnvio {

    @Override
    public String entregar() {
        return "Camion mexicano";
    }
    
}
