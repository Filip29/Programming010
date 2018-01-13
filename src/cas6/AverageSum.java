package cas6;

import java.util.Scanner;

public class AverageSum {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        double average = 1;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        average=sum/5;
        System.out.println(average);
    }
}
//test
