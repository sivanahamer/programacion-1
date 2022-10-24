package countdown;

public class Blastoff {
    /**
     * Metodos recursivos
     * @param n 
     */
    public void countdown(int n){
        //Caso base
        if (n <= 0){
            System.out.println("Blastoff!");
        //Llamada recursiva
        }else{
            System.out.println(n);
            countdown(n - 1);
        }
    }
}
