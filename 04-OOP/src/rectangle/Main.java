package rectangle;

public class Main{
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(2, 5);
        double area = rectangle.getArea();
        rectangle.imprimir();
        System.out.printf("Area: %.2f%n", area);
    }
}