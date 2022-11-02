package autoLabyrinth;

import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    private List<List<String>> labyrinth = new ArrayList<List<String>>();
    private LabyrinthWalls labyrinthWalls = new LabyrinthWalls();

    public Labyrinth(){}


    public List<List<String>> createLabyrinthWalls (Integer highLabyrinth, Integer wideLabyrinth){
        for (int i = 0; i < highLabyrinth; i ++){
            labyrinth.add(new ArrayList<String>());
        }
        for (int i = 0; i < highLabyrinth; i ++){
            for (int j = 0; j < wideLabyrinth; j++){
                labyrinth.get(i).add(labyrinthWalls.getWallsLabyrinth());
            }
        }
        return labyrinth;
    }

    public void constructionLabyrinthRoad (Integer rows, Integer column, Integer high, Integer wide){
        if (rows != 0 && rows == high - 2){
            labyrinth.get(rows + 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows - 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows).set(1, labyrinthWalls.getWayLabyrinth());
        }
        else if (rows != 0 || rows == high - 2){
            labyrinth.get(rows + 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows - 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows).set(1, labyrinthWalls.getWayLabyrinth());
        }
        else if (rows == high -1){
            labyrinth.get(rows - 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows).set(1, labyrinthWalls.getWayLabyrinth());
        }
        else if (rows == 0){
            labyrinth.get(rows + 1).set(0, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(rows).set(1, labyrinthWalls.getWayLabyrinth());
        }
        if (column != wide && column == wide - 2){
            labyrinth.get(column -1).set(wide - 1, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(column +1).set(wide - 1, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(column).set(wide - 2, labyrinthWalls.getWayLabyrinth());
        }
        else if (column != wide || column == wide - 2){
            labyrinth.get(column -1).set(wide - 1, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(column +1).set(wide - 1, labyrinthWalls.getWayLabyrinth());
            labyrinth.get(column).set(wide - 2, labyrinthWalls.getWayLabyrinth());
        }

    }

    public void entryExitLabyrinth (Integer rows, Integer column, Integer wide){
        labyrinth.get(rows).set(0, labyrinthWalls.getEntranceLabyrinth());
        labyrinth.get(column).set(wide - 1, labyrinthWalls.getGameOverLabyrinth());
    }






    public void displayLabyrinth (){
        for (List<String> labyrinthOne : labyrinth){
            System.out.println(labyrinthOne);
        }
    }




}
