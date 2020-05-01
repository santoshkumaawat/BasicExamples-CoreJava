package CmdLineArgs;

public class CmdLineArgs2 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println(args[0] + args[1]);
        System.out.println(x + y);
    }
}
