package ar.edu.untref.aydoo;

/**
 * Created by synysterlove on 25/05/16.
 */
public class IntegracionConstruccionDeEstructuraCompletaTest {

    /*
    @Test
    public void quePuedaConstruirUnaSeccion() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");

        Seccion seccion = new Seccion();
        seccion.agregarContenido(new Titulo("Titulo"));
        seccion.agregarContenido(new Imagen("java.jpg"));

        ConstructorDeEstructura constructor = new ConstructorDeEstructura();

        EstructuraDeSecciones estructuraConstruida = constructor.construirEstructura(listaDeEntrada);

        Assert.assertTrue(this.verificarSiLaSeccionEstaEnLaEstructura(seccion, estructuraConstruida));

    }


    @Test
    public void quePuedaConstruirDosSecciones() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Titulo");
        listaDeEntrada.add("i:java.jpg");
        listaDeEntrada.add("---");
        listaDeEntrada.add("# Subtitulo");

        Seccion seccion1 = new Seccion();
        seccion1.agregarContenido(new Titulo("Titulo"));
        seccion1.agregarContenido(new Imagen("java.jpg"));

        Seccion seccion2 = new Seccion();
        seccion2.agregarContenido(new Subtitulo("Subtitulo"));

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Assert.assertEquals(seccion1, objetosConstruidos.get(0));
        Assert.assertEquals(seccion2, objetosConstruidos.get(1));

    }


    @Test
    public void quePuedaConstruirUnaSeccionConUnaListaDentro() {

        List<String> listaDeEntrada = new ArrayList<String>();
        listaDeEntrada.add("---");
        listaDeEntrada.add("*item1");
        listaDeEntrada.add("*item2");
        listaDeEntrada.add("*item3");

        Seccion seccion = new Seccion();
        Lista lista = new Lista();
        lista.agregarItem(new ItemDeLista("item1"));
        lista.agregarItem(new ItemDeLista("item2"));
        lista.agregarItem(new ItemDeLista("item3"));
        seccion.agregarContenido(lista);

        ConstructorDeSeccionATransformar constructor = new ConstructorDeSeccionATransformar();

        List<Transformable> objetosConstruidos = constructor.construirObjetos(listaDeEntrada);

        Assert.assertTrue(this.verificarSiElObjetoEstaEnLaLista(seccion, objetosConstruidos));

    }*/

    
}
