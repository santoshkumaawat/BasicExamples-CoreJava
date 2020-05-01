package Operators;

public class PrefixPostfix {

    public static void main(String[] args) {
        //Prefix
        int x = 5;
        System.out.println(++x);    //6
        System.out.println(x);      //6

        int y = 10;
        System.out.println(--y);    //9
        System.out.println(y);      //9

        //Postfix
        int a = 80;
        System.out.println(a++);    //80
        System.out.println(a);      //81

        int b = 95;
        System.out.println(b--);    //95
        System.out.println(b);      //94
    }
}
