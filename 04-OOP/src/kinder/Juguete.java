package kinder;

/**
 * Representa el juguete del kinder sorpresa
 * @author Sivana Hamer
 */
public class Juguete {
    private String color; //Guarda el color del jueguete
    private String nombre; //Guarda el nombre del jueguete

    /**
     * Constructor del jueguete del kinder
     * @param color El color del juguete
     * @param nombre El nombre del jueguete
     */
    public Juguete(String color, String nombre){
        this.color = color;
        this.nombre = nombre;
    }

    /**
     * Obtiene el color del juguete
     * @return El color
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Obtiene el nombre del juguete
     * @return El nombre
     */
    public String getNombre(){
        return this.nombre;
    }
}