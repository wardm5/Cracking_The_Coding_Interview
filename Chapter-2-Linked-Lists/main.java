import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.println("hi");
        Problems problems = new Problems();
        problems.test();
        LinkedList<Integer> list = new LinkedList<>();
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        problems.removeDuplicates(list);
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
