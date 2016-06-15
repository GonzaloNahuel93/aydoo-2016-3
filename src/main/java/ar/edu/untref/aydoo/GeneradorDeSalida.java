package ar.edu.untref.aydoo;

import java.util.List;

public class GeneradorDeSalida implements UnidadDeProceso{

	private UnidadDeProceso sucesor;

	public GeneradorDeSalida(){
		this.sucesor = null;
	}

	public void ejecutarOperacion(Object informacionDeEntrada){

		@SuppressWarnings("unchecked")
		List<Object> listaDeInformacion = (List<Object>) informacionDeEntrada;

		//Se extrae la informacion de la lista.
		CodigoHTML codigoHTML = (CodigoHTML) (listaDeInformacion.get(0)); //- En la POSICION 0 ya esta el Codigo HTML listo.

		String[] parametros = (String[]) (listaDeInformacion.get(1)); //- En la POSICION 1 estan los parametros de entrada ya validados previamente.
		String modoDeSalida = parametros[0];
		String archivoDeEntrada = parametros[1];
		String outPut = parametros[2];
		//

		String[] archivos = {archivoDeEntrada, outPut};
        String nombreDeArchivoDeSalida = this.determinarNombreDelArchivoDeSalida(archivos);

        String[] salidaPedida = {modoDeSalida, nombreDeArchivoDeSalida};

        this.generarSalida(codigoHTML, salidaPedida);

	}

	public void setSucesor(UnidadDeProceso nuevoSucesor){
		this.sucesor = nuevoSucesor;
	}

	public UnidadDeProceso getSucesor(){
		return this.sucesor;
	}

	public void generarSalida(CodigoHTML codigoHTML, String[] salidaPedida){

		String modoDeSalidaPedido = salidaPedida[0];
		boolean sePidioModoDefault = modoDeSalidaPedido.equals("--mode=default") || modoDeSalidaPedido.equals("");

		if(sePidioModoDefault){

			String nombreDePresentacion = salidaPedida[1];
			this.generarArchivoDePresentacion(codigoHTML, nombreDePresentacion);

		}else{

			this.generarSalidaPorConsola(codigoHTML);

		}		

	}

	private String determinarNombreDelArchivoDeSalida(String[] archivos){

		String nombreDeArchivoDeSalida = null;

		if(!archivos[1].equals("")){

			nombreDeArchivoDeSalida = archivos[1].substring(9, archivos[1].length());

		}else{

			nombreDeArchivoDeSalida = archivos[0].substring(0, archivos[0].length() - 3);

		}

		return nombreDeArchivoDeSalida;

	}

	private void generarSalidaPorConsola(CodigoHTML codigoHTML){
		System.out.println(codigoHTML.getContenido());
	}

	private void generarArchivoDePresentacion(CodigoHTML codigoHTML, String nombreDePresentacion) {

		CreadorDePresentacion creador = new CreadorDePresentacion();
		creador.generarPresentacion(codigoHTML, nombreDePresentacion);

	}

}