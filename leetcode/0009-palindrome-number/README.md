# LeetCode 9: Palindrome Number

- **Difficulty:** Easy
- **Topics:** Math, Number Manipulation
- **Language:** Java
- **Problem:** [Palindrome Number](https://leetcode.com/problems/palindrome-number/)

## Problem Summary

Given an integer `x`, return `true` if it reads the same forward and backward. Otherwise, return `false`.

## Examples

| Input | Output | Reason |
|---|---|---|
| `121` | `true` | Reads the same in both directions |
| `-121` | `false` | The negative sign changes position |
| `10` | `false` | Reversed numeric value is `1` |

## Approach 1: String Conversion

Convert the integer to a String and compare characters from both ends.

- **Time:** O(d)
- **Auxiliary Space:** O(d)

## Approach 2: Reverse the Entire Number

Extract digits using `% 10`, build the reversed number, and compare it with the original.

- **Time:** O(d)
- **Auxiliary Space:** O(1)

Care is required to avoid integer overflow.

## Approach 3: Reverse Half the Number

1. Return `false` for negative numbers.
2. Return `false` for non-zero numbers ending in zero.
3. Reverse the last half using `% 10` and `/ 10`.
4. Stop when the reversed half becomes greater than or equal to the remaining half.
5. Compare the halves, ignoring the middle digit for odd-length numbers.

## Complexity Analysis

- **Time Complexity:** O(log x), for positive non-zero `x`.
- **Auxiliary Space Complexity:** O(1).

The algorithm avoids String conversion and does not need to construct the complete reversed number.

## Key Learnings

- Use `% 10` to extract the last digit.
- Use `/ 10` to remove the last digit.
- Handle negative numbers and trailing zeros.
- Reverse only half the digits to avoid overflow.
- For odd-length numbers, ignore the middle digit when comparing halves.

## Files

- [`solution.java`](solution.java) — Java implementation

---

*Part of my Java DSA and LeetCode learning journey.*
