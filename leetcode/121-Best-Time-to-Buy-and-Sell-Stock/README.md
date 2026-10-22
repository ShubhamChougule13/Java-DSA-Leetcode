# LeetCode 121: Best Time to Buy and Sell Stock

- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Array, Greedy

## Problem
Given an array of stock prices, find the maximum profit possible by buying on one day and selling on a different future day. If no profit is possible, return `0`.

## Examples

**Example 1**
- Input: `prices = [7,1,5,3,6,4]`
- Output: `5`

**Example 2**
- Input: `prices = [7,6,4,3,1]`
- Output: `0`

## Approach
1. Initialize the minimum buying price with the first day's price.
2. Initialize the maximum profit to `0`.
3. Traverse the remaining prices.
4. Update the minimum price whenever a lower price is found.
5. Otherwise, calculate the profit from selling at the current price and update the maximum profit.
6. Return the maximum profit.

## Complexity Analysis
- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

## Solution
[View Problem on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

## Key Learning
Learned how to track the minimum price and calculate the maximum possible profit in a single traversal without checking every possible pair of days.

---

Part of my Java DSA and LeetCode practice journey.
