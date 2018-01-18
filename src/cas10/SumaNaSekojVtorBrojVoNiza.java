package cas10;

public class SumaNaSekojVtorBrojVoNiza {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0;i<a.length;i=i+2){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
