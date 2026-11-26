# Notes 15 - Sorting Algorithms - Part 1
## Sorting Algorithms:
### Quadratic Sorting:
- Insertion Sort
- Selection Sort
- Bubble Sort

### More Efficient Sorting:
- Merge Sort
- Quick Sort
    - Its worst case performance is O(N^2), but on average it is O(nlogn)

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

## Bubble Sort:
- WILL ADD NOTES LATER

## Divide and Conquer:
- These types of problems take a large problem, and then divide it into smaller sub-problems.
- This can be done recursively.
- Merge sort is an example of a divide and conquer algorithm.

## Merging Two Sorted Lists:
- Two merge two sorted sequences only a single pass is required.
1) Keep a pointer to the start of each list
2) Compare the two elements
3) Add required element to new list
4) Move pointer of the (smaller or larger depends on implementation) to pointer++;

## Merge Sort:
- First we have to split the sequence into two.
    - Find the size of the list
    - Divide the list into two sequences
- Then we continue making smaller lists and putting them in a tree
- When we reach a node with 1 element only, we assume it to be a sorted list.
- We then merge the two sorted lists which takes O(N)
- We do this recursively until we reach the root, and then we would have a sorted list.

## Quick Sort:
- It is a divide and conquer based algorithm where we have to pick a pivot X, the sequence of elements to the left of the pivot have to be smaller than X, and the sequence of elements to the right of the pivot have to be larger than X.
- The pivot can be chosen randomly, or it can either be the first or the last element of the sequence.

- We always have three groups:
    - Less
    - Pivot
    - Greater

- We basically partition the list into three groups. 
- Once the size of the partition is 1, we can simply