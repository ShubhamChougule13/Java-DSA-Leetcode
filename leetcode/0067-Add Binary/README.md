# LeetCode 67: Add Binary

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Math, Simulation

## Problem
Given two binary strings `a` and `b`, return their sum as a binary string.

## Examples

**Example 1**
- Input: `a = "11"`, `b = "1"`
- Output: `"100"`

**Example 2**
- Input: `a = "1010"`, `b = "1011"`
- Output: `"10101"`

## Approach
1. Start adding digits from the rightmost positions of both strings.
2. Convert each character into an integer using `charAt() - '0'`.
3. Add both digits and the previous carry.
4. Calculate the result bit using `sum % 2`.
5. Calculate the next carry using `sum / 2`.
6. Reverse the result to get the correct binary number.

## Complexity Analysis
- **Time Complexity:** O(max(n, m))
- **Auxiliary Space:** O(max(n, m))

## Solution
[View My LeetCode Solution](PASTE_YOUR_LEETCODE_SOLUTION_URL_HERE)

## Key Learning
Learned how to perform binary addition manually using two pointers, carry handling, and StringBuilder in Java.

---

Part of my Java DSA and LeetCode practice journey.
