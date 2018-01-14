package cas7;

public class IndexPozicijaVoNiza {
    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (my_array [j] == t){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5,6,7};
        System.out.println("Index position of 3 is: " + findIndex(my_array, 3));
        System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
    }
}
