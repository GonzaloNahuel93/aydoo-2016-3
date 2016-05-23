package ar.edu.untref.aydoo;

public interface Transformable {

    public ElementoTransformadoHTML getTransformado();

    @Override
    public boolean equals(Object obj);

    public void colocarStringDeContenidoPropio(String contenido);

}