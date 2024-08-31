# Fractional Knapsack Problem

## Problem Description
The Fractional Knapsack problem involves selecting items with given weights and values to maximize the total value in a knapsack that can carry up to a certain weight. Unlike the 0/1 Knapsack problem, where you can either take an item or leave it, in the Fractional Knapsack problem, you can take fractions of an item.

## Use Case
This algorithm is widely used in resource allocation problems, where a decision must be made to optimize a particular objective, such as maximizing profit or minimizing cost.

## Approach
1. **Sort** the items by their value-to-weight ratio in descending order.
2. **Select** items starting from the one with the highest ratio, adding them to the knapsack until the capacity is reached.
3. If the knapsack cannot carry the whole item, **take a fraction** of it.
4. The process continues until the knapsack is full or all items are considered.

## Time Complexity
- **Time Complexity**: `O(n log n)`  
  The sorting step dominates the time complexity.

## Advantages
- **Efficient**: The greedy approach ensures that the solution is optimal.
- **Simple to Implement**: The problem is straightforward to solve using sorting and iteration.

## Disadvantages
- **Only Works for Fractional Items**: This approach does not work for the 0/1 Knapsack problem where items must be taken or left in their entirety.

## References
- [Knapsack Problem on Wikipedia](https://en.wikipedia.org/wiki/Knapsack_problem)
- [GeeksforGeeks: Fractional Knapsack](https://www.geeksforgeeks.org/fractional-knapsack-problem/)
