package CmdLineArgs;

public class CmdLineArgs1 {

    public static void main(String[] args) {
        int n = args.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(args[i]);
        }
    }
}
