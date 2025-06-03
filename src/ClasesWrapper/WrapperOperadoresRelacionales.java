package ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        // Estos últimos son Objetos, más que ser números

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Estoy creando una nueva instancia
        num2 = 1000; // se esta asignando otro objeto, otra instancia que contiene el mismo valor

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //Será false, si bien contienen el mismo valor, no provienen ya de la misma instancia
        // Java hasta 127 si va a comparar de forma automática por el valor, después de eso por instancia
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        //comparar por el valor:
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));

        // comparar por el valor convirtiendo a primitivo
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        num2 = 500;
        boolean condicion = num1 > num2; // ambos son iguales en valor
        System.out.println("condicion = " + condicion);

        boolean condicion2= num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
