public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();

        // 1.1 isUnique1 - data structures allowed...
        System.out.println("\n1.1 isUnique1");
        System.out.println(problems.isUnique1("abc"));  // return true
        System.out.println(problems.isUnique1("abbc")); // return false

        // 1.1 isUnique2 - no data structures allowed...
        System.out.println("\n1.1 isUnique2");
        System.out.println(problems.isUnique2("abc"));  // return true
        System.out.println(problems.isUnique2("abbc")); // return false

        // 1.2 checkPermutation
        System.out.println("\n1.2 checkPermutation");
        System.out.println(problems.checkPermutation("abc", "ab")); // false
        System.out.println(problems.checkPermutation("abc", "cab")); // true
        System.out.println(problems.checkPermutation("abc", "caz")); // false

        // 1.3 URLify1 - not in place
        System.out.println("\n1.3 URLify");
        String test = "Mr John Smith    ";
        System.out.println(problems.URLify1(test, 13)); // Mr%20John%20Smith

        // 1.3 URLify2 - in place
        char[] testArray = new char[test.length()];
        for (int i = 0 ; i < test.length(); i++) {
            testArray[i] = test.charAt(i);
        }
        System.out.println(problems.URLify2(testArray, 13)); // Mr%20John%20Smith

        // 1.4 palindromePermutation
        System.out.println("\n1.4 palindromePermutation");
        System.out.println(problems.palindromePermutation("taco cat"));  // true
        System.out.println(problems.palindromePermutation("acto cta"));  // true
        System.out.println(problems.palindromePermutation("asto cta"));  // false
        System.out.println(problems.palindromePermutation("cac"));  // true
        System.out.println(problems.palindromePermutation("cca"));  // true

        // 1.5 oneAway
        // problems.oneAway();

        // 1.6 stringCompression
        System.out.println("\n1.4 stringCompression");
        System.out.println(problems.stringCompression("aabcccccaaa"));  //  a2b1c5a3
        System.out.println(problems.stringCompression("abcdefg"));      //  abcdefg

        //  1.7 rotateMatrix
        // problems.rotateMatrix();

        // 1.8 zeroMatrix
        System.out.println("\n1.2 zeroMatrix");
        int[][] matrix = new int[][] {{0, 1, 1}, {1, 1, 1}, {0, 1, 1}};
        problems.zeroMatrix(matrix);
        printMatrix(matrix);    // {{0 0 0}, {0 1 1}, {0 0 0}}

        // 1.9 stringRotation
        System.out.println("\n1.2 stringRotation");
        System.out.println(problems.stringRotation("waterbottle", "erbottlewat")); // true
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
