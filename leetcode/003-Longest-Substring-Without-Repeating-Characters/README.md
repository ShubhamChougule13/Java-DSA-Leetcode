# LeetCode 3: Longest Substring Without Repeating Characters

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** String, Sliding Window, HashSet

## Problem
Given a string `s`, find the length of the longest substring that contains no repeating characters.

## Examples

**Example 1**
- Input: `s = "abcabcbb"`
- Output: `3`

**Example 2**
- Input: `s = "bbbbb"`
- Output: `1`

**Example 3**
- Input: `s = "pwwkew"`
- Output: `3`

## Approach
1. Use two pointers, `left` and `right`, to maintain a sliding window.
2. Store the window's characters in a HashSet.
3. When a duplicate appears, remove characters from the left until the duplicate is eliminated.
4. Add the current character to the set.
5. Update the maximum window length at every step.

## Complexity Analysis
- **Time Complexity:** O(n) average
- **Auxiliary Space:** O(min(n, Σ)), where Σ is the character set size.

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

## Key Learning
Learned how the Sliding Window technique and HashSet work together to find the longest substring without repeating characters in linear time.

---

Part of my Java DSA and LeetCode practice journey.
