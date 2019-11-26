package cracking.chapter1.test;
import cracking.chapter1.src.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
public class UnitTest {
    public static void runTests() {
        ArraysAndStrings chap1 = new ArraysAndStrings();

        // 1.1 isUnique1 - data structures allowed...
        System.out.println("\n1.1 isUnique1");
        System.out.println(chap1.isUnique1("abc"));  // return true
        System.out.println(chap1.isUnique1("abbc")); // return false

        // 1.1 isUnique2 - no data structures allowed...
        System.out.println("\n1.1 isUnique2");
        System.out.println(chap1.isUnique2("abc"));  // return true
        System.out.println(chap1.isUnique2("abbc")); // return false

        // 1.2 checkPermutation
        System.out.println("\n1.2 checkPermutation");
        System.out.println(chap1.checkPermutation("abc", "ab")); // false
        System.out.println(chap1.checkPermutation("abc", "cab")); // true
        System.out.println(chap1.checkPermutation("abc", "caz")); // false

        // 1.3 URLify1 - not in place
        System.out.println("\n1.3 URLify");
        String test = "Mr John Smith    ";
        System.out.println(chap1.URLify1(test, 13)); // Mr%20John%20Smith

        // 1.3 URLify2 - in place
        char[] testArray = new char[test.length()];
        for (int i = 0 ; i < test.length(); i++) {
            testArray[i] = test.charAt(i);
        }
        System.out.println(chap1.URLify2(testArray, 13)); // Mr%20John%20Smith

        // 1.4 palindromePermutation
        System.out.println("\n1.4 palindromePermutation");
        System.out.println(chap1.palindromePermutation("taco cat"));  // true
        System.out.println(chap1.palindromePermutation("acto cta"));  // true
        System.out.println(chap1.palindromePermutation("asto cta"));  // false
        System.out.println(chap1.palindromePermutation("cac"));  // true
        System.out.println(chap1.palindromePermutation("cca"));  // true

        // 1.5 oneAway
        // chap1.oneAway();

        // 1.6 stringCompression
        System.out.println("\n1.4 stringCompression");
        System.out.println(chap1.stringCompression("aabcccccaaa"));  //  a2b1c5a3
        System.out.println(chap1.stringCompression("abcdefg"));      //  abcdefg

        //  1.7 rotateMatrix
        // chap1.rotateMatrix();

        // 1.8 zeroMatrix
        System.out.println("\n1.2 zeroMatrix");
        int[][] matrix = new int[][] {{0, 1, 1}, {1, 1, 1}, {0, 1, 1}};
        chap1.zeroMatrix(matrix);
        printMatrix(matrix);    // {{0 0 0}, {0 1 1}, {0 0 0}}

        // 1.9 stringRotation
        System.out.println("\n1.2 stringRotation");
        System.out.println(chap1.stringRotation("waterbottle", "erbottlewat")); // true
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
