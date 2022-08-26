package tiempo;

import java.util.Scanner;

/**
 * Manejar tiempos
 * @author Sivana Hamer :D
 */
public class TiempoMain {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        //Obtengo los datos del segundo
        System.out.print("Horas registradas: ");
        int horas = scanner.nextInt();
        System.out.print("Minutos registrados: ");
        int minutos = scanner.nextInt();
        System.out.print("Segundos registrados: ");
        int segundos = scanner.nextInt();

        //Calcular, dado los datos, cuantos segundos son
        // int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        Tiempo tiempo = new Tiempo(horas, minutos, segundos);
        int totalSegundos = tiempo.obtenerSegundos();

        //Imprimir la cantidad de segundos
        System.out.printf("El paquete duro %d segundos en envío.%n", totalSegundos);
    }
}
