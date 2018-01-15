package cas8;

import java.util.Arrays;

public class NekojElementDaGoOtstranisOdNizata {
    public static void main(String[] args) {
        int[] my_array = {1,2,3,4,5,6,7};
        System.out.println("Original Array : "+ Arrays.toString(my_array));
        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(my_array));
    }
}
