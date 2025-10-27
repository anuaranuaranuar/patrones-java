package decorator;

public class TextoPlano implements Texto{
    private String contenido;

    
    public TextoPlano(String contenido) {
        this.contenido = contenido;
    }


    @Override
    public String render() {
        return contenido;
    }
    

    
}