package ar.edu.untref.aydoo.entrada;

@SuppressWarnings("serial")
public class FormatoDeEntradaInvalidoException extends RuntimeException {
    
	public FormatoDeEntradaInvalidoException(){
		super("El formato del archivo de entrada es invalido.");
	}
	
}