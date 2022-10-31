package lista;

/**
 * Nodo para una lista simplemente enlazada
 */
public class Nodo {
    //Atributos
    private int dato;
    private Nodo next;

    //Constructores
    public Nodo(int dato){
        this.dato = dato;
    }

    public Nodo(int dato, Nodo next){
        this.dato = dato;
        this.next = next;
    }

    public void imprimir(){
        System.out.printf("%d -> ", this.dato);
    }

    public Nodo getNext(){
        return this.next;
    }

    public void setNext(Nodo next){
        this.next = next;
    }
}
