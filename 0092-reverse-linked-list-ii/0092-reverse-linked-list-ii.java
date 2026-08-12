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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         //find the the left
    ListNode temp1 = head;
    ListNode prevl = null;
    int i1 =1;
    while (temp1!=null){
        if(left==i1){
            break;
        }
        prevl = temp1;
        temp1 = temp1.next;
        i1++;
    }
    //find right
    ListNode temp2 = head;
    int i2 = 1;
    while(temp2!=null){
        if(right == i2){
            break;
        }
        temp2 = temp2.next;
        i2++;
    }
    //reverse
    ListNode prev = null;
    ListNode curr = temp1;
    ListNode next;
    ListNode afterright = temp2.next;
    while(curr != afterright){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    if(left ==1){
        head = prev;
    }else{
    prevl.next = prev;
    }
    temp1.next = curr;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna