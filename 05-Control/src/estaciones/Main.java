package estaciones;

import pizza.*;

class Main{
    public static void main(String [] args){
        Interfaz interfaz = new Interfaz(); 

        String nombre = interfaz.pedirTexto("Digite el mes: ", "ERROR! Debe de dar un mes");
        Mes mes = new Mes(nombre);

        interfaz.imprimir(mes.obtenerEstacion());

    }
}