package circle;

/***
 * Main de la clase Circulo
 * Crea circulos dummy
 * @author Sivana Hamer
 * @version 29-08-2022
 */
public class Main {
    public static void main(String [] args){
        //Objeto de circulos
        //Nota: Estos nombres son malas practicas
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(4.0);

        c1.print();
        c2.print();

        double areaC1 = c1.getArea();
        System.out.println(areaC1);
    }
}
