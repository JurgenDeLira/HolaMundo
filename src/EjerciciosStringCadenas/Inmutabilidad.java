package EjerciciosStringCadenas;

public class Inmutabilidad {
    public static void main(String[] args) {
        String curso = "programación";
        curso = curso.concat(" en java");
        System.out.println(curso);
    }
}
