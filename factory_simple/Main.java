package factory_simple;

import factory_simple.dominio.contractos.ITransporte;
import factory_simple.servicio.Logistica;

public class Main {
    public static void main(String[] args) {
        ITransporte logistica;

        logistica = Logistica.crearTransporte("maritimo");

        System.out.println(logistica.entregar());

        System.out.println("-------------------------");


        logistica = Logistica.crearTransporte("aereo");

        System.out.println(logistica.entregar());

        System.out.println("-------------------------");


        logistica = Logistica.crearTransporte("carretera");

        System.out.println(logistica.entregar());

        System.out.println("-------------------------");
    }
}
