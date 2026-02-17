package LinkedList;

public class Basics {

    private Node head;
    private Node tail;

    private int size;

    public Basics(){
        this.size=0;
    }

    class Node{
        private int value;
        private Node next;

        //constructor
        public Node(int value) {
            this.value= value;
        }

        //constructor
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }

    /// 1============
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){ //empty
            tail= head;
        }

        size += 1;
    }

    public void insertNoTail(int val){ //O(N), with tail 1
        Node node= new Node(val);
        // If list is empty
        if (head == null) {
            head = node;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
    }

    //get length of ll
    public int sizeOfList(){
        Node temp=head;
        int len=0;
        while(temp != null){
            temp=temp.next;
            len++;
        }
        return len;
    }

    /// // 2 =======
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    /// / 3 ===========
    public void insertLast(int val) {
        //benefit of using tail is O(1), otherwise will go till head.next = null then indert there.O(n)
        if (tail == null) {
//            insertAtFirst(val);
            Node node = new Node(val);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node = new Node(val); //O(1)
        tail.next = node;
        tail = node;
        size++;
    }

    /// / 4 ============
    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;  //0th
        for (int i = 1; i < index; i++) { //go till index-1
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next=temp.next;
        temp.next = node;

        size++;
    }

    //insert with tail
    public void insertNoTail(int val, int index) {

        Node node = new Node(val);

        // Insert at head
        if (index == 0) {
            node.next = head;
            head = node;
            return;
        }

        Node curr = head;

        // Move to node before index
        for (int i = 0; i < index - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Index out of bounds
        if (curr == null) {
            throw new IndexOutOfBoundsException();
        }

        node.next = curr.next;
        curr.next = node;
    }


    /// / 5 ===============
    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    /// / 10============
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
            //if no tail: throw new RuntimeException("List is empty");
        }
        size--;
        return val;
    }

    /// / 6 =========== O(N)
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteLastNoTail() {

        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        // Only one node
        if (head.next == null) {
            int val = head.value;
            head = null;
            return val;
        }

        Node curr = head;

        // Stop at second-last node
        while (curr.next.next != null) {
            curr = curr.next;
        }

        int val = curr.next.value;
        curr.next = null;

        return val;
    }


    /// / 7 ================== O(n)
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next  = prev.next.next;
        size--;
        return val;
    }

    public int deleteFromEnd(int n){
        int index = size - n;   // convert from end → from start

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    /// / 8=========
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    /// / 9 ==============
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }





    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    public static Basics merge(Basics first, Basics second) {
        Node f = first.head;
        Node s = second.head;

        Basics ans = new Basics();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // recursion reverse
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }


    public static void main(String[] args) {
        Basics first = new Basics();
        Basics second = new Basics();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        Basics ans = Basics.merge(first, second);
        ans.display();

        Basics list = new Basics();
        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();

    }



}
