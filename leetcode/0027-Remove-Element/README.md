# LeetCode 27: Remove Element

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Array, Two Pointers

## Problem
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place and return the number of elements that are not equal to `val`.

The first `k` elements must contain the remaining valid elements. The order of elements may be changed, and elements beyond index `k - 1` can be ignored.

## Examples

**Example 1**
- Input: `nums = [3,2,2,3]`, `val = 3`
- Output: `2`
- First two elements: `[2,2]`

**Example 2**
- Input: `nums = [0,1,2,2,3,0,4,2]`, `val = 2`
- Output: `5`
- First five elements: `[0,1,3,0,4]`

## Approach
1. Initialize a write pointer `k = 0`.
2. Traverse the array using pointer `i`.
3. If `nums[i] != val`, copy the element to `nums[k]` and increment `k`.
4. Skip elements equal to `val`.
5. Return `k`.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/remove-element/)

## Key Learning
Learned how to remove unwanted elements in-place using a write pointer, without creating an extra array.

---

Part of my Java DSA and LeetCode practice journey.
