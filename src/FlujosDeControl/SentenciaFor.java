package FlujosDeControl;

public class SentenciaFor {
    public static void main(String[] args) {


        /*int i = 0;
        for(;;){
            if (i >= 5) {
                break;
            }
                System.out.println("i = " + i);
                i++;
        }*/
        // pero más sencillo:
        for (int i = 0; i <= 10; i++){
            System.out.println("i = " + i);
        }

        for(int i = 10; i>= 0; i--){
            System.out.println("i = " + i);
        }

        for (int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        //solo numeros impares:
        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
        //solo numeros pares:
        for (int i = 0; i <= 10; i++){
            if (i % 2 != 0) { // o ( !(i % 2 == 0) ) si eso es true, lo niega
                continue;
            }
            System.out.println("i = " + i);
        }


    }
}
