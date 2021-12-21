package pl.coderslab.eparametrystartowe;

public class Main08 {

    public static void main(String[] args) {
        int firstDigit = 420;
        int secondDigit = 168;

        while (firstDigit != secondDigit) // dopóki dwie liczby nie są sobie równe
        {
            if (firstDigit > secondDigit)  // sprawdzamy, która z nich jest większa
            {
                firstDigit = firstDigit - secondDigit; // odejmujemy mniejszą liczbę
            }                               // od większej
            else {
                secondDigit = secondDigit - firstDigit;
            }
        }
        System.out.println(firstDigit);

    }

}
