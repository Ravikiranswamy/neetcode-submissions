class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j,l;
        i=0; j=i+1;
        while(j<nums.length)
        {
           l=i;
           while(l<j)
           {
            if(nums[l] == nums[j] && j-l <= k)
            {
                i=l;
                return true;
            }
            else
            {
              l++;
            }
    

           }
           
           j++;
        }
        return false;
    }
}