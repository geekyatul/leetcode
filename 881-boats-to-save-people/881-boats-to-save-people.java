class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int count=0;
        //The idea to take maximum weight person and low weight person
        
        int start=0;
        int end=people.length-1;
        while(start<=end)
        {
            if(people[start]+people[end]<=limit)
            {
                start++; //it means smaller weight person can also come 
            }
            
            count++;
            end--; //because we have to take end with or not with smaller weight 
        }
        
        return count;
    }
}