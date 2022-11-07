package doubly;

/**
 * Nodo de una lista doblement enlazada
 * @author Sivana Hamer
 * @version 11-07-2022
 */
public class Node {
    //Atributos
    private int data;//Dato
    private Node next; //Refencia al siguiente
    private Node previous; //Referencia al anterior

    /**
     * Constructor cuando solo tenemos un dato
     * @param data El dato del nodo
     */
    public Node(int data){
        this.data = data;
    }

    /**
     * Constructor para un nodo con dato y next
     * @param data El dato del nodo
     * @param next La referencia al siguiente nodo
     */
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    /***
     * Constructor al siguiente nod
     * @param data El dato del nodo
     * @param next El siguiente nodo
     * @param previous El nodo previo
     */
    public Node(int data, Node next, Node previous){
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    /**
     * Actualiza el siguiente nodo
     * @param next La referencia al siguiente nodo
     */
    public void setNext(Node next){
        this.next = next;
    }

    /**
     * Actualiza el siguiente nodo
     * @param next La referencia al nodo previo
     */
    public void setPrevious(Node previous){
        this.previous = previous;
    }


    /**
     * Obtiene el dato del nodo
     * @return El dato
     */
    public int getData(){
        return this.data;
    }

    /**
     * Obtiene la referencia al siguiente nodo
     * @return La siguiente refencia
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * Obtiene la referencia al nodo previo
     * @return La refencia anterior
     */
    public Node getPrevious(){
        return this.previous;
    }
}