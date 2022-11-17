package Laberinto;

import java.util.*;

public class Fila {



    private List<Habitacion> fila = new ArrayList<Habitacion>();

    public Fila (Integer cantidadColumnas) {

        for (int i = 0; i < cantidadColumnas; i ++){
            fila.add(new Habitacion());
        }
    }

    public List<Habitacion> getFila() {
        return fila;
    }

}
