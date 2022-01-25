class Solution {
    public int firstUniqChar(String s) {
        
        //easy problem
        //just get the frequnecy and travel the string which have 1 freqeuncy
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
              char ch=s.charAt(i);
              if(map.get(ch)==1)
                  return i;
                  
        }
        return -1;
    }
}