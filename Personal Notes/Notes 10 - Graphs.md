# Notes 10 - Graphs
## Graphs:
- A graph is a pair(V, E)
    - V is the set of vertices/Nodes
    - E is the set of Edges/Links

### Edge Types:
- Directed Edge
    - First vertex is the origin
    - Second vertex is the destination
    - Use () brackets to specify that it is DIRECTED
- Undirected Edge:
    - Needs a pair of nodes to represent the edge
    - use {} brackets to specify that it is UNDIRECTED

### Graph Types:
- Directed graph: All edges are directed
- Undirected graph: All edges are undirected

### Application of Graphs:
- Transportation Network
    - Highway Network
    - Flight Network
- Computer Networks
    - Local area neetwork
    - Internet
- Power grids
    - Distribution network
    - Transmission network

### Concepts:
- Simple Graph:
    - Adjacency: Two nodes are said to be adjacent if there exists an edge that connects them.
    - Incidence: An edge is incident to a node if the edge touches that node

- NON-Simple Graph
    - Parallel Edges: The same end verticies, more than one end
    - Loop/Self-loop: The edge has the same start and end point

- Degree of a vertex:
    - The number of edges that touch the vertex.

- In-Degree:
    - Number of incoming edges

- Out-Degree:
    - Number of outgoing edges

- Path:
    - A sequence of nodes that make a path

- Simple-Path:
    - Same as path but the nodes are UNIQUE

- Cycle:
    - A path where start node equals end node

- Connectivity:
    - If there exists a path from a node to another node for all nodes

### Properties of Graphs:
#### Undirected Graph:
- The sum of the degrees of each node is: 2 x #of Edges
- Max edges: n(n-1)/2

#### Directed Graph:
- The sum of the degrees of each node is: #of Edges
- Max edges: n(n-1)

## Graph ADT:
- areAdjacent(U, V): return true if the edges are incident
- incidentEdges(V): return a collection of the edges incident to V
- endVerticies(e): return the two endpoint verticies of edge e
- opposite(v0, e): starting from v0 through edge e, return the opposite end vertex.

## Graph Representation:
- Representing the Vertices:
    - We can store the nodes in an unordered list
- Representing the edges:
    - Edge List
    - Adjacencey list
    - Adjacencey matrix
    - Incidence matrix
    - An edge object

| Operation | Edge List | Adjacency List | Adjacency Matrix |
|---|---|---|---|
| `areAdjacent(vᵢ, vⱼ)` | O(m) | O(min(deg(vᵢ), deg(vⱼ))) | O(1) |
| `incidentEdges(vᵢ)` | O(m) | O(deg(vᵢ)) | O(n) |
| Space | O(n + m) | O(n + m) | O(n²) |
