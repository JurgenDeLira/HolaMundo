package EjerciciosStringCadenas;

/*
Escribe un programa que:
Tome una frase "Java es genial".
La divida en palabras con split(" ").
Imprima cada palabra en una línea.
Luego convierta la frase en un arreglo de caracteres y cuente cuántas vocales tiene.
 */

public class ConvertirStringAArreglo {
    public static void main(String[] args) {
        String frase = "Java es genial";
        String[] palabras = frase.split(" ");
        for (String p : palabras){
            System.out.println(p);
        }

        char[] caracteres = frase.toCharArray();
        int largo = caracteres.length;
        for (int i = 0; i < largo; i++){
            System.out.println(caracteres[i]);
        }

        int contadorVocales = 0;
        for(char c : caracteres) {
            c = Character.toLowerCase(c); //Para que funcione con mayúsculas
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contadorVocales++;
            }
        }

        System.out.println("\nNúmero de vocales: " + contadorVocales);

    }
}
