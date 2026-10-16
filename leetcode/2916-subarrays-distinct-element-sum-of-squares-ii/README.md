# LeetCode 2916: Subarrays Distinct Element Sum of Squares II

- **Difficulty:** Hard
- **Topics:** Arrays, Segment Tree, Lazy Propagation, Hashing
- **Language:** Java
- **Problem:** [LeetCode 2916](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/)

## Problem Summary

Given an integer array `nums`, calculate the sum of the squares of the distinct counts of all non-empty contiguous subarrays.

Return the result modulo `1_000_000_007`.

## Example

**Input**

```text
nums = [1, 2, 1]
```

**Output**

```text
15
```

## Why the Basic Approach Is Too Slow

The Part I approach uses nested loops and a HashSet, taking O(n²) time.

Here, `nums.length` can reach 100,000, so processing every subarray individually is too expensive.

## Optimized Approach: Segment Tree + Lazy Propagation

For each ending index `i`, maintain the distinct counts of all subarrays ending at `i`, indexed by their starting positions.

Let `previous` be the last occurrence of `nums[i]`.

Only starting positions in `[previous + 1, i]` gain a new distinct value. Apply a range increment of one to this interval.

Each segment tree node maintains:

- `sum`: Sum of the distinct counts.
- `sumSquares`: Sum of their squares.
- `lazy`: Pending range increment.

For a range increment by `v` over length `L`:

- `newSum = oldSum + v * L`
- `newSumSquares = oldSumSquares + 2 * v * oldSum + v² * L`

All calculations are performed modulo `1_000_000_007`.

The root's `sumSquares` gives the contribution of all subarrays ending at the current index.

## Complexity Analysis

- **Time Complexity:** O(n log n)
- **Auxiliary Space:** O(n)

## Key Learnings

- Repeated values affect distinct counts differently depending on their previous occurrence.
- Segment Trees support efficient range updates.
- Lazy Propagation avoids updating every element individually.
- Maintaining both sums and squared sums enables efficient mathematical updates.
- Larger constraints often require a different algorithmic strategy.

## Files

- [`solution.java`](solution.java) — Java implementation

---

*Part of my Java DSA and LeetCode learning journey.*
