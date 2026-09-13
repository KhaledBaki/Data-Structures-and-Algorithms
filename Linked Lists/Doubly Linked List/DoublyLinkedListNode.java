public class DoublyLinkedListNode<genericType>{
    private genericType e;
    private DoublyLinkedListNode next;
    private DoublyLinkedListNode prev;

    public DoublyLinkedListNode(genericType e){
        this.e = e;
        this.next = null;
        this.prev = null;
    }

    // getters
    public DoublyLinkedListNode getNext(){
        return this.next;
    }

    public DoublyLinkedListNode getPrev(){
        return this.prev;
    }

    public genericType getVal(){
        return this.e;
    }

    // setters
    public void setNext(DoublyLinkedListNode node){
        this.next = node;
    }

    public void setPrev(DoublyLinkedListNode node){
        this.prev = node;
    }

    public void setValue(genericType val){
        this.e = val;
    }
}
