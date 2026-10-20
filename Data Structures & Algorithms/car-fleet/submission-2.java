class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
       
        Deque<Double> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2; j++)
            {
                cars[i][0] = position[i];
                cars[i][1] = speed[i];
            }
        }
        Arrays.sort(cars,(a,b) -> Integer.compare(b[0],a[0]));

        for(int i=0; i<n; i++)
        {
            double t = (double)(target-cars[i][0])/cars[i][1];

            if(stack.isEmpty() || t>stack.peek())
            {
                stack.push(t);
            
            }
        }
        return stack.size();
    }
}

