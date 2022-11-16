package Laberinto;

import java.util.ArrayList;
import java.util.List;

public class Columna {

    private List<Fila> columna = new ArrayList<Fila>();

    public Columna (Integer valor, Integer cantidadFila, Integer cantidadColumna) {

        Integer valorUno = valor ;
        for (int i = 0; i < cantidadFila; i ++){
            columna.add(new Fila(valor, cantidadColumna));
            valorUno -= 1;
            valor = valorUno;
        }
    }

    public void visualizar (){
        for (Fila fila: columna){
            System.out.println(" ");
            for (Habitacion habitacion : fila.getFila()){
                System.out.print(habitacion.getValor() + " ");
            }
        }
    }

    public void visualizarParedes (){
        for (Fila fila: columna){
            System.out.println(" ");
            for (Habitacion habitacion : fila.getFila()){
                System.out.print(habitacion.getPared() + " ");
            }
        }
    }

}
