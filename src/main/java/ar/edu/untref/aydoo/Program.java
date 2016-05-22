package ar.edu.untref.aydoo;

import java.io.File;

public class Program{

    public static final void main(String args[]) {

        File archivoDeEntrada = new File(args[0]);
        new LectorDeEntrada().leerArchivo(archivoDeEntrada);

    }

}