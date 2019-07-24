import java.util.*;
public class Problems {
    public void test() {
        System.out.println("This test works! ");
    }
    /*
        isUnique1 - Run time of O(n)
        This method goes through a string and determines if any characters are
        repeated or not.

        Note:  if not allowed additional datastructures such as Set
    */
    public boolean isUnique1(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i)))
                return false;
            set.add(str.charAt(i));
        }
        return true;
    }

    /*
        isUnique2 - Run time of O(n)
        This method goes through a string and determines if any characters are
        repeated or not.

        Note:  if allowed additional datastructures such as Set
    */
    public boolean isUnique2(String str) {
        boolean[] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            int index =  temp;
            if (arr[index])
                return false;
            arr[index] = true;
        }
        return true;
    }

    /*
        checkPermutation - Run time of O(n)
        This method checks two strings to see if they are permutations of each`
        other and returns a boolean if they are or not.
    */
    public boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length())  // imediate check if string is not the same length, obviously false
            return false;
        // null check as well
        int[] arr = new int[256];  // ascii
        for (int i = 0; i < str1.length(); i++) {  // for all chars in the first list
            char temp = str1.charAt(i);            // get the char at the index
            int index = temp;                       // get the int val for the char
            arr[index] = arr[index] + 1;            // increase an array at that index by 1
        }
        for (int i = 0 ; i < str1.length(); i++) {  // for all values in the second string
            char temp = str2.charAt(i);             // get the char at the index
            int index = temp;                       // get the val for that char
            arr[index] = arr[index] - 1;            // decrement the array at the index by 1
            if (arr[index] < 0)                     // if the string has incorrect amount of letters,
                return false;                       // the array should have -1, which will return false
        }
        return true;        // else return true
    }

    // /*
    //     URLify - Run time of O(n)
    //     This method checks two strings to see if they are permutations of each`
    //     other and returns a boolean if they are or not.
    // */
    // public char[] URLify(String str, int trueLength) {
    //     int curr = trueLength - 1;
    //     for (int i = curr; i >= 0; i--) {
    //         char temp = arr[i];
    //         if (temp == ' ') {
    //
    //         }
    //
    //     }
    // }



    /*
        checkPermutation - Run time of O(n)
        This method checks two strings to see if they are permutations of each`
        other and returns a boolean if they are or not.
    */
    public boolean stringRotation(String str1, String str2) {
        String temp = str2 + str2;
        return temp.contains(str1);
    }
}
