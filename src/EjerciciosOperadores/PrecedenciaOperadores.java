package EjerciciosOperadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        Object[] datos = {
                42,             //Integer
                3.14,           //Double
                "Hola Java",    //String
                true,           //Boolean
                'A'             //Character
        };
        for(Object elemento : datos) {
            if (elemento instanceof Integer) {
                System.out.println("Elemento: " + elemento + "-> Es un número entero");
            } else if (elemento instanceof Double) {
                System.out.println("Elemento: " + elemento + "-> Es un número decimal");
            } else if (elemento instanceof String) {
                System.out.println("Elemento: " + elemento +"-> Es una cadena de texto");
            } else if (elemento instanceof  Boolean) {
                System.out.println("Elemento: " + elemento +"-> Es un valor booleano");
            } else if (elemento instanceof Character) {
                System.out.println("Elemento: " + elemento +"-> Es un caracter");
            }
        }
    }
}
