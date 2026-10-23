# LeetCode 15: 3Sum

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Two Pointers, Sorting

## Problem
Given an integer array, return all unique triplets `[nums[i], nums[j], nums[k]]` whose sum equals zero. Duplicate triplets are not allowed.

## Examples

**Example 1**
- Input: `nums = [-1,0,1,2,-1,-4]`
- Output: `[[-1,-1,2],[-1,0,1]]`

**Example 2**
- Input: `nums = [0,1,1]`
- Output: `[]`

**Example 3**
- Input: `nums = [0,0,0]`
- Output: `[[0,0,0]]`

## Approach
1. Sort the array.
2. Fix one element using a loop.
3. Use left and right pointers to find the other two elements.
4. Move the pointers according to whether the sum is negative, positive, or zero.
5. Skip duplicate values to ensure unique triplets.
6. Return the result list.

## Complexity Analysis
- **Time Complexity:** O(n²)
- **Auxiliary Space:** O(1) for the two-pointer algorithm, excluding sorting implementation details and output storage.

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/3sum/)

## Key Learning
Learned how sorting and the Two Pointers technique reduce a three-loop brute-force approach to an O(n²) solution while avoiding duplicate triplets.

---

Part of my Java DSA and LeetCode practice journey.
