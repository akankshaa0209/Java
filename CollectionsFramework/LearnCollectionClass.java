package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(21);
        list.add(12);
        list.add(73);
        list.add(62);
        list.add(11);
        list.add(14);
        list.add(20);

        System.out.println("min element is " + Collections.min(list));
        System.out.println("min element is " + Collections.max(list));
        System.out.println(Collections.frequency(list, 14));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
