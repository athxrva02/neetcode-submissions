class MyHashSet {

    private final ListNode[] set;

    public MyHashSet() {
        set = new ListNode[10000];

        for(int i = 0; i < 10000; i++) {
            set[i] = new ListNode(0);
        }    
    }
    
    public void add(int key) {
        ListNode current = set[key % set.length];
        
        if(!contains(key)) {
            current.next = new ListNode(key);
        }
    }
    
    public void remove(int key) {
        ListNode current = set[key % set.length];
        while(current.next != null) {
            if(current.next.key == key) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode current = set[key % set.length];

        while(current.next != null) {
            if(current.next.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public static class ListNode {
    private int key;
    private ListNode next;

    ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
