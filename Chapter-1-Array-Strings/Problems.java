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

    /*
        URLify - Run time of O(n)
        This method takes a string and length and changes spaces in the string
        to %20 so that the string can work as a URL.

        Note: not in place...
    */
    public String URLify1(String s, int length) {
        if (s == null || s.isEmpty()) {
            return "";
        }
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
                count = count + 1;
            }
        }
        return String.valueOf(result);
    }

    /*
        URLify - Run time of O(n)
        This method takes a string and length and changes spaces in the string
        to %20 so that the string can work as a URL.

        Note: not in place...
    */
    public String URLify2(char[] str, int length) {
        int end = length - 1;
        int curr = length - 1;
        // gets from the end to the first character
        while (str[curr] == ' ') {
            curr--;
        }
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
        return str.toString();
    }

    /*
        zeroMatrix - Run time of O(M*N)
        This method takes in an matrix and for any item in the matrix that is 0, it will
        update the row and column for that item to 0's.
    */
    public void zeroMatrix(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[][] copy = matrix.clone();
        for (int i = 0; i < matrix.length; i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (copy[i][j] == 0) {
                    subList.add(i);
                    subList.add(j);
                    list.add(subList);
                }
            }
        }
        fill(list, matrix);
    }
    // private void fill(int i, int j, int[][] matrix) {
    //     for (int y = 0; y < matrix.length; y++) {
    //         matrix[y][j] = 0;
    //     }
    //     for (int x = 0; x < matrix[0].length; x++) {
    //         matrix[i][x] = 0;
    //     }
    // }
    private void fill(ArrayList<ArrayList<Integer>> list, int[][] matrix) {
        for (int z = 0; z < list.size(); z++) {
            int i = list.get(z).get(0);
            int j = list.get(z).get(1);
            for (int y = 0; y < matrix.length; y++) {
                matrix[y][j] = 0;
            }
            for (int x = 0; x < matrix[0].length; x++) {
                matrix[i][x] = 0;
            }
        }
    }

    /*
        stringRotation - Run time of O(1)
        This method checks if a second string is a rotation of the first string.
    */
    public boolean stringRotation(String str1, String str2) {
        String temp = str2 + str2;
        return temp.contains(str1);
    }
}
