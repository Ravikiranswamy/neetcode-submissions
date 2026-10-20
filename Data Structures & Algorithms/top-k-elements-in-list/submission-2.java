class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int maxElement = 0;

            // Scan entire map to find highest frequency
            for (int key : map.keySet()) {

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    maxElement = key;
                }
            }

            ans[i] = maxElement;

            // Remove so it won't be selected again
            map.remove(maxElement);
        }

        return ans;
    }
}
