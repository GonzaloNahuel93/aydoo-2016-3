package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public abstract class BloqueHTML implements ComponenteHTML {

    protected List<LineaHTML> lineas;

	protected BloqueHTML(){
        this.lineas = new ArrayList<LineaHTML>();
	}

    @Override
	public String getContenido(){

		String contenido = "";

		for(LineaHTML linea: this.lineas){
            contenido = linea.concatenarContenido(contenido);
        }

		return contenido;

	}

}