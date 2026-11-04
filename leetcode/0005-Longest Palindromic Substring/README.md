# LeetCode 5: Longest Palindromic Substring

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** String, Two Pointers, Expand Around Center

## Problem
Given a string `s`, return the longest palindromic substring in it.

A palindrome reads the same forward and backward.

## Examples

**Example 1**
- Input: `s = "babad"`
- Output: `"bab"` or `"aba"`

**Example 2**
- Input: `s = "cbbd"`
- Output: `"bb"`

## Approach: Expand Around Center

1. Iterate through every character in the string.
2. Consider each index as the center of an odd-length palindrome.
3. Consider every pair of adjacent indexes as the center of an even-length palindrome.
4. Expand outward while the characters match.
5. Keep track of the starting index and maximum palindrome length.
6. Return the longest palindromic substring.

## Complexity Analysis
- **Time Complexity:** O(n²)
- **Auxiliary Space:** O(1)

## Key Learning
Learned the Expand Around Center technique and understood why both odd-length and even-length palindrome centers must be checked.
---

Part of my Java DSA and LeetCode practice journey.
