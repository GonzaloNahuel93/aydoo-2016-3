package A.Entrada;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by synysterlove on 17/05/16.
 */
public class LectorDeEntrada {


    private List<String> contenidoDelArchivoDeEntrada;

    public LectorDeEntrada() {

            this.contenidoDelArchivoDeEntrada = new LinkedList<String>();

    }

    public void leerArchivo(File archivoDeEntrada) {

        try {

            FileReader fr = new FileReader(archivoDeEntrada);
            BufferedReader lector = new BufferedReader(fr);

            String lineaActual = lector.readLine();
            while (lineaActual != null) {

                this.contenidoDelArchivoDeEntrada.add(lineaActual);
                lineaActual = lector.readLine();

            }

        } catch (FileNotFoundException e) {

            throw new ArchivoInvalidoException();

        } catch (IOException e) {

            throw new LecturaInvalidaException();

        }

    }

    
    public List<String> getContenidoDelArchivoDeEntrada() {

        return this.contenidoDelArchivoDeEntrada;

    }
}
