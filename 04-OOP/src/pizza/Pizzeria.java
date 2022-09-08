package pizza;

import java.util.ArrayList;

public class Pizzeria {
    private String name;
    private Mesa [] mesa;
    private ArrayList<Topping> toppings;
    private Orden [] ordenes;

    public Pizzeria(String name){
        this.name = name;
    }

    public Mesa ocupar(int cantidadPersonas){
        return null;
    }

    public void desocupar(Mesa mesa){

    }

    public Orden tomarOrden(){
        return null;
    }
}
