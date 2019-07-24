public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();
        // isUnique1 - data structures allowed...
        System.out.println(problems.isUnique1("abc"));  // return true
        System.out.println(problems.isUnique1("abbc")); // return false
        // isUnique2 - no data structures allowed...
        System.out.println(problems.isUnique2("abc"));  // return true
        System.out.println(problems.isUnique2("abbc")); // return false
    }
}
