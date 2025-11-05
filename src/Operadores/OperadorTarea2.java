package Operadores;

import java.util.Scanner;

public class OperadorTarea2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la gasolina en litros: ");
        double gas = scanner.nextDouble();

        if (gas == 70.00){
            System.out.println("Estanque lleno");
        } else if (gas >= 60.00 && gas < 70.00){
            System.out.println("Estanque casi lleno");
        } else if (gas >= 40.00 && gas < 60.00){
            System.out.println("Estanque 3/4");
        } else if (gas >= 35.00 && gas < 40.00){
            System.out.println("Medio estanque");
        } else if (gas >= 20.00 && gas < 35.00) {
            System.out.println("Suficiente");
        } else if (gas >= 1.00 && gas < 20.00) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("No puedes poner más de 70 litros");
        }

    }
}
