package Ejercicios;

/*
Imprime la tabla de multiplicar de un número del 1 al 10
usando un for
 */

import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número del 1 al 10: ");
        int numero = scanner.nextInt();



        if (numero > 10 || numero < 0) {
            System.out.println("Ingrese un número válido");
        }else {
            System.out.println("Tabla del " + numero + ":");
            for (int i = 1; i <= 10; i++){
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

         scanner.close();
    }
}
