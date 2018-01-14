package cas7;

import java.util.Scanner;

public class ZbirNeparniCetriciCifreniBroevi {
    public static void main(String[] args) {
        int sum = 0;
       for (int i=1000;i<=9999;i++){
           if (i%2==0){
               sum = sum+i;
           }
        }
        System.out.println(sum);
    }
}
