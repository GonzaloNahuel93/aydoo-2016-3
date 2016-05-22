package ar.edu.untref.aydoo;

public class OrdenadorDeParametros {

	public String[] ordenar(String[] parametros){
		
		String[] parametrosOrdenados = {"", ""};
		
		for(int i = 0 ; i < parametros.length ; i++){
			parametrosOrdenados = evaluarParametro(parametros, parametrosOrdenados, i);
		}
		
		return parametrosOrdenados;
		
	}

	private String[] evaluarParametro(String[] parametros, String[] parametrosOrdenados, int i) {

		//'.md' tiene 3 letras. Puede darse el caso que este parametro contenga el nombre del archivo a transformar.
		if(parametros[i].length() > 3){
			parametrosOrdenados = this.agregarArchivo(parametros[i], parametrosOrdenados);
		}

		//'--mode=' tiene 7 letras. Puede darse el caso que este parametro contenga el modo en que se quiere generar la salida de la transformacion.
		if(parametros[i].length() > 7){
			parametrosOrdenados = this.agregarModo(parametros[i], parametrosOrdenados);
		}

		return parametrosOrdenados;

	}

	private String[] agregarModo(String parametroActual, String[] parametrosOrdenados){

		String parametro = parametroActual.substring(0,7);
		parametro = parametro.toLowerCase();

		if("--mode=".equals(parametro)){
			parametrosOrdenados[0] = parametro + parametroActual.substring(7,parametroActual.length());
		}

		return parametrosOrdenados;

	}

	private String[] agregarArchivo(String parametroActual, String[] parametrosOrdenados){

		String parametro = parametroActual.substring(parametroActual.length() - 3,parametroActual.length());
		parametro = parametro.toLowerCase();

		if(".md".equals(parametro)){
			parametrosOrdenados[1] = parametroActual.substring(0,parametroActual.length() - 3) + parametro;
		}

		return parametrosOrdenados;

	}

}