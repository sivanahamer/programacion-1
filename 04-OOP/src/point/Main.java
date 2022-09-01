package point;

/**
 * La clase main de un Point y RectanglePoint.
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class Main {
    public static void main(String [] args){
        //Creamos puntos
        Point p1 = new Point(4, 12);
        Point p2 = new Point(6, 8);

        double distancia = p1.getDistance(p2);
        p1.imprimir();
        p2.imprimir();
        System.out.printf("La distancia entre los puntos es %.2f%n", distancia);

        //Crear un rectangulo basado en puntos
        RectanglePoint rectanglePoint = new RectanglePoint(p1, p2);
        rectanglePoint.print();
    }
}
