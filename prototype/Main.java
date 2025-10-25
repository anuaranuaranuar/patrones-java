package prototype;

public class Main {
    public static void main(String[] args) {
       
        Empleado e1 = new Empleado("juan", 18, "medico");
        Empleado e2 = (Empleado) e1.clone();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("-------------------");
        e2.setEdad(00);
        System.out.println(e1);
        System.out.println(e2);

        Estudiante es1 = new Estudiante("david", 35, "ingenieria");
        Estudiante es2 = (Estudiante) e1.clone();
        System.out.println(es1);
        System.out.println(es2);
        System.out.println("-------------------");
        e2.setEdad(00);
        System.out.println(es1);
        System.out.println(e2);
    }
}
