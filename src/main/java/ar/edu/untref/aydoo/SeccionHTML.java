package ar.edu.untref.aydoo;

public class SeccionHTML extends BloqueHTML {



    public void agregarLinea(LineaHTML lineaHTML) {

        this.lineas.add(lineaHTML);

    }

    @Override
    public String getContenido() {

        return "<section>\n" + super.getContenido() + "</section>";

    }

}