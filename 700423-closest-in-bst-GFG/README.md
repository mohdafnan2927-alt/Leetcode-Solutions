# [Closest in BST](https://www.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1?utm_source=chatgpt.com)
## Medium
Given the root of a Binary Search Tree (BST) and an integer k, find the minimum absolute difference between k and the value of any node in the BST.
Examples:
Input: root = [10, 2, 11, 1, 5, N, N, N, N, 3, 6, N, 4], k = 13

Output: 2
Explanation: The node that has value nearest to k is 11. So, the minimum absolute difference is |11-13| = 2.

Input: root = [8, 1, 9, N, 4, N, 10, 3], k = 9
Output: 0
Explanation: The node that has value nearest to k is 9.  So, the minimum absolute difference is |9-9| = 0.
Constraints:1&nbsp;≤&nbsp;number of nodes&nbsp;≤&nbsp;1051&nbsp;≤ node.data, k ≤&nbsp;105