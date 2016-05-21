package ar.edu.untref.aydoo.Programa;

@SuppressWarnings("serial")
public class LecturaInvalidaException extends RuntimeException{
    
	public LecturaInvalidaException(){
		super("La lectura del archivo es inválida.");
	}
	
}