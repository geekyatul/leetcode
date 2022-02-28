class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> listString=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
             String ans="";
              int num=nums[i];
             ans=ans+num;
             int flag=0;
             while(i+1<nums.length && nums[i+1]==num+1)
             {
                 num=nums[i+1];
                 i++;
                 flag=1;
                 
             }
             if(flag==0)
             {
                 listString.add(ans);
             }
             else
             {
                 listString.add(ans+"->"+num);
             }
             
         }
        return listString;
        
    }
}