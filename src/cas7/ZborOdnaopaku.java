package cas7;

import java.util.Scanner;

public class ZborOdnaopaku {
    public static void main(String[] args) {
        String inStr;        // input String
        int inStrLen;        // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read a String
        inStrLen = inStr.length();

        // Use inStr.charAt(index) in a loop to extract character at "index" from inStr
        // The String's index begins at 0 from the left.
        char [] niza = inStr.toCharArray();
        for (int i = inStrLen - 1; i >= 0; --i) {  // Process the String from the right
            System.out.print(niza[i]);
        }
    }
}
