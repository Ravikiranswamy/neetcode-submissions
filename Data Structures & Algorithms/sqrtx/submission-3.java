class Solution {
    public int mySqrt(int x) {
    long pro;
    int i=0;
    while(true)
    {
       pro = (long)i*i;
       if(pro == x)
       {
        return i;
       }
       if(pro > x)
       {
        return i-1;
       }
       i++;
    }

    }
}