class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
        int maxFreq = -1;
        int maxKey = -1;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

        result[i] = maxKey;
        map.remove(maxKey); 
    }

    return result;
    }
}
