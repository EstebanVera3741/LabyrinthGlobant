package Laberinto;

import java.util.*;

public class Fila {

    private List<Habitacion> fila = new ArrayList<Habitacion>();

    public Fila (Integer valor, Integer cantidadColumnas) {

        Integer valorUno = valor;
        for (int i = 0; i < cantidadColumnas; i ++){
            fila.add(new Habitacion(valor));
            valorUno -= 1;
            valorUno = valor;
        }
    }

    public List<Habitacion> getFila() {
        return fila;
    }

}
