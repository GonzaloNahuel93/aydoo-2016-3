package ar.edu.untref.aydoo;

import java.io.File;

public class Program
{

    public static final void main(String args[]) {

        (new ValidadorDeEntrada()).validar(args[0]);
        File archivoDeEntrada = new File(args[0]);
        new LectorDeEntrada().leerArchivo(archivoDeEntrada);

    }

}
