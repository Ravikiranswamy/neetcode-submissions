class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end =nums.length-1;
        int mid;

        while(start <= end)
        {  mid=(end+start)/2;

            if(target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
               
            }
            else 
            {
                end = mid-1;
                
            }

        }
        return start;
    }
}