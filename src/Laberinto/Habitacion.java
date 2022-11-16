package Laberinto;

public class Habitacion {

    private Integer valor;
    private String pared = "Pared";

    public Habitacion (Integer valor){
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public String getPared() {
        return pared;
    }
}
