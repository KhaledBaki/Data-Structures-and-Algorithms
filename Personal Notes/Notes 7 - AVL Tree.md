# Notes 7 - AVL Tree
## Basic Rules
- The difference in height between the right subtree and left subtree of each node must belong to the set {-1, 0, 1}

## Rebalancing By Rotations
### How to Detect Imbalanaced Node
- Each node stores the height of its own subtree
    - The balancing factor is O(1).

- We check the height of the right subtree, and the height of the left subtree that we ALREADY stored. We do the math to verify wether it is an AVL Tree, if the differerce doesn't belong to the set {-1, 0, 1}.


### How to Store the Height
- Once we insert a new node, we know that IT'S height is 0. THen we move up in the chain and add 1 to the height value of each parent (Ancestor).

### Two-Level Imbalance
- When the difference is at most 2 between the left and the right subtrees.
- After inserting or deleting, we need to find the first imbalanced node. That First imbalanced node is Z.
- Then we have to pick Y to be the child with the greater height.
- From Y we have to pick the child with the greater height.
- The case that both children have the same height, it is a special case. We try to go to the left subtree however.

### Case 1:
- If the nodes X, Y, Z are left sided, we rearange them to have the form of:
X(Child)<--->Y(Parent)<--->Z(Child)

### Rule of Thumb:
- To know the order of reassigning the pointers we have to do an in-order traversal. Regardless of the nodes that AREN'T XYZ, we have to check out the order of the XYZ pointers, if you did in-order traversal and found out that the in-order traversal was Y, X, Z. That means that when reassigning to this:

- Node()<--->Node()<--->Node()

- The order should be:
Node(Y)<--->Node(X)<--->Node(Z)

- After that, reorder the subtrees to have the following order:
T1, T2, T3, T4