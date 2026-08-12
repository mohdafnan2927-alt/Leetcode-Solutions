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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode temp1 = l1;
    ListNode temp2 = l2;

    ListNode result = null;
    ListNode tail = null;

    int rem = 0;

    // Both lists have nodes
    while (temp1 != null && temp2 != null) {

        int sum = temp1.val + temp2.val + rem;

        int digit = sum % 10;
        rem = sum / 10;

        ListNode newNode = new ListNode(digit);

        // First node
        if (result == null) {
            result = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        temp1 = temp1.next;
        temp2 = temp2.next;
    }

    // Remaining nodes of l1
    while (temp1 != null) {

        int sum = temp1.val + rem;

        int digit = sum % 10;
        rem = sum / 10;

        ListNode newNode = new ListNode(digit);

        tail.next = newNode;
        tail = newNode;

        temp1 = temp1.next;
    }

    // Remaining nodes of l2
    while (temp2 != null) {

        int sum = temp2.val + rem;

        int digit = sum % 10;
        rem = sum / 10;

        ListNode newNode = new ListNode(digit);

        tail.next = newNode;
        tail = newNode;

        temp2 = temp2.next;
    }

    // Final carry
    if (rem != 0) {
        ListNode newNode = new ListNode(rem);
        tail.next = newNode;
        tail = newNode;
    }

    return result;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna