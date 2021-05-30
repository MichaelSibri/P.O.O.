package deberes;
import java.util.Arrays;
import java.util.Scanner;
public class OrdenarDeMayorAMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = teclado.nextInt();
        int vector[] = new int[tamaño];
        System.out.println("Ingrese los " + tamaño + " numeros");
        for (int i = 0; i < tamaño; i++) {
            vector[i] = teclado.nextInt();
        }
        
        System.out.println("Vector ingresado");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println("");

        
        Arrays.sort(vector);
        System.out.println("El vector ordenado de mayor a menor");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + "\t");
        }
        System.out.println("");
    }
}
