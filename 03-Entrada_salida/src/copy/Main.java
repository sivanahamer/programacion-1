package copy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        String row;

        BufferedReader file = new BufferedReader(new FileReader("example.csv"));

        try (PrintWriter writer = new PrintWriter(new File(" test .csv"))) {
            while ((row = file.readLine()) != null) {
                String[] data = row.split(" , ");
                String newRow = String.join("; ", data) + "\n";
                writer.write(newRow);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        file.close();
    }
}