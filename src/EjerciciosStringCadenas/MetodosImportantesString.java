package EjerciciosStringCadenas;

/*
Crea un programa que pida una frase y luego:
Imprima los primeros 3 caracteres con substring().
Reemplace todas las “a” por “@”.
Verifique si contiene la palabra “Java”.
Cuente cuántas veces aparece la letra “e”.
 */

import java.util.Scanner;

public class MetodosImportantesString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();

        System.out.println("Primeros 3 caracteres: " + frase.substring(0, 3));
        System.out.println("Reemplazo las 'a' por '@': " + frase.replace("a", "@"));
        System.out.println("Verificar si contiene 'Java': " + frase.toLowerCase().contains("java".toLowerCase()));

        int contador = frase.length() - frase.replace("e", "").length();
        System.out.println("Número de veces que a parece 'e': " + contador);

    }
}
