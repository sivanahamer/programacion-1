package pizza;

public class Mesa {
    private int cantidadSillas;
    private int sillasDisponibles;

    public Mesa(int cantidadSillas){
        this.cantidadSillas = cantidadSillas;
        this.sillasDisponibles = cantidadSillas;
    }

    public void ocupar(int cantidad){
        this.cantidadSillas -= cantidad;
    }

    public void desocupar(){
        this.sillasDisponibles = cantidadSillas;
    }

    public String describir(){
        return String.format("Cantidad sillas: %d - Cantidad disponibles: %d", this.cantidadSillas, this.sillasDisponibles);
    }
}
