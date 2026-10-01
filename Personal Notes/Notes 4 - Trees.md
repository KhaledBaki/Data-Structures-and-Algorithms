# Notes 4 - Trees
## Binary Trees
- h + 1 <= n <= (2^(h+1)) - 1 nodes
- 1 <= NE <= 2^h for the number of external nodes

- The height ranges from log(n) to n

- Complete Binary trees are not necessarily full binary trees
- Full binary tree is not necessarily complete
- Perfect trees are complete, and they are full

## Tree ADT
### Tree traversal
- Visiting each node of the tree at least once and there are different types of traversals.
  - Breadth-First Traversal means visiting nodes level by level, visiting each floor of a building and knocking on all the rooms on the floor
    - Use queues for breadth-first traversal. This is done by enqueueing the children node of a node, then dequeue the child and do the same to see if they also have children.
  - Depth-First Traversal goes deep into the tree
    - Use stacks 
    - Preorder: Visit root first then the subtrees
    - Postorder: Visit subtrees first then the root
