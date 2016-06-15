package ar.edu.untref.aydoo;

import java.util.List;

public class ConstructorDeEstructura implements UnidadDeProceso{

	private UnidadDeProceso sucesor;
	private ConstructorDeSeccion constructorSeccion;

	public ConstructorDeEstructura(){

		this.sucesor = new Transformador();
		this.constructorSeccion = new ConstructorDeSeccion();

	}

	public void ejecutarOperacion(Object informacionDeEntrada){

		@SuppressWarnings("unchecked")
		List<Object> listaDeInformacion = (List<Object>) informacionDeEntrada;
		@SuppressWarnings("unchecked")
		List<String> lineasDeArchivo = (List<String>) (listaDeInformacion.get(0)); //- En la POSICION 0 estan las lineas del archivo.

		EstructuraDeSecciones estructuraDeSecciones = this.construirEstructura(lineasDeArchivo);
		listaDeInformacion.set(0, estructuraDeSecciones); //- Ahora se sustituye la POSICION 0 con la Estructura de Secciones.

		this.sucesor.ejecutarOperacion(listaDeInformacion);

	}

	public void setSucesor(UnidadDeProceso nuevoSucesor){
		this.sucesor = nuevoSucesor;
	}

	public UnidadDeProceso getSucesor(){
		return this.sucesor;
	}

    /*Funciona igual que el de la lista, pero devuelve
   	  la ultima posicion de la seccion
    */
    private int calcularDondeTerminaLaSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion) {

        int i = comienzoDeLaSeccion;
        for(int j=i; j < listaDeEntrada.size(); j++) {

            if(listaDeEntrada.get(j).equals("---")) {

                j=listaDeEntrada.size(); //Si encuentra un --- cierra el for

            } else {

                i++;

            }

        }

        return i - 1;

    }

    public EstructuraDeSecciones construirEstructura(List<String> listaDeEntrada) {

        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        for(int i=0; i < listaDeEntrada.size(); i++) {

            String actual = listaDeEntrada.get(i);
            if (actual.equals("---")) { //Solo entra aca cuando detecta el principio de una seccion

                int finalDeLaSeccion = this.calcularDondeTerminaLaSeccion(listaDeEntrada, i+1);

                Seccion seccion = this.construirSeccion(listaDeEntrada, i+1, finalDeLaSeccion);
                estructura.agregarComponente(seccion);
                i = finalDeLaSeccion;

            } else {

                throw new SintaxisDelArchivoDeEntradaInvalidaException();

            }

        }

        return estructura;

    }

    private Seccion construirSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion, int finalDeLaSeccion) {

        List<String> listaDeComponentesDeLaSeccion = listaDeEntrada.subList(comienzoDeLaSeccion, finalDeLaSeccion+1);
        Seccion seccionConstruida = this.constructorSeccion.construirSeccion(listaDeComponentesDeLaSeccion);

        return seccionConstruida;

    }

}