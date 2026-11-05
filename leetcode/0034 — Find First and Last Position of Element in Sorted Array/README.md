# LeetCode 34: Find First and Last Position of Element in Sorted Array

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Binary Search

## Problem
Given a sorted array of integers, find the starting and ending positions of a given target. Return `[-1, -1]` if the target is not found.

## Example

**Input:**
`nums = [5,7,7,8,8,10], target = 8`

**Output:**
`[3,4]`

## Approach: Two Binary Searches

1. Use Binary Search to find the first occurrence of the target.
2. When found, save the index and continue searching on the left.
3. Use another Binary Search to find the last occurrence.
4. When found, save the index and continue searching on the right.
5. Return both indexes.

## Complexity Analysis
- **Time Complexity:** O(log n)
- **Auxiliary Space:** O(1)

## Key Learning
Learned how to modify standard Binary Search to find the first and last occurrences of duplicate elements in a sorted array.

---

Part of my Java DSA and LeetCode practice journey.
