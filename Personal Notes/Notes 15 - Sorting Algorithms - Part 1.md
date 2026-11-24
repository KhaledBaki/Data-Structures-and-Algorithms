# Notes 15 - Sorting Algorithms - Part 1
## Sorting Algorithms:
### Quadratic Sorting:
- Insertion Sort
- Selection Sort
- Bubble Sort

### More Efficient Sorting:
- Merge Sort
- Quick Sort

### Linear Sorting:
- Bucket Sort
- Radix Sort

## Insertion Sort:
- It is an iterative algorithm.
- After each iteration the elements from arr[ 0:i-1 ] are considered to be sorted.
- Our goal is to insert element arr[ i ] into the sorted list
- WHEN TO USE: It is best to use insertion sort when the array is ALMOST sorted.

- The algorithm assumes that the first element is sorted, then after each iteration we compare the last element of the sorted sub-array.
    - If the given element is larger then we simply add it to the end of the sorted array.
    - Else we compare it with the rest of the elements in the sorted list and shift the elements in-place until we find a spot for the new entry to the sorted sub-array.

## Selection Sort:
- We assume two parts of the array, a sorted part and an unsorted part.
- For selection sort we have to find the SMALLEST element in the array and swap it with the first element in the "unsorted part" of the array.
- After that we decrease the size of the unsorted array, and increase the size of the sorted array. We keep finding the min and swapping until we have a sorted array (unsorted size = 0)
- It has the similar nature of heapsort, with the only difference is that we are NOT using a heap. 