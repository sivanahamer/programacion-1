package enlaces;

/**
 * La clase encarga de guardar información acerca de enlaces
 * @author Sivana Hamer
 * @version 01-09-2022
 */
public class AgregadorEnlaces {
    //Atributos
    private String enlace;
    private int cantidadClics;

    //Constructor
    public AgregadorEnlaces(String enlace){
        this.enlace = enlace;
        this.cantidadClics = 0;
    }

    //Metodos
    /**
     * Agrega una cantidad de clics a la cantidad actual
     * @param cantidad La cantidad de clics a agregar
     */
    public void annadirClics(int cantidad){
        this.cantidadClics += cantidad;
    }

    /**
     * Imprime el agregador de enlaces
     */
    public void imprimir(){
        System.out.printf("%s le han hecho clic %d veces", this.enlace, this.cantidadClics);
    }
}
