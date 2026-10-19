# LeetCode 14: Longest Common Prefix

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Array

## Problem
Given an array of strings, find the longest common prefix shared by all strings. If no common prefix exists, return an empty string.

## Examples

**Example 1**
- Input: `strs = ["flower", "flow", "flight"]`
- Output: `"fl"`

**Example 2**
- Input: `strs = ["dog", "racecar", "car"]`
- Output: `""`

## Approach
1. Initialize the prefix with the first string.
2. Compare the prefix with each remaining string.
3. If a string does not start with the current prefix, remove the last character.
4. Continue until the prefix matches or becomes empty.
5. Return the final prefix.

## Complexity Analysis
- **Time Complexity:** O(n × m²) worst case for the shrinking-prefix approach.
- **Auxiliary Space:** O(m) worst case due to string operations.

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/longest-common-prefix/)

## Key Learning
Learned how to compare strings and reduce a candidate prefix until it matches all strings.

---

Part of my Java DSA and LeetCode practice journey.
