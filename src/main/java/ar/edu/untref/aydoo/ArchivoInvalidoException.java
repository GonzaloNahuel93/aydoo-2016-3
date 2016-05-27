package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class ArchivoInvalidoException extends RuntimeException {

	public ArchivoInvalidoException(){
		super("Para proceder con la transformacion se necesita de un archivo de entrada .md.");
	}
	
}