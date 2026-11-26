# Notes 15 - Sorting Algorithms - Part 1
## Sorting Algorithms:
### Quadratic Sorting O(N^2):
- Insertion Sort
- Selection Sort
- Bubble Sort

### More Efficient Sorting:
- Merge Sort
    - O(nlogn)
- Quick Sort
    - Its worst case performance is O(N^2), but on average it is O(nlogn)

### Linear Sorting O(N):
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
- Bubble sort is one of the first sorting algorithms that you learn, it is very straight forward.
1) For every element in the list, compare it every other element.
    - If we want our array in ascending order, we look at the current element and then look at the i + i element, if the i + 1 element is smaller then we can simply swap the two.
- The overall time complexity of bubble sort is O(n^2)

## Divide and Conquer:
- These types of problems take a large problem, and then divide it into smaller sub-problems.
- This can be done recursively.
- Merge, and quick sort is an example of a divide and conquer algorithm.

## Merging Two Sorted Lists:
- Two merge two sorted sequences only a single pass is required.
1) Keep a pointer to the start of each list
2) Compare the two elements
3) Add required element to new list
4) Move pointer of the (smaller or larger depends on implementation) to pointer++;

## Merge Sort:
- First we have to split the sequence into two sub-sequences.
    - Find the size of the list
    - Divide the list into two sequences
- Then we continue making smaller lists by dividing them into two.
    - Put the two divided sequences into a binary tree.
    - Repeat until the size of the sequence is 1.

- When we reach a node with 1 element only, we TREAT it to be a sorted list.
- We then merge the two sorted sibling lists which takes O(N) and store it in the parent node.
- We do this recursively until we reach the root, and then we would have a sorted list at the root of the tree.

- This algorithm takes O(nlogn) since the height of the tree is O(logn) and at each level sorting two sorted sequences is O(n)

## Quick Sort:
- It is a divide and conquer based algorithm where we have to pick a pivot X, the sequence of elements to the left of the pivot have to be smaller than X, and the sequence of elements to the right of the pivot have to be larger than X.
- How to choose the pivot:
    - It can be chosen randomly.
    - It can either be the first or the last element of the sequence.

- We always have three groups:
    - Elements that are less than the value of the pivot
    - The single pivot
    - Elements that are greater than the value of the pivot

1) We basically partition the list into three groups.
2) Continue to partition the left and right side.
3) Repeat until the size of the partition is 1.
    - We know that in the case that we have only 3 or less elements, if we pick the following:
        - One is less than the pivot
        - One IS the pivot
        - One is greater than the pivot.
    - That means in the order of Less, Pivot, Greater will be in a sorted order.

- Unlike merge sort where we to merge the sorted sequence, here it automatically solves its self by making the problem smaller and smaller.

- Another thing to keep in mind, is that the WORST time complexity of Quicksort is O(n^2). HOWEVER, in traditional practice and on AVERAGE, this algorithm takes O(nlogn).