package ar.edu.untref.aydoo;

public class Program{

    public static final void main(String args[]) {

    	//El OrdenadorDeParametros es el primer eslabon de la cadena de responsabilidades.
    	OrdenadorDeParametros ordenadorDeParametros = new OrdenadorDeParametros();
    	ordenadorDeParametros.ejecutarOperacion(args);

    }

}