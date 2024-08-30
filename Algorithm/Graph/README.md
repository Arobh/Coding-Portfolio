## Graph Algorithms

Graph algorithms are essential tools in computer science for solving a variety of problems involving networks, paths, and structures. These algorithms help in analyzing relationships between entities and optimizing solutions for tasks such as finding the shortest path, detecting cycles, and identifying minimum spanning trees. Understanding these algorithms is crucial for applications in network design, social network analysis, logistics, and many other fields. This document provides an overview of key graph algorithms, including their descriptions, use cases, and time complexities.

# List of Graph Algorithms

1. **Depth-First Search (DFS)**
   - **Description:** Traverses a graph in a depthward motion and uses a stack to keep track of nodes to visit.
   - **Use Case:** Pathfinding, topological sorting, cycle detection.
   - **Time Complexity:** O(V + E)

2. **Breadth-First Search (BFS)**
   - **Description:** Traverses a graph level by level, using a queue to explore each vertex’s neighbors.
   - **Use Case:** Shortest path in unweighted graphs, level-order traversal, bipartite checking.
   - **Time Complexity:** O(V + E)

3. **Dijkstra's Algorithm**
   - **Description:** Finds the shortest paths from a source vertex to all other vertices in a graph with non-negative weights.
   - **Use Case:** Routing and navigation systems.
   - **Time Complexity:** O(V^2) or O(E + V log V) with a priority queue.

4. **Bellman-Ford Algorithm**
   - **Description:** Computes the shortest paths from a single source to all vertices, allowing for negative weights.
   - **Use Case:** Networks with negative edge weights, currency arbitrage detection.
   - **Time Complexity:** O(VE)

5. **Floyd-Warshall Algorithm**
   - **Description:** Computes shortest paths between all pairs of vertices.
   - **Use Case:** Dense graphs, all-pairs shortest paths, transitive closure.
   - **Time Complexity:** O(V^3)

6. **Prim's Algorithm**
   - **Description:** Finds the minimum spanning tree for a weighted undirected graph by adding the smallest edge that expands the growing tree.
   - **Use Case:** Network design, constructing minimal-length highways.
   - **Time Complexity:** O(E log V)

7. **Kruskal's Algorithm**
   - **Description:** Builds a minimum spanning tree by adding edges in order of increasing weight, ensuring no cycles form.
   - **Use Case:** Network design, clustering.
   - **Time Complexity:** O(E log E)

8. **A\* Search Algorithm**
   - **Description:** Finds the shortest path from a start node to a goal node, using heuristics to optimize the search.
   - **Use Case:** Pathfinding in games, navigation systems.
   - **Time Complexity:** O(b^d) where b is the branching factor and d is the depth.

9. **Topological Sorting**
   - **Description:** Orders vertices in a directed acyclic graph (DAG) such that for every directed edge u → v, vertex u comes before vertex v.
   - **Use Case:** Task scheduling, resolving symbol dependencies in compilers.
   - **Time Complexity:** O(V + E)

10. **Tarjan’s Algorithm**
    - **Description:** Finds strongly connected components in a directed graph.
    - **Use Case:** Circuit analysis, identifying modules in software.
    - **Time Complexity:** O(V + E)

11. **Kosaraju's Algorithm**
    - **Description:** Another method to find strongly connected components in a directed graph.
    - **Use Case:** Circuit design, social network analysis.
    - **Time Complexity:** O(V + E)

12. **Johnson’s Algorithm**
    - **Description:** Finds all pairs of shortest paths in a sparse graph, using Bellman-Ford and Dijkstra’s algorithms.
    - **Use Case:** Sparse graphs with negative weights.
    - **Time Complexity:** O(V^2 log V + VE)

13. **Edmonds-Karp Algorithm**
    - **Description:** Implements the Ford-Fulkerson method for finding the maximum flow in a flow network using BFS.
    - **Use Case:** Network flow problems, bipartite matching.
    - **Time Complexity:** O(VE^2)

14. **Ford-Fulkerson Algorithm**
    - **Description:** Finds the maximum flow in a flow network.
    - **Use Case:** Circulation with demand, matching problems.
    - **Time Complexity:** O(max_flow \* E)

15. **Dinic's Algorithm**
    - **Description:** An efficient algorithm for computing the maximum flow in a flow network.
    - **Use Case:** Maximum flow problems, network design.
    - **Time Complexity:** O(V^2E)

16. **Hopcroft-Karp Algorithm**
    - **Description:** Finds the maximum matching in a bipartite graph.
    - **Use Case:** Job assignment, network scheduling.
    - **Time Complexity:** O(E√V)

17. **Boruvka's Algorithm**
    - **Description:** An alternative method to find the minimum spanning tree using a divide-and-conquer approach.
    - **Use Case:** Network design.
    - **Time Complexity:** O(E log V)

18. **Hierholzer's Algorithm**
    - **Description:** Finds an Eulerian circuit in a graph where all vertices have even degree.
    - **Use Case:** Route inspection problems, graph theory puzzles.
    - **Time Complexity:** O(E)

19. **Fleury's Algorithm**
    - **Description:** Another method for finding an Eulerian path or circuit in a graph.
    - **Use Case:** Eulerian path problems, route inspection.
    - **Time Complexity:** O(E^2)

20. **Gabow's Algorithm**
    - **Description:** Finds all strongly connected components in a directed graph.
    - **Use Case:** Circuit design, module identification.
    - **Time Complexity:** O(V + E)

21. **Kahn's Algorithm**
    - **Description:** A BFS-based approach for topological sorting in DAGs.
    - **Use Case:** Task scheduling, dependency resolution.
    - **Time Complexity:** O(V + E)

22. **Karger’s Algorithm**
    - **Description:** A randomized algorithm to find the minimum cut of a graph.
    - **Use Case:** Network reliability, graph partitioning.
    - **Time Complexity:** O(V^2 log V)

23. **Stoer-Wagner Algorithm**
    - **Description:** Finds the minimum cut in an undirected graph.
    - **Use Case:** Network reliability, clustering.
    - **Time Complexity:** O(V^3)

24. **Welsh-Powell Algorithm**
    - **Description:** A heuristic method for graph coloring.
    - **Use Case:** Scheduling, register allocation.
    - **Time Complexity:** O(V^2)

25. **Greedy Coloring Algorithm**
    - **Description:** Colors vertices of a graph such that no two adjacent vertices share the same color.
    - **Use Case:** Map coloring, register allocation.
    - **Time Complexity:** O(V^2)

26. **Push-Relabel Algorithm**
    - **Description:** A method for computing the maximum flow in a flow network using local relabeling.
    - **Use Case:** Maximum flow problems, network design.
    - **Time Complexity:** O(V^2E)

27. **Suurballe's Algorithm**
    - **Description:** Finds the pair of edge-disjoint paths of minimum total length between two nodes.
    - **Use Case:** Network design, redundancy planning.
    - **Time Complexity:** O(VE + E log V)

28. **Chinese Postman Problem**
    - **Description:** Finds the shortest path or circuit that visits every edge of a graph at least once.
    - **Use Case:** Routing, postal delivery.
    - **Time Complexity:** O(V^2)

29. **Gomory-Hu Tree**
    - **Description:** Represents all-pairs minimum cuts in a graph.
    - **Use Case:** Network reliability, flow problems.
    - **Time Complexity:** O(VE log(V^2/E))

30. **Biconnected Components Algorithm**
    - **Description:** Identifies biconnected components and articulation points in a graph.
    - **Use Case:** Network design, circuit design.
    - **Time Complexity:** O(V + E)

31. **Articulation Points and Bridges**
    - **Description:** Finds vertices (articulation points) and edges (bridges) whose removal increases the number of connected components.
    - **Use Case:** Network reliability, circuit analysis.
    - **Time Complexity:** O(V + E)

32. **Minimum Cut/Maximum Flow Theorem**
    - **Description:** States that the maximum flow in a network equals the capacity of the minimum cut separating the source and sink.
    - **Use Case:** Network flow problems.
    - **Time Complexity:** Depends on the flow algorithm used (e.g., O(VE^2) for Edmonds-Karp).

33. **Planarity Testing**
    - **Description:** Determines if a graph can be embedded in a plane without edges crossing.
    - **Use Case:** Circuit design, geography.
    - **Time Complexity:** O(V + E)

34. **Chordal Graph Algorithms**
    - **Description:** Algorithms for recognizing and solving problems on chordal graphs.
    - **Use Case:** Database theory, constraint satisfaction.
    - **Time Complexity:** O(V + E)

35. **PageRank Algorithm**
    - **Description:** Computes the rank of web pages based on the structure of links between them.
    - **Use Case:** Search engine ranking, social network analysis.
    - **Time Complexity:** O(E)

36. **Randomized Contraction Algorithm**
    - **Description:** A Monte Carlo method to find the minimum cut of a graph.
    - **Use Case:** Network reliability, graph partitioning.
    - **Time Complexity:** O(V^2)

37. **Hierarchical Clustering (Graph-Based)**
    - **Description:** Constructs a hierarchy of clusters based on graph connectivity.
    - **Use Case:** Image segmentation, bioinformatics.
    - **Time Complexity:** O(V^2 log V)

38. **Label Propagation Algorithm**
    - **Description:** A graph-based method for community detection.
    - **Use Case:** Social network analysis, clustering.
    - **Time Complexity:** O(V + E)

39. **Louvain Method**
    - **Description:** A heuristic method for detecting communities in large networks.
    - **Use Case:** Community detection, social network analysis.
    - **Time Complexity:** O(V log V)

40. **Boruvka-Kruskal’s Algorithm**
    - **Description:** A variant of Kruskal’s algorithm using Boruvka's steps to speed up finding the MST.
    - **Use Case:** Network design.
    - **Time Complexity:** O(E log V)


## Conclusion

Graph algorithms play a vital role in both theoretical and practical aspects of computing. By mastering these algorithms, one can effectively address complex problems related to graph structures and their applications. Whether you are working on optimizing network routes, detecting patterns in data, or solving scheduling issues, the algorithms listed in this document offer powerful solutions. This overview serves as a starting point for deeper exploration and implementation of graph-based techniques in various domains.

