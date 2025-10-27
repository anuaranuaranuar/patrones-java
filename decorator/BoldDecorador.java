package decorator;



public class BoldDecorador extends DecoradorTexto{
    

    public BoldDecorador(Texto wrapper) {
        super(wrapper);
    }

    @Override
    public String render() {
    return "<b>" + super.render() + "</b>";  
    }

}
