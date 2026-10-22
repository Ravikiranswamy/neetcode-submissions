class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;

        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        while (start <= end) {
            int k = start + (end - start) / 2;
            long hr = 0;

            for (int j = 0; j < piles.length; j++) {
                hr += piles[j] / k;

                if (piles[j] % k != 0) {
                    hr++;
                }
            }

            if (hr <= h) {
                end = k - 1;
            } else {
                start = k + 1;
            }
        }

        return start;
    }
}