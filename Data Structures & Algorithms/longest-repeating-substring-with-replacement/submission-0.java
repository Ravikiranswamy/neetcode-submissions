class Solution {
    public int characterReplacement(String s, int k) {
         HashMap<Character, Integer> count = new HashMap<>();

        int res = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            // count[s[r]] += 1
            char ch = s.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            // while window size - maximum frequency > k
            while ((r - l + 1) - Collections.max(count.values()) > k) {

                char leftChar = s.charAt(l);

                count.put(leftChar, count.get(leftChar) - 1);

                l++;
            }

            // res = max(res, window size)
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
    

