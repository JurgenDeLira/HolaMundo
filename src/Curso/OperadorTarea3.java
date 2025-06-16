package Curso;

import javax.swing.*;

public class OperadorTarea3 {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String p2 = JOptionPane.showInputDialog("Ingresa otro nombre y apellido de un familiar o amigo:");
        String p3 = JOptionPane.showInputDialog("Ingresa un tercer nombre y apellido de un familiar o amigo:");

        String max = (p1.split(" ")[0].length() > p2.split(" ")[0].length()) ? p1 : p2;
        max = (p3.split(" ")[0].length() > max.split(" ")[0].length()) ? p3 : max;

        System.out.println("El nombre más largo es = " + max);
    }
}
