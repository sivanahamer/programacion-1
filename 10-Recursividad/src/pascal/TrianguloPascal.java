package pascal;

public class TrianguloPascal {
    /**
     * Obtiene el coeficiente (una celda) del triangulo
     * @param fila La fila del coeficiente
     * @param columna La columna del coeficiente
     * @return El resultado de obtener el coeficiente
     */
    public int obtenerCoeficiente(int fila, int columna){
        //Casos bases
        if (fila == 1) return 1;
        if (columna == 1) return 1;
        if (columna == fila) return 1;
        //Caso recursivo
        return obtenerCoeficiente(fila - 1, columna) + obtenerCoeficiente(fila - 1 , columna - 1);
    }

    /**
     * Imprime toda una fila del triangulo de pascal
     * @param fila La fila a imprimir
     */
    private void imprimirFila(int fila){
        for (int columna = 1; columna <= fila; columna++){
            System.out.printf("%d ", obtenerCoeficiente(fila, columna));
        }
        System.out.println("");
    }

    /**
     * Imprime el triangulo de pascal
     * @param niveles Los niveles del triangulo a imprimir
     */
    public void imprimirTriangulo(int niveles){
        for (int fila = 1; fila <= niveles; fila ++){
            imprimirFila(fila);
        }
    }
}
