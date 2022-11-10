package binary;

public class Main{
    public static void main(String [] args){
        BinaryTree bTree = new BinaryTree(8);
        bTree.getRaiz().setHijoIzquierdo(2);
        bTree.getRaiz().setHijoDerecho(4);
        bTree.getRaiz().getHijoIzquierdo().setHijoIzquierdo(7);
        bTree.getRaiz().getHijoIzquierdo().setHijoDerecho(0);
        bTree.getRaiz().getHijoDerecho().setHijoDerecho(10);

        bTree.imprimirPreorden();
        System.out.println("");
        bTree.imprimirInOrden();
        System.out.println("");
        bTree.imprimirPostOrder();

    }
}