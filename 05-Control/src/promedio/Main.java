package promedio;

import pizza.*;

class Main{
    public static void main(String [] args){
        Interfaz interfaz = new Interfaz(); 

        int veces = interfaz.pedirEntero("Digite la cantidad de numeros: ", "ERROR! Debe de dar un numero entero");
        double suma = 0;
        for (int contador = 0; contador < veces; contador++){
            double numero = interfaz.pedirFlotante("Digite el numero: ", "ERROR! No es un numero");
            suma += numero;
        }
        double promedio = suma/(double)veces;
        interfaz.imprimir("El promedio es: " + promedio);

    }
}