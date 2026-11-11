# LeetCode 17: Letter Combinations of a Phone Number

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** String, Backtracking, Recursion

## Problem
Given a string containing digits from 2 to 9, return all possible letter combinations that the phone number could represent.

## Example

**Input:** `digits = "23"`

**Output:**
`["ad","ae","af","bd","be","bf","cd","ce","cf"]`

## Approach: Backtracking

1. Create a mapping of digits to their corresponding letters.
2. Use recursion to process each digit.
3. Try every possible letter for the current digit.
4. Append the chosen letter to a StringBuilder.
5. When all digits are processed, add the combination to the result.
6. Backtrack by removing the last chosen letter and exploring the next choice.

## Complexity Analysis
- **Time Complexity:** O(n × 4ⁿ) upper bound
- **Auxiliary Space:** O(n), excluding output storage
- **Output Space:** O(n × 4ⁿ) upper bound

## Key Learning
Understood how recursion and backtracking work together to generate all possible combinations. Learned the importance of making a choice, exploring it, and undoing that choice before trying another.
---

Part of my Java DSA and LeetCode practice journey.
