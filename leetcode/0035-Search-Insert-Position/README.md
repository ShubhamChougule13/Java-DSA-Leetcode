# LeetCode 35: Search Insert Position

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Array, Binary Search

## Problem
Given a sorted array of distinct integers and a target value, return its index if found. Otherwise, return the index where it should be inserted to maintain sorted order.

## Examples

**Example 1**
- Input: `nums = [1,3,5,6]`, `target = 5`
- Output: `2`

**Example 2**
- Input: `nums = [1,3,5,6]`, `target = 2`
- Output: `1`

**Example 3**
- Input: `nums = [1,3,5,6]`, `target = 7`
- Output: `4`

## Approach
1. Initialize `left` and `right` pointers.
2. Calculate the middle index.
3. Compare the middle element with the target.
4. Adjust the search range based on the comparison.
5. If the target is not found, return `left` as the insertion position.

## Complexity Analysis
- **Time Complexity:** O(log n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/search-insert-position/)

## Key Learning
Learned how Binary Search efficiently finds a target or its correct insertion position in a sorted array.

---

Part of my Java DSA and LeetCode practice journey.
