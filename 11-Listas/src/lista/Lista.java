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
     * Determina si la lista esta vacia o no
     * @return True si la lista esta vacia
     * False en el caso de que no esta vacia
     */
    public boolean isEmpty(){
        return this.head == null;
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
        //Caso de que se inserta en la cabeza
        if (indice == 0){
            Nodo headViejo = this.head;
            this.head = new Nodo(dato, headViejo);
            // this.head = new Nodo(dato, this.head);
        //Caso que sea en el resto de la lista
        }else{
            Nodo current = this.head;

            // Contador para encontrar el indice
            int contador = 0;
            while (contador < indice - 1 && current != null){
                current = current.getNext();
                contador++;
            }

            //Revisar si no nos hemos salido de la lista
            if (current != null){
                // Swaps de posiciones
                Nodo siguienteSiguiente = current.getNext();
                Nodo siguiente = new Nodo(dato, siguienteSiguiente);
                current.setNext(siguiente);

                // current.setNext(new Nodo(dato, current.getNext()));
            }
        }
    }

    /**
     * Remueve la primera instancia del dato en una lista
     * @param dato El dato a remover
     */
    public void remover(int dato){
        if (!this.isEmpty()){
            //Si es la cabeza, nos movemos uno
            if (this.head.getDato() == dato){
                this.head = this.head.getNext();
            //Caso en el cuerpo
            }else{
                //Iteramos hasta que

                Nodo current = this.head;
                while(current.getNext() != null && current.getNext().getDato() != dato){
                    current = current.getNext();
                }
                //Caso de que si lo encuentro en la lista
                if (current.getNext() != null){
                    //Guardamos el siguiente del siguiente
                    current.setNext(current.getNext().getNext());
                }
            }
        }
    }

    /**
     * Busca si encuentra el nodo en la lista
     * @param dato El dato del nodo a encontrar
     * @return El nodo que busca
     */
    public Nodo encontrar(int dato){
        //Empezamos con el runner de la lista
        Nodo runner = this.head;
        //Mientras que se pueda seguir iterando y no sea el dato de la cabeza, siga
        while(runner != null && runner.getDato() != dato){
            runner = runner.getNext();
        }
        //Si el nodo actual es distinto a nulo, significa que se detuvo dado que el dato era igual al del nodo actual
        if (runner != null){
            //Devolvemos el nodo actual
            return runner;
        }
        //No encontro el nodo en la lista
        return null;
    }
}