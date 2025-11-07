package EjerciciosFlujosDeControl;

/*Pide calificaciones (double) hasta que el usuario ingrese un valor negativo.
Calcula el promedio con un while y usa break para salir del ciclo.*/

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int i = 0;

        while (true){
            System.out.println("Ingresa calificaciones (introducir negativo para terminar): ");
            double calificacion = sc.nextDouble();
            if (calificacion < 0){
                break;
            }
            suma += calificacion;
            i++;

        }
        if (i > 0) {
            double promedio = suma / i;
            System.out.println("El promedio de calificaciones es de: " + promedio);
        } else {
            System.out.println("No se ingresaron calificaciones válidas");
        }
        sc.close();
    }
}
