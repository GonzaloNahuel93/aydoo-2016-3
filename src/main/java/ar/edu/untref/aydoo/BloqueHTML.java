package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public abstract class BloqueHTML implements ComponenteHTML {

	protected List<ComponenteHTML> componentes;

	protected BloqueHTML(){

		this.componentes = new ArrayList<ComponenteHTML>();

	}

	public void agregarComponente(ComponenteHTML componente){

		this.componentes.add(componente);

	}

	public String getContenido(){

		String contenido = "<section>\n";

		for(ComponenteHTML componente: this.componentes){

			contenido = contenido + " " + componente.getContenido() + "\n";

        }

		contenido = contenido + "</section>";

		return contenido;

	}

}