package ar.edu.untref.aydoo;


public class LecturaInvalidaException extends RuntimeException{
    
	public LecturaInvalidaException(){
		super("La lectura del archivo es inv�lida.");
	}
	
}