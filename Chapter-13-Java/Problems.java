import java.util.*;
public class Problems {
    // just a simple test method
    public void test() {
        System.out.println("This test works! ");
    }

    /*
        isUnique1 - Run time of O(n)
        This method goes through a string and determines if any characters are
        repeated or not.

        Note:  if not allowed additional datastructures such as Set
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

}
