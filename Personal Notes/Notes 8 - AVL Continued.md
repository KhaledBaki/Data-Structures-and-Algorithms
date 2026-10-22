# Notes 8 - AVL Continued
## Implementation Details for Rebalancing Trees
- When the heights of the children of Z are the same go left, and same for Y

## Left and Right Rotations
- When rotating left or right, only three of the links have to change.
- We use the same in-order method for the right rotation, however for a left rotation, it is still in order but assuming the order of the inorder is right root left!

### 4 Differnet Cases
- Left-left case: We would need to do one right rotation to make the right side balanced
- Left-Right case: We would need to do a left rotation at Y and then a right rotation at Z to make the right side balanced.

- Right-Right case: We would need to do one left rotation to make the left side balanced
- Right-Left case: We would need to do a right rotation at Y and then a left rotation at Z to make the right side balanced.

## AVL Tree Insertion
- We just need to rebalance the loweset imbalanced node, and this will automatically rebalance the whole tree.
- That means that we do not need to reassign and fix the height of the remaining nodes of the other nodes since when we insert, we already append the height by one at the begining. The point being, is that we are simply manipulating the links in the tree and not the number of node.

## AVL Tree Deletion
- Do normal BST Deletion, and then check to see which node is imbalanced starting from the place you deleted. Meaning when you swap with the predecessor or successor, delete it, and then from that position keep moving up like we did before until we find the first imbalanced node. Then apply the algorithm that we used when inserting a node.

- Note that there are three different cases when deleting a node from a BST;
1) Leaf Node: Super simple
2) One child: Simply attach the child to the parent
3) Two Children: Find the prev or next node based on in order traversal from that node, and then swap the rightmost of the left subtree, or the leftmost from the right subtree. Swap the two, and then delete the one you intended to delete. Then from the place that you deleted, keep checking that the ancestors are balenced until you find the imbalanced node.

### How to Update the Height
- You update the height of the root of the given subtree after each time you do the rebalancing algorithm: 
height(node) = max(height(node.left), height(node.right)) + 1