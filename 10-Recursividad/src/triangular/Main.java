package triangular;

public class Main{
    public static void main(String [] args){
        TriangularN triangularN = new TriangularN();
        System.out.println(triangularN.calcularRecursivo(5));
        System.out.println(triangularN.calcularIterativo(5));
        System.out.println(triangularN.calcularIterativoSinMemo(5));


    }
}