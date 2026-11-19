# Notes 14 - Hashing

## Maps:
- So far we have the following data structures for implementing maps:
    - Sorted Array
    - AVL Tree
    - Sorted Linked List
    - (2,4) Trees

- But all these methods are NOT as efficient as Hash Maps that on average take O(1) per operation.

## What is Hashing?
- If we have IDs with large numbers say in 10s of millions, if we take the module N where N is any integers, we make a large number smaller HOWEVER we risk colliding two keys that would result in the same value after applying Module N.

## Hash Function:
- A hash function maps any key to an integer value within the range of the array.
    - Converts a key to a smaller integer value.

## How to Design a Hash Function:
### Hash Code Map:
- Hash Code: Is a unique code given to a key after transforming it.
- Hash Code Map: Maps the unique hash code to a spot in the array.
- Reinterprets the key into an integer.
    - Gives the same result for the same key.

### Integer Casting:
- Given any number, you need to obtain the 32-Bit representation of the given number.

### Character Casting:
- Convert the character to a UNICODE or ASCII
    - If you have an array of characters, you represent their UNICODE or ASCII in an array.
    - To get a hash key you multiply each value by a WEIGHTED term.
        - x(a^n) + x1(a^n-1) + x2(a^n-2) + etc... where "a" is a unique number and n is the index of the element

### Separate Chaining:
- Should more than one element have the same hash code value, at a given index we can chain the elements.
    - So when we hash an element and obtain its hash code, we go to the array at that index. If there already exists an element, we simply add it to the list at that given index.

- When applying the modulo to the hashcode to store it into the array, make sure that the modulo that you select is a prime number that is CLOSEST to the size of the array. Example, if you have array size 10, let N be 11.

