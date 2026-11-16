# LeetCode 33: Search in Rotated Sorted Array

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Binary Search, Modified Binary Search

## Problem
Given a rotated sorted array of distinct integers, find the index of the target. Return `-1` if it does not exist.

## Example

**Input:**
```text
nums = [4,5,6,7,0,1,2]
target = 0
```

**Output:**
```text
4
```

## Approach: Modified Binary Search

1. Initialize `left` and `right`.
2. Calculate the middle index.
3. If the middle element equals the target, return its index.
4. Identify which half is sorted.
5. Check whether the target belongs to that sorted half.
6. Eliminate the other half and repeat.

## Complexity Analysis
- **Time Complexity:** O(log n)
- **Auxiliary Space:** O(1)

## Key Learning
Learned how to identify a sorted half in a rotated array and apply binary search without sorting the array.

---

Part of my Java DSA and LeetCode practice journey.
