package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 11, 13, 15};
        for (int num : numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Jorge", "Pepe", "Maria", "Paco", "Lalo", "Tuco", "Pato", "Peppa"};
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
