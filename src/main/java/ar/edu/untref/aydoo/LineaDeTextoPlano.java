package ar.edu.untref.aydoo;

public class LineaDeTextoPlano extends Elemento {
    
    public LineaDeTextoPlano(String texto) {
        super(texto);     
    }

    @Override
    public LineaHTML getTransformado() {

        TextoPlanoHTML texto = new TextoPlanoHTML(this.getContenido());
        return texto;

    }

}