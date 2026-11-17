# Notes 13 - Spanning Tree
## Spanning Tree
- The spanning tree can be found using:
    - BFS
    - DFS

## Cost of Spanning Tree:
- The sum of the edge weights of the spanning tree.

## Minimal Spanning Tree
- It is the spanning tree of a graph with the SMALLEST cost.
- You need to find the cheapest way to build the sub-graph.

## Greedy Algorithms:
- A sequential way to find MST. 
- A greedy algorithm focuses on solving a smaller sub-problem.

### Greedy Algorithm Examples:
#### Prim's algorithm:
- Gradually adds best-possible verticies to grow the tree.
    1) Pick a starting vertex
    2) Grow the spanning tree by selecting the vertex with the smallest costing EDGE.
    3) The tree is now larger, keep repeating the process.

- Use a heap to keep track of the smallest edge connected to the tree.
- Every time we add a vertex to the tree we have to update the edge cost of the vertex, IF there is a cheaper way.

- This algorithm can produce different spanning tree's based on your implementation, HOWEVER the cost is the same either way!

**NOTE!: The main difference between Dijkstra's and Prim's Algorithm is that:
Dijkstra's uses edge relaxation so it checks if self cost + weight cost < other node cost.
Prim's checks the other node cost and edge cost and sees which is less** 

#### Kruskal's algorithm: 
- Gradually adds best-possible edges to avoid cycles.
1) List all the edges with their weights starting from the smallest to the largest.
2) Visit them one by one. If connecting the two verticies leads to a cycle, skip that edge pair.
3) Once the number of edges = N - 1 where N is the number of nodes, we stop the algorithm.

**TAKEAWAY:** The main takeaway from this algorithm is that each vertex starts as its own cluster. We continue to grow these clusters and AVOID cycles. We keep growing clusters until the number of edges = number of nodes - 1


### Exchange Property:
- When we have a cycle in a graph, we can remove ANY edge in the given cycle, and the graph would still be a tree.
    - Graph with N nodes, and N - 1 Edges is a tree.

### Cycle Property:
- For any cycle in a connected, edge-weighted graph, an edge whose weight is strictly greater than the weight of every other edge in that cycle cannot belong to any MST of the graph. Meaning the heaviest edge in the cycle is not in MST.

### Cuts in Graphs:
- Cut-set is all the edges that have been cut.
- Cutting a graph makes two disjoint graphs.