class Solution {
    
int[] c;
    
    public int[] sortArray(int[] nums) {
   int low=0; 
   int high=nums.length-1;
   c= new int[nums.length];
mergesort(nums,low,high);
return nums;
    }


      public void mergesort(int[] nums,int low,int high)
        {
            if(low>=high)
            {
                return;
            }
            int mid = (low+high)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);

            simplemerge(nums,low,mid,high);
        }
      public void simplemerge(int[] nums,int low,int mid,int high)
        {
           int i=low; 
           int j=mid+1;
           int k=low;
           while(i<=mid && j<= high)
           {
            if(nums[i] < nums[j])
            {
                c[k++] = nums[i++];
            }
            else
            {
                c[k++] = nums[j++];
            }
            }
           while(i<=mid)
            c[k++]=nums[i++];

           while(j<=high)
            c[k++]=nums[j++];
           
           for(i=low; i<=high; i++)
           {
            nums[i]=c[i];
           }
        
        }
}
    
