class Solution {
    public boolean isAnagram(String s, String t) {
     int[] nums1 = new int[s.length()];
     int[] nums2 = new int[t.length()];
     for(int i=0; i<s.length(); i++)
     {
        nums1[i] = s.charAt(i);
     }
     for(int j=0; j<t.length(); j++)
     {
        nums2[j] = t.charAt(j);
     }

     Arrays.sort(nums1); 
     Arrays.sort(nums2);
     if(nums1.length == nums2.length)
     {
     for(int i=0, j=0; i<nums1.length && j<nums2.length; i++,j++)
     {
        if(nums1[i] != nums2[j])
        return false;
     }
     
     return true;
     }
     else
     return false;
    }
}
