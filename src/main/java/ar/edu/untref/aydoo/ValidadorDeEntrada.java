package ar.edu.untref.aydoo;


public class ValidadorDeEntrada {

    public void validar(String entrada) {

        if(!(entrada.endsWith(".md"))) throw new FormatoDeEntradaInvalidoException();

    }
    
}