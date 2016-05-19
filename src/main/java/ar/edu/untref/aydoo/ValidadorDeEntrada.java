package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 19/05/16.
 */
public class ValidadorDeEntrada {

    public void validar(String entrada) {

        if(!(entrada.endsWith(".md"))) throw new FormatoDeEntradaInvalidoException();

    }
    
}
