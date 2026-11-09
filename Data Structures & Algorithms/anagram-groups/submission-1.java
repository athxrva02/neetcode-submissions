class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Batch it? Based on length??
        // o(26) array to count for each anagram type. If found, add to list

        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs) {
            int[] count = new int[26];

            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
