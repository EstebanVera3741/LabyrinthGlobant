package Laberinto;

import ConeccionLaberinto.Nodos;

public class Laberinto {

    private Columna laberinto;
    Nodos nodos = new Nodos();

    public Laberinto (Integer cantidadFilas, Integer cantidadColumnas){
        Columna columna = new Columna(cantidadFilas, cantidadColumnas);
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

    public void posicionesLaberinto (Integer valor){
        Integer numeroRandom = (int) Math.round((Math.random()*((1-valor)+1)) + valor);
        buscarSalidaRandom(numeroRandom);
    }
    public void buscarSalidaRandom (Integer numeroRandom){
        laberinto.crearValoresHabitaciones();
        for (Fila fila : laberinto.getColumna()){
            for (Habitacion habitacion : fila.getFila()){
                if(habitacion.getValor() == numeroRandom){
                    habitacion.setValor(0);
                }
            }
        }
        laberinto.visualizarValoresLaberinto();
    }


}
