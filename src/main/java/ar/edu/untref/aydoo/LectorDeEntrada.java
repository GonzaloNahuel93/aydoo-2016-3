package ar.edu.untref.aydoo;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class LectorDeEntrada implements UnidadDeProceso{

	private UnidadDeProceso sucesor;
    private List<String> contenidoDelArchivoDeEntrada;

    public LectorDeEntrada() {

    	this.sucesor = new ConstructorDeEstructura();
    	this.contenidoDelArchivoDeEntrada = new LinkedList<String>();

    }

	public void ejecutarOperacion(Object informacionDeEntrada){

		String[] parametros = ((String[]) informacionDeEntrada);
		String archivoDeEntrada = parametros[1];

		this.leerArchivo(new File(archivoDeEntrada));

		try {

			List<String> lineasDeArchivo = this.getContenidoDelArchivoDeEntrada();

			List<Object> informacionParaElSucesor = new LinkedList<Object>();
			informacionParaElSucesor.add(lineasDeArchivo);
			informacionParaElSucesor.add(parametros);

			this.sucesor.ejecutarOperacion(informacionParaElSucesor);

        } catch (SintaxisDelArchivoDeEntradaInvalidaException e) {

        	System.out.print("No se puede transformar el archivo, su sintaxis es invalida.");
        	e.printStackTrace();

        }

	}

	public void setSucesor(UnidadDeProceso nuevoSucesor){
		this.sucesor = nuevoSucesor;
	}

	public UnidadDeProceso getSucesor(){
		return this.sucesor;
	}

    public void leerArchivo(File archivoDeEntrada) {

        try {

            FileReader fr = new FileReader(archivoDeEntrada);
            BufferedReader lector = new BufferedReader(fr);

            String lineaActual = lector.readLine();
            
            while (lineaActual != null) {

                this.contenidoDelArchivoDeEntrada.add(lineaActual);
                lineaActual = lector.readLine();

            }
            
            lector.close();

        } catch (FileNotFoundException e) {

            throw new ArchivoInvalidoException();

        } catch (IOException e) {

            throw new LecturaInvalidaException();

        }

    }

    public List<String> getContenidoDelArchivoDeEntrada() {
    	return this.contenidoDelArchivoDeEntrada;
    }

}