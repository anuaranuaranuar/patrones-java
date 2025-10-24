package factory_abstract.dominio.contratos;

public interface ILogisticaFactory {

    IEnvio crearTransporte();

    IDocumento crearDocumento();

} 
