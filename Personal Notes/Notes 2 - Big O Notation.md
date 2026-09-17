# Notes 2 - Big O Notation
## Brief Explanation
Big-O notation is used to classify, and determine the complexity of a computer algorithm. In other words, as the number of data increases, how does this algorithm behave?

## Time Complexity
How much time does it take to run an algorithm.
This is based on the number of operations that have to be done by the computer.

## Space Complexity
How much memory is used up by the algorithm to run to completion.

## Types of Notation
### Big-O Notation
```
Mathematical Proof: 0 < f(n) < c * g(n) so any function less than c * g(n) is valid
Where n is the number of terms getting passed through.
Where f(n) is the number of operations  as a function of n.

There must exist a positive constant c > 0, and a threshold N0 >= 0 for all n > N0
C can be any positive constant (positive real number)
N must be a positive integer

```
### Big Omega Notation
```
f(n) > c * g(n)
```

### Big Theta Notation
```
c1 * g(n) <= f(n) <= c2 * g(n)
```

## Big O Diagram
<img width="572" height="349" alt="image" src="https://github.com/user-attachments/assets/43a23005-938c-4844-855f-295e8b86826f" />

## Basic Naming Conventions
- O(1) = Constant Time
- O(log n) = Logarithmic Time
- O(n) = Linear Time
- O(n * log n) = Quasilinear Time
- O(n^2) = Quadratic Time 
