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
			List<String> lineasDeArchivo = this.lector.getContenidoDelArchivoDeEntrada();

			EstructuraDeSecciones estructuraConstruida = this.constructor.construirEstructura(lineasDeArchivo);

			CodigoHTML codigoHTML = ((CodigoHTML)estructuraConstruida.getTransformado());

			String[] archivos = {parametros[1], parametros[2]};
			String nombreDeArchivoDeSalida = this.determinarNombreDelArchivoDeSalida(archivos);
			
			String[] entradas = {modoDeSalida, nombreDeArchivoDeSalida};

			this.generador.generarSalida(codigoHTML, entradas);

		}

	}
	
	private String determinarNombreDelArchivoDeSalida(String[] archivos){
		
		String nombreDeArchivoDeSalida = "";
		
		if(!archivos[1].equals("")){
			
			nombreDeArchivoDeSalida = archivos[1].substring(9, archivos[1].length());
			
		}else{
			
			nombreDeArchivoDeSalida = archivos[0].substring(archivos[0].length() - 3, archivos[0].length());
			
		}
		
		return nombreDeArchivoDeSalida;
		
	}

}