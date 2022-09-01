package point;

/**
 * La clase para representar rectangulos por medio de puntos.
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class RectanglePoint {
    //Atributos
    private Point si; //Esquina (s)uperior (i)zquierda
    private Point id; //Esquina (i)nferior (d)erecha

    //Constructor
    public RectanglePoint(Point si, Point id){
        this.si = si;
        this.id = id;
    }
    
    //Metodos

    /**
     * Método que mide la altura del rectángulo.
     * @return La altura
     */
    public double getHeight(){
        Point ii = new Point(this.si.getX(), this.id.getY()); //Punto (i)nferior (i)zquierda
        return ii.getDistance(this.si);
    }

    /**
     * Método que obtiene el ancho del rectángulo.
     * @return El ancho
     */
    public double getWidth(){
        Point sd = new Point(this.id.getX(), this.si.getY()); //Punto (s)uperior (d)erecha
        return this.si.getDistance(sd);
    }

    /**
     * Método que imprime la información del rectángulo.
     */
    public void print(){
        System.out.printf("Base = %.2f%nAltura = %.2f%n", this.getWidth(), this.getHeight());
    }
}
