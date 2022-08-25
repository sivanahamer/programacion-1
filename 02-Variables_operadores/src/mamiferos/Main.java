package mamiferos;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){ 

        // Pedir el nombre del animal
        Scanner in = new Scanner(System.in);

        System.out.print("El nombre del animal es: ");
        String animal = in.nextLine();

        // Preguntamos si o no de las caracteristicas
        System.out.print("Tiene sangre fria: ");
        boolean tieneSangreFria = in.nextBoolean();

        System.out.print("Tiene glandulas mamarias: ");
        boolean tieneGlandulasMamarias = in.nextBoolean();

        System.out.print("Tiene pelo: ");
        boolean tienePelo = in.nextBoolean();

        System.out.print("Tiene vertebra: ");
        boolean tieneVertebra = in.nextBoolean();

        // Determinamos si es un mamifero o no (algo abstracto)
        boolean esMamifero =  !tieneSangreFria && tienePelo && tieneVertebra && tieneGlandulasMamarias;

        System.out.printf("El animal %s es mamifero: %b", animal, esMamifero);

        in.close();
    }
}
