package src.starducks;
import pizza.*;

public class Starducks{
    //Atributos
    private Matriz ventas;
    private Matriz costos;
    private Matriz utilidades;
    private String [] locales;
    private String [] trimestres;
    private final int CANTIDAD_TRIMESTRES = 4;
    private Interfaz interfaz;

    //Constructores
    public Starducks(){
        //Crea la interfaz
        this.interfaz = new Interfaz();

        //Crea los trimestres & locales
        this.crearTrimestres();
        this.obtenerLocales();

        //Crea las matrices
        this.ventas = new Matriz("ventas", locales, trimestres);
        this.costos = new Matriz("costos", locales, trimestres);
    }


    //Metodos
    /**
     * Crea el arreglo de trimestres
     */
    private void crearTrimestres(){
        this.trimestres = new String [CANTIDAD_TRIMESTRES];
        for (int indice = 0; indice < CANTIDAD_TRIMESTRES; indice++)
            this.trimestres[indice] = String.format("Trimestre %d", indice + 1);
    }

    /***
     * Obtiene los locales
     */
    public void obtenerLocales(){
        //Cuantos locales son
        int cantidadLocales = this.interfaz.pedirEntero("Digite la cantidad de locales: ", "ERROR! Tiene que ser un entero");
        this.locales = new String [cantidadLocales];

        //Los nombres de las locales
        for (int indice = 0; indice < cantidadLocales; indice++)
            this.locales[indice] = this.interfaz.pedirTexto("Digite el nombre del local: ", "ERROR!");
    }

    /***
     * Obtenemos la informacion de las matrices de ganancias y costos
     */
    public void obtenerInformacion(){
        this.ventas.obtenerValores();
        this.costos.obtenerValores();
        this.utilidades = this.ventas.restar("utilidades", costos);
    }

    /**
     * Imrpmir la informaicon
     */
    public void imprimirInformacion(){
        this.ventas.imprimir();
        this.costos.imprimir();
        this.utilidades.imprimir();
    }

    /**
     * Procesa la informacion que se tiene de las utilidades
     */
    public void procesarInformacion(){
        Arreglo sumaLocales = this.utilidades.sumarFila("SUMA LOCALES");
        sumaLocales.imprimir();
        Arreglo sumaTrimestres = this.utilidades.sumarColumnas("SUMA TRIMESTRES");
        sumaTrimestres.imprimir();
        Arreglo sumaTodo = this.utilidades.sumarTodo("SUMA TODO");
        sumaTodo.imprimir();
    }

}
