package deberes;
import java.util.Scanner;
public class TranspuestaDeUnaMatiz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = teclado.nextInt();
        int matriz[][] = new int[filas][columnas];
        int matrizT[][] = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            System.out.println("Ingresa los elementos de la fila " + "(" + (i + 1) + ")");
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = teclado.nextInt();
            }
            System.out.println("");
        }
        
        
        System.out.println("Matriz ingresada");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
            System.out.println("");
        }
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
