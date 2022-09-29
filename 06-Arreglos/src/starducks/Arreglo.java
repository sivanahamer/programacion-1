package src.starducks;
import pizza.*;

public class Arreglo {
    private int [] valores;
    private static Interfaz interfaz = new Interfaz();
    private String nombre;
    private String [] nombres;
    private final int ESPACIOS_IMPRIMIR = 15; //Esto se puede encontrar de los datos para hacerlo variable

    public Arreglo(String nombre, String [] nombres, int [] valores){
        //Se guarda la informacion del arreglo
        this.nombre = nombre;
        this.nombres = nombres;

        //Pasamos la referencia del arreglo
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
     * Imprime una matriz
     */
    public void imprimir(){
        this.imprimirNombre();

        String formatCampo;
        String texto;


        for (int indice = 0; indice < this.valores.length; indice++){
            //Imprime un elemento de la matriz
            formatCampo = "%" + ESPACIOS_IMPRIMIR + "S";
            texto = String.format(formatCampo, this.nombres[indice]);
            interfaz.imprimirNoNewLine(texto);

            //Imprime el elemento del arreglo
            formatCampo = "%" + ESPACIOS_IMPRIMIR + "d";
            texto = String.format(formatCampo, this.valores[indice]);
            interfaz.imprimir(texto);
        }
    }

}