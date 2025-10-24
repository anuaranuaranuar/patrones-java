package factory;

import factory.dominio.contractos.Logistica;
import factory.servicio.LogisticaAerea;
import factory.servicio.LogisticaMaritima;
import factory.servicio.LogisticaTerrestre;

public class Main {
    public static void main(String[] args) {

        Logistica logistica;
        logistica = new LogisticaTerrestre();
        
        String resultadoTerrestre = logistica.planificarEntrega();

        System.out.println("Terrestre: "+ resultadoTerrestre);
        System.out.println("------------------------------");

        logistica = new LogisticaMaritima();
        
        String resultadoMaritima = logistica.planificarEntrega();

        System.out.println("Maritima: "+ resultadoMaritima);
        System.out.println("------------------------------");

       
        logistica = new LogisticaAerea();
        
        String resultadoAereo = logistica.planificarEntrega();

        System.out.println("Aereo: "+ resultadoAereo);

        
    }
}
