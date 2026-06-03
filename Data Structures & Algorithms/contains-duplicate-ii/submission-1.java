class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) return true;
            
            window.add(nums[i]);

            if (window.size() > k) window.remove(nums[i - k]);
        }
        return false;
    }

    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     Map<Integer, Integer> map = new HashMap<>();

    //     for(int i = 0; i < nums.length; i++) {
    //         if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
    //             return true;
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return false;
    // }
}