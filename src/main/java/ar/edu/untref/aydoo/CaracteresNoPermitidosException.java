package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class CaracteresNoPermitidosException extends RuntimeException {

	public CaracteresNoPermitidosException(){
		super("En el archivo de entrada no se permiten ni acentos, ni enies, ni barras ( / ).");
	}

}