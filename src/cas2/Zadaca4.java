package cas2;

import java.util.Scanner;

public class Zadaca4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        }
        if (n == 2 || n == 4) {
            ans = "Not Weird";
        }
        if (n == 6 || n == 8 || n == 10 || n == 12 || n == 14 || n == 16 || n == 18 || n == 20) {
            ans = "Weird";
        }
        if (n % 2 == 0 && n > 20) {
            ans = "Not Weird";
        }

        System.out.println(ans);

    }
}
