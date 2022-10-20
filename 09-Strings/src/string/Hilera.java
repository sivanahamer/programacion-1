package string;

import java.util.Arrays;
import java.util.List;

public class Hilera {
    private String valor;

    public Hilera(String valor){
        this.valor = valor;
    }

    /**
     * Cuenta la cantidad de palabras que hay en una oracion
     * @return La cantidad de palabras
     */
    public int contarPalabras(){
        String [] palabras = valor.split(" ");
        return palabras.length;
    }

    public static boolean contains(char letra, String caracteresAQuitar){
        for(int indiceCaracteresQuitar = 0; indiceCaracteresQuitar < caracteresAQuitar.length(); indiceCaracteresQuitar++){
            if (letra == caracteresAQuitar.charAt(indiceCaracteresQuitar)){
                return true;
            }
        }
        return false;
    }


    /**
     * Quita vocales de una hilera
     * @return Una hilera sin vocales
     */
    public Hilera quitarVocales(){
        String caracteresAQuitar = "AEIOU";
        String sinVocales = "";
        //Iteramos sobre cada una de las letras de la palabra que se tiene
        for(int indice = 0; indice < this.valor.length(); indice++){
            char caracterActual = this.valor.charAt(indice);
            //Se compara con lo chars que se quieren quitar
            char caracterActualMayuscula = Character.toString(caracterActual).toUpperCase().toCharArray()[0];
            if (! Hilera.contains(caracterActualMayuscula, caracteresAQuitar)){
                sinVocales += caracterActual;
            }
        }

        return new Hilera(sinVocales);
    }

    /**
     * Imprime la hilera
     */
    public void imprimir(){
        System.out.println(this.valor);
    }

    /**
     * Reviere una hilera
     * @return La hilera revertida
     */
    public Hilera revertir(){
        String hileraRevertida = "";
        for(int indice = 0; indice < this.valor.length(); indice++){
            char caracterActual = this.valor.charAt(indice);
            hileraRevertida = caracterActual + hileraRevertida;
        }

        return new Hilera(hileraRevertida);
    }

    /**
     * Reviere una hilera v2
     * @return La hilera revertida
     */
    public Hilera revertirv2(){
        String hileraRevertida = "";
        for(int indice = this.valor.length() - 1 ; indice >= 0 ; indice--){
            char caracterActual = this.valor.charAt(indice);
            hileraRevertida += caracterActual;
        }

        return new Hilera(hileraRevertida);
    }

    /**
     * Una palabra es abecederian si todas las letras de la palabra aparecen en orden alfabético.
     * @return True si es abacederian, false si no es
     */
    public boolean abecederian(){
        for (int indice = 1; indice < this.valor.length(); indice ++){
            char caracterActual = this.valor.charAt(indice);
            char caracterAnterior = this.valor.charAt(indice - 1);
            if (caracterAnterior > caracterActual){
                return false;
            }
        }
        return true;
    }

}
