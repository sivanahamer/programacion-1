package echo;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Obtiene todo lo siguiente hasta un enter
        String texto = sc.nextLine();
        //   //Obtiene el siguiente booleano. Se tiene que dar enter.
        //   boolean bool = sc.nextBoolean();
        //   //Obtiene el siguiente entero
        //   int entero = sc.nextInt();
        //   //Obtiene el siguiente flotante
        //   float flotante = sc.nextFloat();
        System.out.println(texto);
        sc.close();

    }  
}
