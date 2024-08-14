# Greedy Algorithms

Greedy algorithms build solutions piece by piece, always choosing the next piece that offers the most immediate benefit. They are used in optimization problems where a locally optimal choice can lead to a globally optimal solution.

## List of Greedy Algorithms

### 1. **Activity Selection Problem**
   - **Description**: Select the maximum number of activities that don't overlap, given their start and end times.
   - **Use Case**: Scheduling problems.
   - **Time Complexity**: O(n log n)

### 2. **Fractional Knapsack Problem**
   - **Description**: Maximize the value in a knapsack that can carry up to a certain weight, allowing for fractions of items.
   - **Use Case**: Resource allocation problems.
   - **Time Complexity**: O(n log n)

### 3. **Huffman Coding**
   - **Description**: Build a binary tree for optimal prefix codes used in data compression, based on character frequencies.
   - **Use Case**: Data compression (e.g., ZIP, JPEG).
   - **Time Complexity**: O(n log n)

### 4. **Prim's Algorithm**
   - **Description**: Find the minimum spanning tree for a weighted undirected graph.
   - **Use Case**: Network design.
   - **Time Complexity**: O(E log V)

### 5. **Kruskal's Algorithm**
   - **Description**: Find the minimum spanning tree by sorting all edges and adding them one by one.
   - **Use Case**: Network design.
   - **Time Complexity**: O(E log E)

### 6. **Dijkstra's Algorithm**
   - **Description**: Find the shortest paths from a source vertex to all other vertices in a graph with non-negative weights.
   - **Use Case**: Routing and navigation systems.
   - **Time Complexity**: O(V^2) or O(E + V log V) with a priority queue.

### 7. **Job Sequencing Problem**
   - **Description**: Maximize profit by scheduling jobs with deadlines and profits.
   - **Use Case**: Task scheduling with profit maximization.
   - **Time Complexity**: O(n log n)

### 8. **Coin Change Problem (Greedy)**
   - **Description**: Find the minimum number of coins/notes required to make a given amount using denominations.
   - **Use Case**: Financial systems with fixed denominations.
   - **Time Complexity**: O(n)

### 9. **Egyptian Fraction**
   - **Description**: Represent a fraction as a sum of distinct unit fractions.
   - **Use Case**: Mathematical decomposition.
   - **Time Complexity**: Varies with the fraction's complexity.

### 10. **Minimum Number of Platforms Required**
   - **Description**: Find the minimum number of platforms required for a railway station so that no train has to wait.
   - **Use Case**: Resource allocation in transportation.
   - **Time Complexity**: O(n log n)

### 11. **Optimal Merge Pattern**
   - **Description**: Find the minimum cost to merge files or data.
   - **Use Case**: File merging in data compression.
   - **Time Complexity**: O(n log n)

### 12. **Gas Station Problem**
   - **Description**: Given a circular route of gas stations, determine if you can start at one station and complete the circuit.
   - **Use Case**: Vehicle routing.
   - **Time Complexity**: O(n)

### 13. **Largest Number Problem**
   - **Description**: Arrange a list of numbers to form the largest possible number.
   - **Use Case**: Number manipulation, concatenation problems.
   - **Time Complexity**: O(n log n)

### 14. **Greedy Coloring**
   - **Description**: Assign colors to vertices of a graph such that no two adjacent vertices share the same color.
   - **Use Case**: Map coloring, register allocation in compilers.
   - **Time Complexity**: O(V^2)

### 15. **Set Cover Problem (Greedy Approximation)**
   - **Description**: Find a minimum-size set of subsets that cover all elements.
   - **Use Case**: Resource selection, database systems.
   - **Time Complexity**: O(n log n)

### 16. **Interval Scheduling Maximization**
   - **Description**: Select the maximum number of mutually compatible intervals.
   - **Use Case**: Scheduling, resource allocation.
   - **Time Complexity**: O(n log n)

### 17. **Bellman-Ford Algorithm (Greedy Component)**
   - **Description**: Find the shortest paths from a single source to all vertices, allowing for negative weights.
   - **Use Case**: Networks with negative edge weights.
   - **Time Complexity**: O(VE)
   - **Note**: Though primarily a dynamic programming algorithm, it can have greedy elements.

### 18. **Minimum Number of Coins (Greedy)**
   - **Description**: Find the minimum number of coins for a given amount using a greedy approach.
   - **Use Case**: Currency systems.
   - **Time Complexity**: O(n)

### 19. **Greedy Best-First Search**
   - **Description**: An algorithm that explores a graph by selecting the path that appears to lead most directly to the goal.
   - **Use Case**: Pathfinding, AI.
   - **Time Complexity**: O(b^m) where `b` is the branching factor and `m` is the maximum depth of the search tree.

### 20. **Steiner Tree Problem (Greedy Heuristic)**
   - **Description**: Find the minimum network of nodes connecting a given subset of nodes.
   - **Use Case**: Network design, circuit design.
   - **Time Complexity**: Depends on implementation; can be NP-hard.

### 21. **Vertex Cover Problem (Greedy Approximation)**
   - **Description**: Find the minimum number of vertices that cover all edges in a graph.
   - **Use Case**: Network security, facility location.
   - **Time Complexity**: O(V + E)

### 22. **Scheduling to Minimize Lateness**
   - **Description**: Given a set of jobs with deadlines and durations, schedule them to minimize maximum lateness.
   - **Use Case**: Task scheduling.
   - **Time Complexity**: O(n log n)

### 23. **Traveling Salesman Problem (Greedy Heuristic)**
   - **Description**: Approximate a solution to the Traveling Salesman Problem by choosing the nearest unvisited city.
   - **Use Case**: Route optimization.
   - **Time Complexity**: O(n^2)

### 24. **Approximate Vertex Cover**
   - **Description**: Approximate the solution to the vertex cover problem using a greedy algorithm.
   - **Use Case**: Network security, facility location.
   - **Time Complexity**: O(V + E)

### 25. **K-Center Problem (Greedy Approximation)**
   - **Description**: Find k centers in a graph such that the maximum distance of any vertex to a center is minimized.
   - **Use Case**: Facility location, clustering.
   - **Time Complexity**: O(V + E)

## Conclusion

Greedy algorithms offer efficient solutions for many problems, especially where the problem allows a locally optimal choice to lead to a globally optimal solution. However, they may not always produce the best solution for problems that require considering the global context, so it’s important to understand the nature of the problem before applying a greedy strategy.


