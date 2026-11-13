# LeetCode 22: Generate Parentheses

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Backtracking, Recursion, String

## Problem
Given `n` pairs of parentheses, generate all combinations of well-formed parentheses.

## Example

**Input:** `n = 3`

**Output:**
`["((()))","(()())","(())()","()(())","()()()"]`

## Approach: Backtracking

Maintain two counters:
- `open`: Number of opening brackets used.
- `close`: Number of closing brackets used.

Rules:
1. Add `(` only if `open < n`.
2. Add `)` only if `close < open`.
3. When the current string reaches length `2 * n`, save it.
4. Backtrack after exploring each choice.

## Complexity Analysis
- **Time Complexity:** O(n × Cₙ), where Cₙ is the nth Catalan number.
- **Auxiliary Space:** O(n), excluding output storage.
- **Output Space:** O(n × Cₙ).

## Key Learning
Learned how to use backtracking with constraints to generate only valid combinations. Understood how opening and closing counters prevent invalid parentheses sequences.


---

Part of my Java DSA and LeetCode practice journey.
