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