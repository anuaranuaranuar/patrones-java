package factory_abstract.dominio;

import factory_abstract.dominio.contratos.IDocumento;

public class DocumentoMexicano implements  IDocumento {

    @Override
    public String adjuntar() {
        return "Adjuntando documento Mexicano";  
    }
    
}