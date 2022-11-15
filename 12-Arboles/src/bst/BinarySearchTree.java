package bst;

public class BinarySearchTree {
    //Atributo
    private Node raiz;

    //Constructor
    public BinarySearchTree(int dato){
        this.raiz = new Node(dato);
    }

    public BinarySearchTree(Node raiz){
        this.raiz = raiz;
    }

    //Metodos
    public Node getRaiz(){return this.raiz;}

    /**
     * Metodo auxiliar que llama al metodo recursivo de imprimir en pre orden
     */
    public void imprimirPreorden(){
        this.imprimirPreorden(this.raiz);
    }

    /**
     * Imprime en preorden el arbol
     * (1) El nodo actual
     * (2) Hijos izquierdos
     * (3) Hijos derechos
     * @param actual El nodo actual a imprimir
     */
    public void imprimirPreorden(Node actual){
        if (actual != null){
            actual.imprimir();
            this.imprimirPreorden(actual.getHijoIzquierdo());
            this.imprimirPreorden(actual.getHijoDerecho());
        }
    }

    /**
     * Metodo auxiliar que llama al metodo recursivo de imprimir in orden
     */
    public void imprimirInOrden(){
        this.imprimirInOrden(this.raiz);
    }

    /**
     * Imprime en in order el arbol
     * (1) Hijos izquierdos
     * (2) El nodo actual 
     * (3) Hijos derechos
     * @param actual El nodo actual a imprimir
     */
    public void imprimirInOrden(Node actual){
        if (actual != null){
            this.imprimirInOrden(actual.getHijoIzquierdo());
            actual.imprimir();
            this.imprimirInOrden(actual.getHijoDerecho());
        }
    }

    /**
     * Metodo auxiliar que llama al metodo recursivo de imprimir post orden
     */
    public void imprimirPostOrder(){
        this.imprimirPostOrder(this.raiz);
    }

    /**
     * Imprime en post order el arbol
     * (1) Hijos izquierdos
     * (2) Hijos derechos
     * (3) El nodo actual 
     * @param actual El nodo actual a imprimir
     */
    public void imprimirPostOrder(Node actual){
        if (actual != null){
            this.imprimirPostOrder(actual.getHijoIzquierdo());
            this.imprimirPostOrder(actual.getHijoDerecho());
            actual.imprimir();
        }
    }

    /**
     * Buscar en un arbol BST
     * @param actual El nodo actual
     * @param dato El dato a buscar
     * @return El nodo si lo encontro, null si no lo encuentra
     */
    public Node buscar(Node actual, int dato){
        //Caso base de que encontre el nodo
        if (actual.getDato() == dato){
            return actual;
        }
        //Caso de buscar en el hijo izquierdo
        if ( dato < actual.getDato() && actual.getHijoIzquierdo() != null ){
            return buscar(actual.getHijoIzquierdo(), dato);
        }
        //Caso de buscar en el hijo derecho
        if ( actual.getDato() < dato && actual.getHijoDerecho() != null ){
            return buscar(actual.getHijoDerecho(), dato);
        }
        //Caso de que no lo encontro
        return null;
    }

    /**
     * Inserta dentro de un arbol BST un valor
     * @param actual El nodo actual del arbol
     * @param dato El dato a insertar
     */
    public void insertar(Node actual, int dato){
        //Caso base: Insertar en un arbol vacio
        if (actual == null){
            this.raiz = new Node(dato);
        //Casos de insertar en un arbol que tiene datos 
        } else{
            //Caso de que va a la izquierda
            if (dato < actual.getDato()){
                //Reviso si esta libre mi hijo izquierdo
                if (actual.getHijoIzquierdo() == null){
                    actual.setHijoIzquierdo(dato);
                //Si no esta libre, busco a mi izquierdo donde hay espacio
                } else{
                    this.insertar(actual.getHijoIzquierdo(), dato);
                }
            }else{
                //Caso de que va a la derecha
                if (actual.getDato() < dato){
                    //Reviso si esta libre mi hijo derecho
                    if (actual.getHijoDerecho() == null){
                        actual.setHijoDerecho(dato);
                    }              
                    //Si no esta libre, busco a mi derecha donde hay espacio
                    else{
                        this.insertar(actual.getHijoDerecho(), dato);
                    }  
                }
            }
        }
    }
}
