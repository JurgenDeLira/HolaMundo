package EjerciciosStringCadenas;

public class ConcatenandoString {
    public static void main(String[] args) {
        String nombre = "Jorge";
        String apellido = "De Lira";

        System.out.println(nombre + " " + apellido);
        System.out.println(nombre.concat(" ").concat(apellido));

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(nombre).append(" ").append(apellido));

    }
}
