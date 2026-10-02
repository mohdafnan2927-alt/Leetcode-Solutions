/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    static class info{
            Node node;
            int hd;
            public info(Node node,int hd){
                this.node = node;
                this.hd = hd;
            }
        }
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        Queue<info> q = new LinkedList<>();
               HashMap<Integer,Node> map = new HashMap<>();
               q.add(new info(root,0));
               q.add(null);
               int min=0,max=0;
               while(!q.isEmpty()){
                   info curr = q.remove();
                   if(curr == null){
                       if(q.isEmpty()){
                           break;
                       }else{
                           q.add(null);
                       }
                   }else{
                           map.put(curr.hd,curr.node);
                       
                       if(curr.node.left !=null){
                           q.add(new info(curr.node.left,curr.hd-1));
                           min = Math.min(min,curr.hd-1);
                       }
                        if(curr.node.right !=null){
                           q.add(new info(curr.node.right,curr.hd+1));
                           max = Math.max(max,curr.hd+1);
                       }
                   }
               }
               ArrayList<Integer> ans = new ArrayList<>();
               for(int i =min;i<=max;i++){
                   ans.add(map.get(i).data);
               }
               return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna