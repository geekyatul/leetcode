class Solution {
    public int addDigits(int num) {
        
         while(num>=10)
         {
             int temp=num;
             int sum=0;
             while(temp>0)
             {
                 int rem=temp%10;
                 sum=sum+rem;
                 temp=temp/10;
                 
             }
             num=sum;
         }
        return num;
        
    }
}