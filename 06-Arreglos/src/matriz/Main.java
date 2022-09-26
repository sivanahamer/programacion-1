public class Main {
    public static void main(String [] args){
        boolean [] [] matriz = new boolean [3] [4];
        matriz[2][0] = true;

        matriz[1][3] = (matriz[2][0] || matriz[0][0]);

        //Imprime la direccion de memoria que es una fila
        System.out.println(matriz[2]);
        //Imprime una celda
        System.out.println(matriz[1][3]);

        for(int i = 0; i < matriz.length; i++){
            // System.out.println(matriz[i]);
            for (int j = 0; j< matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
