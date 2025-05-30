package FlujosDeControl;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecuta");
        }


        do { // primero ejecuta y después evalua con while
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);

        prueba = true;
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}
