package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }


    }

}
