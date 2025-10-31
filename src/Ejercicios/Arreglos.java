package Ejercicios;

/*
Crea dos arreglos de 10 enteros. LLénalos con números consecutivos,
y luego crea un tercer arreglo que contenga la suma de los dos
 */

public class Arreglos {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        // llenar a con números del 1 al 10
        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        // llenar b con números del 11 al 20
        for (int i = 0; i < b.length; i++){
            b[i] = i + 11;
        }

        // llenar con c con la suma de a[i] + b[i]
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }

        // mostrar resultados
        System.out.println("Arreglo A: ");
        for (int num : a) {
            System.out.println(num + " ");
        };

        System.out.println("\nArreglo B: ");
        for (int num : b) {
            System.out.println(num + " ");
        }

        System.out.println("\nArreglo C (A + B): ");
        for (int num : c){
            System.out.println(num + " ");
        }
    }
}