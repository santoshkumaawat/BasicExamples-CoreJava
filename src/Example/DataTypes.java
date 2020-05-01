package Example;

public class DataTypes {

    public static void main(String[] args) {
        System.out.println("Premetive Data Types");
        System.out.println("1. Integral Data Types");
        byte byt = 127;
        System.out.println("byte : " + byt);

        short srt = 32767;
        System.out.println("short : " + srt);

        int integer = 2147483647;
        System.out.println("int : " + integer);

        long lng = 9223372036854775807L;
        System.out.println("long : " + lng);

        System.out.println("2. Floating Point Data Types");
        float flot = 225.23F;
        System.out.println("float : " + flot);

        double dbl = 25.58684146D;
        System.out.println("double : " + dbl);

        System.out.println("3. Character Data Types");
        char regularU = 'U';
        char accentedU = '\u00da';
        System.out.println("character : " + regularU);
        System.out.println("character : " + accentedU);

        System.out.println("4. Boolean Data Types");
        boolean bool = true;
        System.out.println("boolean : " + bool);
    }

}
