class Solution {
    public int hammingDistance(int x, int y) {
        
        int count=0;
        for(int i=0;i<32;i++)
        {    
               int num1=(x>>i & 1);
               int num2=(y>>i & 1);
            System.out.println(num1+" "+ num2);
              if((num1 ^ num2)==1)
                  count++;
        }
        return count;
        
    }
}