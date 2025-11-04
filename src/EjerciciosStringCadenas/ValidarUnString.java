package EjerciciosStringCadenas;

/*
Escribe una función boolean esValido(String texto) que devuelva:
false si el texto es null o está vacío.
false si solo contiene espacios.
true en cualquier otro caso.
Prueba con distintos valores.
 */

public class ValidarUnString {
    public static void main(String[] args) {
        System.out.println(esValido(null)); // false
        System.out.println(esValido("")); // false
        System.out.println(esValido("    "));// false
        System.out.println(esValido("Hola")); // true
        System.out.println(esValido(" Mundo"));//true

    }

    public static boolean esValido(String texto){
        //Compruebo si es null
        if (texto == null){
            return false;
        }
        // eliminiar espacios al inicio y final
        texto = texto.trim();

        // comprobar si está vacío después de quitar espacios
        if (texto.isEmpty()) {
            return false;
        }

        return  true;
    }
}
