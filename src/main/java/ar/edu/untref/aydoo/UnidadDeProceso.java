package ar.edu.untref.aydoo;

/* Interface para la aplicacion del Patron CHAIN OF RESPONSIBILITY.
 * 
 * Las Unidades del proceso son:
 * 1 - OrdenadorDeParametros
 * 2 - ValidadorDeParametros
 * 3 - LectorDeEntrada
 * 4 - ConstructorDeEstructura
 * 5 - Transformador
 * 6 - GeneradorDeSalida
 */
public interface UnidadDeProceso {

	public void ejecutarOperacion(Object informacionDeEntrada);

	public void setSucesor(UnidadDeProceso nuevoSucesor);

	public UnidadDeProceso getSucesor();

}