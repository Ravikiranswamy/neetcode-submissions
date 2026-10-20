class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int minbuy=prices[i];
        int maxp=0,p=0;
        int sellday=0;

        for(i=0; i<prices.length; i++)
        {
            if(prices[i]<minbuy)
            {
                minbuy=prices[i];
            }
            p=prices[i]-minbuy;
            
            
                if(maxp < p)
                {
                    maxp=p;
                
                }

            
        }
        return maxp;
        }
    }

