/**import java.util.Scanner;
import java.util.*;

public class Principal {

    private static final String paredes = "_____________";
    private static String entrada = "   Entrada   ";
    private static String finJuego = "  Fin Juego  ";
    private static String felicidades = " Felicidades ";
    private static String ubicacion = "  Estoy aca  ";
    private static String camino = "             ";

    private static Integer filas = 0;

    public static Scanner lecturaDatos (){
        return new Scanner(System.in);
    }
    public static int crearAnchoLaberinto (){
        System.out.println("Ingrese el ancho del laberinto");
        int anchoLaberinto = lecturaDatos().nextInt();
        return anchoLaberinto;
    }
    public static int crearAltoLaberinto (){
        System.out.println("Ingrese el alto del laberinto");
        int altoLaberinto = lecturaDatos().nextInt();
        return altoLaberinto;
    }
    public static List<List<String>> crearParedesLaberintos (int columnas, int filas){
        List<List<String>> laberintoUno = new ArrayList<List<String>>();
        for(int i = 1; i <= columnas; i++){
            laberintoUno.add(new ArrayList<String>());
        }
        for (int alto = 0; alto < columnas; alto ++) {
            for (int ancho = 0; ancho < filas; ancho ++){
                laberintoUno.get(alto).add(paredes);
            }
        }
        return laberintoUno;
    }
    public static int posicionLaberinto(int minimo, int numeroRecibido){
        int numeroRandom = (int) Math.round((Math.random()*((minimo-numeroRecibido)+1)) + numeroRecibido);
        return numeroRandom;
    }

    public static void visualizarLaberinto (List<List<String>> laberinto){
        for (int filas = 0; filas < laberinto.size(); filas ++) {
            System.out.println(laberinto.get(filas));
        }
    }

    public static void establecerEntradaSalida (List<List<String>> laberinto, int ejeFinal,
                                                 int ejeY, int ejeX){

        laberinto.get(ejeY).set(0, entrada);
        laberinto.get(ejeFinal).set(ejeX, finJuego);
        System.out.println("Laberinto para Solucionar");
        visualizarLaberinto(laberinto);
    }
    public static int movimientoArriba (List<List<String>> laberinto, int columnas, int filas,
                                         int ejeY){


        if(laberinto.get(columnas -1).get(filas).equals(paredes)){
            System.out.println("Hay una pared");
            return columnas;
        }
        else {
            laberinto.get(columnas - 1).set(filas, ubicacion);
        }
        laberinto.get(columnas).set(filas, camino);
        condicionResolverLaberintoDos (laberinto, columnas, filas);
        laberinto.get(ejeY).set(0, entrada);
        columnas -= 1;
        return columnas;
    }
    public static int movimientoDerecha (List<List<String>> laberinto, int columnas, int filas,
                                         int ejeY){

        if(laberinto.get(columnas).get(filas +1).equals(paredes)){
            System.out.println("Hay una pared");
            return filas;
        }
        else {
            laberinto.get(columnas).set(filas + 1, ubicacion);
        }
        laberinto.get(columnas).set(filas, camino);
        laberinto.get(ejeY).set(0, entrada);
        filas += 1;
        return filas;
    }
    public  static int movimientoAbajo (List<List<String>> laberinto, int columnas, int filas,
                                        int ejeY){

        if(laberinto.get(columnas + 1).get(filas).equals(paredes)){
            System.out.println("Hay una pared");
            return columnas;
        }
        else {
            laberinto.get(columnas + 1).set(filas, ubicacion);
        }
        laberinto.get(columnas).set(filas, camino);
        laberinto.get(ejeY).set(0, entrada);
        columnas += 1;
        return columnas;
    }
    public static int movimientoIzquierda (List<List<String>> laberinto, int columnas, int filas,
                                            int ejeY){
        if(laberinto.get(columnas).get(filas -1).equals(paredes)){
            System.out.println("Hay una pared");
            return filas;
        }
        else {
            laberinto.get(columnas).set(filas - 1, ubicacion);
        }
        laberinto.get(columnas).set(filas, paredes);
        laberinto.get(ejeY).set(0, entrada);
        filas -= 1;
        return filas;
    }
    public static boolean condicionResolverLaberinto (List<List<String>> laberinto, int ejeFinal,
                                                      int columnas, int filas, int ejeX) {

        boolean iniciar = false;

        if (laberinto.get(columnas).get(filas) == laberinto.get(ejeFinal).get(ejeX)) {
            laberinto.get(ejeFinal).set(ejeX, felicidades);
            visualizarLaberinto(laberinto);
            iniciar = true;
            System.out.println("Haz ganado el juego");
        }
        return iniciar;

    }

    public static void condicionResolverLaberintoDos (List<List<String>> laberinto, int columnas, int filas){
        if (laberinto.get(columnas).get(filas).equals(paredes)){
            System.out.println("Esta es una Pared");
        }
    }
    public static boolean resolverLaberinto (List<List<String>> laberinto,int ejeFinal, int ejeY, int ejeX,
                                          boolean iniciar){

        int columnas = ejeY;

        while (iniciar != true){
            String movimiento = lecturaDatos().nextLine();

            switch (movimiento){
                case "w":
                    columnas = movimientoArriba(laberinto, columnas, filas, ejeY);
                    visualizarLaberinto(laberinto);
                    iniciar = condicionResolverLaberinto(laberinto, ejeFinal, columnas, filas, ejeX);
                    break;
                case "d":
                    filas = movimientoDerecha(laberinto, columnas, filas, ejeY);
                    visualizarLaberinto(laberinto);
                    iniciar = condicionResolverLaberinto(laberinto, ejeFinal, columnas, filas, ejeX);
                    break;
                case "s" :
                    columnas = movimientoAbajo(laberinto, columnas, filas, ejeY);
                    visualizarLaberinto(laberinto);
                    iniciar = condicionResolverLaberinto(laberinto, ejeFinal, columnas, filas, ejeX);
                    break;
                case "a" :
                    filas = movimientoIzquierda(laberinto, columnas, filas, ejeY);
                    visualizarLaberinto(laberinto);
                    iniciar = condicionResolverLaberinto(laberinto, ejeFinal, columnas, filas, ejeX);
                    break;
                default:
                    System.out.println("Recuerda los comandos son - a-w-s-d-");
                    break;
            }

        }
        return iniciar;
    }


    public static void contruccionCaminoLaberinto (List<List<String>> laberinto, int alto, int ancho){


        int unionUno = (alto * ancho) /2 + 8;

        for (int intentos = 0; intentos <= unionUno; intentos ++){
            int ejeY = posicionLaberinto(0, alto -1);
            int ejeX = posicionLaberinto(-1, ancho -1);
            laberinto.get(ejeY).set(ejeX, camino);
        }

    }






    public static void main(String[] args) {

        int alto = crearAltoLaberinto();
        int ancho = crearAnchoLaberinto();
        if (alto < 6 || ancho < 6){
            System.out.println("El tamaño del laberinto no es el adecuado " +
                    " debe tener como minimo un tamaño de 6x6 ");
            alto = crearAltoLaberinto();
            ancho = crearAnchoLaberinto();
            if (alto < 4 || ancho <4){
                System.out.println("No se puede crear el laberinto " + "\n"
                + "Laberinto Automatico ");
                alto = 6;
                ancho = 6;
            }
        }
        System.out.println("el laberinto es " + alto + " x " + ancho);
        List<List<String>> laberinto = crearParedesLaberintos(alto, ancho);
        contruccionCaminoLaberinto(laberinto, alto, ancho);


        int ejeY = posicionLaberinto(1, alto - 1);
        int ejeX = posicionLaberinto(1, ancho - 1);
        int ejeFinal = posicionLaberinto(0, alto - 1);



        establecerEntradaSalida(laberinto, ejeFinal, ejeY, ejeX);

        System.out.println("Iniciando el juego");
        boolean iniciar = false;
        resolverLaberinto(laberinto, ejeFinal, ejeY, ejeX, iniciar);

        System.out.println(" juego");








        System.out.println("Hola ");

    }
}**/
