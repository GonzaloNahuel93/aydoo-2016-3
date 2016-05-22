package ar.edu.untref.aydoo;

public class Titulo extends ElementoSimple {

    public Titulo(String titulo) {
        super(titulo);
    }

    @Override
    public ComponenteHTML getTransformado() {

        TituloHTML tituloHTML = new TituloHTML(this.getContenido());
        return tituloHTML;

    }

}