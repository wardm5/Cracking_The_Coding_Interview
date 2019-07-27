public class LinkedList<T> {
    private int count;
    public Node head;
    /*
     *  Constructor for Linked List (no parameter/data)
     */
    public LinkedList() {
        head = null;
        count = 0;
    }
    /*
     *  Constructor for Linked List (parameter)
     */
    public LinkedList(T data) {
        head = new Node(data);
        count = 1;
    }
    /*
     *  Add to Tail
     */
    public boolean addToTail(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        count++;
        return true;
    }
    /*
     *  Add to Head
     */
    public boolean addToHead(T data) {
        if (head == null) {
            head = new Node(data);
            return true;
        }
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        return true;
    }
    /*
     *  Print
     */
    public void print() {
        Node temp = head;
        while (temp != null) {
            temp.print();
            temp = temp.next;
        }
        System.out.println();
    }
    /*
     *  Remove
     */
    public boolean remove(T data) {
        if (head == null)
            return false;
        Node prior = null;
        Node temp = head;
        while (temp.next != null) {
            if (temp.get() == data && prior == null) {
                head = temp.next;
                return true;
            } else if (temp.get() == data) {
                prior.next = temp.next;
                return true;
            } else {
                System.out.println(temp.get() + " testing");
                prior = temp;
                temp = temp.next;
            }
        }
        return false;
    }
    /*
     *  Contains
     */
    public boolean contains(T data) {
        if (head == null)
            return false;
        Node temp = head;
        while (temp != null) {
            if (temp.get() == data)
                return true;
            temp = temp.next;
        }
        return false;
    }
    /*
     *  isEmpty
     */
    public boolean isEmpty() {
        return (count == 0);
    }
    /*
     *  clear()
     */
     public void clear() {
         this.count = 0;
         this.head = null;
     }
}
