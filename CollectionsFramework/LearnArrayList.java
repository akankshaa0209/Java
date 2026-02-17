package CollectionsFramework;
//dynamic arrays,
//array size dynamic
//implements list

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        //ARRAY
//        String[] rollNo = new String[30];
//        rollNo[0]="abc";
//        rollNo[29]="xyz";

        //ARRAYLIST : java.util
        ArrayList<String> rollNo = new ArrayList<>(); //empty array
        rollNo.add("abc"); //10 size internal array created
        //as we add more(say 11th): n+ n/2 + 1
        //copies old into new arr and dumps old one

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4); //O(N)//will add 4 at end of list
        System.out.println(list);

        list.add(1, 50); //method overloading
        System.out.println(list);

        //adding new list in current list
        List<Integer> newList = new ArrayList<>();
        newList.add(15);
        newList.add(16);

        list.addAll(newList);
        System.out.println(list);

        //get
        System.out.println(list.get(1));

        //remove O(N)
        list.remove(1); //index
        System.out.println(list);

        list.remove(Integer.valueOf(16));
        System.out.println(list);

        //clear
//        list.clear();
//        System.out.println(list);

        //set: to update O(1)
        list.set(2, 100);
        System.out.println(list);

        System.out.println(list.contains(100)); //O(N)

        //size
        System.out.println(list.size());

        //iterate
        for (int i = 0; i < list.size(); i++) {
            System.out.println("elements " + list.get(i));
        }

        //for each
        for (Integer ele : list) {
            System.out.println("elements " + ele);
        }

        //every collections framework has an iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator " + it.hasNext());
        }
    }
}
