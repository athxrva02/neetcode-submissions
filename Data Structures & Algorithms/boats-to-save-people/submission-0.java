class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length == 1) {
            return 1;
        }
        Arrays.sort(people);
        int boatCount = 0;
        int left = 0, right = people.length - 1;
        
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                boatCount++;
                left++;
                right--;
            } else {
                right--;
                boatCount++;
            }
        }

        return boatCount;
    }
}