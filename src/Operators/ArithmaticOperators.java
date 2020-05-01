 package Operators;

public class ArithmaticOperators {

    public static void main(String[] args) {
        add(10, 10);
        subtract(50, 20);
        multiply(10, 20);
        divide(30, 15);
        modulus(60, 8);
    }

    static void add(int x, int y) {
        System.out.println("Addition : " + (x + y));
    }

    static void subtract(int x, int y) {
        System.out.println("Subtraction : " + (x - y));
    }

    static void multiply(int x, int y) {
        System.out.println("Multiplication : " + (x * y));
    }

    static void divide(int x, int y) {
        System.out.println("Division : " + (x / y));
    }

    static void modulus(int x, int y) {
        System.out.println("Modulus : " + (x % y));
    }

}
