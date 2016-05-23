package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class OrdenadorDeParametrosTest {

	@Test
	public void queOrdeneLosParametrosDeEntradaAcordeAlOrdenEstandarDefinido(){

		//El orden estandar definido es:
		//1) Modo de salida.
		//2) Archivo a transformar.

		String[] parametros = {"miPresentacion.md", "--mode=default"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=default", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);

	}

	@Test
	public void queOrdeneLosParametrosDeEntradaAunqueElModoPedidoSeaInvalido(){

		String[] parametros = {"miPresentacion.md", "--mode=arcoiris"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=arcoiris", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);

	}

	@Test
	public void seInsertanParametrosParaOrdenarQueContieneEnMayusculasYNoDeberiaInfluirEnElOrdenamiento(){

		String[] parametros = {"mIpReSeNtAcIoN.MD", "--MODE=No-OutPut"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=No-OutPut", parametrosOrdenados[0]);
		Assert.assertEquals("mIpReSeNtAcIoN.md", parametrosOrdenados[1]);

	}

	@Test
	public void seInsertanVariosParametrosPeroSoloSeGuardanAquellosQueSonValidos(){

		String[] parametros = {"--mode=default", "miPresentacion.md", "Hola", "Esto", "Es", "AyDOO"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=default", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);

	}

	@Test
	public void seInsertaSolamenteElArchivoATransformar(){

		String[] parametros = {"miPresentacion.md"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);

	}

}