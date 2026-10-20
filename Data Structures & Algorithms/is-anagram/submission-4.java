class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer>map1= new HashMap<>();
      HashMap<Character,Integer>map2= new HashMap<>();

      for(int i=0; i<s.length(); i++)
      {   
         char ch = s.charAt(i);
         if(map1.containsKey(ch))
         {   int oldcount=map1.get(ch);
            map1.put(ch,oldcount+1);
         }
         else
         map1.put(ch,1);
      }
      for(int i=0; i<t.length(); i++)
      {    
         char ch = t.charAt(i);
         if(map2.containsKey(ch))
         {   int oldcount=map2.get(ch);
            map2.put(ch,oldcount+1);
         }
         else
         map2.put(ch,1);
      }
      if(s.length()!=t.length())
      {
         return false;
      }
      else
      {
      for(int i=0; i<s.length(); i++)
      {
         char ch = s.charAt(i);
         if(map2.containsKey(ch))
         {
           if(map1.get(ch).equals(map2.get(ch)))
         {
            continue;
         }
         else
         return false;
         }
         else
         {
            return false;
         }
      }
      return true;
      }
         
      
    }
}
