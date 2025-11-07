package EjerciciosFlujosDeControl;

//Pide un número N y muestra la suma de los números del
// 1 al N usando un bucle for

import java.util.Scanner;

public class SumaHastaN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 0;

        while (true){
            System.out.println("Ingresa un número entero: ");

            if(sc.hasNextInt()){
                N = sc.nextInt();
                break;
            }else {
                System.out.println("Error: Solo se permiten números enteros.");
                sc.next();
            }
        }

        // TODO: Usar for
        int suma = 0;

        for (int i = 1; i <= N; i++){
            suma += i;
        }

        System.out.println("La suma de los números del 1 al número " + N + " da: " + suma);

    }
}
