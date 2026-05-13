class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;
        for(int num: nums){            
            
            if(!set.contains(num-1)){
                int curr = num;
                int streak = 1;
                while(set.contains(curr+1)){
                    curr += 1;
                    streak += 1;
                }
                longest = streak>longest?streak:longest;
            }            
        }
        return longest;
    }
}
