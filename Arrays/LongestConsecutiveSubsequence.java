static int findLongestConseqSubseq(int arr[], int N){
	    
    Arrays.sort(arr);
    int current = 1;
    int max = 1;
    for(int i=1; i<N; i++){
        if(arr[i]-1 == arr[i-1] || arr[i-1] == arr[i]){
            if(arr[i]-1 == arr[i-1])
            current++;
        }else{
            current=1;
        }
        max = Math.max(max, current);
    }
    return max;
 }
 