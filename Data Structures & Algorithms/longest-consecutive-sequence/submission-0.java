class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxlen = 0;
        int len;

        for(int num: nums)
            hs.add(num);

        for(int num: hs) {
            if(!hs.contains(num - 1)){ //Indicate start
                len = 1;
                while(hs.contains(++num)) {
                    len++;
                }
                maxlen = Math.max(len, maxlen);
            } 
        }
        
        return maxlen;
    }
}