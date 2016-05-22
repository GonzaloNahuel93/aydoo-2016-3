package ar.edu.untref.aydoo.entrada;

@SuppressWarnings("serial")
public class ArchivoInvalidoException extends RuntimeException {
    
	public ArchivoInvalidoException(){
		super("El archivo es invalido.");
	}
	
}