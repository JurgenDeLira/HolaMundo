package EjerciciosOperadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        while (true){
            System.out.println("Proporciona 3 números enteros: ");

            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                num3 = sc.nextInt();
                break; // si todo esta bien sale del bucle
            } else {
                System.out.println("Por favor, ingresa solo números enteros.");
            } sc.next(); //descarto la entrada inválida
        }

        int mayor = (num1 > num2) ? num1 : num2;
        mayor = (mayor > num3) ? mayor : num3;

        System.out.println("El número mayor es: " + mayor);

    }
}
