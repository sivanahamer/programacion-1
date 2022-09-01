package rectangle;

public class Rectangle {
    //Atributos
    private double base;
    private double height;
    
    //Constructor
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    //Metodos
    public double getArea(){
        return this.base * this.height;
    }

    public double getPerimeter(){
        return this.base * 2 + this.height * 2;
    }

    public void imprimir(){
        System.out.printf("Soy un rectangulo con base de %.2f y altura %.2f%n", this.base, this.height);
    }
}
