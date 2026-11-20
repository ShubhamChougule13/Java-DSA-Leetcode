# LeetCode 75: Sort Colors

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Two Pointers, Dutch National Flag Algorithm

## Problem

Given an array containing only `0`, `1`, and `2`, sort it in-place in the order `0, 1, 2` without using the built-in sorting function.

## Example

**Input:**
```text
[2,0,2,1,1,0]
```

**Output:**
```text
[0,0,1,1,2,2]
```

## Approach: Dutch National Flag Algorithm

Use three pointers:

- `low`: Boundary for zeros.
- `mid`: Current element being examined.
- `high`: Boundary for twos.

Rules:
1. If `nums[mid] == 0`, swap with `low`, then increment both pointers.
2. If `nums[mid] == 1`, increment `mid`.
3. If `nums[mid] == 2`, swap with `high`, then decrement `high`. Do not increment `mid` yet.

Continue while `mid <= high`.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Traversal:** One pass

## Key Learning

Learned how three pointers divide an array into three regions and how the Dutch National Flag Algorithm sorts the array in one pass without extra storage.


---

Part of my Java DSA and LeetCode practice journey.
