package EjerciciosFlujosDeControl;

/*
Mediante el teclado pedir dos números enteros positivos o negativos
y multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y tener
 en cuenta los unarios, donde menos por menos es positivo.
 */

import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;


        while (true) {
            System.out.print("Ingresa el primer número entero: ");
            if (sc.hasNextInt()) {
                num1 = sc.nextInt();
                break;
            } else {
                System.out.println("Error: solo se permiten números enteros.");
                sc.next(); // limpiar entrada
            }
        }

        while (true){
            System.out.print("Ingresa el segundo número entero: ");
            if (sc.hasNext()) {
                num2 = sc.nextInt();
                break;
            } else {
                System.out.println("Error solo se permiten números enteros.");
                sc.next();
            }
        }

        //Determinar signo del resultado
        boolean esNegativo = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 <0);

        //Trabajar solo con valores positivos para la suma repetida
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int resultado = 0;

        //sumar 'a' tantas veces como indique 'b'
        for (int i = 0; i < b; i++){
            resultado += a;
        }

        //Aplicar signo si corresponde
        if (esNegativo) {
            resultado = -resultado;
        }

        System.out.println("\nResultado de la multiplicación: " + resultado);
        sc.close();
    }
}

