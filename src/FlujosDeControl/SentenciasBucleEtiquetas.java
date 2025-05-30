package FlujosDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {


        bucle:
        for (int i = 1; i <= 7; i++){
            int j = 1;
            while (j <=8) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Día " + i + " trabajando a las " + j + " hrs.");
                j++;
            }
        }

        //Esto de bucle1 funciona como una etiqueta
        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n==============================================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
