package CollectionsFramework;
//fifo, ifc
//back=rear=addition
//front=front=deletion
//can be implemented using array, arraylist as well as linked list, pq

//queue ifc includes all methods of Collection ifc cz Collection is a
//super ifc of queue.

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){

        //using LinkedList
        //linkedlist using queue
        Queue<Integer> queue = new LinkedList<>();
        //add(ret true/false //GOOD TO USE
        queue.offer(12);
        queue.offer(14);
        queue.offer(16);
        System.out.println(queue);

        //remove the frontmost
        System.out.println(queue.poll());
        System.out.println(queue); //12 polled/removed

        //return the head, if empty returns null //GOOD TO USE
        System.out.println(queue.peek());

        //add, if not added throws exception
        queue.add(18);
        System.out.println(queue);

        //returns the head of queue, if empty=exception throw
        System.out.println(queue.element());

    }
}
