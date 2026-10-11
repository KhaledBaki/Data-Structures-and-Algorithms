public class Stack<genericType>{
    // Nested Class
    public class Node<Type>{
        private Type value;
        private Node<Type> next;

        public Node(Type element, Node<Type> next){
            this.value = element;
            this.next = next;
        }
    }

    // Head of the Stack
    private Node<genericType> head = null;
    private int size = 0;


    public void push(genericType element){
        if (head == null){
            head = new Node<genericType>(element, null);
            size++;
        }
        else {
            Node<genericType> node = new Node<>(element, head);
            head = node;
            size++;
        }
    }

    public genericType pop(){
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
    }
    public void printStack(){
        Node<genericType> current = head;
        System.out.println("Stack (Top to Down):");
        while (current != null){
            System.out.println(current.value);
            System.out.println("|");
            System.out.println("V");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++){
            stack.push(i);
        }
        stack.printStack();

        System.out.println("");
        stack.pop();
        stack.printStack();
    }
}