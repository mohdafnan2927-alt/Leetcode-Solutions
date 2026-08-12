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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
    //find size;
     ListNode temp = head;
     int size=0;
    //calculate the size
    while(temp!=null){
        size++;
        temp = temp.next;
    }
    int rn = size;//remaining nodes
    temp = head;
    ListNode prevGroupTail = null;
    while(rn>=k){
        //calculate the last node
        int i =1;
        while(i<k){
            temp = temp.next;
            i++;
        }
        ListNode nextt = temp.next;//this for nextnode of temp
        ListNode firstnode = curr;
        //now reverse
        ListNode prev= null;
        ListNode next;
        while(curr!=nextt){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if (prevGroupTail != null) {
            prevGroupTail.next = prev;
        } else {
            head = prev;
        }
        //first node should point to nextt
        firstnode.next = nextt;
         prevGroupTail = firstnode;
        temp = nextt;//so temp starts from the nextt
        curr = nextt;//so the reversal also starts from the nextt
        rn = rn-k;//calculate remaining nodes
    }
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna