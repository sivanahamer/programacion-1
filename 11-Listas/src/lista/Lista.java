package lista;

public class Lista {
    //Atributo
    //TODO: :)
    // private int cantidadNodos;
    private Nodo head;

    //Constructor
    public Lista(){
        this.head = null;
    }

    public Lista(int dato){
        this.head = new Nodo(dato);
    }

    public Lista(Nodo head){
        this.head = head;
    }

    public Nodo getHead(){
        return this.head;
    }

    public void imprimir(){
        Nodo current = this.head;

        while (current != null){
            current.imprimir();
            current = current.getNext();
        }
        System.out.println();
    }

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

}
