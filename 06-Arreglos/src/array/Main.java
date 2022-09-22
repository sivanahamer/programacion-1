package src.array;

class Main{
    public static void main(String [] args){
        // int[] arreglo = {3, 6, 10};
        // Array array = new Array(arreglo);

        Array array = new Array();
        array.cargar();
        int maximo = array.obtenerMaximo();
        array.imprimir();
        System.out.println(maximo);
    }
}
