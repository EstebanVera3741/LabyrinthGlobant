package Principal;

import Laberinto.*;
import java.util.Scanner;

public class Main {
    public static void lecturaDatos (){
        Scanner scanner = new Scanner(System.in);
        try {
            Integer cantidadFilas = scanner.nextInt();
            Integer cantidadColumnas = scanner.nextInt();
            Integer valor = cantidadFilas * cantidadColumnas;
            Laberinto laberinto = new Laberinto(cantidadFilas, cantidadColumnas);
            laberinto.posicionesLaberinto(valor);
        }catch (Exception e){
            System.out.println("Utiliza numeros");
            lecturaDatos();
        }
    }
    public static void main(String[] args) {
        lecturaDatos();

    }

}
