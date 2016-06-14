package ar.edu.untref.aydoo;

public class ValidadorDeParametros implements UnidadDeProceso{

	private UnidadDeProceso sucesor;

	public ValidadorDeParametros(){
		this.sucesor = new LectorDeEntrada();
	}

	public void ejecutarOperacion(Object informacionDeEntrada){

		String[] parametrosDeEntrada = ((String[]) informacionDeEntrada);
		boolean losParametrosSonValidosParaTransformar = this.hayCondicionesValidasParaTransformar(parametrosDeEntrada);

		if(losParametrosSonValidosParaTransformar){
		   this.sucesor.ejecutarOperacion(parametrosDeEntrada);
		}

	}

	public void setSucesor(UnidadDeProceso nuevoSucesor){
		this.sucesor = nuevoSucesor;
	}

	public UnidadDeProceso getSucesor(){
		return this.sucesor;
	}

	public boolean hayCondicionesValidasParaTransformar(String[] parametrosDeEntrada){

		boolean hayUnModoDeSalidaValido = this.modoDeSalidaValido(parametrosDeEntrada[0]);
		boolean hayContradiccionDeParametros = this.contradiccionDeParametros(parametrosDeEntrada[0], parametrosDeEntrada[2]);
		boolean hayArchivoDeEntrada = this.hayArchivoDeEntrada(parametrosDeEntrada[1]);
		boolean contieneCaracteresRarosElArchivoDeEntrada = this.hayCaracteresRaros(parametrosDeEntrada[1]);

		boolean hayCondicionesValidasParaTransformar = (hayUnModoDeSalidaValido && !hayContradiccionDeParametros) && (hayArchivoDeEntrada && 
														!contieneCaracteresRarosElArchivoDeEntrada);

		return hayCondicionesValidasParaTransformar;

	}

	private boolean modoDeSalidaValido(String modoDeSalida){

		boolean sePidioModoDefault = modoDeSalida.equals("--mode=default") || modoDeSalida.equals("");
		boolean sePidioModoNoOutput = modoDeSalida.startsWith("--mode=no-output");

		boolean modoDeSalidaValido = sePidioModoDefault || sePidioModoNoOutput;

		if(!modoDeSalidaValido){
            throw new ModoDeSalidaInvalidoException();
        }

		return modoDeSalidaValido;

	}

	private boolean contradiccionDeParametros(String modoDeSalida, String output) {

		boolean sePidioModoNoOutput = modoDeSalida.equals("--mode=no-output");
		boolean sePidioUnArchivoDeSalida = !output.equals("");

		boolean contradiccionDeParametros = sePidioModoNoOutput && sePidioUnArchivoDeSalida;

		if(contradiccionDeParametros){
			throw new CombinacionDeParametrosInvalidaException();
		}

		return contradiccionDeParametros;

	}

	private boolean hayArchivoDeEntrada(String archivo) {

		boolean hayArchivoDeEntrada = !archivo.equals("");

		if(!hayArchivoDeEntrada){
            throw new ArchivoInvalidoException();
        }

		return hayArchivoDeEntrada;

	}

	private boolean hayCaracteresRaros(String nombreDelArchivoDeEntrada) {
		
		boolean hayCaracteresRaros = false;
		
		if(this.hayArchivoDeEntrada(nombreDelArchivoDeEntrada)){
			
			boolean hayEnies = nombreDelArchivoDeEntrada.contains("ñ") || nombreDelArchivoDeEntrada.contains("Ñ");
			boolean hayAcentos = (nombreDelArchivoDeEntrada.contains("á") || nombreDelArchivoDeEntrada.contains("Á")) ||
								 (nombreDelArchivoDeEntrada.contains("é") || nombreDelArchivoDeEntrada.contains("É")) ||
								 (nombreDelArchivoDeEntrada.contains("í") || nombreDelArchivoDeEntrada.contains("Í")) ||
								 (nombreDelArchivoDeEntrada.contains("ó") || nombreDelArchivoDeEntrada.contains("Ó")) ||
								 (nombreDelArchivoDeEntrada.contains("ú") || nombreDelArchivoDeEntrada.contains("Ú"));
			boolean hayBarra = nombreDelArchivoDeEntrada.contains("/");
			
			hayCaracteresRaros = hayEnies || hayAcentos || hayBarra;
			
		}
		
		if(hayCaracteresRaros){
			throw new CaracteresNoPermitidosException();
		}
		
		return hayCaracteresRaros;
		
	}

}