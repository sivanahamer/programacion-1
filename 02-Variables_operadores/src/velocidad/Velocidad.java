public class Velocidad {
    private double distancia;
    private double tiempo;

    public Velocidad(double distancia, double tiempo){
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public double calcular(){
        // calcular la velocidad
        //velocidad es igual a distancia entre tiempo
        return distancia / tiempo;
    }
}
