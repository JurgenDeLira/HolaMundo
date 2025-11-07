package EjerciciosOperadores;

import java.util.Scanner;

public class EvaluadorDeDesempeñoArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cal = new int [3];

        System.out.println("Ingresa las 3 calificaciones (de 0 a 100)");
        for (int i = 0; i < 3; i++){
            while (true){
                System.out.println("Calificación " + (i+1) + ": ");
                if(sc.hasNextInt()){
                    int v = sc.nextInt();
                    if(v >= 0 && v <= 100){
                        cal[i] = v;
                        break;
                    } else {
                        System.out.println("Debe estar entre 0 y 100");
                    }
                }else {
                    System.out.println("Por favor, ingresa solo números enteros.");
                    sc.next();
                }
            }
        }

        double promedio = (cal[0] + cal[1] + cal[2]) / 3.0;
        System.out.println("Promedio: " + promedio);

        boolean todas = cal[0] >= 60 && cal[1] >= 60 && cal[2] >= 60;

        if (todas && promedio >= 70){
            System.out.println("Resultado: Aprobado");
        } else if ((cal[0] < 60 || cal[1] < 60 || cal[2] < 60) && promedio >= 70) {
            System.out.println("Resultado: Reprobado (calificación menor a 60 existente)");
        } else {
            System.out.println("Resultado: Reprobado");
        }
        sc.close();
    }
}
