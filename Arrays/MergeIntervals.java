public int[][] merge(int[][] intervals) {
        
    int i = 0;
    int x = 0;
    Arrays.sort(intervals, new Comparator<int[]>() {
        
        @Override
        public int compare(int[] entry1, int[] entry2) {
            int start1 = entry1[0];
            int start2 = entry2[0];
            
            if(start1 > start2){
                return 1;
            }else if(start1 == start2){
                return 0;
            }else return -1;
        }
    });

    while(i < intervals.length){
        int end = intervals[i][1];
        int start = intervals[i][0];
        int temp = start;
        while(end >= start && i<intervals.length){
            start = intervals[i][0];
            if(end >= start){
                end = Math.max(end, intervals[i][1]);
            }else{
                break;
            }
            i++;
        }

        x++;
    }
    int[][] ans = new int[x][2];
    x = 0;
    i = 0;
    while(i < intervals.length){
        int end = intervals[i][1];
        int start = intervals[i][0];
        int temp = start;
        while(end >= start && i<intervals.length){
            start = intervals[i][0];
            if(end >= start){
                end = Math.max(end, intervals[i][1]);
            }else{
                break;
            }
            i++;
        }
        ans[x][0] = temp;
        ans[x][1] = end;
        x++;
    }
    return ans;
}