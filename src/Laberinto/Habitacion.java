package Laberinto;

public class Habitacion {

    private Integer valor;
    private String tipoDeHabitacion;

    public Habitacion (){}


    public Integer getValor() {
        return valor;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion (String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
