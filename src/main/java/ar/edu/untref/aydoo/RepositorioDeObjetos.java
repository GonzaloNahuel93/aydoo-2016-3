package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepositorioDeObjetos {

    private Map<String, ElementoDeLinea> diccionarioDeObjetos;

    public RepositorioDeObjetos() {
        //Se inicializa el mapa con lo que aceptamos en el archivo de entrada
        this.reiniciarRepositorio();
    }

    public ElementoDeLinea obtenerObjetoPorString(String s) {

        Iterator<String> iteradorClavesDelMapa = diccionarioDeObjetos.keySet().iterator();
        while(iteradorClavesDelMapa.hasNext()) {

            String actual = iteradorClavesDelMapa.next();
            if(s.startsWith(actual)) {

                ElementoDeLinea aDevolver = diccionarioDeObjetos.get(actual);
                this.reiniciarRepositorio();
                return aDevolver;

            }

        }

        return new TextoPlano(""); //Si no matchea ninguna de las especificaciones, lo interpreta como texto

    }

    private void reiniciarRepositorio() {

        this.diccionarioDeObjetos = new HashMap<String, ElementoDeLinea>();
        diccionarioDeObjetos.put("#", new Titulo(""));
        diccionarioDeObjetos.put("##", new Subtitulo(""));
        diccionarioDeObjetos.put("i:", new Imagen(""));
        diccionarioDeObjetos.put("*", new ItemDeLista(""));

    }

}