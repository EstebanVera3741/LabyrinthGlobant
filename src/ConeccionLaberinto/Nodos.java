package ConeccionLaberinto;

import Laberinto.Laberinto;

public class Nodos {

    private NodoPadre inicio;
    private Laberinto laberinto;

    public Nodos (Laberinto laberinto){
        inicio = null;
        this.laberinto = laberinto;
    }

    public void insertarNuevoNodo (Integer valor){
        if (inicio == null){
            inicio = new NodoPadre(valor);
        }
        else {
            inicio.insertarNuevoNodo(valor);
        }
    }


    public void recorrerOrdenSolucionLaberinto (){
        recorrerOrdenLaberinto(inicio);
    }
    public void recorrerOrdenLaberinto (NodoPadre nodo){
        if(nodo == null){
            return;
        }
        else {
            recorrerOrdenLaberinto(nodo.getNodoIzquierdo());
            if (nodo.getValor() == laberinto.getNumeroSalida()){
                System.out.println("Felicidades Solucion Laberinto");
            }
            recorrerOrdenLaberinto(nodo.getNodoDerecho());
        }
    }


}
