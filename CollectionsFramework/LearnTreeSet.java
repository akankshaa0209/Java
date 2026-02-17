package CollectionsFramework;
//unique
//implememts bst
//sorted

//logn

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        set.add(54);

        System.out.println(set);

        System.out.println(set.size());

        set.remove(54);
        System.out.println(set);

        System.out.println(set.contains(100)); //false

        System.out.println(set.isEmpty()); //false

        set.clear();
        System.out.println(set);
    }
}
