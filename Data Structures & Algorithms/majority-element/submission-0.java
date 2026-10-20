class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
int val =0;
      for(int i=0; i<nums.length; i++)
      {
        if(map.containsKey(nums[i]))
      {
        int oldcount = map.get(nums[i]);
        map.put(nums[i],oldcount+1);
      }
      else
      {
        map.put(nums[i],1);
      }
      } 
      for(int i=0; i<nums.length; i++)
      {
        if(map.get(nums[i]) >=nums.length/2.0)
        {
             val = nums[i];
            break;
        }
      }
      return val;
    }
}