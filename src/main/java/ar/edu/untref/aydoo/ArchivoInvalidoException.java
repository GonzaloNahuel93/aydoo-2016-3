package ar.edu.untref.aydoo.Programa;

@SuppressWarnings("serial")
public class ArchivoInvalidoException extends RuntimeException {
    
	public ArchivoInvalidoException(){
		super("El archivo es invalido.");
	}
	
}