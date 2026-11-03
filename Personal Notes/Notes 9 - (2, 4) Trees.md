# Notes 9 - (2, 4) Trees & Multi-way Trees
## Multi-way trees
- Each node can have at most 3 elements
- When we reach 4 elements, push the 3rd one to a higher node and split the rest into other lower nodes.

## Multi-way search tree
- Each node can contain multiple keys
- The number of children is: number of elements in a node + 1

### Order of the keys:
- For a node with 2 keys, we will have three ranges (-inf, K1) to (K1, K2) to (K2, +inf)
    - The same idea is true for when we have 3 keys, we would have four ranges.

### Searching Operation:
- Starting from the root, compare the target key with the first key and traverse with the same logic as a binary search tree.
- If the key is in the node itself, we simply return the key in the node.
- NOTE: When searching if the key is at the node it is O(1) since there are at most 3 keys, and then we explore the appropriate range based on the set of keys.

### Inorder Traversal for Multi-way search trees:
- It is the same idea as the BST inorder traversal.

## (2, 4) Trees:
### Properties:
- Every node has 2, 3, or 4 children.
- A (2, 4) tree with n entries has height Big-Theta(logn).

### Inserting into a (2, 4) Tree:
### Split Operation:
- If we are inserting to a node with 3 keys, it will become a node with 4 keys and we will then have to do a "Split Operation".
- We send the third node to the node above, and then we split the original overloaded node into two parts.
Then we attach those two parts to the parent node of the originally overloaded node. We recursively do this algorithm until the characteristic/property satisfies.

### Deleting Operation:
- It is the same method to delete a node from a BST
    - inorder successor
    - inorder predecessor

- The different operations are:
    - Fusion: Merge two siblings together and the pull a key down from a parent.
    - Transfer: Look at your adjacent siblings and take a key from them.
        - Adjacent sibling is one of the same parent!
    - Simple BST Swap and Delete