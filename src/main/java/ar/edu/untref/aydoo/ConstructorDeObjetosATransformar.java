package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 23/05/16.
 */
public class ConstructorDeObjetosATransformar {

    private RepositorioDeObjetos repositorio;

    public ConstructorDeObjetosATransformar() {

        this.repositorio = new RepositorioDeObjetos();

    }
    
    public List<Transformable> construirObjetos(List<String> listaDeEntrada) {

        List<Transformable> objetos = new ArrayList<Transformable>();

        for (int i=0; i < listaDeEntrada.size(); i++) {

            String actual = listaDeEntrada.get(i);

            if (actual.startsWith("*")) { //Solo entra aca cuando detecta el principio de una lista

                int finalDeLaLista = this.calcularDondeTerminaLaLista(listaDeEntrada, i);

                Lista lista = this.construirLista(listaDeEntrada, i, finalDeLaLista);
                objetos.add(lista);
                i += finalDeLaLista;

            } else if (actual.equals("---")) { //Solo entra aca cuando detecta el principio de una seccion

                int finalDeLaSeccion = this.calcularDondeTerminaLaSeccion(listaDeEntrada, i+1);

                Seccion seccion = this.construirSeccion(listaDeEntrada, i, finalDeLaSeccion);
                objetos.add(seccion);
                i += finalDeLaSeccion;

            } else {

                Transformable objeto = this.repositorio.obtenerObjetoPorString(actual);
                objeto.colocarStringDeContenidoPropio(actual);
                objetos.add(objeto);

            }

        }

        return objetos;

    }

    private Seccion construirSeccion(List<String> listaDeEntrada, int comienzoDeLaSeccion, int finalDeLaSeccion) {

        Seccion seccion = new Seccion();
        for(int i = comienzoDeLaSeccion+1; i <= finalDeLaSeccion; i++) {

            Transformable elemento = this.repositorio.obtenerObjetoPorString(listaDeEntrada.get(i));
            elemento.colocarStringDeContenidoPropio(listaDeEntrada.get(i));
            seccion.agregarContenido((Elemento)elemento);

        }
        return seccion;

    }


    private Lista construirLista(List<String> listaDeEntrada, int comienzoDeLaLista, int finalDeLaLista) {

        Lista lista = new Lista();
        for(int i = comienzoDeLaLista; i <= finalDeLaLista; i++) {

            Transformable item = this.repositorio.obtenerObjetoPorString(listaDeEntrada.get(i));
            item.colocarStringDeContenidoPropio(listaDeEntrada.get(i));
            lista.agregarItem((ItemDeLista)item);

        }
        return lista;

    }

    /*Toma la misma lista de entrada, y el comienzo de la "lista de items",
    y devuelve la posicion en la lista de entrada del "ultimo item", es decir,
    la ultima linea que empieza con *
     */
    private int calcularDondeTerminaLaLista(List<String> listaDeEntrada, int comienzoDeLaLista) {

        int i = comienzoDeLaLista;
        for(int j=i; j < listaDeEntrada.size(); j++) {

            if(listaDeEntrada.get(j).startsWith("*")) {

                i++;

            }

        }

        return i-1;

    }

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


}
