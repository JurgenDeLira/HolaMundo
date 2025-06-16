package Curso;

import java.util.Scanner;

public class OperadorTarea {
    public static void main(String[] args) {

        Integer n1 = 0;
        Integer n2 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        n1 = s.nextInt();

        System.out.println("Ingrese el segundo número: ");
        n2 = s.nextInt();


        if (n1 > n2){
            System.out.println(n1 + ", " + n2);
        } else if (n2 > n1){
            System.out.println(n2+ ", " + n1);
        } else {
            System.out.println("Números son iguales");
        }

    }
}
