class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();  
      int n = nums.length;
      Arrays.sort(nums);

      for(int i=0; i<n; i++)
      {
       int j=i+1;
       int k=n-1;
       
       while(j<k)
       {
        if(nums[i]+nums[j]+nums[k] < 0)
       {
          j++;
       }
       else if(nums[i]+nums[j]+nums[k] > 0)
       {
          k--;
       }
       else
       {
        List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);
            if(!result.contains(triplet))
        result.add(triplet);
        j++;
        k--;
        }
       }
      }
      return result;
    }
}
