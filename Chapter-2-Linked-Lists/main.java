public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.test();
        LinkedList<Integer> list = new LinkedList<>();
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);

        // 1.1 removeDuplicates - data structures allowed...
        System.out.println("\n1.1 removeDuplicates1");
        problems.removeDuplicates1(list);
        list.print();

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
