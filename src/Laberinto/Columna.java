package Laberinto;

import java.util.*;

public class Columna {

    private List<Fila> columna = new ArrayList<Fila>();

    public Columna (Integer cantidadFila, Integer cantidadColumna) {

        for (int i = 0; i < cantidadFila; i ++){
            columna.add(new Fila(cantidadColumna));
        }
    }

    public List<Fila> getColumna() {
        return columna;
    }

    public void visualizarValoresLaberinto (){
        for (Fila fila: columna){
            System.out.println(" ");
            for (Habitacion habitacion : fila.getFila()){
                System.out.print(habitacion.getTipoDeHabitacion() + " ");
            }
        }
    }

    public void crearValoresHabitaciones (){
        Scanner scanner = new Scanner(System.in);
        Integer cont = 0;
        for (Fila fila : columna){
            for (Habitacion habitacion : fila.getFila()){
                cont ++;
                cont = cont;
                habitacion.setValor(cont);
                habitacion.setTipoDeHabitacion(scanner.nextLine());
            }
        }
    }



}