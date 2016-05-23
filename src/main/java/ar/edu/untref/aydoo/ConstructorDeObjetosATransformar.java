package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by synysterlove on 23/05/16.
 */
public class ConstructorDeObjetosATransformar {
    
    public List<Transformable> construirObjetos(List<String> listaDeEntrada) {

        List<Transformable> objetos = new ArrayList<Transformable>();
        objetos.add(new Titulo("Titulo"));
        return objetos;

    }


}
