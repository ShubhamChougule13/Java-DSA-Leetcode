# LeetCode 4: Median of Two Sorted Arrays

- **Difficulty:** Hard
- **Language:** Java
- **Topics:** Array, Binary Search, Divide and Conquer

## Problem
Given two sorted arrays, return the median of the combined sorted array.

The expected time complexity is O(log(m + n)).

## Examples

**Example 1**
- Input: `nums1 = [1,3]`, `nums2 = [2]`
- Output: `2.0`

**Example 2**
- Input: `nums1 = [1,2]`, `nums2 = [3,4]`
- Output: `2.5`

## Approach
1. Apply binary search on the smaller array.
2. Divide both arrays into left and right partitions.
3. Calculate the partition boundaries.
4. Check whether the left partition elements are correctly ordered against the right partition.
5. Adjust binary search boundaries until a valid partition is found.
6. Calculate the median based on whether the total number of elements is odd or even.

## Complexity Analysis
- **Time Complexity:** O(log(min(m, n)))
- **Auxiliary Space:** O(1)

## Solution
[My LeetCode Solution — Add your submission Share URL here](PASTE_YOUR_SUBMISSION_URL_HERE)

## Key Learning
Learned how binary search and partitioning can find the median of two sorted arrays without merging them.

---

Part of my Java DSA and LeetCode practice journey.
