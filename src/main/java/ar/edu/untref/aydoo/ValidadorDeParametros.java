package ar.edu.untref.aydoo;

public class ValidadorDeParametros {

	public boolean hayCondicionesValidasParaTransformar(String[] parametrosDeEntrada){

		boolean hayCondicionesValidasParaTransformar = !this.contradiccionDeParametros(parametrosDeEntrada[0], parametrosDeEntrada[2]) && 
										 				this.hayArchivoDeEntrada(parametrosDeEntrada[1]);

		return hayCondicionesValidasParaTransformar;

	}

	private boolean contradiccionDeParametros(String primerParametro, String segundoParametro) {
		
		boolean contradiccionDeParametros = false;
		
		boolean sePidioModoNoOutput = primerParametro.equals("--mode=no-output");
		boolean estaVacioElParametroParaPedirNombreAUnArchivoDeSalida = segundoParametro.equals("");
		
		if(sePidioModoNoOutput && !estaVacioElParametroParaPedirNombreAUnArchivoDeSalida){
			contradiccionDeParametros = true;
		}
		
		return contradiccionDeParametros;
		
	}

	private boolean hayArchivoDeEntrada(String parametro) {

		boolean hayArchivoDeEntrada = false;
		boolean estaVacioElParametro = parametro.equals("");

		if(!estaVacioElParametro){
			hayArchivoDeEntrada = true;
		}

		return hayArchivoDeEntrada;

	}

}