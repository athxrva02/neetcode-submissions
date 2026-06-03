class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            int[] countArray = new int[26];
            for(Character c: s.toCharArray()) {
                countArray[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for(int num: countArray) {
                key.append(num).append("<>");
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<String>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
