package EjerciciosOperadores;

import java.util.Scanner;

public class EvaluadorDeDesempeño {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int calificacion1;
        int calificacion2;
        int calificacion3;

        while (true){
            System.out.println("Ingresa las 3 calificaciones: ");

            if (sc.hasNextInt()){
                calificacion1 = sc.nextInt();
                calificacion2 = sc.nextInt();
                calificacion3 = sc.nextInt();
                break; // si todo esta bien sale del bucle
            } else {
                System.out.println("Por favor, ingresa solamente números enteros.");
            } sc.next(); //Descarto la entrada inválida
        }

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;

        System.out.println("Promedio: " + promedio);
        if (calificacion1 >= 60 && calificacion2 >= 60 && calificacion3 >= 60 && promedio >= 70){
            System.out.println("Resultado: Aprobado");
        } else if ((calificacion1 < 60 || calificacion2 < 60 || calificacion3 < 60) && promedio >= 70){
            System.out.println("Resultado: Reprobado (calificación menor a 60 existente)");
        } else {
            System.out.println("Resultado: Reprobado");
        }
        /* con operador ternario
        String resultado = (promedio >= 70 && calificacion1 >= 60 && calificacion2 >= 60 && calificacion3 >= 60)
        ? "Aprobado"
        : "Reprobado";
        System.out.println("Resultado: " + resultado);
         */
    }
}
