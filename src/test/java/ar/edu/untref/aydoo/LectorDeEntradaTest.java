package ar.edu.untref.aydoo.tests;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.untref.aydoo.entrada.LectorDeEntrada;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LectorDeEntradaTest {

    @Test
    public void queConUnArchivoVacioNoHagaNada() throws IOException {

        File archivo = new File("archivo.txt");
        FileWriter fw = new FileWriter(archivo);
        fw.write("");
        fw.close();

        LectorDeEntrada lector = new LectorDeEntrada();
        lector.leerArchivo(archivo);

        archivo.delete();

        Assert.assertTrue(lector.getContenidoDelArchivoDeEntrada().isEmpty());

    }

    @Test
    public void queInterpreteCorrectamenteUnArchivoConTresLineas() throws IOException {

        File archivo = new File("archivo.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hola");
        bw.newLine();
        bw.write("soy un archivo");
        bw.newLine();
        bw.write("y no sirvo para nada");
        bw.close();
        fw.close();

        LectorDeEntrada lector = new LectorDeEntrada();
        lector.leerArchivo(archivo);

        archivo.delete();

        List<String> contenido = lector.getContenidoDelArchivoDeEntrada();
        Assert.assertEquals(contenido.get(0), "hola");
        Assert.assertEquals(contenido.get(1), "soy un archivo");
        Assert.assertEquals(contenido.get(2), "y no sirvo para nada");

    }

}