package ar.edu.untref.aydoo.excepciones;

@SuppressWarnings("serial")
public class ModoDeSalidaInvalidoException extends RuntimeException {

	public ModoDeSalidaInvalidoException(){
		super("El modo de salida insertado es incorrecto. Solo se permiten: default o no-output.");
	}

}