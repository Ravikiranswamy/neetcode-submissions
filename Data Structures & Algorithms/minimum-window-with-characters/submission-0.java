class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0,length=0,k;
        int minlength = Integer.MAX_VALUE;
        int start=0;

     for(k=0; k<t.length(); k++)
       {     char ch = t.charAt(k);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int need = map.size();
        int have=0;

    while(j<s.length())
        {   char ch = s.charAt(j);
            window.put(ch,window.getOrDefault(ch,0)+1);

            if(map.containsKey(ch)&& window.get(ch).equals(map.get(ch)))
            {
                have++;
            }
            if(have == need)
            {
                length=j-i+1;
            }

            while(have == need)
            {  
                 if(minlength > j-i+1)
            {
                minlength = j-i+1;
                start=i;
            }
                
                
                 char ch1 = s.charAt(i);
                window.put(ch1,window.getOrDefault(ch1, 0)-1);
                
                
                if(map.containsKey(ch1) && window.get(ch1) < map.get(ch1))
                {
                    have--;
                }
                i++;
            }


            
            j++;
        }
        if(minlength == Integer.MAX_VALUE)
        return "";

        return s.substring(start,start+minlength);
    }
}
