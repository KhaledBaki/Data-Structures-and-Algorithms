# Notes 12 - Shortest Path
## Shortest Path
- You need to find the path with the smallest cost
    - Sometimes there only needs to be one hop, but it is no necessarily the cheapest

- For the shortest path between A to B, all the subpaths have to be optimal i.e the shortest

# Dijkstra's Algorithm
- Single-Source shortest path (SSSP). This algorithm finds the shortest path between two points.

## Assumptions:
- The graph is connected
- Edge weights are non-negative (Critical)
- In <span style="color: red;">Dijkstra's algorithm </span> initially we assume that the distance from the starting point A to itself to be zero

### Edge Relaxation:
- The distances of all the remaining nodes i.e (Not the source node) are set to be infinite, and this is because we have no information about them just yet.

- This is where edge relaxation comes to play. The method is rather straightforward:

```
Where d(X) denotes the distance at arbitrary node X
Where c(X, Y) denotes the cost of crossing the edge from X to Y
if( d(u) + c(u, v) < d(v) ){
    THEN:
        d(v) = d(u) + c(u, v)
}
```
![alt text](<assets/Screenshot 2026-11-12 135056.png>)

### Procedure:
- Starting from the source node, the distance from the source to the source is 0, and every other vertex is set to have a distance of infinity.
- Update the adjacent verticies' distances starting from the vertex with the smallest distance from the source, that hasn't done the edge relaxation method yet.
    - e.g. From the source we first label its adjacent verticies by the weight of the edge from the source to the vertex.

- Then we move onto the shortest edge, and used the edge relaxation method.
    - i.e. we check if there is a shorter path than the one currently at the node.

- We do that until we have succefully covered all the nodes.

- After this procedure, we would have found the shortest paths for all the nodes from the source.

## Reference Video:
Abdul Bari the DSA Goat! 
https://www.youtube.com/watch?v=XB4MIexjvY0