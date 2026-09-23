public static void main(String[] args){
    final int LINKED_LIST_LENGTH = 9;
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    
    // Creating a linked list
    for (int i = 0; i < LINKED_LIST_LENGTH; i++){
        list.addFirst(i);
        list.printList();
        System.out.println();
    }
    System.out.println();

    // Reversing linked list
    list.reverseLinkedList();

    // Verifying that is reversed
    System.out.println("Reversed Linked List:");
    list.printList();
}