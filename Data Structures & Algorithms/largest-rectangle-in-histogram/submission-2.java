class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxarea = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {

                int index = stack.pop();

                int height = heights[index];

                int right = i;

                int left;
                if (stack.isEmpty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }

                int width = right - left - 1;

                int area = height * width;

                maxarea = Math.max(maxarea, area);
            }

            stack.push(i);
        }

        // Process bars that never found a smaller bar on the right
        while (!stack.isEmpty()) {

            int index = stack.pop();

            int height = heights[index];

            int right = heights.length;

            int left;
            if (stack.isEmpty()) {
                left = -1;
            } else {
                left = stack.peek();
            }

            int width = right - left - 1;

            int area = height * width;

            maxarea = Math.max(maxarea, area);
        }

        return maxarea;
    }
}