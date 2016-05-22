package ar.edu.untref.aydoo;


public class FormatoDeEntradaInvalidoException extends RuntimeException {
    
	public FormatoDeEntradaInvalidoException(){
		super("El formato del archivo de entrada es inv�lido.");
	}
	
}