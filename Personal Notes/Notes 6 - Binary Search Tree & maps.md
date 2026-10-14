# Notes 6 - Binary Search Tree & Maps
## Map (Associative Array)
- A collection of key-value entries, the keys MUST be unique.
- Operations (Search, Insert, Delete) on the map based on the key and NOT the index.
### Main Methods
- get(k)
- put(k, v)
    - If no entry exists, create a new entry.
    - Else At key K update the value V
- remove(k)

### Support Methods
- keySet(), values(), entrySet(), size()

### Applications for Map
- Two Sum: Store the array element value as the key, and the corresponding value is the index of the element. Then at each element of the array we check to see is the number - element at index is in the map. If not then we add the current element and its index to the map.

- Logging System:
    - Key: Timestamp
    - Value: Event

### Implementation of Map
- Lists
- Hash Table
- Binary Search Tree
- Etc...

### Binary Searching
- In a sorted array, check if the value you want is in the upper or lower half of the array, and then we reassign the low and high pointers. We then check if the middle element is the value we are searching for. We keep doing this until we find the element.
- It can be done with a recursive algorithm, or with a while loop.

### Binary Search Tree
- The left child is the smaller.
- The right child is the larger
- An inOrderTraversal of a binary search tree will LITERALLY print out the values in order. (Very Helpful Tip!)
- preOrder traversal: root -> left -> right
- postOrder: left -> right -> root
