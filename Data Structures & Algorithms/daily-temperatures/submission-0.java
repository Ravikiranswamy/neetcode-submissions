class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        int i=0; int j,k;
        for(k=0; k<temperatures.length; k++)
        {
            result[k]=0;
        }
        for(i=0;i<temperatures.length; i++)
        {    j=i+1;
             
            while(j<temperatures.length)
            {
                if(temperatures[i]<temperatures[j])
                {
                    result[i] = j-i;
                    break;
                }
                j++;
            }
        }
        return result;
    }
}
