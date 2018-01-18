package cas10;

import java.util.Scanner;

public class SumOdSeDo100 {
    public static void main(String[] args){

        Scanner citac = new Scanner(System.in);
        int n = citac.nextInt();
        int sum = 0;
        sum=n*(n+1)/2;

        System.out.println(sum);
    }

}


