# LeetCode 31: Next Permutation

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Two Pointers, Greedy

## Problem
Given an array of integers, rearrange it into the next lexicographically greater permutation. If no greater permutation exists, rearrange it into ascending order.

The modification must be done in-place using constant extra memory.

## Examples

**Example 1**
- Input: `nums = [1,2,3]`
- Output: `[1,3,2]`

**Example 2**
- Input: `nums = [3,2,1]`
- Output: `[1,2,3]`

**Example 3**
- Input: `nums = [1,1,5]`
- Output: `[1,5,1]`

## Approach
1. Scan from right to left to find the first index where `nums[i] < nums[i + 1]`. This is the pivot.
2. Find the rightmost element greater than the pivot.
3. Swap the pivot with that element.
4. Reverse the suffix after the pivot to obtain the smallest possible arrangement.

If no pivot exists, reverse the entire array.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/next-permutation/)

## Key Learning
Learned how to find the next lexicographical permutation using a pivot, swapping, and reversing the suffix without using extra space.

---

Part of my Java DSA and LeetCode practice journey.
