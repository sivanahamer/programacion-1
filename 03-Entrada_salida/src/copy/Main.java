package copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        //Permite leer de un archivo
        BufferedReader file = new BufferedReader(new FileReader("./03-Entrada_salida/data/baby_shark.txt"));


        //Writer escribe a un archivo
        PrintWriter writer = new PrintWriter(new File("./03-Entrada_salida/data/baby_shark_copia.txt"));
        
        //Lee todas las lineas, del archivo
        String row;
        while ((row = file.readLine()) != null){
            //Se puede hacer todo lo que uno quiera aqui :)
            writer.write(row + "\n");
        }
        
        writer.close();
        file.close();
    }
}