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

    /**
     * Borra una hoja dentro de un arbol
     * @param nodoABorrar El nodo que se quiere borrar
     */
    private void borrarHoja(Node nodoABorrar){
        //Borramos la raiz
        if (this.raiz == nodoABorrar){
            this.raiz = null;
        //Caso de borrar un nodo normal
        }else{
            Node padre = obtenerPadre(nodoABorrar.getDato());

            //Revisa si quiere borrar un hijo izquierdo
            if (padre.getHijoIzquierdo() == nodoABorrar){
                padre.setHijoIzquierdo(null);
            }else{
                //Quiero borrar el hijo derecho
                padre.setHijoDerecho(null);
            }
        }
    }

    /**
     * Borra un nodo con un hijo
     * @param nodoABorrar El nodo que se quiere borrar
     */
    private void borrarUnHijo(Node nodoABorrar){
        //Guardamos el hijo en una referencia
        Node hijo = null;
        if (nodoABorrar.getHijoIzquierdo() != null) 
            hijo = nodoABorrar.getHijoIzquierdo();
        else
            hijo = nodoABorrar.getHijoDerecho();
        
        //Le caemos encima al dato actual con el del hijo 
        nodoABorrar.setDato(hijo.getDato());
        //Hacemos lo mismo con las referencias
        nodoABorrar.setHijoIzquierdo(hijo.getHijoIzquierdo());
        nodoABorrar.setHijoDerecho(hijo.getHijoDerecho());
    }

    /**
     * Obtiene el nodo más pequeño en un arbol
     * @param actual El nodo actual del arbol
     * @return El nodo más pequeño
     */
    private Node obtenerMasPequenno(Node actual){
        Node masPequenno = actual;
        //Iteramos el hijo izquierdo hasta que el siguiente sea nulo
        while (masPequenno.getHijoIzquierdo() != null){
            masPequenno = masPequenno.getHijoIzquierdo();
        }
        return masPequenno;
    }

    /**
     * Borra un nodo con dos hijos
     * @param nodoABorrar El nodo que se quiere borrar
     */
    private void borrarDosHijos(Node nodoABorrar){
        //Obtiene el nodo con el que vamos a hacer swap
        Node masPequenno = this.obtenerMasPequenno(nodoABorrar.getHijoDerecho());
        //Guardamos el dato, para no perderlo
        int datoMasPequenno = masPequenno.getDato();
        //Borrar el dato del arbol
        this.remover(datoMasPequenno);
        //Caerle encima al dato
        nodoABorrar.setDato(datoMasPequenno);
    }

    /**
     * Obtiene el padre de un nodo
     * @param actual El nodo actual en donde esta en el arbol
     * @param dato El dato del nodo hijo al cual se le busca el padre
     * @return La referencia del padre del nodo con el dato, si es que existe
     */
    private Node obtenerPadre(Node actual, int dato){
        //Caso bases:
        //Es mi hijo derecho
        if (actual.getHijoDerecho() != null && actual.getHijoDerecho().getDato() == dato){
            return actual;
        }
        //Es mi hijo  izquierdo
        if (actual.getHijoIzquierdo() != null && actual.getHijoIzquierdo().getDato() == dato){
            return actual;
        }
        //Casos recursivos
        //Caso de buscar en el hijo izquierdo
        if (dato < actual.getDato() && actual.getHijoIzquierdo() != null){
            return obtenerPadre(actual.getHijoIzquierdo(), dato);
        }
        //Caso de buscar en el hijo derecho
        if (actual.getDato() < dato && actual.getHijoDerecho() != null){
            return obtenerPadre(actual.getHijoDerecho(), dato);
        }
        //Caso de que no lo encontro
        return null;
    }

    
    /**
     * Obtiene el padre de un nodo
     * @param dato El dato del nodo hijo al cual se le busca el padre
     * @return La referencia del padre del nodo con el dato, si es que existe
     */
    public Node obtenerPadre(int dato){
        //Si esta el dato dentro del arbol y no es la raiz
        if (dato != this.raiz.getDato() && buscar(this.raiz, dato) != null){
            return obtenerPadre(this.raiz, dato);
        }
        //Si no soy la raiz, que no tiene padre :c
        //O no esta en el arbol
        return null;
    }

    /**
     * Remueve dentro de un arbol BST un valor
     * @param dato El dato a borrar
     */
    public void remover(int dato){
        Node nodoABorrar = buscar(this.raiz, dato);
        if (nodoABorrar != null){ 
            switch (nodoABorrar.contarHijos()) {
                //Borrar hoja
                case 0: this.borrarHoja(nodoABorrar); break;
                //Borrar nodo con un hijo
                case 1: this.borrarUnHijo(nodoABorrar); break;
                //Borrar nodo con varios hijos
                case 2: this.borrarDosHijos(nodoABorrar); break;
            }
        }
    }
}
