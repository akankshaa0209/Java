package CollectionsFramework;
//keys must be unique
//n

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();

        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        System.out.println(mp);
        //mp.put("two",23); will override 2

//        if(!mp.containsKey("two")) {  //no override
//            mp.put("two", 23);
//        }
//        System.out.println(mp);
        //or
//        mp.putIfAbsent("two", 23);
//        System.out.println(mp);

        System.out.println(mp.containsValue(3));
        System.out.println(mp.containsKey("one"));

        System.out.println(mp.isEmpty());

        mp.remove("three");
        System.out.println(mp);

//        mp.clear();

        //iterate
//        for(Map.Entry<String,Integer> e:mp.entrySet()){
//            System.out.println(e); //one=1
//            System.out.println(e.getKey()); //one
//            System.out.println(e.getValue()); //1
//        }

        //iterate only over keys
//        for (String key:mp.keySet()){
//            System.out.println(key);
//        }

//        for (Integer val:mp.values()){
//            System.out.println(val);
//        }

    }
}
