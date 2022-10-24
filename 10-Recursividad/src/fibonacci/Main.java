package fibonacci;

public class Main{
    public static void main(String [] args){
        Fibonacci fibonacci = new Fibonacci();


        // System.out.println(fibonacci.calcularBottomUp(5));
        // System.out.println(fibonacci.calcularBottomUp(100));// No termina de correr

        System.out.println(fibonacci.calcularTopDown(100));

        System.out.println(fibonacci.calcularDinamica(100));

    }
}