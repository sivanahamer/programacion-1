package dice;

/**
 * La clase encarga de guardar información acerca de un dado.
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class Dice {
    //Atributos
    private int caras;

    //Constructor
    /***
     * Constructor por defecto del dado
     * @param caras La cantidad de caras de un dado.
     * Debe ser mayor que 0
     */
    public Dice(int caras){
        this.caras = caras;
    }

    //Metodos
    /**
     * Simula tirar un dado
     * @return La cara que saco
     */
    public int roll(){
        return (int)(Math.random() * this.caras) + 1;
    }

    /***
     * Imprime la informacion del dado con el tiro dado
     */
    public void imprimir(){
        System.out.printf("d%d: %d%n", this.caras, this.roll());
    }
}