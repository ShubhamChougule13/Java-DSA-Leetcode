# LeetCode 169: Majority Element

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Array, Sorting, Boyer-Moore Voting Algorithm

## Problem

Given an integer array, find the element that appears more than `n / 2` times. The problem guarantees that a majority element exists.

## Example

**Input:**
```text
nums = [2,2,1,1,1,2,2]
```

**Output:**
```text
2
```

## Approach: Boyer-Moore Voting Algorithm

Maintain two variables:

- `candidate`: Stores the potential majority element.
- `count`: Tracks its voting balance.

Steps:
1. If count is zero, select the current element as the candidate.
2. If the current element equals the candidate, increment count.
3. Otherwise, decrement count.
4. Return the final candidate.

The majority element appears more than half the time, so it cannot be completely cancelled by all other elements.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Key Learning

Understood the Boyer-Moore Voting Algorithm and how cancellation of different elements helps identify a majority element using constant extra space.

---

Part of my Java DSA and LeetCode practice journey.
