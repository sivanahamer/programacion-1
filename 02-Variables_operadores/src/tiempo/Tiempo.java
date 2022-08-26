package tiempo;

public class Tiempo {
    
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    /**
     * Obtiene del tiempo la cantidad en segundos
     * @return Los segundos totales
     */
    public int obtenerSegundos(){
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        return totalSegundos;
    }
}