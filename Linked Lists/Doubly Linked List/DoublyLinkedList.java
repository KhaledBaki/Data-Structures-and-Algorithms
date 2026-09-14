public class DoublyLinkedList<genericType> {

    // Head
    private DoublyLinkedListNode<genericType> head;

    // Tail
    private DoublyLinkedListNode<genericType> tail;

    // Constructor
    public DoublyLinkedList(int size) {
        if (size <= 0 ) {
            head = null;
            tail = null;
        }
        else {
            // First node
            head = new DoublyLinkedListNode(0); 
            tail = head;

            // Add remaining nodes
            for (int i = 1; i < size; i++) {
                DoublyLinkedListNode node = new DoublyLinkedListNode(i);
                tail.setNext(node);
                node.setPrev(tail);
                tail = tail.getNext();
            }
        }
    }
    
    public void print() {
        DoublyLinkedListNode<genericType> current = head;

        // go through all the nodes
        while(current != null){
            System.out.print(current.getVal());

            // Move cursor
            current = current.getNext();
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head != null){

            // one node case
            if (head == tail){
                head = null;
                tail = null;
            }

            // more than one node
            else{
                head = head.getNext();
                head.setPrev(null);
            }
        }
    }

    public void deleteLast() {
        if (head != null){

            // one node case
            if (head == tail){
                head = null;
                tail = null;
            } 
            
            // more than one node
            else{
                tail = tail.getPrev();
                tail.setNext(null);
            }
        }
    }

    // create and display a linked list
    public static void main(String [] args){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>( 5 );
        
        list.print();
        
        list.deleteFirst();

        list.print();
        
        for (int i = 0; i < 5; i++ ){
            list.deleteLast();
            list.print();
        }
    }
}
