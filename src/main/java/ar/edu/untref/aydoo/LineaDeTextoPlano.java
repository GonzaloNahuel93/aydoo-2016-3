package ar.edu.untref.aydoo;

public class LineaDeTextoPlano extends ElementoDeLinea {
    
    public LineaDeTextoPlano(String texto) {
        super(texto);     
    }

    @Override
    public TransformadoHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }

}