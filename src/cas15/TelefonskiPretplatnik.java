package cas15;

import java.util.Scanner;

public class TelefonskiPretplatnik {
    public static void main(String[] args) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi go brojot");
        int[] broj = new int[9];
        for (int i = 0; i < 9; i++) {
            broj[i] = citac.nextInt();
        }
        System.out.println(broj[0] + "" + broj[1] + "" + broj[2] + "/" + broj[3] + broj[4] + broj[5] + "-" + broj[6] + broj[7] + broj[8]);
        if (broj[2]==0){
            System.out.println("T-Mobile");
        }if (broj[2]==1){
            System.out.println("T-Mobile");
        }if (broj[2]==2){
            System.out.println("T-Mobile");
        }if (broj[2]==5){
            System.out.println("One");
        }if (broj[2]==6){
            System.out.println("One");
        }if (broj[2]==7){
            System.out.println("Vip");
        }if (broj[2]==8){
            System.out.println("Vip");
        }
    }


}
