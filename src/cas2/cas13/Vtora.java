package cas2.cas13;

public class Vtora {
    public static void main(String[] args) {
        int[] niza = new int[]{1,2,3,4,5,6,7};
        int sum = 0;
        for (int i = 0; i <niza.length ; i++) {
            sum = sum + niza.length;
            double average = sum / niza.length;
            System.out.println("Sredna vrednost na nizata e " +average);
       }
    }
}
