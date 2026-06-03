class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int num: nums) {
            map.put(num, false);
        }

        for(int num: nums) {
            if(map.get(num)) {
                return true;
            }
            map.put(num, true);
        }

        return false;
    }
}