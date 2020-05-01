package Input;

import java.util.Scanner;

public class UsingScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
