package CollectionsFramework;
//unique
//follows set: no dupilcates allowed
//no order defined, random

//O(N)

//generates hash of each ele internally, which is put into collection
//check each hash is unique for each ele

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

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
