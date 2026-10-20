class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
int i,j;
i=m;j=0;

while(i<m+n && j<n)
{
nums1[i] = nums2[j];
i++;
j++;
}
Arrays.sort(nums1);

    }
}