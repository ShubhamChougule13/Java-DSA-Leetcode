# LeetCode 26: Remove Duplicates from Sorted Array

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Array, Two Pointers

## Problem
Given a sorted integer array, remove duplicates in-place so that each unique element appears only once. Return the number of unique elements, `k`.

The first `k` elements must contain the unique values in sorted order.

## Examples

**Example 1**
- Input: `nums = [1,1,2]`
- Output: `k = 2`
- First `k` elements: `[1,2]`

**Example 2**
- Input: `nums = [0,0,1,1,1,2,2,3,3,4]`
- Output: `k = 5`
- First `k` elements: `[0,1,2,3,4]`

## Approach
1. Initialize a pointer `i = 0` to track the last unique element.
2. Traverse the array with `j` starting from index `1`.
3. When `nums[j]` differs from `nums[i]`, increment `i` and copy `nums[j]` to `nums[i]`.
4. Return `i + 1` as the number of unique elements.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## Key Learning
Learned how the Two Pointers technique removes duplicates in-place while preserving the sorted order, without using extra space.

---

Part of my Java DSA and LeetCode practice journey.
