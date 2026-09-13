public class DoublyLinkedList {

    // Head
    private DoublyLinkedListNode doublyLinkedList;

    // Tail
    private DoublyLinkedListNode tail;

    public DoublyLinkedList(int size) {
        if (size <= 0 ) {
            doublyLinkedList = null;
            tail = null;
        }
        else {

            // First node
            doublyLinkedList = new DoublyLinkedListNode(0); 

            tail = doublyLinkedList;

            for (int i = 1; i < size; i++) {
                DoublyLinkedListNode node = new DoublyLinkedListNode(i);
                tail.setNext(node);
                node.setPrev(tail);
                tail = tail.getNext();
            }

        }
    }
    
    public void print() {
        DoublyLinkedListNode current = doublyLinkedList;

        // go through all the nodes
        while(current != null){
            System.out.print(current.getVal());
            current = current.getNext();
        }
        System.out.println();
    }

    public void deleteFirst() {

        if (doublyLinkedList != null){

            // one node case
            if (doublyLinkedList == tail){
                doublyLinkedList = null;
                tail = null;
            
            // more than one node
            } else{
                doublyLinkedList = doublyLinkedList.getNext();
                doublyLinkedList.setPrev(null);
            }
        }
    }

    public void deleteLast() {
        if (doublyLinkedList != null){

            // one node case
            if (doublyLinkedList == tail){
                doublyLinkedList = null;
                tail = null;
            
            // more than one node
            } else{
                tail = tail.getPrev();
                tail.setNext(null);
            }
        }
    }

    // create and display a linked list
    public static void main(String [] args){
        DoublyLinkedList list = new DoublyLinkedList( 5 );
        
        list.print();
        
        list.deleteFirst();

        list.print();
        
        for (int i = 0; i < 5; i++ ){
            list.deleteLast();
            list.print();
        }
    }
}
