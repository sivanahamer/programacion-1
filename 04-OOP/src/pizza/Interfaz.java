package pizza;

import java.util.Scanner;

/**
 * Esto es el view
 */
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
                String resultado = this.pedirTexto(mensaje, mensajeError);
                int entero = Integer.parseInt(resultado);
                return entero;
            }catch (NumberFormatException e){
                this.imprimir(mensajeError);
            }
        }
    }

    /***
     * Pide un flotante
     * @param mensaje El mensaje a imprimir al pedir un flotante
     * @param mensajeError El mensaje cuando sucede un error
     * @return El flontante que se dio
     */
    public double pedirFlotante(String mensaje, String mensajeError){
        while (true){
            try{
                String resultado = this.pedirTexto(mensaje, mensajeError);
                double flotante = Double.parseDouble(resultado);
                return flotante;
            }catch (NumberFormatException e){
                this.imprimir(mensajeError);
            }
        }
    }

    /**
     * Pide un texto 
     * @param mensaje El mensaje para pedir el texto
     * @param mensajeError El mensaje de error
     * @return El texto que se obtuvo
     */
    public String pedirTexto(String mensaje, String mensajeError){
        while (true){
            try{
                this.imprimirNoNewLine(mensaje);
                String texto = this.scanner.nextLine();
                return texto;
            //TODO: Check exception
            }catch (NumberFormatException e){
                this.imprimir(mensajeError);
            }
        }
    }

    /***
     * Imprime un mensaje
     * @param mensaje El mensaje a imprimir
     */
    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    /***
     * Imprime un mensaje sin new line
     * @param mensaje El mensaje a imprimir
     */
    public void imprimirNoNewLine(String mensaje){
        System.out.print(mensaje);
    }
}
