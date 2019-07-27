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

        // 1.3 URLify
        System.out.println("\n1.3 URLify");
        String test = "Mr John Smith    ";
        System.out.println(problems.URLify1(test, 13)); // false
        char[] testArray = new char[test.length()];
        for (int i = 0 ; i < test.length(); i++) {
            testArray[i] = test.charAt(i);
        }
        System.out.println(problems.URLify2(testArray, 13)); // true

        // 1.4 palindromePermutation


        // 1.5 oneAway


        // 1.6 stringCompression


        //  1.7 rotateMatrix


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
