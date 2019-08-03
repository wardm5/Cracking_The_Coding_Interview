public class main {
    public static void main(String[] args) {
        System.out.println("hi");
        Problems problems = new Problems();
        problems.test();
        write(reverse("testing yo, this should work!"));
    }
    private static void write(String input) {
        System.out.println(input);
    }
    private static String reverse(String str) {
        StringBuilder build = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++ ) {
            build.insert(0, str.charAt(i));
        }
        return build.toString();
    }
}
