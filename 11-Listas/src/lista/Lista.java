package lista;

/**
 * Una lista simplemente enlazada
 * @author Sivana Hamer
 * @version 10-31-2022
 */
public class Lista {
    //Atributo
    // private int cantidadNodos;
    private Nodo head;

    //Constructor
    /**
     * Crea una lista vacia
     */
    public Lista(){
        this.head = null;
    }

    /**
     * Constructor de una lista con un nodo
     * @param dato El dato de la cabeza de la lista
     */
    public Lista(int dato){
        this.head = new Nodo(dato);
    }

    /**
     * Constructor de una lista con un nodo
     * @param head La cabeza de la lista
     */
    public Lista(Nodo head){
        this.head = head;
    }

    /**
     * Obtiene la cabeza de la lista
     * @return La cabeza
     */
    public Nodo getHead(){
        return this.head;
    }

    /**
     * Imprime toda la lista
     */
    public void imprimir(){
        Nodo current = this.head;

        while (current != null){
            current.imprimir();
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * Concatena un nuevo dato al final de la lista
     * @param dato El dato
     */
    public void concatenar(int dato){
        Nodo current = this.head;

        //Itera hasta el final
        //Caso de que es una lista vacia
        if (current == null){
            this.head = new Nodo(dato);
        //Caso de que no es una lista vacia
        //Es decir hay nodos
        }else{
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new Nodo(dato));
        }
    }

    public void insertar(int indice, int dato){
        //TODO: Edge cases de insertar
        Nodo current = this.head;

        int contador = 0;
        while (contador <  indice){
            current = current.getNext();
            contador++;
        }
        Nodo siguienteSiguiente = current.getNext();
        Nodo siguiente = new Nodo(dato, siguienteSiguiente);
        current.setNext(siguiente);

        // current.setNext(new Nodo(dato, current.getNext()));
    }

}
