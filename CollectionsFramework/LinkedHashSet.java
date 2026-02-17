package CollectionsFramework;
//unique
//follows set: no dupilcates allowed

//generates hash of each ele internally, which is put into collection
//check each hash is unique for each ele

//set as well as linked list(order maintained)

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    static void main(String[] args) {
        Set<Integer> set = new java.util.LinkedHashSet<>();

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
