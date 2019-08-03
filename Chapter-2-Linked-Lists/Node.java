public class Node<T> {
    private T data;
    public Node next;
    public Node() {
        this.data = null;
        next = null;
    }
    public Node(T val) {
        this.data = val;
        next = null;
    }
    public T get() {
          return data;
    }
    public void set(T val) {
          this.data = val;
    }
    public void print() {
          System.out.print(this.data + " ");
    }
}
