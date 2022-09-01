package point;

/**
 * La clase para puntos;
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class Point {
    //Atributos
    private double x;
    private double y;

    //Constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Metodos
    /**
     * Método que imprime las coordenadas del punto.
     */
    public void imprimir(){

    }

    /**
     * Método que retorna la coordenada x del punto.
     * @return La coordenada en eje X
     */
    public double getX(){
        return this.x;
    }

    /**
     * Método que retorna la coordenada y del punto.
     * @return La coordenada en eje y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Recibe otro objeto Point. Calcula y retorna la distancia entre ambos puntos.
     * @param p2
     * @return
     */
    public double getDistance(Point p2){
        Point p1 = this;
        double y2_y1 = p2.getY() - p1.y;
        double x2_x1 = p2.getX() - p1.x;
        return Math.sqrt(Math.pow(y2_y1, 2)+ Math.pow(x2_x1, 2));
    }
}
