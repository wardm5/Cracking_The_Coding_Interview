import java.util.*;
public class Problems {
    public void test() {
        System.out.println("this works! " );
    }
    public void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        Node<Integer> temp = list.getHead();
        Node prior = null;
        while (temp != null) {
            if (set.contains(temp.get())) {
                prior.next = temp.next;
                temp = temp.next;
            } else {
                set.add(temp.get());
                prior = temp;
                temp = temp.next;
            }
        }
    }
}
