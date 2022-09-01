package rectangle;

/**
 * La clase main de un rectangulo.
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class Main{
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(2, 5);
        double area = rectangle.getArea();
        rectangle.imprimir();
        System.out.printf("Area: %.2f%n", area);
    }
}