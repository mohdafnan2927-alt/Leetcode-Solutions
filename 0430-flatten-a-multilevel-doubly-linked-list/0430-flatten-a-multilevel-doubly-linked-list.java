/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
            Node nxt = temp.next;
            Node child = temp.child;
            //connect this child node to temp
            temp.next = child;
            child.prev = temp;
            temp.child = null;
            Node childEnd = child;
            while(childEnd.next!=null){
                childEnd = childEnd.next;
            }
            //connect the childEnd with the next of original list
            childEnd.next = nxt;
            if(nxt!=null){
                nxt.prev = childEnd;
            }    
            }
            temp = temp.next;
        }
        return head;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna