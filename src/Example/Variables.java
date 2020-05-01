package Example;

public class Variables {

    public static void main(String args[]) {
        int firstVar;
        firstVar = 50;
        System.out.println(firstVar);

        int secondVar = 100;
        System.out.println(secondVar);

        firstVar = secondVar;
        System.out.println(firstVar);

        secondVar = 200;
        System.out.println(secondVar);

        System.out.println(firstVar);

        String stringVar = "This is String";
        System.out.println(stringVar);
    }

}
