package triangular;

public class TriangularN {
    /**
     * Calcula el triangular N recursivamente
     * @param n El numero a calcular
     * @return El resultado del numero triangular de N
     */
    public int calcularRecursivo(int n){
        //Caso base
        if (n<=1)
            return 1;
        //Llamada recursiva
        return n + calcularRecursivo(n-1);
    }

    /**
     * Calcula iterativamente con memoria dinamica
     * @param n El numero a calcular
     * @return El resultado del numero triangular de N
     */
    public int calcularIterativo(int n){
        //Guardar dentro de un arreglo nuestros casos bases
        int [] memo = new int [n + 1];
        memo[0] = memo[1] = 1;

        //Iteramos para calcular el numero hasta el triangular N
        for (int indice = 2; indice <= n; indice++){
            memo[indice] = indice + memo[indice -1];
        }

        //Devolvemos el resultado
        return memo[n];
    }

    public int calcularIterativoSinMemo(int n){
        //No se ocupa realmente un arreglo auxiliar
        //Podemos solo usar una variable para tener el ultimo valor
        //E ir iterando sobre el
        int resultado = 1;

        //Calcula el resultado sumando el valor actual hasta llegar a N
        for (int indice = 2; indice <= n; indice++){
            resultado += indice;
        }

        //Devuelve el resultado
        return resultado;
    }
}
