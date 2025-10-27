package decorator;

public class UnderlineDecorador extends DecoradorTexto {

     public UnderlineDecorador(Texto wrapper) {
        super(wrapper);
    }

    @Override
    public String render() {
    return "<s>" + super.render() + "</s>";  
    }
}
