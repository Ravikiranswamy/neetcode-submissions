class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int i=0,j,k=0;

        for(k=0; k<s1.length(); k++)
        {
            char ch = s1.charAt(k);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(j=0; j<s2.length(); j++)
        {
            char ch = s2.charAt(j);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(j-i+1 > s1.length())
            {
                char lastch = s2.charAt(i);
                map2.put(lastch,map2.get(lastch)-1);

                if(map2.get(lastch) == 0)
                {
                    map2.remove(lastch);
                }
                i++;
            }

            if(j-i+1 == s1.length())
            {
                if(map1.equals(map2))
                {
                    return true;
                }
            }

        }
        return false;
    }
}
