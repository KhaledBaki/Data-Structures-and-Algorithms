public class SinglyLinkedList<genericType>{
    private SinglyLinkedListNode<genericType> head;
    private SinglyLinkedListNode<genericType> tail;
    private int size;

    // Create empty list
    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    // Add first
    public void addFirst (genericType nodeValue){
        
        // Empty list condition
        if (head == null && tail == null){
            head = new SinglyLinkedListNode<genericType>(nodeValue);
            tail = head;
            size++;
            return;
        }

        // Every other condition
        SinglyLinkedListNode firstNode = new SinglyLinkedListNode<genericType>(nodeValue);
        firstNode.setNext(head);
        head = firstNode;
        size++;
    }

    // Add last
    public void addLast (genericType nodeValue){
        // Empty list condition
        if (head == null && tail == null){
            head = new SinglyLinkedListNode<genericType>(nodeValue);
            tail = head;
            size++;
            return;
        }

        // Every other condition
        SinglyLinkedListNode lastNode = new SinglyLinkedListNode<genericType>(nodeValue);
        tail.setNext(lastNode);
        tail = lastNode;
        size++;
    }

    // delete last
    public void deleteLast(){
        // Empty list condition
        if (head == null && tail == null){
            return;
        }

        // Single node case
        else if (head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }
        
        // Iterative case (Cons of the singly linked list)
        SinglyLinkedListNode current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        tail = current;
        size--;
    }

    // Print out list in order
    public void printList(){
        SinglyLinkedListNode current = head;

        while (current != null){
            System.out.print(current.getVal() + " -> ");
            current = current.getNext();
        }
        System.out.print("NULL");
    }

    // Reverse linked list - Three pointer solution
    public void reverseLinkedList(){
        if (size() <= 0){
            return;
        }

        SinglyLinkedListNode<genericType> prev = null;
        SinglyLinkedListNode<genericType> current = head;
        SinglyLinkedListNode<genericType> next = head.getNext();

        while (next != null){
            current.setNext(prev);
            prev = current;
            current = next;
            next = next.getNext();
        }
        current.setNext(prev);
        head = current;
    }

    // get list size
    public int size(){
        return this.size;
    }
}