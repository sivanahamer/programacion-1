package fibonacci;

public class Fibonacci {
    /**
     * Recursividad basico de Fibonacci
     * @param n El valor n a calcular de Fibonacci
     * @return El valor de Fibonacci dado
     */
    public int calcularBottomUp(int n) {
        //System.out.println(n);
        if (n == 0 || n == 1)
            return 1;
        return calcularBottomUp(n - 1) + calcularBottomUp(n - 2);
    }

    /**
     * Calcula Fibonacci top down
     * @param n El valor n a calcular de Fibonacci
     * @return El valor de Fibonacci dado
     */
    public int calcularTopDown(int n){
        return calcularTopDown(n, new int [n + 1]);
    }

    /**
     * Calcula Fibonacci top down
     * @param n El valor n a calcular de Fibonacci
     * @param memo Memoria auxiliar para guardar los valores
     * @return El valor de Fibonacci dado
     */
    public int calcularTopDown(int n, int [] memo){
        //Caso base
        if (n == 0 || n == 1) 
            return 1;
        //Caso que aun no tengo el valor recursivo, lo guardo en el arreglo
        if (memo[n] == 0)
            memo[n] = calcularTopDown(n -1 , memo) + calcularTopDown(n-2, memo);
        //Devuelve el valor de lo que tiene en la recusividad
        return memo[n];
    }

    /**
     * Calcula dinamicamente fibonacci
     * @param n El valor n a calcular de Fibonacci
     * @return El valor de Fibonacci dado
     */
    public int calcularDinamica(int n){
        //Memoria auxiliar
        int [] memo = new int [n + 1];
        //Casos bases
        memo[0] = 1;
        memo[1] = 1;
        //Calculamos los valores de la solucion iterativos
        for (int indice = 2; indice <= n; indice++){
            memo[indice] = memo[indice-1] + memo[indice -2];
        }
        //Devolvemos el ultimo valor en el arreglo
        return memo[n];
    }
}
