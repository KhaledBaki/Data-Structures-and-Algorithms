# Notes 5 - Priority Queues

## Heap
- Min-heap: Parent's key is less than or equal to both the children keys
    - That means that the root is the smallest element
- Max-heap: Parent's key is greater than or equal to both the children keys
    - That means that the root is the largest element
- We can use a heap to implement a priority queue,

- A heap can be implemented with an array nicely WITH A COMPLETE Tree
    - Complete tree is perfect until the n - 1 height, and everything below is left most.

    - The node itself is at index i
        - In an array the child index is Left child: 2i + 1, Right child: 2i + 2
        - Parent index is floor(i-1)/2

    - We use an array so that we can index any element in O(1) time

### Height of a Heap
- Height is floor(log n)

### Heap Removal
- The worst case of the down-heap bubbling it is the height of the tree so O(log n)
- swap the root node with the bottom rightmost element, and then remove it, then we keep swapping from up to down, until the property of the heap tree satisfies

### Heap insertion
- The worst case of the up-heap bubbling it is the height of the tree so O(log n)
- Insert the node at the bottom right most height and then swap untilthe property of the heap tree satisfies


### Heap Construction
- We chose the last internal node, in the array based case i = floor((n - 1) - 1)/2, and then we work our way i-- to tackle each internal node. So at each internal node we do a down-heap algorithm. We skip the bottom height.
- This construction takes overall O(n)
