class Solution {
    public boolean isPalindrome(String s) {
        int i,j;
        char ch1,ch2;
        i=0;j=s.length()-1;
        while(i<s.length() && j>=0)
        { 
              
        
            while(i<=j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            while(i<=j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }

               if(i>j)
        {
            break;
        }
        
            ch1=Character.toLowerCase(s.charAt(i));
            ch2=Character.toLowerCase(s.charAt(j));
            if(ch1!=ch2)
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
