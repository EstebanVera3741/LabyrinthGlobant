package ConeccionLaberinto;

public class Nodos {

    NodoPadre inicio;

    public Nodos (){
        inicio = null;
    }

    public void insertarNuevoNodo (Integer valor){
        if (inicio == null){
            inicio = new NodoPadre(valor);
        }
        else {
            inicio.insertarNuevoNodo(valor);
        }
    }


    public void recorrerOrdenSolucionLaberinto (){
        recorrerOrdenLaberinto(inicio);
    }
    public void recorrerOrdenLaberinto (NodoPadre nodo){
        if(nodo == null){
            return;
        }
        else {
            recorrerOrdenLaberinto(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor() + " ");
            recorrerOrdenLaberinto(nodo.getNodoDerecho());
        }
    }


}
