# LeetCode 7: Reverse Integer

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Math, Integer Overflow

## Problem
Given a signed 32-bit integer, reverse its digits. If the reversed integer goes outside the signed 32-bit integer range, return `0`.

## Examples

**Example 1**
- Input: `x = 123`
- Output: `321`

**Example 2**
- Input: `x = -123`
- Output: `-321`

**Example 3**
- Input: `x = 120`
- Output: `21`

## Approach
1. Extract the last digit using the modulo operator (`% 10`).
2. Remove the last digit using integer division (`/ 10`).
3. Build the reversed number by multiplying the previous result by 10 and adding the extracted digit.
4. Check positive and negative integer overflow before updating the reversed number.
5. Return `0` if the reversed value exceeds the 32-bit integer range.

## Complexity Analysis
- **Time Complexity:** O(log₁₀ |x|)
- **Auxiliary Space:** O(1)

## Key Learning
Learned digit manipulation using modulo and division, along with handling integer overflow without using 64-bit integers.

---

Part of my Java DSA and LeetCode practice journey.
