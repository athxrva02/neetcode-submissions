class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int reqlen = (nums.length / 3) + 1;

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.size() > 2) {
                HashMap<Integer, Integer> newMap = new HashMap<>();
                for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    if(entry.getValue() > 1) {
                        newMap.put(entry.getKey(), entry.getValue() - 1);
                    }
                }
                map = newMap;
            }   
        }

        for(int key: map.keySet()) {
            int freq = 0;
            for(int num: nums) {
                if(key == num) {
                    freq++;
                }
            }
            if(freq >= reqlen) {
                res.add(key);
            }
        }

        return res;
    }
}