package estaciones;

public class Mes {
    private String nombre;
   
    public Mes(String nombre){
        this.nombre = nombre;
    }

    public String obtenerEstacion(){
        String estacion = "";
        switch(this.nombre){
            case "diciembre":
            case "enero":
            case "febrero":
            estacion = "Invierno";
            break;
            case "abril":
            case "marzo":
            case "mayo":
            estacion = "Primavera";
            break;
            case "junio":
            case "julio":
            case "agosto":
            estacion = "Verano";
            break;
            case "septiembre":
            case "octubre":
            case "noviembre":
            estacion = "Otonno";
            break;
            default:
            estacion = "NA";
        }
        return estacion;
    }
}
