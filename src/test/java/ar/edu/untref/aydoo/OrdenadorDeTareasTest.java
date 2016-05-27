package ar.edu.untref.aydoo;

import org.junit.Test;

public class OrdenadorDeTareasTest {

	@Test
	public void seQuiereComoSalidaUnArchivoInsertandoLosTresParametrosCorrectamente(){

		OrdenadorDeTareas ordenador = new OrdenadorDeTareas();
		String[] entrada = {"--mode=default", "PresentacionDelTP.md", "--output=Presentacion"};

		ordenador.ejecutar(entrada);

	}

	@Test
	public void seQuiereComoSalidaUnArchivoInsertandoSoloElArchivoDeEntrada(){

		OrdenadorDeTareas ordenador = new OrdenadorDeTareas();
		String[] entrada = {"PresentacionDelTP.md"};

		ordenador.ejecutar(entrada);

	}

	@Test
	public void seQuiereComoSalidaUnArchivoInsertandoSoloElArchivoDeEntradaPeroSinEspecificarQueEsUnMD(){

		OrdenadorDeTareas ordenador = new OrdenadorDeTareas();
		String[] entrada = {"PresentacionDelTP"};

		ordenador.ejecutar(entrada);

	}

	@Test
	public void seQuiereComoSalidaUnArchivoInsertandoElArchivoDeEntradaYQueriendoUnaSalidaEspecial(){

		OrdenadorDeTareas ordenador = new OrdenadorDeTareas();
		String[] entrada = {"ComputacionCuantica", "--output=CuanticaComputacion"};

		ordenador.ejecutar(entrada);

	}

	
}