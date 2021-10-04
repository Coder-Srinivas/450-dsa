public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    PriorityQueue<Integer> q = new PriorityQueue<>();
    
    for(int i : arr){
        q.add(i);
    }
    int ans = 0;
    while(k-- > 0 && q.size() > 0){
        ans = q.poll();
    }
    
    return ans;
} 