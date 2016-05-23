package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by synysterlove on 23/05/16.
 */
public class RepositorioDeObjetos {

    private Map<String, Transformable> diccionarioDeObjetos;

    public RepositorioDeObjetos() {

        //Se inicializa el mapa con lo que aceptamos en el archivo de entrada
        this.diccionarioDeObjetos = new HashMap<String, Transformable>();
        diccionarioDeObjetos.put("#", new Titulo(""));

    }

    /*Este metodo tiene la posta tanto
    que hasta valida que no haya cosas raras en el
    archivo de entrada!! Porque pide que todas las lineas
    empiecen con alguno de los strings que tiene el mapa
     */
    public Transformable obtenerObjetoPorString(String s) {

        Iterator<String> iteradorClavesDelMapa = diccionarioDeObjetos.keySet().iterator();
        while(iteradorClavesDelMapa.hasNext()) {

            String actual = iteradorClavesDelMapa.next();
            if(s.startsWith(actual)) return diccionarioDeObjetos.get(actual);

        }

        throw new SintaxisDelArchivoDeEntradaInvalidaException(); //Si no hubo nunca un matcheo con lo aceptado, tira excepcion porque la entrada tiene algo invalido

    }
}
