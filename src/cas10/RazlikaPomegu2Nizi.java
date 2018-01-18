package cas10;

public class RazlikaPomegu2Nizi {
    public static void main(String[] args) {
        int[] a = {12, 3, 67, 8, 3, 8, 9};
        int[] b = {12, 2, 67, 9, 3, 7, 9};
        System.out.println(presmetajRazlika(a,b));
        System.out.println(soberiAsoB(a,b));
    }
    public static int presmetajRazlika(int[]a,int[]b){
        int counter = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=b[i]){
                counter++;
            }
        }

        return counter;
    }
    public static int soberiAsoB(int[]a,int[]b){
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i]-b[i];
        }

        return sum;
    }

    }

