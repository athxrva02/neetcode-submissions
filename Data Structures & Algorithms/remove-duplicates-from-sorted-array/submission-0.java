class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) {
            return 1;
        }

        int i = 1, k = 1;
        while(i < nums.length) {
            if(nums[i - 1] != nums[i]) {
                nums[k++] = nums[i++];
            } else {
                i++;
            }
        }

        return k; 

    }
}