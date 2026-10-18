# LeetCode 13: Roman to Integer

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Greedy

## Problem
Given a Roman numeral string `s`, convert it into an integer.

## Examples

**Example 1**
- Input: `s = "III"`
- Output: `3`

**Example 2**
- Input: `s = "LVIII"`
- Output: `58`

**Example 3**
- Input: `s = "MCMXCIV"`
- Output: `1994`

## Approach
1. Traverse the Roman numeral string from left to right.
2. Convert each Roman symbol into its integer value.
3. Compare the current symbol's value with the next symbol's value.
4. If the current value is smaller, subtract it; otherwise, add it.
5. Return the final total.

## Complexity Analysis
- **Time Complexity:** `O(n)`
- **Auxiliary Space:** `O(1)`

## Solution
[View Java Solution](https://leetcode.com/problems/roman-to-integer/)

## Key Learning
Learned how to handle Roman numeral subtraction rules through character comparison and solve the problem in a single traversal.

---

Part of my Java DSA and LeetCode practice journey.
