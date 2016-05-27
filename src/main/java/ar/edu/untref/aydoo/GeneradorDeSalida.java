package ar.edu.untref.aydoo;


public class GeneradorDeSalida {

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

	private void generarSalidaPorConsola(CodigoHTML codigoHTML){
		System.out.println(codigoHTML.getContenido());
	}

	private void generarArchivoDePresentacion(CodigoHTML codigoHTML, String nombreDePresentacion) {

		CreadorDePresentacion creador = new CreadorDePresentacion();
		creador.generarPresentacion(codigoHTML, nombreDePresentacion);

	}

}