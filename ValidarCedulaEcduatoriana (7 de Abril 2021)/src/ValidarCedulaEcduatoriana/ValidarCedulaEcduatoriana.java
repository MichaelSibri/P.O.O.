package deberes;

import java.util.Scanner;

public class ValidarCedulaEcduatoriana {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de cédula");
        String cedula = teclado.next();
        int suma = 0, resta = 0;

        for (int i = 0; i < cedula.length() - 1; i++) {
            int numeroCedula = Integer.parseInt(cedula.charAt(i) + "");
            if (i % 2 == 0) {
                numeroCedula = numeroCedula * 2;
                if (numeroCedula > 9) {
                    numeroCedula = numeroCedula - 9;
                }
            }

            suma = suma + numeroCedula;
        }

        if (suma % 10 != 0) {
            int acumulacion = ((suma / 10) + 1) * 10;
            resta = acumulacion - suma;
        }

        int ultimo = Integer.parseInt(cedula.charAt(9) + "");

        if (ultimo == resta) {
            System.out.println("la cédula ingresa es correcta");
        } else {
            System.out.println("la cedula es incorrecta");
        }
    }
}
