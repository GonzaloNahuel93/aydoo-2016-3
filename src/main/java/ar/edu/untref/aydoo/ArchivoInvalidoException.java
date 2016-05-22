package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class ArchivoInvalidoException extends RuntimeException {
    
	public ArchivoInvalidoException(){
		super("El archivo es invalido.");
	}
	
}