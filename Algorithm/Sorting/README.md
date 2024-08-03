# Sorting Algorithms

This document provides an overview of common sorting algorithms. Each algorithm is described briefly, including its basic approach and characteristics.

## 1. Bubble Sort

**Description:** Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. This process is repeated until the array is sorted.

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## 2. Selection Sort

**Description:** Selection Sort finds the minimum (or maximum) element from the unsorted portion of the array and swaps it with the first unsorted element. This process continues until the array is sorted.

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## 3. Insertion Sort

**Description:** Insertion Sort builds the final sorted array one item at a time by inserting elements into their correct position in the sorted portion of the array.

**Time Complexity:** O(n^2)  
**Space Complexity:** O(1)  

## 4. Merge Sort

**Description:** Merge Sort divides the array into two halves, recursively sorts each half, and then merges the sorted halves to produce the sorted array.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)  

## 5. Quick Sort

**Description:** Quick Sort selects a 'pivot' element and partitions the array into elements less than the pivot and elements greater than the pivot. It then recursively sorts the partitions.

**Time Complexity:** O(n log n) (average), O(n^2) (worst-case)  
**Space Complexity:** O(log n) (average)  

## 6. Heap Sort

**Description:** Heap Sort converts the array into a heap structure and repeatedly extracts the maximum (or minimum) element from the heap to build the sorted array.

**Time Complexity:** O(n log n)  
**Space Complexity:** O(1)  

## 7. Counting Sort

**Description:** Counting Sort counts the occurrences of each distinct element and uses this information to place elements directly into their correct position in the output array.

**Time Complexity:** O(n + k) (where k is the range of input values)  
**Space Complexity:** O(k)  

## 8. Radix Sort

**Description:** Radix Sort sorts numbers digit by digit starting from the least significant digit to the most significant digit, using a stable subroutine like Counting Sort.

**Time Complexity:** O(n * k) (where k is the number of digits)  
**Space Complexity:** O(n + k)  

## 9. Bucket Sort

**Description:** Bucket Sort divides the elements into several buckets, sorts each bucket individually, and then concatenates the buckets to produce the sorted array.

**Time Complexity:** O(n^2) (worst-case), O(n + k) (average-case)  
**Space Complexity:** O(n + k)  

## 10. Shell Sort

**Description:** Shell Sort is an optimization of Insertion Sort that allows the exchange of items that are far apart, reducing the number of comparisons and moves.

**Time Complexity:** O(n^(3/2)) (average-case), O(n^2) (worst-case)  
**Space Complexity:** O(1)  

## References

For further reading and detailed explanations, please refer to the following resources:

- [Wikipedia Sorting Algorithms](https://en.wikipedia.org/wiki/Sorting_algorithm)
