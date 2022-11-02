import autoLabyrinth.Labyrinth;
import autoLabyrinth.LabyrinthWalls;

import java.util.Scanner;

public class Main {

    //_________________________________________________________________________________________________________________
    //          SE ESTABLECERA COMO LA CLASE PRINCIPAL PARA EJECUTAR EL CODIGO
    //           De la cual se realizaran las mejoras al codigo del laberinto
    //_________________________________________________________________________________________________________________

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Labyrinth labyrinth = new Labyrinth();
        LabyrinthWalls labyrinthWalls = new LabyrinthWalls();


        Integer high = scanner.nextInt();
        Integer wide = scanner.nextInt();


        labyrinth.createLabyrinthWalls(high, wide);
        Integer rows = labyrinthWalls.positionLabyrinth(0, high);
        Integer column = labyrinthWalls.positionLabyrinth(0, wide);


        if (rows == high || column == wide){
            rows = rows - 1;
            column = wide - 1;
        }
        labyrinth.entryExitLabyrinth(rows, column, wide);
        labyrinth.constructionLabyrinthRoad(rows, column, high, wide);




        labyrinth.displayLabyrinth();



    }
}