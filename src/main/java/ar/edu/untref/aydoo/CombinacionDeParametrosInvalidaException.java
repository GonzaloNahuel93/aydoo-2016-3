package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class CombinacionDeParametrosInvalidaException extends RuntimeException {
    
	public CombinacionDeParametrosInvalidaException(){
		super("La combinacion de parametros ingresados es invalido.");
	}

}