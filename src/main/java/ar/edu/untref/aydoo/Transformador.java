package ar.edu.untref.aydoo;

import java.util.List;

public class Transformador implements UnidadDeProceso{

	private UnidadDeProceso sucesor;

	public Transformador(){
		this.sucesor = new GeneradorDeSalida();
	}

	public void ejecutarOperacion(Object informacionDeEntrada){

		@SuppressWarnings("unchecked")
		List<Object> listaDeInformacion = (List<Object>) informacionDeEntrada;

		//- En la POSICION 0 estan las Estructuras de Secciones.
		EstructuraDeSecciones estructuraDeSecciones = (EstructuraDeSecciones) (listaDeInformacion.get(0));

		CodigoHTML codigoHTML = (CodigoHTML) (this.transformar(estructuraDeSecciones));
		listaDeInformacion.set(0, codigoHTML); //- Ahora se sustituye la POSICION 0 ya con el Codigo HTML.

		this.sucesor.ejecutarOperacion(listaDeInformacion);

	}

	public void setSucesor(UnidadDeProceso nuevoSucesor){
		this.sucesor = nuevoSucesor;
	}

	public UnidadDeProceso getSucesor(){
		return this.sucesor;
	}

    public ElementoTransformadoHTML transformar(Transformable elemento) {

        ElementoTransformadoHTML transformado = elemento.getTransformado();
        return transformado;

    }

}