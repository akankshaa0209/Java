package CollectionsFramework;
//doubly ended queue
//used in sliding window
//implements queue

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();

//        ad.offer(23); //appends at last
//        ad.offer(12);
//        ad.offer(45);
//        System.out.println(ad); //[23, 12, 45]

        ad.offer(23); //appends at last
        ad.offerFirst(12); //at first
        ad.offerLast(45); //appends at last
        ad.offer(26);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        //removes top (head) and return
        System.out.println(ad.poll());
        System.out.println("poll" + ad);

        System.out.println(ad.pollFirst());
        System.out.println("pollfisrt" + ad);

        System.out.println(ad.pollLast());
        System.out.println("pollLast" + ad);
    }
}

//Implement stack using arraydeque
//offer
//polllast (to remove lastele)
