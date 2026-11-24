# Notes 14 - Hashing

## Maps:
- So far we have the following data structures for implementing maps ranging from O(logn) to O(n) per operation:
    - Sorted Array 
    - AVL Tree
    - Sorted Linked List
    - (2,4) Trees

- All the above implementation methods are NOT as efficient as Hash Maps that on average take O(1) per operation.

## What is Hashing?
- If we have IDs with large numbers say in 10s of millions, if we take the modulo N where N is any integer, we make a large number smaller HOWEVER we risk colliding two keys that would result in the same value after applying Modulo N. 

```
An example would be:
12 Mod 10 = 2
102 Mod 10 = 2

Both values resulted in having the same key, so we can say that we obtained a key collision!

```

## Hash Function:
- A hash function maps any key to an integer value within the range of the array.
    - It is a sequence of steps that converts an object into a hashed integer value. 
    - Converts a key to an integer value after applying certain hashing operations.
    - Reinterprets the key into an integer.
    - Gives the same result for the same key.

## How to Design a Hash Function:
### Hash Code Map:
- Hash Code: Is a unique code given to a key after transforming it.
- Hash Code Map: Maps the unique hash code to a spot in the array.

### Integer Casting:
- Given any number (float, double, long, etc...), you need to obtain the IEEE 32-Bit representation of the given number. With that you can take an algorithm to perform certain hashing actions so that you can obtain the hash code.

### Character Casting:
- Convert the character to a UNICODE or ASCII
    - If you have an array of characters, you represent their UNICODE or ASCII in an array.
    - To get a hash key you multiply each value by a WEIGHTED term.

```
Example of Weighted Term Sum:

Where "a" is a unique number (usually prime). 
Where "n" is the index of the element in the array.
Where "x" is the element value.

hashCode = x(a^n) + x1(a^n-1) + x2(a^n-2) + etc... 

The above would be used to hash collection of elements, one example can be a word which is an array of chars.
```

### Separate Chaining:
- Should more than one element have the same hash code value, at a given index we can chain the elements.
    - So when we hash an element and obtain its hash code, we go to the array at that index. If there already exists an element, we simply add it to the list at that given index.

- Make sure that the modulo that you select to implement your hashing function is a prime number that is CLOSEST to the size of the array you are using to store the elements. For example, if you have an array of size 10, let N be 11 since it is the closest prime number to 10.

## Probing (Open Addressing)
### Linear Probing 
```
H_i(K) = [H(K) + i] mod N
```
- In the above formula we keep increasing i by one until it is sufficient to find an empty cell
- Instead of separately chaining elements at an index, we find the NEXT empty spot in the array. Should the array be full near the end we can do a wrap around insertion.

#### The Operations for Linear Probing:
- Searching:
    - It is the same way as searching for a chained hashmap, however since only one entry is being stored per spot, if there is an entry at the given cell, we keep probing further cells to see if there is an empty spot. If there is an empty spot fill it.
    - If we search and keep probing and we hit an empty cell, we call that an unsuccessful search.
        - IMPORTANT: If you are searching and you hit an "AVAILABLE" cell make sure to skip over it and continue searching!

- Deleting:
    - When deleting a key from the hashmap we can to first search with the probing search method above. When we find the element, we delete it and store a special entry "AVAILABLE" so that it doesn't cause an error next time you search for an element. This is crucial since earlier we said if we are searching and we hit an empty cell it means that the element is NOT in the hashmap.

- Inserting:
    - Get the hashcode, if there is already an element at that index probe until you find an empty or AVAILABLE cell.

#### How to get the best performance:
- The best performance for a linearly probed hashmap is when the number of keys is less than 50% of the array size.
- When we approach that number we resize the array (double it) and find the next closest prime numebr and RE-hash each element so that next time you need to access them it is possible!

### Quadratic Probing:
```
H_i(K) = [H(K) + i^2] mod N
```
- In the above formula we keep increasing i by one until it is sufficient to find an empty cell
- This method risks skipping over empty cells since the growth is too fast!

- However the math works out so that when the array size is a PRIME NUMBER and the number of keys is less than half the capacity of the array. Then quadratic probing is guaranteed to find an empty cell. 

- if the searches reach N/2 then we can stop searching since that means that the element does not exist.

- This method of probing follows the same methods of searching, deleting, and inserting as linear probing.

## Double Hashing:
```
H_i(K) = [H(K) + i * D(k)] mod N

D(K) = N - (K mod N)

Where H_i(K) is the primary hash code of the entry
Where i is an index
where D(K) is secondary hashing function (Can be any hashing function)
```

- Two hashing functions are used.