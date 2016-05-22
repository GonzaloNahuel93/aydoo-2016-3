package ar.edu.untref.aydoo;

public class LineaDeTextoPlano extends ElementoSimple {
    
    public LineaDeTextoPlano(String texto) {
        super(texto);     
    }

    @Override
    public ComponenteHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }

}