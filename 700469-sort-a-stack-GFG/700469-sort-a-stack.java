class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return;
        }
        int data = st.pop();

        sortStack(st);              // sort remaining stack first

        pushatbottom2(st, data); //call the pushatbottom func
    }
    public static void pushatbottom2(Stack<Integer> st,int data){
        if(st.isEmpty() ||st.peek()<=data){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushatbottom2(st,data);
        st.push(top);
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna