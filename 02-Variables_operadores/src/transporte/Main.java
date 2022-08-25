package transporte;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){ 
        Scanner in = new Scanner(System.in);

        // Pedimos la cantidad de ruedas del vehiculo
        System.out.print("Ingrese las ruedas del medio de transporte: ");
        int cantidadRuedas = in.nextInt();

        // Determinar si la cantidad dada es igual a la cantidad del vehiculo
        // - Si la cantidad es 0, es verdadero que es carrito chocon
        System.out.println("Es carrito chocon: " + (cantidadRuedas == 0));
        // - Si la cantidad es 1, es verdadero que es  monociclo
        System.out.printf("Es monociclo: %b%n", (cantidadRuedas == 1));
        // - Si la cantidad es 2, es verdadero que es  bicicleta
        System.out.printf("Es bicicleta: %b%n", (cantidadRuedas == 2));
        // - Si la cantidad es 3, es verdadero que es  triciclo
        System.out.printf("Es triciclo: %b%n", (cantidadRuedas == 3));
        // - Si la cantidad es 4, es verdadero que es  automovil
        boolean esAutomovil = cantidadRuedas == 4;
        System.out.printf("Es automovil: %b%n", esAutomovil);
        // - Si la cantidad es 5+, es verdadero que es camion
        System.out.printf("Es camion: %b", (cantidadRuedas >= 5));

        in.close();
    }
}
