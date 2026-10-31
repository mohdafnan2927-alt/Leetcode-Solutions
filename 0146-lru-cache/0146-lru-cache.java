class LRUCache {
    LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
    public int c =0;
    public LRUCache(int capacity) {
        c = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int k = key;
            int v = map.get(key);
            map.remove(key);
            map.put(k,v);
            return v;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
        }else if(map.size()>=c){
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey);
        }
        map.put(key,value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna