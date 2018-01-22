package cas12;

import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int n = citac.nextInt();
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
