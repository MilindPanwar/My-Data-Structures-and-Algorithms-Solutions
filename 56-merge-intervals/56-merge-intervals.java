class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> result= new ArrayList<>();
        
        if(intervals==null |intervals.length==0){
            return result.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        //initialising pairs
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] i : intervals){
            if(i[0]<=end){
                //entered here to merge values
                end=Math.max(end,i[1]);
            }else{
                //entered here cuz no merge needed
                result.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[0][]);
        
    }
}