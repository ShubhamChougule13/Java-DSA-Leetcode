# LeetCode 54: Spiral Matrix

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Matrix, Simulation, Boundary Traversal

## Problem
Given an `m x n` matrix, return all elements in spiral order.

## Example

**Input:**
```text
[[1,2,3],
 [4,5,6],
 [7,8,9]]
```

**Output:**
```text
[1,2,3,6,9,8,7,4,5]
```

## Approach: Boundary Traversal

Maintain four boundaries:
- `top`: First unvisited row.
- `bottom`: Last unvisited row.
- `left`: First unvisited column.
- `right`: Last unvisited column.

Traverse in four directions:
1. Left to right.
2. Top to bottom.
3. Right to left.
4. Bottom to top.

After each traversal, shrink the corresponding boundary. Use conditions to avoid visiting elements more than once.

## Complexity Analysis
- **Time Complexity:** O(m × n)
- **Auxiliary Space:** O(1), excluding output storage.
- **Output Space:** O(m × n)

## Key Learning
Learned how to traverse a 2D matrix in spiral order using four boundaries and how to handle single-row and single-column edge cases.

---

Part of my Java DSA and LeetCode practice journey.
