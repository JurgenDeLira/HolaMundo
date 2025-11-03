package EjerciciosStringCadenas;

public class CreandoObjetosStringEnLaLiteral {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");

        boolean comparacion1 = a == b;
        boolean comparacion2 = a.equals(b);

        System.out.println(comparacion1);
        System.out.println(comparacion2);

        /*
        El operador == compara si son el mismo objeto y no lo son.
        equals compara más el valor de ellos y si tienen el mismo valor
         */
    }
}
