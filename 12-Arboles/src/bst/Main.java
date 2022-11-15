package bst;

public class Main{
    public static void main(String [] args){
        BinarySearchTree bTree = new BinarySearchTree(10);
        bTree.getRaiz().setHijoIzquierdo(6);
        bTree.getRaiz().setHijoDerecho(22);
        bTree.getRaiz().getHijoIzquierdo().setHijoIzquierdo(3);
        bTree.getRaiz().getHijoIzquierdo().setHijoDerecho(8);
        bTree.getRaiz().getHijoDerecho().setHijoDerecho(31);

        bTree.imprimirPreorden();
        System.out.println("");
        bTree.imprimirInOrden();
        System.out.println("");
        bTree.imprimirPostOrder();

        System.out.println("");
        bTree.buscar(bTree.getRaiz(), 3).imprimir();
        bTree.insertar(bTree.getRaiz(), 7);
        System.out.println("");
    }
}