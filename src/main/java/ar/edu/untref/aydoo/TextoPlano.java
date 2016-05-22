package ar.edu.untref.aydoo;


public class TextoPlano extends ElementoDeLinea {
    
    public TextoPlano(String texto) {
        super(texto);     
    }

    @Override
    public TransformadoHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }

}