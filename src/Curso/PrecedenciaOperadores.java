package Curso;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;

        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; // (15 + 8) + 66.6 el preincremento tiene prioridad
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j); // ahora si vale 7 por que se decrementa en la siguiente instrucción

    }
}
