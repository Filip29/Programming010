package cas5;

import java.util.Scanner;

public class DelenjeNaCifri {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        int num = citac.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
