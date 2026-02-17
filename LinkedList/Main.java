package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(23);
//        System.out.println(list);

//        Basics list = new Basics();
//        list.insertAtFirst(3);
//        list.insertAtFirst(2);
//        list.insertAtFirst(8);
//        list.insertAtFirst(17);
//        list.display();
//        int ans= list.sizeOfList();
//        System.out.println(ans);
//        list.insertLast(99);
////        list.insertLast(90);
////        list.insert(100, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.deleteFromEnd(2));
//        list.insertRec(88, 2);
//        list.display();

                DoublyLL list = new DoublyLL();
        list.insertFirst(31);
        list.insertFirst(20);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(8, 65);

        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();


    }
}
