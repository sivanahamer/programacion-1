package kinder;

/**
 * Representa el huevo de chocolate
 * @author Sivana Hamer
 */
public class KinderSorpresa {
    private Juguete juguete;

    /**
     * Construye el kinder sorpresa
     * @param nombreJuguete
     * @param colorJuguete
     */
    public KinderSorpresa(String nombreJuguete, String colorJuguete){
        this.juguete = new Juguete(colorJuguete, nombreJuguete);
    }

    /**
     * Obtiene el juguete del kinder sorpresa
     * @return El juguete del kinder
     */
    public Juguete getJuguete(){
        return this.juguete;
    }
}
