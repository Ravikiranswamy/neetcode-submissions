class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j,maxlength=0,length=0;
        HashSet<Character> set = new HashSet<>();
        i=0;
        j=0;
      while(j<s.length())
      {
        if(!set.contains(s.charAt(j)))
        {
            set.add(s.charAt(j));
            length++;
        }
        else
        {
            while(i<j)
            {
                if(s.charAt(j)==s.charAt(i))
                {
                    set.remove(s.charAt(i));
                    i++;
                    set.add(s.charAt(j));
                    break;
                }
                else
                {   set.remove(s.charAt(i));
                    i++;
                    length--;
                    
                }
            }
        }
        maxlength=Math.max(maxlength,length);
        j++;
      }
      return maxlength;
    }
}
