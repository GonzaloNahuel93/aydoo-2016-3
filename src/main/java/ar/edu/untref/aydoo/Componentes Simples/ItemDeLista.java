package C.ComponentesSimples;

import D.ComponentesHTML.ItemDeListaHTML;
import D.ComponentesHTML.LineaHTML;

public class ItemDeLista extends Elemento{

	public ItemDeLista(String contenido){
		super(contenido);
	}

	@Override
	public LineaHTML getTransformado() {

		ItemDeListaHTML itemDeListaHTML = new ItemDeListaHTML(this.getContenido());
		return itemDeListaHTML;

	}

}