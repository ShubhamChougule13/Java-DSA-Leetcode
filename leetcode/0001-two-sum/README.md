# LeetCode 1: Two Sum

- **Platform:** LeetCode
- **Difficulty:** Easy
- **Topic:** Array, HashMap
- **Problem:** [Two Sum](https://leetcode.com/problems/two-sum/)

## Problem Summary

Given an integer array `nums` and an integer `target`, return the indices of two distinct elements whose sum equals the target.

Each input is guaranteed to have exactly one solution, and the same array element cannot be used twice.

## Example

**Input**

```text
nums = [2, 7, 11, 15]
target = 9
```

**Output**

```text
[0, 1]
```

**Explanation:** `nums[0] + nums[1] = 2 + 7 = 9`.

The answer contains indices, not values.

## Approach 1: Brute Force

Use two nested loops to examine every pair of distinct elements.

If `nums[i] + nums[j] == target`, return their indices.

- **Time Complexity:** O(n²)
- **Auxiliary Space:** O(1)

## Approach 2: HashMap (Optimized)

Traverse the array from left to right.

For each element:

1. Calculate `required = target - nums[i]`.
2. Check whether `required` exists in the HashMap.
3. If found, return the stored index and the current index.
4. Otherwise, store the current number and its index.

The map stores each previously visited number as the key and its original index as the value.

- **Average Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

## Why HashMap?

Brute force may check O(n²) pairs. A HashMap allows average-case constant-time lookups, reducing the expected overall time to O(n).

The trade-off is additional memory usage.

## Key Observation

For every current number, the required partner is:

`required = target - current`

Checking before inserting the current element ensures that the algorithm finds a previously visited partner and does not use the same array position twice.

Duplicate values are allowed when their indices are different.

## Concepts Learned

- Array traversal
- Nested loops
- HashMap key-value pairs
- Complement-based lookup
- Original array indices
- Time and space complexity

## Files

- [`Solution.java`](Solution.java) — Java implementation

---

*Part of my Java DSA and LeetCode learning journey.*
