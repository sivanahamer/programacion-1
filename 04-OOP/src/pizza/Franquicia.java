package pizza;

import java.util.ArrayList;

/**
 * Funciona como la clase controlador
 */
public class Franquicia {
    private Interfaz interfaz;
    private ArrayList<Pizzeria> pizzerias;

    public Franquicia(){
        this.interfaz = new Interfaz();
    }

    public void run(){
        //AQUI METEMOS OPCIONES DE COSAS
        int cantidadPizzas = this.interfaz.pedirEntero("Deme la cantidad de pizzas: ", "Error! No es entero");
    }
}
