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
    public ListNode middleNode(ListNode head) {
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int i =size/2;
        int idx=0;
        ListNode temp1 = head;
        while(idx<i){
            temp1 = temp1.next;
            idx++;
        }
        head = temp1;
        //even
        if(size%2==0){
        return head;
        }else{
            return head;//odd
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna