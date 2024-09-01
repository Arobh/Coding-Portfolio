# Huffman Coding

## Problem Description
Huffman Coding is a lossless data compression algorithm that generates optimal prefix codes based on the frequency of characters in the input data. The algorithm builds a binary tree where more frequent characters are assigned shorter bit lengths, and less frequent characters are assigned longer bit lengths, reducing the overall size of the encoded data.

## Use Case
Huffman Coding is commonly used in data compression formats like ZIP, GZIP, JPEG, and PNG, where efficient data storage or transmission is crucial.

## Approach
1. **Calculate Frequencies**: Determine the frequency of each character in the input data.
2. **Build a Min-Heap**: Create a min-heap of all characters, where the heap is ordered by frequency.
3. **Build the Huffman Tree**: Repeatedly extract the two nodes with the lowest frequencies from the heap, combine them into a new node with a frequency equal to the sum of the two, and insert the new node back into the heap. Continue until only one node remains.
4. **Generate Codes**: Traverse the Huffman tree to assign binary codes to each character.

## Time Complexity
- **Building the Huffman Tree:** `O(n log n)`
- **Encoding Data:** `O(n log n)`

Here, `n` is the number of unique characters in the input data.

## Advantages
- **Efficient Compression**: Huffman Coding provides a near-optimal solution for lossless data compression.
- **Widely Applicable**: It is used in many common file compression formats and standards.

## Disadvantages
- **Variable-Length Codes**: Managing variable-length codes can be more complex than fixed-length codes.

## References
- [Huffman Coding on Wikipedia](https://en.wikipedia.org/wiki/Huffman_coding)
- [GeeksforGeeks: Huffman Coding](https://www.geeksforgeeks.org/huffman-coding-greedy-algo-3/)
