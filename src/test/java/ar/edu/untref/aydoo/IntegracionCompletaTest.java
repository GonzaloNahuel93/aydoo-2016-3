package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 14/06/16.
 */
public class IntegracionCompletaTest {


    /*
    @Test
    public void queTransformeCorrectamenteUnArchivoDado() throws IOException {

        File archivo = new File("archivo.md");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("---");
        bw.newLine();
        bw.write("#Titulo");
        bw.newLine();
        bw.write("##Subtitulo");
        bw.newLine();
        bw.write("---");
        bw.newLine();
        bw.write("*item1");
        bw.newLine();
        bw.write("*item2");
        bw.close();
        fw.close();

        String[] args = new String[3];
        args[0] = "archivo.md";
        args[1] = "--mode=default";
        args[2] = "--output=presentacion_test_integracion";

        OrdenadorDeParametros ordenadorDeParametros = new OrdenadorDeParametros();
        ordenadorDeParametros.ejecutarOperacion(args);

        File salida = new File("index.html");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String contenido = "";
        String lineaActual = br.readLine();

        while (lineaActual != null) {

            contenido.concat(lineaActual);
            lineaActual = br.readLine();

        }

        br.close();
        fr.close();

        salida.delete();
        archivo.delete();

    }
    */

    
}
