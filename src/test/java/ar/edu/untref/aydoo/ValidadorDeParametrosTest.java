package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ValidadorDeParametrosTest {

	@Test
	public void queTireTrueCuandoLosParametrosSonValidosComoParaHacerUnaTransformacion(){

		String[] parametros = {"--mode=default", "miPresentacion.md", "--output=PresentacionParaAyDOO"};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertTrue(validador.hayCondicionesValidasParaTransformar(parametros));

	}

	@Test
	public void queTireFalseCuandoLosParametrosDelModeYOutputSeContradicen(){

		String[] parametros = {"--mode=no-output", "miPresentacion.md", "--output=presentacionMaster"};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertFalse(validador.hayCondicionesValidasParaTransformar(parametros));

	}

	@Test
	public void queTireTrueCuandoSePuedaDarElCasoQueSeInserteOtraCombinacionDeParametrosValidosParaUnaTransformacion(){

		String[] parametros = {"--mode=default", "miPresentacion.md", ""};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertTrue(validador.hayCondicionesValidasParaTransformar(parametros));

	}

	@Test
	public void queTireFalseCuandoNoSeDetectaUnArchivoDeEntradaParaTransformar(){

		String[] parametros = {"--mode=default", "", "--output=presentacionMaster"};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertFalse(validador.hayCondicionesValidasParaTransformar(parametros));

	}

	@Test
	public void queTireTrueCuandoSimplementeSePasaElArchivoDeEntradaParaUnaTransformacion(){

		String[] parametros = {"", "miPresentacion.md", ""};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertTrue(validador.hayCondicionesValidasParaTransformar(parametros));

	}

	@Test
	public void queTireFalseCuandoSePasaUnModoDeSalidaInvalido(){

		String[] parametros = {"--mode=arcoiris", "miPresentacion.md", "--output=Salida"};
		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertFalse(validador.hayCondicionesValidasParaTransformar(parametros));

	}

}