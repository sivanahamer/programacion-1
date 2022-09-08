package pizza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {

    private Scanner scanner;

    public Interfaz(){
        this.scanner = new Scanner(System.in);
    }

    /***
     * Pide un entero
     * @param mensaje El mensaje a imprimir al pedir un entero
     * @param mensajeError El mensaje cuando sucede un error
     * @return El entero que se dio
     */
    public int pedirEntero(String mensaje, String mensajeError){
        while (true){
            try{
                System.out.print(mensaje);
                int entero = Integer.parseInt(this.scanner.nextLine());
                return entero;
            }catch (NumberFormatException e){
                System.out.println(mensajeError);
            }
        }
    }
}
