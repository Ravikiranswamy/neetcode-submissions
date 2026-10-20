class Solution {
    public int maxArea(int[] heights) {
        int i,j,area=0,maxarea=0;
        i=0; j=heights.length-1;

        while(i<j)
        {

        area=(Math.min(heights[i],heights[j])*(j-i));

        if(maxarea<area)
        {
            maxarea=area;
        }
        if(heights[i] > heights[j])
        {
            j--;
        }
        else
        {
            i++;
        }
        }
        return maxarea;
    }
}
