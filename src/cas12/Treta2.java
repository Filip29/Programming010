package cas12;

import java.util.Scanner;

public class Treta2 {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int n = citac.nextInt();
        int[] value = {1, 2, 3, 4, 5, 6, 7};
        int i = 0;
        for (int j = 0; j < value.length; j++) {
            if (value[j] == n) {
                System.out.println("Da,pripaga vo nizata");
                break;
            }
            if ((value.length) -i == 0) {
                System.out.println("Ne pripaga vo nizata");
            }
        }
    }
}
