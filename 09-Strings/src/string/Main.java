package string;


public class Main {
    public static void main(String [] args){
        Hilera hilera = new Hilera("biopsy");

        System.out.printf("Cantidad de palabras: %d%n", hilera.contarPalabras());
        hilera.quitarVocales().imprimir();
        hilera.revertir().imprimir();
        hilera.revertirv2().imprimir();
        System.out.printf("Es abecederian: %b%n", hilera.abecederian());

    }

}