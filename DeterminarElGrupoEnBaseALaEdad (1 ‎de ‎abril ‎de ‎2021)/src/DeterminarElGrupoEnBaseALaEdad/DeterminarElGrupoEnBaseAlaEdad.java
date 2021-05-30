package deberes;
import java.util.Scanner;
public class DeterminarElGrupoEnBaseAlaEdad {
//Generar una aplicacion que permita determinar el grupo en base a la edad
    public static void main(String[] args) {
        System.out.println("Ingrese una edad");
        Scanner entradaScaner = new Scanner(System.in);
        int edad = entradaScaner.nextInt();
        System.out.println("Su edad: " + edad);
        if (edad > 0 && edad < 2) {
            System.out.println("Usted pertenese al grupo BEBES");
        }
        if (edad >= 2 && edad < 12) {
            System.out.println("Usted pertenese al grupo NIÑOS");
        }
        if (edad >= 12 && edad < 18) {
            System.out.println("Usted pertenese al grupo JOVENES");
        }
        if (edad >= 18 && edad < 65) {
            System.out.println("Usted pertenese al grupo ADULTOS");
        }
        if (edad >= 65) {
            System.out.println("Usted pertenese al grupo ADULTOS MAYORES");
        }
    }
}
