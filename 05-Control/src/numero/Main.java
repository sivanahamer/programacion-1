package numero;

import pizza.*;

class Main{
    public static void main(String [] args){
        Interfaz interfaz = new Interfaz(); 

        Numero numero = new Numero(interfaz.pedirFlotante("Digite el numero:", "ERROR! No es un numero."));

        interfaz.imprimir(numero.getValor());
        interfaz.imprimir(numero.getSigno());
        interfaz.imprimir(numero.getPar());

    }
}