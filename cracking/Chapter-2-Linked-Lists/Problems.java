import java.util.*;
public class Problems {
    public void test() {
        System.out.println("this works! " );
    }

    public void removeDuplicates1(LinkedList<Integer> list) {
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
    public void removeDuplicates2(LinkedList<Integer> list) {
        Node<Integer> temp = list.getHead();
        Node prior = null;
        while (temp != null) {
            int val = temp.get();
            Node<Integer> curr = temp.next;
            Node currPrior = temp;
            while (curr != null) {
                if (curr.get() == val) {
                    currPrior.next = curr.next;
                    curr = curr.next;
                } else {
                    currPrior = curr;
                    curr = curr.next;
                }
            }
            prior = temp;
            temp = temp.next;
        }
    }
    // public Node<Integer> kthFromLast(LinkedList<Integer> list, int k) {
    //     Node<Integer> first = list.getHead();
    //     Node<Integer> middle = list.getHead();
    //     Node<Integer> last = list.getHead();
    //     int count1 = 0;
    //     int count2 = 0;
    //     while (last != null) {
    //         last = last.next.next;
    //         middle = middle.next;
    //         count1 += 2;
    //         count2 += 1;
    //         if (k == 0 && last.next == null)
    //             return last;
    //         else
    //             return last.next;
    //
    //     }
    //     System.out.println(count1 + "   " + count2);
    //     return curr;
    // }
    public Node<Integer> kthFromLast(LinkedList<Integer> list, int k) {

    }
}
