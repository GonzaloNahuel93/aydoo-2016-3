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

        return i - 1;

    }

    public EstructuraDeSecciones construirEstructura(List<String> listaDeEntrada) {

        EstructuraDeSecciones estructura = new EstructuraDeSecciones();
        for(int i=0; i < listaDeEntrada.size(); i++) {

            String actual = listaDeEntrada.get(i);
            if (actual.equals("---")) { //Solo entra aca cuando detecta el principio de una seccion

                int finalDeLaSeccion = this.calcularDondeTerminaLaSeccion(listaDeEntrada, i+1);

                Seccion seccion = this.construirSeccion(listaDeEntrada, i+1, finalDeLaSeccion);
                estructura.agregarComponente(seccion);
                i = finalDeLaSeccion;

            } else {

                throw new SintaxisDelArchivoDeEntradaInvalidaException();

            }

        }

        return estructura;

    }

    private Seccion construirSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion, int finalDeLaSeccion) {

        List<String> listaDeComponentesDeLaSeccion = listaDeEntrada.subList(comienzoDeLaSeccion, finalDeLaSeccion+1);
        ConstructorDeSeccion constructorSeccion = new ConstructorDeSeccion();
        Seccion seccionConstruida = constructorSeccion.construirSeccion(listaDeComponentesDeLaSeccion);

        return seccionConstruida;

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
