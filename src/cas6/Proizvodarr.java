package cas6;

import java.util.Scanner;

public class Proizvodarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        double proizvod = 1;
        for (int i = 0; i < arr.length; i++) {
            proizvod *= arr[i];
        }

        System.out.println(proizvod);
    }
}
