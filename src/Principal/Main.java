package Principal;

import Laberinto.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer cantidadFilas = scanner.nextInt();
        Integer cantidadColumnas = scanner.nextInt();
        Integer valor = cantidadFilas * cantidadColumnas;


        Laberinto laberinto = new Laberinto(cantidadFilas, cantidadColumnas);
        laberinto.coneccionIndiceNodosLaberinto();

        System.out.println(" ");
        System.out.println(" ");
        laberinto.vizualizarOrdenLaberinto();


    }

}
