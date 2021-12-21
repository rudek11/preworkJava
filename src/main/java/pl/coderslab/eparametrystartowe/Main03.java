package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < args.length ; i++) {
            sum += Integer.parseInt(args[i]);

        }
        avg = sum / args.length;
        System.out.println(avg);
    }
}
