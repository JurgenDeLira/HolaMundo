package EjerciciosOperadores;

/*
Instrucción:
Crea un programa que muestre paso a paso cómo cambian los valores de una
variable usando preincremento (++x), postincremento (x++), predecremento (--x) y postdecremento (x--).
Debes:
Declarar una variable entera x con valor inicial 5.
Mostrar el resultado de cada operación en consola con un texto que explique qué está ocurriendo.
 */

public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {

        int x = 5;
        System.out.println("Valor inicial de x: " + x);
        int preIncremento = ++x;
        int postIncremento = x++;
        int xpostIn = x;

        int preDecremento = --x;
        int postDecremento = x--;
        int xPostDe = x;


        System.out.println("++x = " + preIncremento);
        System.out.println("x++ = " + postIncremento);
        System.out.println("x después de postincremento = " + xpostIn);
        System.out.println("--x = " + preDecremento);
        System.out.println("x-- = " + postDecremento);
        System.out.println("x final = " + xPostDe);

    }
}
