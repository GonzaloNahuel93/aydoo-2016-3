package ar.edu.untref.aydoo;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CreadorDePresentacion {

	public void generarPresentacion(CodigoHTML codigoHTML, String nombreDePresentacion){

		File plantilla = new File("plantilla");

		if(plantilla.exists()){

			File presentacion = this.crearDirectorio(nombreDePresentacion);
			this.colocarContenidoBase(presentacion);
			this.modificarIndex(presentacion, codigoHTML);

		}else{

			System.out.print("No esta la plantilla para proceder a crear la presentacion.");

		}

	}

	private File crearDirectorio(String nombreDePresentacion) {

		File presentacion = new File(nombreDePresentacion);
		presentacion.mkdir();

		return presentacion;

	}

	private void colocarContenidoBase(File directorio) {

		File plantilla = new File("plantilla");

		String[] archivos = plantilla.list();

		for (int i = 0 ; i < archivos.length ; i++) {
		  copiarDirectorios(new File(plantilla,archivos[i]),new File(directorio,archivos[i]));                           
		}

	}

	private void copiarDirectorios(File origen, File destino) {

		if(origen.isDirectory()){

			destino.mkdir();

			String[] ficheros = origen.list();

			for (int i = 0 ; i < ficheros.length ; i++) {
			  copiarDirectorios(new File(origen,ficheros[i]),new File(destino,ficheros[i]));                           
			}

		}else{

			this.copiarFicheros(origen, destino);

		}

	}

	private void copiarFicheros(File origen, File destino) {

		try{

			InputStream in = new FileInputStream(origen);
			OutputStream out = new FileOutputStream(destino);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
			  out.write(buf, 0, len);
			}

			in.close();
			out.close();

		}catch(IOException e){

			e.getMessage();

		}

	}

	private void modificarIndex(File directorio, CodigoHTML codigoHTML) {

		try{

			File index = new File(directorio, "index.html");
			RandomAccessFile raf = new RandomAccessFile(index, "rw");

            String lineaActual = raf.readLine().trim();
            String codigoCompleto = "";

            while (lineaActual != null) {

            	lineaActual = lineaActual.trim();
            	boolean esLaLineaAReemplazar = lineaActual.equals("[este-es-el-texto-a-reemplazar]");

            	if(esLaLineaAReemplazar){

            		codigoCompleto = codigoCompleto + "\n" + codigoHTML.getContenido() + "\n\n";

            	}else{

            		codigoCompleto = codigoCompleto + lineaActual + "\n";

            	}

                lineaActual = raf.readLine();

            }

            raf.close();

            FileOutputStream fo = new FileOutputStream(index);
    		fo.write(codigoCompleto.getBytes());
    		fo.close();

        } catch (FileNotFoundException e) {

            throw new ArchivoInvalidoException();

        } catch (IOException e) {

            throw new LecturaInvalidaException();

        }

	}

}