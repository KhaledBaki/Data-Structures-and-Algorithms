public class SinglyLinkedListNode<E> {
    private E element;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(E element){
        this.element = element;
        this.next = null;
    }

    // Getters
    public SinglyLinkedListNode getNext(){
        return this.next;
    }

    public E getVal(){
        return this.element;
    }

    // Setters
    public void setNext(SinglyLinkedListNode node){
        this.next = node;
    }

    public void setVal(E val){
        this.element = val;
    }
}