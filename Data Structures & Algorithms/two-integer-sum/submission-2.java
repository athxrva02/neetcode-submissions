class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int key;
        for(int i = 0; i < nums.length; i++) {
            key = target - nums[i];

            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }

            map.put(key, i);
        }

        return new int[] {-1,-1};
    }
}