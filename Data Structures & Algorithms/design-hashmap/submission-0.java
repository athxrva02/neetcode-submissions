class MyHashMap {

    private ListNode[] map;
    public MyHashMap() {
        map = new ListNode[10000];

        for(int i = 0; i < map.length; i++) {
            map[i] = new ListNode();
        }
    }
    
    public void put(int key, int value) {
        ListNode current = map[hash(key)];

        while(current.next != null) {
            if(current.next.key == key) {
                current.next.value = value;
                return;
            }
            current = current.next;
        }
        current.next = new ListNode(key, value, null);
    }
    
    public int get(int key) {
        ListNode current = map[hash(key)];

        while(current.next != null) {
            if(current.next.key == key) {
                return current.next.value;
            }
            current = current.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        ListNode current = map[hash(key)];

        while(current.next != null) {
            if(current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    private int hash(int key) {
        return key % map.length;
    }


    class ListNode {
        private int key;
        private int value;
        private ListNode next;

        ListNode(int key, int value, ListNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        ListNode() {
            this(-1,-1,null);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */