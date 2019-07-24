import java.util.*;
public class Problems {
    public void test() {
        System.out.println("This test works! ");
    }
    // if allowed additional datastructures such as Set
    public boolean isUnique1(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i)))
                return false;
            set.add(str.charAt(i));
        }
        return true;
    }
    // public isUnique2() {
    //
    // }
}
