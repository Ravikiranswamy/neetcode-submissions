class Solution {
    public int trap(int[] height) {
        int i,j,res=0;
       i=0; j=height.length-1;
       int maxright=height[j];
       int maxleft=height[i];
       
        while(i < j)
        {
          if(maxleft <= maxright)
          {
            i++;
            maxleft = Math.max(maxleft,height[i]);
            res += maxleft - height[i];
          }
          else
          {
            j--;
            maxright = Math.max(maxright,height[j]);
            res += maxright-height[j];
          }
        }
        return res;
    }
}
