package ar.edu.untref.aydoo;

import java.util.List;

/**
 * Created by synysterlove on 25/05/16.
 */
public class ConstructorDeEstructura {

    /*Funciona igual que el de la lista, pero devuelve
   la ultima posicion de la seccion
    */
    private int calcularDondeTerminaLaSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion) {

        int i = comienzoDeLaSeccion;
        for(int j=i; j < listaDeEntrada.size(); j++) {

            if(!listaDeEntrada.get(j).equals("---")) {

                i++;

            }

        }

        if(i != listaDeEntrada.size()) {

            return i - 2;

        } else {

            return i - 1;

        }

    }

    public EstructuraDeSecciones construirEstructura(List<String> listaDeEntrada) {

        return null;

    }

    /*
    private Seccion construirSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion, int finalDeLaSeccion) {

        Seccion seccion = new Seccion();
        for(int i = comienzoDeLaSeccion+1; i <= finalDeLaSeccion; i++) {

            Transformable elemento = this.repositorio.obtenerObjetoPorString(listaDeEntrada.get(i));
            elemento.colocarStringDeContenidoPropio(listaDeEntrada.get(i));
            seccion.agregarContenido((Elemento)elemento);

        }
        return seccion;

    }*/

}
