package doubly;

/**
 * Main para una lista doblemente enlazada
 * @author Sivana Hamer
 * @version 11-07-2022
 */
public class Main {
    public static void main(String [] args){
        //Crear algunos nodos
        Node n1 = new Node(3);
        Node n2 = new Node(2, n1);
        System.out.println(n2.getData());


        //Crea una lista
        List list = new List();

        //Concatenamos valor a una lista
        System.out.println("Concatenar a una lista...");
        list.concatenar(1);
        list.concatenar(2);
        list.concatenar(3);

        //Imprimimos una lista
        list.imprimir();
        list.imprimirReves();

        //Insertar en la lista
        System.out.println("Insertar un 10 en la posicion 2...");
        list.insertar(10, 4);
        list.imprimir();
        list.imprimirReves();

        //Remover de la lista
        System.out.println("Remover el 2 de la lista...");
        list.remover(3);
        list.imprimir();
        list.imprimirReves();
    }
}