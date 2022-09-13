package numero;

public class Numero {
    //Atributos
    private double valor;

    //Constructor
    public Numero(double valor){
        this.valor = valor;
    }

    //Metodos
    public String getSigno(){
        String resultado = "";
        if (this.valor > 0){
            resultado = "Es positivo";
        }else if (this.valor == 0){
            resultado = "Es cero";
        }else{
            resultado = "Es negativo";
        }
        return resultado;
    }

    public String getPar(){
        if (this.valor % 2 == 0){
            return "Es par";
        }else{
            return "Es impar";
        }
    }

    public String getValor(){
        return String.format("%.2f", this.valor);
    }
}
