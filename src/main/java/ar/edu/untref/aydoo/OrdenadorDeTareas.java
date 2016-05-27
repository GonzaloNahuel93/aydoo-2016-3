package ar.edu.untref.aydoo;

import java.io.File;
import java.util.List;

public class OrdenadorDeTareas {

	private OrdenadorDeParametros ordenador;
	private ValidadorDeParametros validador;
	private LectorDeEntrada lector;
	private ConstructorDeEstructura constructor;
	private GeneradorDeSalida generador;

	public OrdenadorDeTareas(){

		this.ordenador = new OrdenadorDeParametros();
		this.validador = new ValidadorDeParametros();
		this.lector = new LectorDeEntrada();
		this.constructor = new ConstructorDeEstructura();
		this.generador = new GeneradorDeSalida();

	}

	public void ejecutar(String[] parametrosDeEntrada){

		//Ordena los parametros de entrada
		String[] parametros = this.ordenador.ordenar(parametrosDeEntrada);

		//Valida los parametros de entrada
		boolean losParametrosSonValidosParaTransformar = this.validador.hayCondicionesValidasParaTransformar(parametros);

		//Ejecuta la transformacion si se puede transformar
		String modoDeSalida = parametros[0];
		String archivoDeEntrada = parametros[1];

		if(losParametrosSonValidosParaTransformar){

			this.lector.leerArchivo(new File(archivoDeEntrada));

            try {

                List<String> lineasDeArchivo = this.lector.getContenidoDelArchivoDeEntrada();

                Transformador transformador = new Transformador();
                CodigoHTML codigoHTML = (CodigoHTML)transformador.transformar(this.constructor.construirEstructura(lineasDeArchivo));

                String[] archivos = {parametros[1], parametros[2]};
                String nombreDeArchivoDeSalida = this.determinarNombreDelArchivoDeSalida(archivos);

                String[] entradas = {modoDeSalida, nombreDeArchivoDeSalida};

                this.generador.generarSalida(codigoHTML, entradas);

            } catch (SintaxisDelArchivoDeEntradaInvalidaException e) {

                System.out.print("No se puede transformar este archivo, su sintaxis es invalida");
                e.printStackTrace();

            }

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

}