class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i,j;
        int n= temperatures.length;
        int[] result = new int[n];

        for(i=0; i<n; i++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
            {
                int prev = stack.pop();
                result[prev] = i-prev;
            }
            stack.push(i);
        }
        return result;


    }
}
