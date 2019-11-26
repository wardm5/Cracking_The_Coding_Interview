package cracking.chapter1.src;
import java.util.*;
public class ArraysAndStrings {
    // just a simple test method
    public static void test() {
        System.out.println("This test works! ");
    }

    /*
        isUnique1 - Run time of O(n)
        This method goes through a string and determines if any characters are
        repeated or not.

        Note:  if not allowed additional datastructures such as Set
    */
    public static boolean isUnique1(String str) {
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
    public static boolean isUnique2(String str) {
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
    public static boolean checkPermutation(String str1, String str2) {
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

    /*
        URLify - Run time of O(n)
        This method takes a string and length and changes spaces in the string
        to %20 so that the string can work as a URL.

        Note: not in place
    */
    public static String URLify1(String s, int length) {
        if (s == null || s.isEmpty())
            return "";
        int count = 0;
        char[] result = new char[s.length()];
        for (int i = 0; i < length; i ++) {
            if (s.charAt(i) == ' ') {
                result[count] = '%';
                result[count + 1] = '2';
                result[count + 2] = '0';
                count = count + 3;
            } else {
                result[count] = s.charAt(i);
                count++;
            }
        }
        return String.valueOf(result);
    }

    /*
        URLify - Run time of O(n)
        This method takes a string and length and changes spaces in the string
        to %20 so that the string can work as a URL.

        Note: in place
    */
    public static String URLify2(char[] str, int length) {
        int end = str.length - 1;
        int curr = length - 1;
        while (curr >= 0) {
            char temp = str[curr];
            if (temp == ' ') {
                str[end] = '0';
                str[end - 1] = '2';
                str[end -2] = '%';
                end -= 3;
            } else {
                str[end] = temp;
                end--;
            }
            curr--;
        }
        return String.valueOf(str);
    }

    /*
        palindromePermutation - Run time of O(n)
        This method takes in a string and determines if that string is a palindrone permutation, that is
        if the string could be a palindrone or not.
    */
    public static boolean palindromePermutation(String str1) {
        int oddCount = 0;                               // initalize odd count
        int[] arr = new int[256];                       // initlaize array to keep track of characters
        for (int i = 0 ; i < str1.length(); i++) {      // for each character in string
            char temp = str1.charAt(i);                 // set temp char
            int val = temp;                             // set val for that char (ascii val)
            if (temp == ' ')  continue;                 // if temp is space, then continue loop
            arr[val] = arr[val] + 1;                    // otherwise, increment that char in the array
            if (arr[val] % 2 != 0) oddCount++;          // if the value for that char is odd, then increase odd counter
            else oddCount--;                            // else decrement odd counter
        }
        return !(oddCount > 1);         // if odd counter is greater than 1, then it cannot be a palindrone permutation
    }

    /*
        stringCompression - Run time of
        This method takes in a string and then either compresses it by noting how many characters were typed
        or provide the orginal string if that was shorter than the 'compressed version'
    */
    public static String stringCompression(String str) {
        // null check
        StringBuilder builder = new StringBuilder();        //  create string builder for efficent string concatination
        int count = 0;                                      // initalize count
        char prior = str.charAt(0);                         // initalize character to first char in string
        for (int i = 1 ; i < str.length(); i++) {           // for all chars in string
            if (str.charAt(i) != prior) {                   // if the current charcter is different than the prior one
                builder.append(prior).append(count + 1);    // add prior char to the string builder with the count + 1
                prior = str.charAt(i);                      // set current char to the currnet character
                count = 0;                                  // set count to 0
            } else if (i == str.length() - 1) {             // if on the last char in the string
                builder.append(prior).append(count + 2);    // the builder adds the last char plus the count + 2
            } else {
                count++;             // else increase count
            }
        }
        String temp = builder.toString();   // convert StringBuilder to string
        if (temp.length() < str.length())   // check if orignal string is longer than the compressed string
            return temp;        // if compressed is less, return compressed version
        return str;             // else return orginal
    }

    /*
        zeroMatrix - Run time of ~O(M*N)
        This method takes in an matrix and for any item in the matrix that is 0, it will
        update the row and column for that item to 0's.
    */
    public static void zeroMatrix(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  // creates array of array of integers to store coordinates
        for (int i = 0; i < matrix.length; i++) {               // go through each point in matrix
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {                        // if the point in the matrix contains 0...
                    ArrayList<Integer> subList = new ArrayList<>();     // create ArrayList to store point values
                    subList.add(i);  // add y
                    subList.add(j);  // add x
                    list.add(subList);  // add these points to the array containing points
                }
            }
        }
        fill(list, matrix);         // helper method to fill in the matrix
    }
    private static void fill(ArrayList<ArrayList<Integer>> list, int[][] matrix) {
        for (int z = 0; z < list.size(); z++) {     // for all arrays in the ArrayList
            int i = list.get(z).get(0);             // get the y value
            int j = list.get(z).get(1);             // get the x value
            for (int y = 0; y < matrix.length; y++) {   // for all y values
                matrix[y][j] = 0;                   // place 0 at the x and y value
            }
            for (int x = 0; x < matrix[0].length; x++) {  // for all x values
                matrix[i][x] = 0;                   //  place 0 at the x and y value
            }
        }
    }

    /*
        stringRotation - Run time of O(1)
        This method checks if a second string is a rotation of the first string.
    */
    public static boolean stringRotation(String str1, String str2) {
        String temp = str2 + str2;
        return temp.contains(str1);
    }
}
