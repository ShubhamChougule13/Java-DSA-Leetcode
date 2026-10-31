# LeetCode 28: Find the Index of the First Occurrence in a String

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, String Matching

## Problem
Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`. Return `-1` if `needle` is not part of `haystack`.

## Examples

**Example 1**
- Input: `haystack = "sadbutsad"`, `needle = "sad"`
- Output: `0`

**Example 2**
- Input: `haystack = "leetcode"`, `needle = "leeto"`
- Output: `-1`

## Approach
1. Traverse the haystack using an outer loop.
2. At each possible starting position, compare characters with the needle.
3. Use an inner loop to check whether all characters match.
4. Return the starting index if the complete needle matches.
5. Return `-1` if no occurrence is found.

## Complexity Analysis
- **Time Complexity:** O((n - m + 1) × m), worst case O(n × m).
- **Auxiliary Space:** O(1).

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Key Learning
Learned how to perform manual string matching using nested loops and character comparisons to find the first occurrence of a substring.

---

Part of my Java DSA and LeetCode practice journey.
