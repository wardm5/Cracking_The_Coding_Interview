public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();
        // 1.1 isUnique1 - data structures allowed...
        System.out.println("1.1 isUnique1");
        System.out.println(problems.isUnique1("abc"));  // return true
        System.out.println(problems.isUnique1("abbc")); // return false
        // 1.1 isUnique2 - no data structures allowed...
        System.out.println("1.1 isUnique2");
        System.out.println(problems.isUnique2("abc"));  // return true
        System.out.println(problems.isUnique2("abbc")); // return false
        // 1.2 checkPermutation
        System.out.println("1.2 checkPermutation");
        System.out.println(problems.checkPermutation("abc", "ab")); // false
        System.out.println(problems.checkPermutation("abc", "cab")); // true
        System.out.println(problems.checkPermutation("abc", "caz")); // false
        // 1.3 URLify


        // 1.4 palindromePermutation


        // 1.5 oneAway


        // 1.6 stringCompression


        //  1.7 rotateMatrix


        // 1.8 zeroMatrix


        // 1.9 stringRotation
        System.out.println("1.2 stringRotation");
        System.out.println(problems.stringRotation("waterbottle", "erbottlewat")); // true


    }
}
