package EjerciciosFlujosDeControl;

/*
Crear una clase con el método main donde el desafío es buscar el número menor de
mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de números
a comparar, luego utilizando una sentencia for iterar el numero de veces (ingresado)
para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
si no, imprimir " el numero menor es igual o mayor que 10!".
 */

import java.util.Scanner;

public class EncontrarMenorDeMultiplesValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteros = 0;

        while (true) {
            System.out.println("Ingresa el número de enteros a considerar (mínimo 10): ");
            if (sc.hasNextInt()) {
                enteros = sc.nextInt();
                if (enteros >= 10) {
                    break; // válido, salimos
                } else {
                    System.out.println("Introducir mínimo 10 números enteros.");
                }
            } else {
                System.out.println("Error: solo se permiten números enteros.");
                sc.next(); // limpiar entrada
            }
        }

        int menor = Integer.MAX_VALUE; // el valor más grande posible como punto de partida

        // Pedir los números y encontrar el menor

        for (int i = 1; i <= enteros; i++) {
            int numero;

            while (true) {
                System.out.println("Ingresa el número " + i + ": ");
                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    break; // entrada válida, salimos del while interno
                } else {
                    System.out.println("Error: solo se permiten números enteros.");
                    sc.next();
                }
            }

            if (numero < menor) {
                menor = numero; // actualiza el número menor
            }
        }

        // Mostrar resultados
        System.out.println("\nEl número menor es: " + menor);

        if (menor < 10 ){
            System.out.println("El número " + menor +" es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }

        sc.close();
    }
}

