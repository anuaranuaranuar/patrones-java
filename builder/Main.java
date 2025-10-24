package builder;

public class Main {
    public static void main(String[] args) {
        Persona soloNombre = new Persona.Builder("Juan").build();

        System.out.println("Solo atributo inicial: \n" + soloNombre);

        Persona full = new Persona.Builder("Pedro")
                                .conEdad(18)
                                .conEmail("pedro@gmail.com")
                                .conProfesion("estudiante")
                                .conSalario(10000f)
                                .build();

        System.out.println("Todos los atributos: \n" +
                                    full);
    }
    
}
