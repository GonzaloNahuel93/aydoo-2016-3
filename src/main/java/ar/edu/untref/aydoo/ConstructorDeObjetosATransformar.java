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

            if(actual.startsWith("*")) { //Solo entra aca cuando detecta el principio de una lista

                int finalDeLaLista = this.calcularDondeTerminaLaLista(listaDeEntrada, i);

                Lista lista = this.construirLista(listaDeEntrada, i, finalDeLaLista);
                objetos.add(lista);
                i+=finalDeLaLista;

            } else if (actual.startsWith("---")) { //Solo entra aca cuando detecta el principio de una seccion

                //TODO

            } else {

                Transformable objeto = this.repositorio.obtenerObjetoPorString(actual);
                objeto.colocarStringDeContenidoPropio(actual);
                objetos.add(objeto);

            }

        }

        return objetos;

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


}
