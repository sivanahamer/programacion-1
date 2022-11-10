package binary;

public class BinaryTree {
    //Atributo
    private Node raiz;

    //Constructor
    public BinaryTree(int dato){
        this.raiz = new Node(dato);
    }

    public BinaryTree(Node raiz){
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
}
