package lista;

/**
 * Nodo para una lista simplemente enlazada
 * @author Sivana Hamer
 * @version 10-31-2022
 */
public class Nodo {
    //Atributos
    private int dato;
    private Nodo next;

    //Constructores
    /**
     * Constructor de datos
     * @param dato El dato del nodo
     */
    public Nodo(int dato){
        this.dato = dato;
    }

    /**
     * Constructo de datos con el siguiente nodo
     * @param dato El dato del nodo
     * @param next El siguiente nodo
     */
    public Nodo(int dato, Nodo next){
        this.dato = dato;
        this.next = next;
    }

    //Metodos
    /**
     * Imprime el nodo
     */
    public void imprimir(){
        System.out.printf("%d -> ", this.dato);
    }

    /**
     * Obtiene el siguiente nodo
     * @return El siguiente nodo
     */
    public Nodo getNext(){
        return this.next;
    }

    /**
     * Guarda el siguiente nodo
     * @param next El siguiente nodo
     */
    public void setNext(Nodo next){
        this.next = next;
    }
}
