package Laberinto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer filas = scanner.nextInt();
        Integer columnas = scanner.nextInt();
        Integer valor = filas * columnas;

        Columna columna = new Columna(valor, filas, columnas);

        columna.visualizar();
        columna.visualizarParedes();




    }
}
