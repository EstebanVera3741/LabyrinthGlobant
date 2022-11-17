package ConeccionLaberinto;

public class NodoPadre {

    private Integer valor;
    private NodoPadre nodoIzquierdo, nodoDerecho;

    public NodoPadre (Integer valor){
        this.valor = valor;
        nodoIzquierdo = null;
        nodoDerecho = null;
    }
    public int getValor() {
        return valor;
    }
    public NodoPadre getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoPadre getNodoDerecho() {
        return nodoDerecho;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void insertarNuevoNodo (Integer valor) {
        if (valor < this.valor) {
            if (nodoIzquierdo == null){
                nodoIzquierdo = new NodoPadre(valor);
            }
            else{
                nodoIzquierdo.insertarNuevoNodo(valor);
            }
        }
        else {
            if (nodoDerecho == null){
                nodoDerecho = new NodoPadre(valor);
            }
            else{
                nodoDerecho.insertarNuevoNodo(valor);
            }
        }

    }

}