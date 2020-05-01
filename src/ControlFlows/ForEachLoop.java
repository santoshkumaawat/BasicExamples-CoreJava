package ControlFlows;

public class ForEachLoop {

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(num.length);

        for (int i : num) {
            System.out.println(i);
        }
    }
}
