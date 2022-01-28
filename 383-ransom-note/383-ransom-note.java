class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            if(map.containsKey(ch))
            {
                 if(map.get(ch)==1)
                     map.remove(ch);
                else 
                    map.put(ch,map.get(ch)-1);
            }
        }
        
        if(map.size()>0)
            return false;
        else 
            return true;
    }
}