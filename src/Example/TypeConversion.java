package Example;

public class TypeConversion {

    public static void main(String[] args) {
        float floatValue = 1.2F;
        byte byteValue = 8;
        double doubleValue = 4.0D;
        short shortValue = 10;
        long longValue = 5;
        int integerValue = 12;

        short srt = byteValue;  //short = 16bits , byte = 8bits
        System.out.println(srt);

        byte byt = (byte) shortValue;   //byte = 8bits, short = 16bits
        System.out.println(byt);

        int integer = (int) longValue;  //int = 32bits, long = 64bits
        System.out.println(integer);

        int integer2 = (int) doubleValue;   //int = 32bits, double = 64bits
        System.out.println(integer2);

        int integer3 = (int) floatValue;
        /*int and float having same size but float having decimal places
         and therefore int cant store decimal value 
         so we need to casting float value to integer
         and so integer can store some possible value which can be store
         but also some value possibly lost(Decimal Value)
         */
        System.out.println(integer3); 
    }
}
