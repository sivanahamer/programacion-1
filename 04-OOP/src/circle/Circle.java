package circle;

/***
 * Clase que guarda un Circulo
 * @author Sivana Hamer
 * @version 29-08-2022
 */
public class Circle {

    //Atributos
    private double radio;

    //Constructor
    /**
     * Constructor por defecto del circulo
     * @param radio El radio del circulo
     */
    public Circle(double radio){
        this.radio = radio;
    }

    //Metodos
    /***
     * Obtiene el area de un circulo
     * @return El area de un circulo
     */
    public double getArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Obtiene el perimetro de un circulo
     * @return El perimetro de un circulo
     */
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radio;
        return perimeter; //Devuelve el valor DENTRO de la variable
        //Nota: Perimeter deja de existir en la siguiente linea
    }

    /***
     * Imprime el radio y perimetro de un circulo
     */
    public void print(){
        System.out.println("Yo soy un circulo O");
        System.out.printf("Mi radio es: %.2f%n", this.radio);
        System.out.printf("Mi perimetro es: %.2f%n", this.getPerimeter());
    }
}
