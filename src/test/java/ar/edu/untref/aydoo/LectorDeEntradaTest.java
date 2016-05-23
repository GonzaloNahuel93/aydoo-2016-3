package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LectorDeEntradaTest {

    @Test
    public void queConUnArchivoVacioNoHagaNada() throws IOException {

        File archivo = new File("archivo.md");
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

        File archivo = new File("archivo.md");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Este es");
        bw.newLine();
        bw.write("un archivo");
        bw.newLine();
        bw.write("con tres lineas");
        bw.close();
        fw.close();

        LectorDeEntrada lector = new LectorDeEntrada();
        lector.leerArchivo(archivo);

        archivo.delete();

        List<String> contenido = lector.getContenidoDelArchivoDeEntrada();
        Assert.assertEquals(contenido.get(0), "Este es");
        Assert.assertEquals(contenido.get(1), "un archivo");
        Assert.assertEquals(contenido.get(2), "con tres lineas");

    }

}