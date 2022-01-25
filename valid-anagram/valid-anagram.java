class Solution {
    public boolean isAnagram(String s, String t) {
        
        //we can use one hashmap
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if(map.containsKey(ch))
            {
                int freq=map.get(ch);
                if(freq==1)
                     map.remove(ch);
                else 
                {
                    map.put(ch,freq-1);
                }
            }
            else 
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==0)
            return true;
        else 
            return false;
        
    }
}