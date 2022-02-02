class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        //problem identification -- frequency means hashmap
        //I have to check every length of p it seems to sliding window fixed sized 
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        List<Integer> ansList=new ArrayList<>();
        
        for(int i=0;i<p.length();i++)
        {
             char ch=p.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        
        //now we will use fixed sized sliding window 
        //first write the approach in copy then write in the code 
        
        int start=0;
        int end=0;
        while(end<s.length())
        {
            char ch=s.charAt(end);
            if(end-start+1<p.length())
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            else if(end-start+1==p.length())
            {
                //adding new character
                 map2.put(ch,map2.getOrDefault(ch,0)+1);
               // System.out.println(map1+" "+map2);
                if(map1.equals(map2))
                     ansList.add(start);
                
                //removing the start
                char startChar=s.charAt(start);
                 int freq=map2.get(startChar);
                if(freq>1)
                    map2.put(startChar,map2.get(startChar)-1);
                else 
                    map2.remove(startChar);
                start++;
                
            }
            end++;
        }
            
        return ansList;
        
        
    }
}