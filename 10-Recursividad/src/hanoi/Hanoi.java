package hanoi;

public class Hanoi {
    /**
     * Corre la solucion de torres de Hanoi
     * @param disco El numero del disco actual que se esta resolviendo
     * @param origen La varilla de origen
     * @param auxiliar La varilla auxiliar
     * @param destino La varilla de destino
     * @param moviemientoActual El moviemiento actual
     */
    public int correr(int disco, String origen, String auxiliar, String destino, int moviemientoActual){
        //Caso base
        if (disco == 1){
            moviemientoActual +=1;
            System.out.printf("%d. Mover disco %d: %s -> %s%n", moviemientoActual, disco, origen, destino);
        }else{
            moviemientoActual = correr(disco - 1, origen, destino, auxiliar, moviemientoActual);
            moviemientoActual +=1;
            System.out.printf("%d. Mover disco %d: %s -> %s%n", moviemientoActual, disco, origen, destino);
            moviemientoActual = correr(disco - 1, auxiliar, origen, destino, moviemientoActual);
        }
        return moviemientoActual;
    } 
}
