package EjerciciosFlujosDeControl;

/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales
en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de
notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas
 una a una para realizar los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar
un mensaje de error finalizando el programa.
 */


import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Se pediran 20 notas finales con escala de 1 a 7:");
        double sumaMa5 = 0.0;
        int iMa5 = 0;
        double sumaMe4 = 0.0;
        int iMe4 = 0;
        int notas1 = 0;

        for (int i = 1; i <= 20; i++){
            double nota = 0.0;

            while (true){
                System.out.print("Ingresa la nota " + i + ": ");
                if(sc.hasNextDouble()) {
                    nota = sc.nextDouble();
                    if (nota == 0){
                        System.out.println("Error: se ingresó una nota 0. Programa finalizado.");
                        sc.close();
                        return;
                    } else if (nota >= 1.0 && nota <= 7.0) {
                        break; //válido
                    } else {
                        System.out.println("Error: la nota debe estar entre 1.0 y 7.0.");
                        sc.next(); // limpiar entrada inválida
                    }
                }
            }


            if (nota >= 5.0){
                sumaMa5 += nota;
                iMa5++;
            } else if (nota <= 4.0 && nota > 1.0) {
                sumaMe4 += nota;
                iMe4++;
            } else if (nota == 1.0) {
                notas1++;
            }
        }
        // Mostrar resultados
        double promedioMa5 = (iMa5 > 0) ? sumaMa5 / iMa5 : 0;
        double promedioMe4 = (iMe4 > 0) ? sumaMe4 /iMe4 : 0;
        int totalNotas = iMa5 + iMe4 + notas1;
        double promedioTotal = (sumaMa5 + sumaMe4 + (notas1 + 1.0)) / totalNotas;

        System.out.println("El número de notas mayores a 5 es de " + iMa5 + " y su promedio es " + promedioMa5);
        System.out.println("El número de notas menores a 4 es de " + iMe4 + " y su promedio es " + promedioMe4);
        System.out.println("La cantidad de notas con 1 es de " + notas1);


        System.out.println("El promedio total es de " + promedioTotal);
        sc.close();
    }
}
