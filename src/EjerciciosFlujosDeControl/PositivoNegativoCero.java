package EjerciciosFlujosDeControl;

//Lee un número entero e imprime si es "Positivo", "Negativo", o "Cero".

import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = sc.nextInt();

        // TODO: usa if / else if / else

        if(num > 0){
            System.out.println("Positivo");
        } else if (num < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }
    }
}
