package ar.edu.untref.aydoo.excepciones;

@SuppressWarnings("serial")
public class SintaxisDelArchivoDeEntradaInvalidaException extends RuntimeException {
    
	public SintaxisDelArchivoDeEntradaInvalidaException(){
		super("La sintaxis del archivo de entrada es invalida.");
	}

}