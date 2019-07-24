import java.util.*;
public class Problems {
    public void test() {
        System.out.println("This test works! ");
    }
    /*
        isUnique1 - Run time of O(n)
        if not allowed additional datastructures such as Set
    */
    public boolean isUnique1(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i)))
                return false;
            set.add(str.charAt(i));
        }
        return true;
    }
    /*
        isUnique2 - Run time of O(n)
        if allowed additional datastructures such as Set
    */
    public boolean isUnique2(String str) {
        boolean[] arr = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            int index =  temp;
            if (arr[index])
                return false;
            arr[index] = true;
        }
        return true;
    }
}
