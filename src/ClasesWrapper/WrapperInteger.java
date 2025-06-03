package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {


        //Integer intObjeto = new Integer(32768); DEPRECATED, new Integer será obsoleto ya no es necesario ponerlo

        int intPrimitivo = 32768; // esta es la forma de poner un primitivo en wrapper
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        /* Esta es la forma de hacer el wrapper directo:
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;
         */

        int num = intObjeto; // aqui estoy convirtiendo un wrapper a un primitivo. De forma implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // es lo mismo que el de arriba, por debajo implementara lo mismo. De forma explicita
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto); // esta saliendosé del limite, no lo marca como error pero habrá inconsistencia

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);// si agarra valor 32768 lo deja en 0, pero si si es 127...:

        Long LongObjeto = intObjeto.longValue();
        System.out.println("LongObjeto = " + LongObjeto);

    }
}
