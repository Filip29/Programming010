package cas14;

import java.util.Scanner;

public class ProizvodNaCifri {
    public static void main(String args[]) {
        Scanner citac = new Scanner(System.in);
        System.out.println("Vnesi broj");
        int num = citac.nextInt();
        magicenbroj(num);
    }

    public static void magicenbroj(int num) {
        int a = 0;
        int proizvod = 1;
        while (num > 0){
            a = num % 10;
            num = num / 10;
            proizvod = proizvod * a;
        }
        if (proizvod%5==0||proizvod%7==0){
            System.out.println("Brojot e magicen");
        }else if (proizvod%2==0){
            System.out.println("Brojot e polu magicen");
        }else{
            System.out.println("Ne e magicen");
        }
    }

}

