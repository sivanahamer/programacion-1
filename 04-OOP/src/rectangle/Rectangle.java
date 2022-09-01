package rectangle;

/**
 * La clase que representa un rectangulo
 * @author Sivana Hamer
 * @version 01-09-2022
 */
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
    /**
     * Obtiene el area del rectuangulo
     * @return El area
     */
    public double getArea(){
        return this.base * this.height;
    }

    /**
     * Obtiene el perimetro
     * @return El perimetro
     */
    public double getPerimeter(){
        return this.base * 2 + this.height * 2;
    }

    /**
     * Imprime la informacion de un rectangulo
     */
    public void imprimir(){
        System.out.printf("Soy un rectangulo con base de %.2f y altura %.2f%n", this.base, this.height);
    }
}
