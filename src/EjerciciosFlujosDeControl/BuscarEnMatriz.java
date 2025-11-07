package EjerciciosFlujosDeControl;

/*Dado un arreglo bidimensional (matriz), busca un número ingresado
por el usuario. Usa for anidado con etiqueta para salir de ambos bucles
si lo encuentras */

import java.util.Scanner;

public class BuscarEnMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Ingresa el número que deseas buscar: ");
        int valorBuscado = sc.nextInt();
        boolean encontrado = false;

        buscar:
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                // TODO: Usar if con break etiqueta
                if (matriz[i][j] == valorBuscado){
                    encontrado = true;
                    System.out.println("Valor encontrado en posición [" + i + "][" + j + "]");
                    break buscar;
                }
            }
        }
        if (!encontrado){
            System.out.println("El valor " + valorBuscado + " no se encontró en la matriz.");
        }
        sc.close();
    }
}
