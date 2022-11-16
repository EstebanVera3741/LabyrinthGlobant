package Laberinto;

import java.sql.SQLOutput;

public class Arbol {
    NodoArbol inicial;
    public Arbol (){
        this.inicial = null;
    }

    public void insertarNodo (int valor){
        if(inicial == null){
            inicial = new NodoArbol(valor);
        }
        else {
            inicial.insertarNuevoNodo(valor);
        }
    }

    //Recorridos
    public void dispararPreOrden (){
        preOrden(inicial);
    }
    public void preOrden(NodoArbol nodo){
        if(nodo == null){
            return;
        }
        else {
            System.out.print(nodo.getValor() + " ");
            preOrden(nodo.getNodoIzquierdo());
            preOrden(nodo.getNodoDerecho());
        }
    }



    public void dispararInOrden (){
        inOrden(inicial);
    }
    public void inOrden(NodoArbol nodo){
        if(nodo == null){
            return;
        }
        else {
            inOrden(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor() + " ");
            inOrden(nodo.getNodoDerecho());
        }
    }


    public void dispararPostOrden (){
        postOrden(inicial);
    }
    public void postOrden(NodoArbol nodo){
        if(nodo == null){
            return;
        }
        else {
            postOrden(nodo.getNodoIzquierdo());
            postOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor() + " ");
        }
    }



}
