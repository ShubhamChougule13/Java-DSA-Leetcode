# LeetCode 53: Maximum Subarray

- **Difficulty:** Medium
- **Topics:** Array, Dynamic Programming, Kadane's Algorithm
- **Language:** Java
- **Problem:** [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)

## Problem Summary

Given an integer array `nums`, find the non-empty contiguous subarray with the largest sum and return that sum.

## Example

**Input**

```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output**

```text
6
```

**Explanation:** The subarray `[4,-1,2,1]` has the maximum sum:

`4 + (-1) + 2 + 1 = 6`

## Approach 1: Brute Force

Generate every possible subarray and calculate its sum.

- **Time Complexity:** O(n³) if each subarray sum is recalculated.
- **Auxiliary Space:** O(1).

Maintaining a running sum improves this approach to O(n²).

## Approach 2: Kadane's Algorithm

Maintain two variables:

- `currentSum`: Maximum sum of a subarray ending at the current position.
- `maxSum`: Maximum sum found so far.

For each element, choose between starting a new subarray and extending the existing one:

`currentSum = max(nums[i], currentSum + nums[i])`

Then update the overall maximum:

`maxSum = max(maxSum, currentSum)`

## Complexity Analysis

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

Each element is processed once, and only two variables are needed.

## Important Edge Cases

- A single-element array, such as `[1]`.
- All-negative values, such as `[-5,-2,-8]`, where the answer is `-2`.
- Mixed positive and negative values.
- The best subarray may start or end at the array boundaries.

## Key Learnings

- A subarray must be contiguous and non-empty.
- A negative running sum may be better discarded when starting a new subarray.
- Kadane's Algorithm solves the problem in linear time.
- Initializing `maxSum` with `nums[0]` correctly handles all-negative arrays.

## Files

- [`solution.java`](solution.java) — Java implementation

---

*Part of my Java DSA and LeetCode learning journey.*
