package Laberinto;

import ConeccionLaberinto.Nodos;

public class Laberinto {

    private Columna laberinto;

    private Nodos nodos = new Nodos(this);
    private Integer numeroSalida;

    public Laberinto (Integer cantidadFilas, Integer cantidadColumnas){
        Columna columna = new Columna(cantidadFilas, cantidadColumnas);
        laberinto = columna;
    }
    public void vizualizarLaberinto (){
        laberinto.crearValoresHabitaciones();
        laberinto.visualizarValoresLaberinto();
    }

    public void conexionNodos (){
        for (Fila fila : laberinto.getColumna()){
            for (Habitacion habitacion : fila.getFila()){
                if (habitacion.getTipoDeHabitacion().equals("entrada")){
                    nodos.insertarNuevoNodo(habitacion.getValor());
                }
                if (habitacion.getTipoDeHabitacion().equals("camino")){
                    nodos.insertarNuevoNodo(habitacion.getValor());
                }
                if (habitacion.getTipoDeHabitacion().equals("salida")){
                    nodos.insertarNuevoNodo(habitacion.getValor());
                    numeroSalida = habitacion.getValor();
                }
            }
        }
    }
    public void solucionarLaberinto (){
        nodos.recorrerOrdenSolucionLaberinto();
    }

    public Integer getNumeroSalida() {
        return numeroSalida;
    }
}
