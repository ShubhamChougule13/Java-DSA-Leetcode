# LeetCode 2913: Subarrays Distinct Element Sum of Squares I

- **Difficulty:** Easy
- **Topics:** Array, HashSet, Nested Loops
- **Language:** Java
- **Problem:** [LeetCode 2913](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/)

## Problem Summary

Given an integer array `nums`, calculate the sum of the squares of the distinct element counts of all possible non-empty contiguous subarrays.

For each subarray:

1. Count its distinct values.
2. Square the distinct count.
3. Add the square to the final result.

## Example

**Input**

```text
nums = [1, 2, 1]
```

**Output**

```text
15
```

**Explanation**

| Subarray | Distinct count | Square |
|---|---:|---:|
| `[1]` | 1 | 1 |
| `[2]` | 1 | 1 |
| `[1]` | 1 | 1 |
| `[1, 2]` | 2 | 4 |
| `[2, 1]` | 2 | 4 |
| `[1, 2, 1]` | 2 | 4 |

Total = `1 + 1 + 1 + 4 + 4 + 4 = 15`.

## Approach: Nested Loops + HashSet

1. Fix the starting index `i`.
2. Create an empty `HashSet` for distinct values.
3. Move the ending index `j` from `i` to the end of the array.
4. Add `nums[j]` to the set.
5. Obtain the distinct count using `set.size()`.
6. Add `distinctCount * distinctCount` to the answer.
7. Return the final answer.

## Java Solution

See [`Solution.java`](solution.java).

## Complexity Analysis

- **Time Complexity:** O(n²) average.
- **Auxiliary Space Complexity:** O(n).

There are `n(n + 1) / 2` non-empty subarrays. Maintaining a HashSet incrementally avoids rescanning every subarray to count distinct values.

## Key Learnings

- A subarray is contiguous and non-empty.
- Duplicate values count only once toward the distinct count.
- Fixing a starting index and extending the ending index generates every subarray.
- A HashSet maintains unique values efficiently.
- Reusing previous work improves the brute-force approach from O(n³) to O(n²).

---

*Part of my Java DSA and LeetCode learning journey.*
