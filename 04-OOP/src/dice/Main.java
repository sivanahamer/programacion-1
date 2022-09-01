package dice;

/**
 * La clase main de un dado.
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class Main {
    public static void main(String [] args){
        Dice d6 = new Dice(6);
        Dice d20 = new Dice(20);

        d6.imprimir();
        d20.imprimir();
    }
}
