package ar.edu.untref.aydoo;

public class ValidadorDeParametros {

	public boolean hayCondicionesValidasParaTransformar(String[] parametrosDeEntrada){

		boolean hayUnModoDeSalidaValido = this.modoDeSalidaValido(parametrosDeEntrada[0]);
		boolean hayContradiccionDeParametros = this.contradiccionDeParametros(parametrosDeEntrada[0], parametrosDeEntrada[2]);
		boolean hayArchivoDeEntrada = this.hayArchivoDeEntrada(parametrosDeEntrada[1]);

		boolean hayCondicionesValidasParaTransformar = (hayUnModoDeSalidaValido && !hayContradiccionDeParametros) && hayArchivoDeEntrada;

		return hayCondicionesValidasParaTransformar;

	}

	private boolean modoDeSalidaValido(String modoDeSalida){

		boolean sePidioModoDefault = modoDeSalida.equals("--mode=default") || modoDeSalida.equals("");
		boolean sePidioModoNoOutput = modoDeSalida.startsWith("--mode=no-output");

		boolean modoDeSalidaValido = sePidioModoDefault || sePidioModoNoOutput;
		
		if(!modoDeSalidaValido){
			System.out.println("El modo de salida insertado es incorrecto. Solo se permiten: default o no-output.");
		}

		return modoDeSalidaValido;

	}

	private boolean contradiccionDeParametros(String modoDeSalida, String output) {

		boolean sePidioModoNoOutput = modoDeSalida.equals("--mode=no-output");
		boolean sePidioUnArchivoDeSalida = !output.equals("");

		boolean contradiccionDeParametros = sePidioModoNoOutput && sePidioUnArchivoDeSalida;
		
		if(contradiccionDeParametros){
			System.out.println("La combinacion de parametros es invalida.");
		}

		return contradiccionDeParametros;

	}

	private boolean hayArchivoDeEntrada(String archivo) {

		boolean hayArchivoDeEntrada = !archivo.equals("");
		
		if(!hayArchivoDeEntrada){
			System.out.println("Para proceder con la transformacion se necesita de un archivo de entrada .md.");
		}
		
		return hayArchivoDeEntrada;

	}

}