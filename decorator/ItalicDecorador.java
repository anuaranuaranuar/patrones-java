package decorator;

public class ItalicDecorador extends DecoradorTexto{
    

    public ItalicDecorador(Texto wrapper) {
        super(wrapper);
    }

    @Override
    public String render() {
    return "<i>" + super.render() + "</i>";  
    }

}