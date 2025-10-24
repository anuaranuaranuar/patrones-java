package builder;

public class Persona {

    private final String nombre;
    private Integer edad;
    private String email;
    private String profesion;
    private Float salario;

    private Persona(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.email = builder.email;
        this.profesion = builder.profesion;
        this.salario = builder.salario;
    }

    @Override
    public String toString() {
        return  "CrearPersona [nombre=" + nombre +
                ", edad=" + edad +
                ", email=" + email +
                ", profesion=" + profesion +
                ", salario=" + salario + "]";
    }

    public static class Builder {
        private final String nombre;
        private Integer edad = null;
        private String email = null;
        private String profesion = null;
        private Float  salario = null;

        public Builder(String nombre) {
            this.nombre = nombre;
        }

        public Builder conEdad(Integer edad) {
            this.edad = edad;
            return this;
        }

        public Builder conEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder conProfesion(String profesion) {
            this.profesion = profesion;
            return this;
        }

        public Builder conSalario(Float salario) {
            this.salario = salario;
            return this;
        }


        public Persona build()  {

            if(nombre.isEmpty()){
                throw new IllegalStateException("Email obligatorio.");
            }
            return new Persona(this);
        }
        
        

    }
}