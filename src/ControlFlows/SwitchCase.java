package ControlFlows;

public class SwitchCase {

    public static void main(String[] args) {
        int a = 30, b = 20;
        String s = "+";
        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
