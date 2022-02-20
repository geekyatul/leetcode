class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Stack<Pair> stack=new Stack<>();
        
        Arrays.sort(intervals,(a,b)->{
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });
        
        for(int i=0;i<intervals.length;i++)
        {
            System.out.println(intervals[i][0]+" "+ intervals[i][1]);
        }
        
        stack.push(new Pair(intervals[0][0],intervals[0][1]));
        
        for(int i=1;i<intervals.length;i++)
        {
            Pair st=stack.peek();
            if(st.start<=intervals[i][0] && intervals[i][1]<=st.end)
                continue;
            else
            stack.push(new Pair(intervals[i][0],intervals[i][1]));
        }
        
        
        return stack.size();
        
        
    }
}

class Pair
{
    int start;
    int end;
    
    public Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}