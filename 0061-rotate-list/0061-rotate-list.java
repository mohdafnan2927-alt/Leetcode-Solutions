/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
        return head;
    }

    ListNode temp = head;
    int size = 0;

    // Calculate size
    while (temp != null) {
        size++;
        temp = temp.next;
    }

    k = k % size;

    int i = 0;

    while (i < k) {
        ListNode prev = null;
        temp = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        temp.next = head;
        prev.next = null;
        head = temp;

        i++;
    }
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna