public class BinaryTree<genericType>{
    
    // Nested Class
    public class TreeNode<E>{
        private E element;
        private TreeNode<E> parent;
        private TreeNode<E> leftSibling;
        private TreeNode<E> rightSibling;
    }

    private TreeNode<genericType> root;
    private int size = 0;


    public void inOrderTraversal(){
        // Print out tree
    }

    public void breadthFirstTraversal(){
        // Print out BF-Tree
    }

    public int getSize(){
        return this.size;
    }

    public int getHeight(){
        // Implementation to be done
        return -1;
    }

    public void addNode(TreeNode<genericType> node){

    }

    public genericType deleteRoot(){
        return root.element;
    }
}
