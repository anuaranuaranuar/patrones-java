package factory_abstract.dominio;

import factory_abstract.dominio.contratos.IDocumento;

public class DocumentoColombiano implements IDocumento {

    @Override
    public String adjuntar() {
        return "Adjuntando documento Colombiano";  
    }
    
}
