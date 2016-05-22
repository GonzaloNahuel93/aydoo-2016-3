package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;
import ar.edu.untref.aydoo.OrdenadorDeParametros;

public class OrdenadorDeParametrosTest {

	@Test
	public void queOrdeneLosParametrosAcordeAlOrdenEstandarDefinido(){

		//El orden estandar definido es:
		//1) Modo de salida.
		//2) Archivo a transformar.

		String[] parametros = {"miPresentacion.md", "--mode=default"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=default", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);

	}

}