package deberes;

import java.util.Scanner;

public class SerieDeFibonassi {

    //0,1,1,2,3,5,8,...
    //primerValor,segundoValor,tercerValor = primerValor+segundoValor
    //           ,segundoValor = primerValor,tercerValor = segundoValor, tercerValor = primerValor+segundoValor  
    public static void main(String[] args) {
        int primerValor = 0;
        int segundoValor = 1;
        int tercerValor = 0;
        int numeroDeElementos = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el numero de elementos agenerar");
        numeroDeElementos = teclado.nextInt();

        if (numeroDeElementos == 1) {
                System.out.print(" " + "0");
                System.out.println("");
        }
        if (numeroDeElementos == 2) {
                System.out.print(" " + "0");
                System.out.print(" " + "1");
                System.out.println("");   
        }
        
        if (numeroDeElementos > 2) {
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + "0");
            i = i + 1;
            System.out.print(" " + "1");
            i = i + 1;
        }

        for (int i = 2; i < numeroDeElementos; i++) {

            tercerValor = primerValor + segundoValor;
            primerValor = segundoValor;
            segundoValor = tercerValor;
            System.out.print(" " + tercerValor);
        }

        System.out.println("");
    }
    }

}
