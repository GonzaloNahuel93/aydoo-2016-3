package ar.edu.untref.aydoo.Programa.Elementos;

public class SeccionHTML extends BloqueHTML {

    public void agregarLinea(LineaHTML lineaHTML) {
        this.lineas.add(lineaHTML);
    }

    @Override
    public String getContenido() {
        return "<section>\n" + super.getContenido() + "</section>";
    }

}