import java.util.Scanner;

class Main {
    
    public static void main(String [] args){ 

        //Crea algo que permite leer la entrada de usuario
        Scanner input = new Scanner(System.in);
        
        // obtener la distancia y el tiempo
        System.out.print("Distancia viajada (d): ");
        double distancia = input.nextDouble();
        System.out.print("Tiempo transcurrido (t): ");
        double tiempo = input.nextDouble();

        
        //Calcula la velocidad
        Velocidad velocidad = new Velocidad(distancia, tiempo);

        // imprimir resultado
        System.out.printf("La velocidad es: %.3f m/s", velocidad.calcular());

        //Cerrar input para evitar fugas de memoria
        input.close();
    }
}