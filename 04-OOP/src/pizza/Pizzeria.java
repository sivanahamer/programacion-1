package pizza;

import java.util.ArrayList;

public class Pizzeria {
    private String name;
    private ArrayList<Mesa> mesas;
    private ArrayList<Topping> toppings;
    private ArrayList<Orden> ordenes;

    public Pizzeria(String name){
        this.name = name;
        this.mesas = new ArrayList<Mesa>();
        this.toppings = new ArrayList<Topping>();
        this.ordenes = new ArrayList<Orden>();
    }

    public void agregarMesa(int cantidadSillas){
        mesas.add(new Mesa(cantidadSillas));
    }

    public void agregarTopping(String nombre){
        toppings.add(new Topping(nombre));
    }

    public String describir(){
        String datos = "";
        datos += "-----Mesas-----\n";
        //Va por todas las mesitas
        for (Mesa mesa: this.mesas){
            datos += mesa.describir() + "\n";
        }
        datos += "\n-----Toppings-----\n";
        for (Topping topping: this.toppings){
            datos += topping.describir() + "\n";
        }

        return datos;
    }

    public void tomarOrden(){

    }
}
