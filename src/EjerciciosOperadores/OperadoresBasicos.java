package EjerciciosOperadores;

import java.util.Scanner;

public class OperadoresBasicos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Proporciona el segundo número entero: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + ( num1 % num2));
    }
}
