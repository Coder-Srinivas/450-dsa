int getPairsCount(int[] arr, int n, int k) {
        
    HashMap<Integer, Integer> map = new HashMap<>();
    int ans = 0;
    for(int i=0; i<n; i++){
        int c = map.getOrDefault(arr[i], 0);
        c++;
        map.put(arr[i], c);
    }
    
    for(int i=0; i<n; i++){
        int current = arr[i];
        int req = k - arr[i];
        
        int count = map.getOrDefault(req, 0);
        if(req == current){
            count--;
        }
        ans += count;
    }
    
    return ans/2;
}public class CountPairsWithGivenSum {
    
}
