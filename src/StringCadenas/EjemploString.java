package StringCadenas;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        // compara si son el mismo objeto
        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual); //false

        //compara el valor
        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual); //true

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);

        // da true, por que es la misma dirección en memoria no como el curso2 que crea un new String
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);

    }
}
