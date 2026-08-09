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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode mergeLL = new ListNode(-1);
        ListNode tail = mergeLL;

        while (temp1 != null) {

            while (temp2 != null && temp2.val <= temp1.val) {
                tail.next = new ListNode(temp2.val);
                tail = tail.next;
                temp2 = temp2.next;
            }

            tail.next = new ListNode(temp1.val);
            tail = tail.next;

            temp1 = temp1.next;
        }

        // Remaining elements of list2
        while (temp2 != null) {
            tail.next = new ListNode(temp2.val);
            tail = tail.next;
            temp2 = temp2.next;
        }

        return mergeLL.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna