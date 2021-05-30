package deberes;
import java.util.Scanner;
public class EnBaseAlMumeroImprimirElMesCorrespondiente {
    //Generar una aplicacion que en base al numero del mes convertir en texto
    public static void main(String[] args) {
        System.out.println("Ingrese un numero del 1 al 12");
        Scanner entradaScaner = new Scanner(System.in);
        int numero = entradaScaner.nextInt();
        System.out.println("Numero ingresado: " + numero);
        if (numero==1) {
            System.out.println("El mes correspondiente al numero 1 es ENERO");
        }
        if (numero==2) {
            System.out.println("El mes correspondiente al numero 2 es FEBRERO");
        }
        if (numero==3) {
            System.out.println("El mes correspondiente al numero 3 es MARZO");
        }
        if (numero==4) {
            System.out.println("El mes correspondiente al numero 4 es ABRIL");
        }
        if (numero==5) {
            System.out.println("El mes correspondiente al numero 5 es MAYO");
        }
        if (numero==6) {
            System.out.println("El mes correspondiente al numero 6 es JUNIO");
        }
        if (numero==7) {
            System.out.println("El mes correspondiente al numero 7 es JULIO");
        }
        if (numero==8) {
            System.out.println("El mes correspondiente al numero 8 es AGOSTO");
        }
        if (numero==9) {
            System.out.println("El mes correspondiente al numero 9 es SEPTIEMBRE");
        }
        if (numero==10) {
            System.out.println("El mes correspondiente al numero 10 es OCTUBRE");
        }
        if (numero==11) {
            System.out.println("El mes correspondiente al numero 11 es NOVIEMBRE");
        }
        if (numero==12) {
            System.out.println("El mes correspondiente al numero 12 es DICIEMBRE");
        }
    }  
}
