package src.starducks;
import pizza.*;

public class Matriz {
    private int [][] valores;
    private static Interfaz interfaz = new Interfaz();
    private String nombre;
    private String [] nombresFilas;
    private String [] nombresColumnas;
    private int cantidadFilas;
    private int cantidadColumnas;
    private final int ESPACIOS_IMPRIMIR = 15; //Esto se puede encontrar de los datos para hacerlo variable

    public Matriz(String nombre, String [] nombresFilas, String [] nombresColumnas){
        //Se guarda la informacion de la matriz
        this.nombre = nombre;
        this.nombresFilas = nombresFilas;
        this.nombresColumnas = nombresColumnas;
        this.cantidadFilas = nombresFilas.length;
        this.cantidadColumnas = nombresColumnas.length;

        //Crea la matriz vacias
        this.valores = new int [cantidadFilas][cantidadColumnas];
    }

    public Matriz(String nombre, String [] nombresFilas, String [] nombresColumnas, int [] [] valores){
        //Se guarda la informacion de la matriz
        this.nombre = nombre;
        this.nombresFilas = nombresFilas;
        this.nombresColumnas = nombresColumnas;
        this.cantidadFilas = nombresFilas.length;
        this.cantidadColumnas = nombresColumnas.length;

        //Crea la matriz vacias
        this.valores = valores;
    }

    private void imprimirNombre(){
        String separador = "*".repeat(30);
        interfaz.imprimir(separador);
        interfaz.imprimir(this.nombre.toUpperCase());
        interfaz.imprimir(separador);
        interfaz.imprimir("");
    }

    /**
     * Obtiene los valores de una matriz
     */
    public void obtenerValores(){

        this.imprimirNombre();
        for(int i = 0; i < cantidadFilas ; i++){
            for (int j = 0; j < cantidadColumnas; j++){
                String mensaje = String.format("Digite las %s de [%d][%d]: ", this.nombre, i, j);
                int elemento = interfaz.pedirEntero(mensaje, "ERROR al ingresar el dato");
                this.valores[i][j] = elemento;
            }
        }
    }

    /**
     * Imprime una matriz
     */
    public void imprimir(){
        this.imprimirNombre();

        String formatCampo;
        String texto;

        formatCampo = "%" + ESPACIOS_IMPRIMIR + "S";
        texto = String.format(formatCampo, "LOCALES");
        interfaz.imprimirNoNewLine(texto);

        for (int j = 0; j < cantidadColumnas; j++){
            //Imprime un elemento de la matriz
            formatCampo = "%" + ESPACIOS_IMPRIMIR + "S";
            texto = String.format(formatCampo, this.nombresColumnas[j]);
            interfaz.imprimirNoNewLine(texto);
        }
        interfaz.imprimir("");

        for(int i = 0; i < cantidadFilas ; i++){
            //Imprime el local
            formatCampo = "%" + ESPACIOS_IMPRIMIR + "s";
            texto = String.format(formatCampo, this.nombresFilas[i]);
            interfaz.imprimirNoNewLine(texto);

            for (int j = 0; j < cantidadColumnas; j++){
                //Imprime un elemento de la matriz
                formatCampo = "%" + ESPACIOS_IMPRIMIR + "d";
                texto = String.format(formatCampo, this.valores[i][j]);
                interfaz.imprimirNoNewLine(texto);
            }
            interfaz.imprimir("");
        }
    }

    public Matriz restar(String nombre, Matriz otraMatriz){
        int [][] b = otraMatriz.valores;

        int [][] valores = this.valores.clone();

        for(int i = 0; i < cantidadFilas ; i++){
            for (int j = 0; j < cantidadColumnas; j++){
                valores[i][j] -= b[i][j];
            }
        }
        
        return new Matriz(nombre, this.nombresFilas, this.nombresColumnas, valores);
    }
    
    /**
     * Suma las filas de una matriz
     * @param nombre El nombre de la nueva matriz
     * @return Una matriz donde se le sumo las filas
     */
    public Arreglo sumarFila(String nombre){
        //Crear la matriz donde se van a guardar los resultados
        int [] resultados = new int [this.cantidadFilas];

        for (int i = 0; i < cantidadFilas; i ++){
            resultados[i] = 0;
            for (int j = 0; j < cantidadColumnas; j++){
                resultados[i] += this.valores[i][j];
            }
        }
        return new Arreglo(nombre, nombresFilas, resultados);
    }
}