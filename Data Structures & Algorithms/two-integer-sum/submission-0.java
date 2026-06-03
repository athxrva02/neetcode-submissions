class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int k = target - nums[i];

            if(map.containsKey(k)) {
                return i <= map.get(k) ? new int[]{i, map.get(k)} : new int[]{map.get(k), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
