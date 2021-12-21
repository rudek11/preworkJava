package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] numb = new int[n];
        int k = 0;
        for (int i = 1; i <= numb.length; i++) {
            System.out.println();
            for (int j = 1; j <= numb.length; j++) {
                k = i * j;
                System.out.println(i + " * " + j + " = " + k);
            }
        }
    }

}
