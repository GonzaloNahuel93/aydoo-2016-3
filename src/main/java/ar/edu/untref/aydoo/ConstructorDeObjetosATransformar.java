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
        for (String actual: listaDeEntrada) {

            Transformable objeto = this.repositorio.obtenerObjetoPorString(actual);
            objeto.colocarStringDeContenidoPropio(actual);
            objetos.add(objeto);

        }

        return objetos;

    }


}
