package pitagoras;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){ 

        Scanner in = new Scanner(System.in);
        // pedir los lados (a y b)
        System.out.print("Longitud del lado a: ");
        double a = in.nextDouble();
        System.out.print("Longitud del lado b: ");
        double b = in.nextDouble();

        // aplicar la formula de calcular la hipotenusa
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // presentar el resultado
        System.out.printf("La longitud de la hipotenusa es: %.1f", c);

        in.close();
    }
}
