package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;
import ar.edu.untref.aydoo.ValidadorDeParametros;

public class ValidadorDeParametrosTest {

	@Test
	public void queTireTrueCuandoLosParametrosSonCorrectos(){

		String[] parametros = {"--mode=default", "Mi Presentacion.md", "--output=Presentacion para AyDOO"};

		ValidadorDeParametros validador = new ValidadorDeParametros();

		Assert.assertTrue(validador.hayCondicionesValidasParaTransformar(parametros));

	}
	
}