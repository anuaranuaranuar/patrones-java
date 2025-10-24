package factory.dominio.contractos;
//El creador (clase ABSTRACTA)
public abstract class Logistica {
    
    public abstract ITransporte crearTransporte();

    public String planificarEntrega(){
        ITransporte transporte = crearTransporte();

        return "Preparando la entrega. " + transporte.entregar();
    };
}
