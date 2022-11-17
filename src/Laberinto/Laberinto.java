package Laberinto;

import ConeccionLaberinto.Nodos;

public class Laberinto {

    private Columna laberinto;
    Nodos nodos = new Nodos();

    public Laberinto (Integer cantidadFilas, Integer cantidadColumnas){
        Columna columna = new Columna(cantidadFilas, cantidadColumnas);
        columna.visualizarValoresLaberinto();
        laberinto = columna;
    }

    public void vizualizarOrdenLaberinto (){
        nodos.recorrerOrdenSolucionLaberinto();
    }

    public void coneccionIndiceNodosLaberinto (){
        for (Fila fila : laberinto.getColumna()){
            for (Habitacion habitacion : fila.getFila()){
                Integer valor = habitacion.getValor();
                nodos.insertarNuevoNodo(valor);
            }
        }
    }

}
