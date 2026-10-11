import org.w3c.dom.Node;

public class Queue<genericType>{
    // Nested Class
    public class Node<Type>{
        private Type value;
        private Node<Type> next;

        public Node(Type element, Node<Type> next){
            this.value = element;
            this.next = next;
        }
    }

    // Queue Attributes
    private Node<genericType> head = null;
    private Node<genericType> tail = null;
    private int size = 0;


    public void enqueue(genericType element){
        if (head == null){
            head = new Node<genericType>(element, null);
            tail = head;
            size++;
        }
        else {
            tail.next = new Node<>(element, null);
            tail = tail.next;
            size++;
        }
    }

    public genericType dequeue(){
        if (isEmpty()){
            return null;
        }

        genericType temp = head.value;
        head = head.next;
        size--;
        return temp;
    }

    public genericType peek(){
        return head.value;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }
    public void clear(){
        head = null;
        tail = null;
    }
    public void printQueue(){
        Node<genericType> current = head;
        System.out.println("Queue (Left to Right):");
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        queue.printQueue();

        System.out.println();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
    }
}