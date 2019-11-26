public class main {
    public static void main(String[] args) {
        Problems problems = new Problems();
        // LinkedList setup
        LinkedList<Integer> list = setupList();

        // 1.1 removeDuplicates1 - data structures allowed...
        System.out.println("\n1.1 removeDuplicates1");  // takes O(n) time due to going through entire list once.
        problems.removeDuplicates1(list);  // 1 2 3
        list.print();

        // 1.1 removeDuplicates2 - no data structures allowed...
        list = setupList();
        System.out.println("\n1.1 removeDuplicates2");  // takes O(n) time due to going through entire list once.
        problems.removeDuplicates2(list);    // 1 2 3
        list.print();

        list = setupList();
        System.out.println("\n1.2. kthFromLast");
        Node<Integer> temp = problems.kthFromLast(list, 4);
        System.out.println(temp.get());
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
    private static LinkedList<Integer> setupList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        return list;
    }
}
