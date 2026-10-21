# LeetCode 21: Merge Two Sorted Lists

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Linked List, Recursion, Two Pointers

## Problem
Given the heads of two sorted linked lists, merge them into one sorted linked list and return its head.

## Example

**Input**
- `list1 = [1,2,4]`
- `list2 = [1,3,4]`

**Output**
- `[1,1,2,3,4,4]`

## Approach
1. Create a dummy node and a tail pointer.
2. Compare the current values of both linked lists.
3. Attach the smaller node to the merged list.
4. Move the corresponding list pointer and advance the tail.
5. Attach the remaining nodes when one list becomes empty.
6. Return `dummy.next` as the merged list's head.

## Complexity Analysis
- **Time Complexity:** O(m + n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)

## Key Learning
Learned how to merge two sorted linked lists efficiently by comparing nodes and reusing existing links instead of creating a separate list of values.

---

Part of my Java DSA and LeetCode practice journey.
