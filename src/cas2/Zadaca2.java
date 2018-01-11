package cas2;

import java.util.Scanner;

public class Zadaca2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Brojot " + i + " se vika Marija");
            } else if (i % 5 == 0) {
                System.out.println("Brojot " + i + " se vika Hristina");
            } else if (i % 3 == 0) {
                System.out.println("Brojot " + i + " se vika Filip");
            }
    }
}
