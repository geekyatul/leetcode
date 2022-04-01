class Solution {
    public String reverseVowels(String s) {

        int start=0;
        int end=s.length()-1;
        char ch[]=s.toCharArray();
        //System.out.println(ch);    
        while(start<end)
        {
            
            while(start<end && !isVowel(ch[start]))
            {
                System.out.println("start" + ch[start]);
                start++;
            }
            while(start<end && !isVowel(ch[end]))
            {
                System.out.println("end" + ch[end]);
                end--;
            }
            System.out.println(ch[start]+" " + ch[end]);
            swap(ch,start,end);
            System.out.println("after swapping string will be " + ch);
            start++;
            end--;
            
        }
        
        return String.valueOf(ch);
    }
    
    public boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
             return true;
        else 
           return false;
    }
    
    public void swap(char ch[],int start,int end)
    {
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        
    }
}