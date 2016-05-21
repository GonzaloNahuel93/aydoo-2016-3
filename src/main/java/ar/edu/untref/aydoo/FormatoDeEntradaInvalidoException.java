package ar.edu.untref.aydoo.Programa;

@SuppressWarnings("serial")
public class FormatoDeEntradaInvalidoException extends RuntimeException {
    
	public FormatoDeEntradaInvalidoException(){
		super("El formato del archivo de entrada es inválido.");
	}
	
}