package pl.coderslab.dtablice;

import java.util.Locale;

public class Main07 {

    public static void main(String[] args) {
        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double avg = 0;
        for (int i = 0; i < temps.length; i++) {
            temps[i] = temps[i] * 1.8 + 32;
            System.out.println(temps[i]);
            avg = avg + temps[i];
        }
        avg = avg/temps.length;
        System.out.println(avg);
        System.out.format("średnia: %.2f%n", avg );
    }

}