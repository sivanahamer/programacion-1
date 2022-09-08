package pizza;

import java.util.ArrayList;

/**
 * Funciona como la clase controlador
 */
public class Franquicia {
    private Interfaz interfaz;
    private Pizzeria pizzeria;

    public Franquicia(){
        this.interfaz = new Interfaz();
        this.pizzeria = new Pizzeria("FNAF LOCATION 1");
    }

    public void run(){

        //AQUI METEMOS OPCIONES DE COSAS
        boolean seguir = true;
        while (seguir){
            this.interfaz.imprimir("Welcome to Fazz Bears Pizzeria!");
            this.interfaz.imprimir("1) Agregar mesa\n2) Agregar topping\n3) Agregar orden\n4) Salir");
            int opcion = this.interfaz.pedirEntero("Digite la opcion: ", "Error! No es un entero");
            switch(opcion){
                case 1: this.agregarMesa(); break;
                case 2: this.agregarTopping(); break;
                case 3: this.agregarOrden(); break;
                case 4: seguir=false; break;
                default: this.interfaz.imprimir("Esa opcion no es valida");
            }
        }
    }

    public void agregarMesa(){
        int cantidadSillas = this.interfaz.pedirEntero("Digite la cantidad de sillas: ", "Error! No es una cantidad de sillas validas");
        this.pizzeria.agregarMesa(cantidadSillas);
    }

    public void agregarTopping(){
        String texto = this.interfaz.pedirTexto("Digite el nombre del topping: ", "Error! No es un topping valido");
        this.pizzeria.agregarTopping(texto);
    }

    public void agregarOrden(){

    }
}
