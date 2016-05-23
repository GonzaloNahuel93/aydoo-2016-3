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
        for (String s: listaDeEntrada) {

            Transformable objeto = this.repositorio.obtenerObjetoPorString(s);
            ((Titulo)objeto).colocarContenido(s);
            objetos.add(objeto);


        }

        return objetos;

    }


}
