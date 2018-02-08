package cas14;

    public class TrueFalseNizaCounter {
        public static void main(String[] args) {
            int[] a = {1,2,3,4,5,6};
            int[] b = {1,3,2,5,5,6};
            System.out.println(nizaniza(a,b));
        }
        public static boolean nizaniza (int[]a,int[]b){
            int counter = 0;
            for (int i = 0; i <a.length; i++) {
                if (a[i]!=b[i]){
                    counter++;
                }
            }if (counter==3){
                return true;
            }else{
                return false;
            }
        }
    }

