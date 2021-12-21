package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i < n; i++) {
            String row = "";

            for (int j = 1; j < n; j++) {
                if (j <= i) {
                    row += "*";
                } else {
                    row = row + j;

                }
            }
            System.out.print(row + "\n");

        }
        for (int i = 1; i < n; i++) {
            String row2 = "";

            for (int j = n; j > 1 ; j--) {
                if (j >= i) {
                    row2 += "*";
                } else {
                    row2 = row2 + j;

                }
            }
            System.out.print(row2 + "\n");

        }
    }
}