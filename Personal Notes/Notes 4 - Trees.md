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
  - Depth-First Traversal goes deep into the tree
    - Preorder: Visit root first then the subtrees
    - Postorder: Visit subtrees first then the root
