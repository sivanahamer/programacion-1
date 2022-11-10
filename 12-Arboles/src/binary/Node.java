package binary;

public class Node {
    //Atributos
    private int dato;
    private Node izquierdo;
    private Node derecho;

    //Constructores
    public Node(int dato){
        this.dato = dato;
    }

    public Node(int dato, Node izquierdo, Node derecho){
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    //Metodos
    //Gets
    public int getDato(){return this.dato;}
    public Node getHijoIzquierdo(){return this.izquierdo;}
    public Node getHijoDerecho(){return this.derecho;}
    
    //Sets
    public void setDato(int dato){this.dato = dato;}
    public void setHijoIzquierdo(int dato){this.izquierdo = new Node(dato);}
    public void setHijoDerecho(int dato){this.derecho = new Node(dato);}

    //Imprimir
    public void imprimir(){System.out.print(this.dato + " ");}


}
