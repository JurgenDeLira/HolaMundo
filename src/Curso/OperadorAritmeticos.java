package Curso;

import javax.swing.*;

public class OperadorAritmeticos {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);
        System.out.println(i + j + "i + j = ");
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        //System.out.println("(i - j) = " + i - j); da error
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        float div2 = i / j;// sigue saliendo mal, float si es decimal peor i y j estan como int
        float div3= (float) i / j; //Si le hacemos un cast por ejemplo si funciona (tambien puedes poner los dos en float)
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);

        int resto = i % j; // el % es el residuo
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero "));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}
