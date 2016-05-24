package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class OrdenadorDeParametrosTest {

	@Test
	public void queOrdeneLosParametrosDeEntradaAcordeAlOrdenEstandarDefinido(){

		//El orden estandar definido es:
		//1) Modo de salida.
		//2) Archivo a transformar.
		//3) Output elegido (Opcional).

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

		Assert.assertEquals("--mode=no-output", parametrosOrdenados[0]);
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

	@Test
	public void seInsertanTodosLosParametrosIncluyendoLaPedidaDeUnOutputEspecial(){

		String[] parametros = {"miPresentacion.md", "--mode=default", "--output=Archivo"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=default", parametrosOrdenados[0]);
		Assert.assertEquals("miPresentacion.md", parametrosOrdenados[1]);
		Assert.assertEquals("--output=Archivo", parametrosOrdenados[2]);

	}

	@Test
	public void seVerificaQueOrdeneBienLosParametrosCuandoSeInsertanLosTresParametrosConLetrasMayusculasYMinisculas(){

		String[] parametros = {"--OuTpUt=AyDOO", "Presentacion de AyDOO.md", "--MODE=NosE"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=nose", parametrosOrdenados[0]);
		Assert.assertEquals("Presentacion de AyDOO.md", parametrosOrdenados[1]);
		Assert.assertEquals("--output=AyDOO", parametrosOrdenados[2]);

	}

	@Test
	public void queNoSeTomeEnCuentaCuandoSeColocaUnArchivoQueNoSeaMd(){

		String[] parametros = {"--output=AyDOO", "Presentacion.txt", "--mode=default"};
		OrdenadorDeParametros ordenador = new OrdenadorDeParametros();

		String[] parametrosOrdenados = ordenador.ordenar(parametros);

		Assert.assertEquals("--mode=default", parametrosOrdenados[0]);
		Assert.assertEquals("", parametrosOrdenados[1]);
		Assert.assertEquals("--output=AyDOO", parametrosOrdenados[2]);

	}

}