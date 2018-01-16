package cas9;

import java.util.Arrays;

public class MinimumVoNiza {
    static int min;

    public static void min(int my_array[]) {
        min = Integer.MAX_VALUE;
        int len = my_array.length;
        for (int i = 0; i < len ; i++) {
            if (my_array[i]<min){
                min=my_array[i];
            }

        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] my_array = {5,8,2,3,7,10,25,30,4};
        min(my_array);
        System.out.println(" Original Array: "+ Arrays.toString(my_array));
        System.out.println(" Minimum value for the above array = " + min);

    }


    }

