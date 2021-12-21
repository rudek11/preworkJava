package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";

            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    row += "*";
                }
            }
            System.out.print(row + "\n");

        }
    }
}