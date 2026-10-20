# LeetCode 20: Valid Parentheses

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Stack

## Problem
Given a string containing parentheses, curly brackets, and square brackets, determine whether the brackets are valid and correctly ordered.

## Examples

**Example 1**
- Input: `s = "()"`
- Output: `true`

**Example 2**
- Input: `s = "()[]{}"`
- Output: `true`

**Example 3**
- Input: `s = "(]"`
- Output: `false`

**Example 4**
- Input: `s = "([)]"`
- Output: `false`

**Example 5**
- Input: `s = "{[]}"`
- Output: `true`

## Approach
1. Use a stack to store opening brackets.
2. Push each opening bracket onto the stack.
3. For every closing bracket, check whether the stack is empty.
4. Pop the top opening bracket and verify that its type matches the closing bracket.
5. Return `true` only if all brackets match and the stack is empty at the end.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/valid-parentheses/)

## Key Learning
Learned how the Stack data structure uses the Last In, First Out (LIFO) principle to validate correctly nested brackets.

---

Part of my Java DSA and LeetCode practice journey.
