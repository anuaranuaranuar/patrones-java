package decorator;

public class Main {
    public static void main(String[] args) {
        Texto texto = new TextoPlano("Hola mundo");

        texto = new BoldDecorador(
                    new ItalicDecorador(
                        new UnderlineDecorador(texto)));

                        System.out.println(texto.render());
    }
}
