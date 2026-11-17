# LeetCode 134: Gas Station

- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Greedy

## Problem
There are `n` gas stations arranged in a circular route. Each station provides some gas, and travelling to the next station consumes some gas.

Find the starting station index from which we can complete the entire circular journey. Return `-1` if no solution exists.

## Example

**Input:**
```text
gas  = [1,2,3,4,5]
cost = [3,4,5,1,2]
```

**Output:**
```text
3
```

## Approach: Greedy Algorithm

Maintain three variables:

- `totalTank`: Tracks the total petrol balance across all stations.
- `currentTank`: Tracks petrol balance from the current candidate starting point.
- `start`: Stores the candidate starting station index.

For every station:
1. Calculate `gas[i] - cost[i]`.
2. Add the difference to both tank variables.
3. If `currentTank` becomes negative, move the candidate start to `i + 1` and reset `currentTank` to zero.
4. After processing all stations, return `-1` if `totalTank` is negative; otherwise return `start`.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Key Learning

Learned how the Greedy approach eliminates multiple impossible starting positions in one pass. Also understood why the total petrol balance determines whether completing the circular journey is possible.

---

Part of my Java DSA and LeetCode practice journey.
