package CollectionsFramework;

//want to give priority to ele, customized
//implemented by queue

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPQ {
    public static void main(String[] args){

        //MIN HEAP: smallest at top
        //min ele at the top
        //Queue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        //MAX HEAP
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(40);
        pq1.offer(12);
        pq1.offer(24);
        pq1.offer(36);
        System.out.println(pq1);

        pq1.poll();
        System.out.println(pq1);

        System.out.println(pq1.peek());
    }
}
