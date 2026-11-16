class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // this is twosum with extra steps? one extra loop looks like
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i >0 && nums[i] == nums[i-1]) {
                continue;
            }


            int left = i+1, right = nums.length - 1;

            while(left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];

                if(threeSum > 0) {
                    right--;
                } else if(threeSum < 0) {
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;

                    while(nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }

        return res;
    }
}