

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            map.put(nums[i], 0);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) == 1) {
                continue;
            }

            int count = 1;
            int num = nums[i];

            // Expand toward smaller numbers
            while (set.contains(num - 1)) {
                num--;
                if (map.get(num) == 1) {
                    break;
                }
                map.put(num, 1);
                count++;
            }

            num = nums[i];

            // Expand toward larger numbers
            while (set.contains(num + 1)) {
                num++;
                if (map.get(num) == 1) {
                    break;
                }
                map.put(num, 1);
                count++;
            }

            map.put(nums[i], 1);
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
