package decorator;

public class DecoradorTexto implements Texto {

    protected Texto wrapper;
    
    public DecoradorTexto(Texto wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String render() {
    return wrapper.render();

    }
    
}
