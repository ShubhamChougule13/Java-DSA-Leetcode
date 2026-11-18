# LeetCode 39: Combination Sum

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Backtracking, Recursion

## Problem

Given an array of distinct integers and a target, return all unique combinations whose sum equals the target.

Each candidate can be used unlimited times.

## Example

**Input:**
```text
candidates = [2,3,6,7]
target = 7
```

**Output:**
```text
[[2,2,3],[7]]
```

## Approach: Backtracking

1. Sort the candidates to make pruning possible.
2. Maintain a current combination and remaining target.
3. If remaining target becomes zero, save a copy of the combination.
4. Try candidates starting from the current index.
5. Pass the same index during recursion to allow unlimited reuse.
6. Remove the last chosen candidate to backtrack.

## Complexity Analysis

- **Time:** Exponential in the worst case.
- **Auxiliary Space:** O(target / smallest candidate), excluding output storage.

## Key Learning

Understood how Backtracking explores combinations, how recursion allows candidate reuse, and how starting-index control prevents duplicate combinations in different orders.

---

Part of my Java DSA and LeetCode practice journey.
