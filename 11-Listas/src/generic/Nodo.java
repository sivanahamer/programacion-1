package generic;

/**
 * Nodo para una lista simplemente enlazada generico
 * @author Sivana Hamer
 * @version 10-31-2022
 */
public class Nodo<T> {
    //Atributos
    private T dato;
    private Nodo<T> next;

    //Constructores
    /**
     * Constructor de datos
     * @param dato El dato del nodo
     */
    public Nodo(T dato){
        this.dato = dato;
    }

    /**
     * Constructo de datos con el siguiente nodo
     * @param dato El dato del nodo
     * @param next El siguiente nodo
     */
    public Nodo(T dato, Nodo<T> next){
        this.dato = dato;
        this.next = next;
    }

    //Metodos

    /**
     * Obtiene el siguiente nodo
     * @return El siguiente nodo
     */
    public Nodo<T> getNext(){
        return this.next;
    }

    /**
     * Guarda el siguiente nodo
     * @param next El siguiente nodo
     */
    public void setNext(Nodo<T> next){
        this.next = next;
    }

    /**
     * Obtiene el dato del nodo
     * @return El dato del nodo
     */
    public T getDato(){
        return this.dato;
    }
}
