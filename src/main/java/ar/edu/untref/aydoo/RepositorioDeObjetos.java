package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RepositorioDeObjetos {

    private Map<String, Class> diccionarioDeObjetos;

    public RepositorioDeObjetos() {

        this.diccionarioDeObjetos = new HashMap<String, Class>();
        diccionarioDeObjetos.put("#", Titulo.class);
        diccionarioDeObjetos.put("##", Subtitulo.class);
        diccionarioDeObjetos.put("i:", Imagen.class);
        diccionarioDeObjetos.put("*", ItemDeLista.class);

    }

    public ElementoDeLinea obtenerObjetoPorString(String s) {

        Iterator<String> iteradorClavesDelMapa = diccionarioDeObjetos.keySet().iterator();
        while(iteradorClavesDelMapa.hasNext()) {

            String actual = iteradorClavesDelMapa.next();
            if(s.startsWith(actual)) {

                try {

                    ElementoDeLinea aDevolver = (ElementoDeLinea)diccionarioDeObjetos.get(actual).newInstance();
                    return aDevolver;

                } catch (Exception e) {

                    throw new RepositorioInvalidoException();

                }
            }

        }

        return new TextoPlano(""); //Si no matchea ninguna de las especificaciones, lo interpreta como texto

    }


}