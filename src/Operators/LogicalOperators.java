package Operators;

public class LogicalOperators {

    public static void main(String[] args) {
        int x = 50;
        System.out.println(x > 10 && x < 100);
        System.out.println(x > 10 || x < 40);
        System.out.println(!(x > 10 && x < 100));
    }
}
