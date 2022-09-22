package src.array;

import pizza.*;
import java.lang.Math;

/**
 * Esto NO es MVC
 */
public class Array {
    //Atributos
    int [] valores;
    
    //Constructor
    public Array(){

    }

    public Array(int [] valores){
        this.valores = valores;
    }

    //Metodos

    /***
     * Cargamos un arreglo de una longitud variable
     */
    public void cargar(){
        Interfaz interfaz = new Interfaz();
        //Obtuvimos la longitud (length)
        int longitud = interfaz.pedirEntero("Digite la longitud del arreglo: ", "ERROR! Debe ser un entero");

        //Creamos en el arreglo la longitud variable
        this.valores = new int [longitud];

        //Pedir los numeros
        for(int indice = 0; indice < this.valores.length; indice++){
            String texto = String.format("Digite el numero %d: ",indice + 1);
            this.valores[indice] = interfaz.pedirEntero(texto, "ERROR! El numero digitado es incorrecto");
        }


    }

    public int obtenerMaximo(){
        int maximo = this.valores[0];
        for (int indice = 1; indice < this.valores.length; indice++){
            if (this.valores[indice] > maximo){
                maximo = this.valores[indice];
            }
        }
        return maximo;
    }

    /***
     * Imprimimos los valores del arreglo
     */
    public void imprimir(){
        System.out.print("{");
        //Iteramos sobre todos los indices
        for (int indice = 0; indice < this.valores.length; indice++){
        // for (int elemento : this.valores){
            //Obtenemos el valor
            int elemento = this.valores[indice];
            //Imprimimos distinto el primer caso
            if (indice == 0){
                System.out.printf("%d", elemento);
            }else{
                System.out.printf(", %d", elemento);
            }
        }
        System.out.println("}");
    }

}
