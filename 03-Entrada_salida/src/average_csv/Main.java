package average_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Permite leer de un archivo
        BufferedReader file = new BufferedReader(new FileReader("./03-Entrada_salida/data/numeros_favoritos.csv"));


        int sumaFavoritos = 0;
        int cantidadEstudiantes = 0;

        file.readLine();//leemos el header para que no este en los datos
        //Lee todas las lineas, del archivo
        String row;
        while ((row = file.readLine()) != null){
            //Se puede hacer todo lo que uno quiera aqui :)
            String [] elementos = row.split(",");
            int numeroFavorito = Integer.parseInt(elementos[1]);
            sumaFavoritos += numeroFavorito;
            cantidadEstudiantes++;
        }        
        file.close();
        //Calcula el promedio
        System.out.println((float) sumaFavoritos / (float) cantidadEstudiantes);

    }
}