# Notes 11 - BFS & DFS
## What is Breadth-First Search:
- Breadth-First Search or BFS is a way to traverse a graph level by level.
- In a tree, it quite literally goes through the tree level by level, starting from the root node all the way to the last level.
- The BFS traversal takes up more memory than DFS.

### How to implement Breadth-First Search (BFS):
- We can use a queue data structure to help us in this method of traversal.
    1) Make a queue and enqueue the starting node
    2) While the queue is <span style="color: red;">NOT EMPTY</span> enqueue the children of the DEQUEUEed given nod  e.
    3) Keep doing this until the queue is empty and you would have accomplished BFS.

## What is Depth-First Search:
- Depth-First Search or DFS is a way to traverse the graph deeply.
    - Meaning when you visit a node, continue visiting more nodes from that point.
- In a tree, DFS is equivalent to a <span style="color: green;">Pre-Order Traversal</span> which means that it will keep backtracking until all the paths have been traversed. 
- DFS ensures that EVERY POSSIBLE PATH is traversed in a TREE and not necessarily graphs!

### How can we implement Depth-First Search (DFS):
- We can use a stack data structure to help us achieve this functionality.
    1) Make a stack and push the starting node or root
    2) While the stack is <span style="color: red;">NOT EMPTY</span> push the children of the POPed given node from the stack.
    3) Keep doing this until the stack is empty and you would have accomplished DFS.