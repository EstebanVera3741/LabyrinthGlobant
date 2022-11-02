package autoLabyrinth;

public class LabyrinthWalls {

    private String wayLabyrinth = "             ";
    private String wallsLabyrinth = "_____________";
    private String entranceLabyrinth = "   Entrada   ";
    private String gameOverLabyrinth = "  Fin Juego  ";
    private String congratulations = " Felicidades ";

    public LabyrinthWalls(){}

    public Integer positionLabyrinth (Integer minimumNumber, Integer maximumNumber){
        Integer random = (int) Math.round((Math.random()*((minimumNumber-maximumNumber)+1)) + maximumNumber);
        return random;
    }





    public String getWallsLabyrinth(){
        return wallsLabyrinth;
    }
    public String getWayLabyrinth() {
        return wayLabyrinth;
    }
    public String getEntranceLabyrinth() {
        return entranceLabyrinth;
    }
    public String getGameOverLabyrinth() {
        return gameOverLabyrinth;
    }
    public String getCongratulations() {
        return congratulations;
    }
}
