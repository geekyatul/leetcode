class Solution {
    public int[][] merge(int[][] intervals) {
        //First sort on basis of 
        //1 sort on basic of first and second 
        //2.how to store the ans 
        //3.which data structuture to use to solve the problem 
        //I have seend people used pair to use the elment 
        
        //I will store in arraylist of array
        //how we we are defining the size of arrayList
        
        ArrayList<int []> list=new ArrayList<>();
        
        ///First sort on the basis of start time
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        
        //now we will traverse over the intervals
        
        for(int[] interval:intervals)
        {
            //first we will check list is empty or not
            if(list.size()==0)
                list.add(interval);
            else
            {
                //here we will decide to merge or not 
                int prevInterval[]=list.get(list.size()-1);
                System.out.println(prevInterval);
                if(interval[0]<=prevInterval[1])
                {
                    //this is condition of merging 
                    prevInterval[1]=Math.max(interval[1],prevInterval[1]);
                }
                else
                {
                    list.add(interval);
                }
                
                
            }
        }
        return list.toArray(new int[list.size()][]);
        
        
        
        
        
        
        
    }
}

//How  t