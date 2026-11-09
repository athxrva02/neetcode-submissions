class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int longest = 0;
        for(int num: nums) {
            hs.add(num);
        }

        for(int num: nums) {


            if(!hs.contains(num - 1)) {
                int length = 1;

                while(hs.contains(num + length)) {
                    length++;
                }

                longest = Math.max(length, longest);

            }
        }   

        return longest;
    }
}
