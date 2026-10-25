# LeetCode 2: Add Two Numbers

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Linked List, Math, Recursion

## Problem
Given two non-empty linked lists representing non-negative integers in reverse order, add the numbers and return the sum as a linked list in reverse order.

## Examples

**Example 1**
- Input: `l1 = [2,4,3]`, `l2 = [5,6,4]`
- Output: `[7,0,8]`
- Explanation: `342 + 465 = 807`

**Example 2**
- Input: `l1 = [0]`, `l2 = [0]`
- Output: `[0]`

**Example 3**
- Input: `l1 = [9,9,9,9,9,9,9]`, `l2 = [9,9,9,9]`
- Output: `[8,9,9,9,0,0,0,1]`

## Approach
1. Use a dummy node to build the result linked list.
2. Add the current digits from both lists along with the carry.
3. Calculate the result digit using `sum % 10`.
4. Calculate the next carry using `sum / 10`.
5. Append the result digit and move to the next nodes.
6. Continue while either list has digits remaining or a carry exists.

## Complexity Analysis
- **Time Complexity:** O(max(m, n))
- **Auxiliary Space:** O(1), excluding the result list.
- **Output Space:** O(max(m, n) + 1) in the worst case.

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/add-two-numbers/)

## Key Learning
Learned how to add numbers represented by linked lists using digit-by-digit addition, carry handling, and a dummy node without converting the lists into integer values.

---

Part of my Java DSA and LeetCode practice journey.
