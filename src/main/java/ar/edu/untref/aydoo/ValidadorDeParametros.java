package ar.edu.untref.aydoo;

public class ValidadorDeParametros {

	public boolean hayCondicionesValidasParaTransformar(String[] parametrosDeEntrada){

		boolean hayCondicionesValidasParaTransformar = !this.contradiccionDeParametros(parametrosDeEntrada[0], parametrosDeEntrada[2]) && 
										 				this.hayArchivoDeEntrada(parametrosDeEntrada[1]);

		return hayCondicionesValidasParaTransformar;

	}

	private boolean contradiccionDeParametros(String primerParametro, String segundoParametro) {

		boolean sePidioModoNoOutput = primerParametro.equals("--mode=no-output");
		boolean sePidioUnArchivoDeSalida = !segundoParametro.equals("");

		boolean contradiccionDeParametros = sePidioModoNoOutput && sePidioUnArchivoDeSalida;

		return contradiccionDeParametros;

	}

	private boolean hayArchivoDeEntrada(String parametro) {

		boolean hayArchivoDeEntrada = !parametro.equals("");
		return hayArchivoDeEntrada;

	}

}