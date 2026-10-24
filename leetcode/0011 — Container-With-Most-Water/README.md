# LeetCode 11: Container With Most Water

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Two Pointers, Greedy

## Problem
Given an integer array `height`, find two vertical lines that form a container holding the maximum amount of water.

## Examples

**Example 1**
- Input: `height = [1,8,6,2,5,4,8,3,7]`
- Output: `49`

**Example 2**
- Input: `height = [1,1]`
- Output: `1`

## Approach
1. Initialize two pointers at the beginning and end of the array.
2. Calculate the area using the smaller height and the distance between the pointers.
3. Update the maximum area.
4. Move the pointer pointing to the shorter line.
5. Continue until both pointers meet.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/container-with-most-water/)

## Key Learning
Learned how the Two Pointers technique reduces the brute-force O(n²) approach to O(n) by moving the shorter boundary at each step.

---

Part of my Java DSA and LeetCode practice journey.
