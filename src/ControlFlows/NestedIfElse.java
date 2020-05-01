package ControlFlows;

public class NestedIfElse {

    public static void main(String[] args) {
        int x = 50; //use different value of x here
        int y = x;
        //y = 55;
        if (x == y) {
            if (x > 15) {
                if (x < 100) {
                    System.out.println("x is greater than 15 and less than 100 : " + x);
                } else {
                    System.out.println("x is greater than 15 and also greater than 100 : " + x);
                }
            } else {
                System.out.println("x is less than 15 : " + x);
            }
        } else {
            System.out.println("x is not equal to " + y);
        }
    }
}
