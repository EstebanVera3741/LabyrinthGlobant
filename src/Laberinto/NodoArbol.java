package Laberinto;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzquierdo, nodoDerecho;

    public NodoArbol (int valor){
        this.valor = valor;
        nodoIzquierdo = null;
        nodoDerecho = null;
    }

    public int getValor() {
        return valor;
    }

    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void insertarNuevoNodo(Integer valor){
        if (valor < this.valor){
            if (nodoIzquierdo == null){
                nodoIzquierdo = new NodoArbol(valor);
            }
            else{
                nodoIzquierdo.insertarNuevoNodo(valor);
            }
        }
        else{
            if (nodoDerecho == null){
                nodoDerecho = new NodoArbol(valor);
            }
            else {
                nodoDerecho.insertarNuevoNodo(valor);
            }
        }
    }

}
