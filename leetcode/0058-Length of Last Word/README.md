# LeetCode 58: Length of Last Word

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Two Pointers

## Problem
Given a string containing words and spaces, return the length of the last word.

A word is a continuous sequence of non-space characters.

## Examples

**Example 1**
- Input: `s = "Hello World"`
- Output: `5`

**Example 2**
- Input: `s = "   fly me   to   the moon   "`
- Output: `4`

**Example 3**
- Input: `s = "luffy is still joyboy"`
- Output: `6`

## Approach: Backward Traversal

1. Start from the last index of the string.
2. Skip all trailing spaces.
3. Count characters until reaching a space or the beginning of the string.
4. Return the count.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Key Learning
Learned how to traverse a string backwards, ignore trailing spaces, and count the last word without creating extra arrays or strings.

---

Part of my Java DSA and LeetCode practice journey.
