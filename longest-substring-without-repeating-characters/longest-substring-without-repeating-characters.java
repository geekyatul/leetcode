class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //This problem based on sliding window algorithm 
        //I will using hashset that follow the uniqueness
        
        if(s.length()==0)
            return 0;
          int start=0;
          int travel=0;
        int max=1;
        HashSet<Character> set=new HashSet<>();
        while(travel<s.length())
        {
            char ch=s.charAt(travel);
            if(!set.contains(ch))
            {
                set.add(ch);
                travel++;
                max=Math.max(max,travel-start);
            }
               
            else
            {
                
                while(set.contains(ch))
                {
                    set.remove(s.charAt(start));
                    start++;
                }
            }
        }
        return max;
    }
}