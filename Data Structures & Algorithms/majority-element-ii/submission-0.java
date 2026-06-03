class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int reqlen = (nums.length / 3) + 1;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num , 0) + 1);
            if(map.get(num) == reqlen) {
                res.add(num);
            }
        }

        return res;
    }
}