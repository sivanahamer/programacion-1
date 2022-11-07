package doubly;

/**
 * Una lista doblemente enlazada
 * @author Sivana Hamer
 * @version 11-07-2022
 */
public class List {
    private Node head;//Guarda la cabeza de la lista
    private Node tail;//Guarda la cola de la lista

    /**
     * Devuelve si la lista se encuentra vacia
     * @return Verdadero si esta vacio, y falso si no.
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Imprime la lista
     */
    public void imprimir(){
        //Revisamos que la lista no se encuentre vacia
        if (!isEmpty()){
            //El nodo actual
            Node runner = this.head;
            //Revisa cada referencia
            while(runner != null){
                System.out.printf("%d <-> ", runner.getData());
                runner = runner.getNext();
            }
        }
        System.out.println("🔵");
    }

    /**
     * Imprime la lista al reves
     */
    public void imprimirReves(){
        System.out.print("🔵");
        //Revisamos que la lista no se encuentre vacia
        if (!isEmpty()){
            //Empezamos por la cola
            Node runner = this.tail;
            //Revisa cada referencia
            while(runner != null){
                System.out.printf(" <-> %d", runner.getData());
                runner = runner.getPrevious();
            }
        }
        System.out.println();
    }

    /**
     * Concatena un dato al final de la lista
     * @param data El dato a agregar
     */
    public void concatenar(int data){
        //Tenemos que revisar si la lista se encuentra vacia
        if (isEmpty()){
            //Si es vacia, se agrega a la cabeza
            Node newNode = new Node(data);
            this.head = this.tail = newNode;
        }
        else{
            //Si no es vacia, se agrega en el ultimo elemento
            //El nodo actual
            Node runner = this.head;
            //Llego al ultimo elemento
            while(runner.getNext() != null){
                runner= runner.getNext();
            }
            //Le agregamos al ultimo nodo un nuevo nodo
            Node newNode = new Node(data, null, runner);
            runner.setNext(newNode);
            //Actualizamos la cola
            this.tail = newNode;
        }
    }

    /**
     * Insertamos en la posicion del indice el dato
     * @param data El dato a agregar
     * @param index El indice donde se agrega el nodo
     */
    public void insertar(int data, int index){
        if (index == 1){
            //Creamos un nuevo nodo que apunta a la lista que tiene en la cabeza
            Node newNode = new Node(data, this.head);

            //Actualizar la referencia de la cabeza anterior si no es vacio
            if(!isEmpty()){
                this.head.setPrevious(newNode);
            }else{
                //Si no hay lista, se actualiza la cola
                this.tail = newNode;
            }
            //La cabeza ahora apunta a esta nuevo nodo
            this.head = newNode;
        }
        else{
            //El nodo actual
            Node runner = this.head;
            int contador = 1;
            //Mientras existe un siguiente que recorrer o
            //no nos encontramos en la posicion antes de insertar
            while(runner != null && contador != (index - 1)){
                runner= runner.getNext();
                contador++;
            }
            //Voy a insertar  solo si me encuentro en la posicion antes de insertar
            if(contador == (index - 1)){
                //Creamos el nuevo nodo que apunta al siguiente del nodo anterior a agregar
                Node newNode = new Node(data, runner.getNext(), runner);
                //Actualiza el anterior del nodo que era el previo del siguiente si existe
                if (runner.getNext() != null) {
                    runner.getNext().setPrevious(newNode);
                }else{
                    //Si no, estamos en el nodo final y por lo tanto actualizamos la cola
                    this.tail = newNode;
                }
            //El nodo antes de agregar ahora apunta al nuevo nodo
                runner.setNext(newNode);
            }
        }
    }

    /**
     * Remueve el nodo con el dato de la lista
     * @param dato El dato del nodo que se busca remover
     */
    public void remover(int dato){
        //Determinamos si estamos removiendo la cabeza
        if (!isEmpty() && this.head.getData() == dato){
            //Guardamos que la cabeza es el siguiente nodo de la lista
            this.head = this.head.getNext();
            //Actualizar que ahora el anterior de la cabeza apunta a nulo
            if (!isEmpty()){
                this.head.setPrevious(null);
            //Si esta vacio, la cola apunta a nada
            }else{
                this.tail = null;
            }
        //Remover un caso que no es la cabeza
        }else{
            Node runner = this.head;
            //Hay que encontrarse en la posicion anterior antes de remover
            //Revisamos si hay un siguiente y si este siguiente es igual al dato
            while(runner.getNext() != null && runner.getNext().getData() != dato){
                //Vamos al siguiente
                runner = runner.getNext();
            }
            //Revisamos si termino al llegar al nodo anterior que se tenia que remover
            if(runner.getNext() != null){
                //Obtenemos el siguiente del siguiente, es nuestro nuevo nodo
                Node newNext = runner.getNext().getNext();
                //Actualizamos el nuevo next
                runner.setNext(newNext);
                //Actualizamos que el nuevo next tenga de previo al nodo actual
                if (newNext != null){
                    newNext.setPrevious(runner);
                //Actualizamos que el ultimo nodo es el final actual de la lista
                }else{
                    this.tail = runner;
                }
            }
        }
    }
}