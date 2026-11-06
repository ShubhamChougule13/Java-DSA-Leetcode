# LeetCode 29: Divide Two Integers

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Math, Bit Manipulation

## Problem
Given two integers, `dividend` and `divisor`, return their quotient without using multiplication, division, or modulo operators.

The result must be truncated towards zero and must fit within the 32-bit signed integer range.

## Examples

**Example 1**
- Input: `dividend = 10, divisor = 3`
- Output: `3`

**Example 2**
- Input: `dividend = 7, divisor = -3`
- Output: `-2`

## Approach: Bit Manipulation + Repeated Doubling

1. Convert both numbers into positive `long` values.
2. Determine the sign of the result using XOR.
3. Use bit shifting to double the divisor.
4. Subtract the largest possible chunks from the dividend.
5. Build the quotient using bit shifts.
6. Handle the integer overflow case.

## Complexity Analysis
- **Time Complexity:** O(1) for 32-bit integers
- **Auxiliary Space:** O(1)

## Key Learning
Learned how bit shifting and repeated doubling can be used to perform integer division without using multiplication, division, or modulo operators.

Also understood negative number handling and the Integer.MIN_VALUE overflow edge case.

---

Part of my Java DSA and LeetCode practice journey.
