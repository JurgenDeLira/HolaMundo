package Ejercicios;

import java.util.Scanner;

/*
Pide al usuario una calificación (0-100) e imprime si aprobó o reprobó
(mínimo 70 para aprobar).
 */
public class Condicionales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu calificación (0-100): ");
        Integer calificacion = scanner.nextInt();

        if (calificacion >= 70 && calificacion <= 100){
            System.out.println("¡Felicidades, aprobaste!");
        } else if (calificacion < 70 && calificacion >= 0) {
            System.out.println("Lo siento, reprobaste");
        } else {
            System.out.println("Ingresa una calificación valida por favor");
        }
        scanner.close();
    }
}

// Con switch:

class conSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu calificación (0-100): ");
        Integer calificacion = scanner.nextInt();

        switch (calificacion/10){
            case 10:
            case 9:
            case 8:
            case 7:
                System.out.println("¡Felicidades aprobaste!");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Lo siento, reprobaste");
                break;
            default:
                System.out.println("Calificación no válida");
        }
        scanner.close();
    }
}
