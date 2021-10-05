static int minJumps(int[] arr){
    int i = 0;
    int n = arr.length;
    int steps = 0;
    int max = arr[0];
    while(i < n){
        steps++;
        
        if(max >= n){
            return steps;
        }

        int prev = max;
        for(int x=i; x<=prev; x++){
            max = Math.max(max, x + arr[x]);
        }
        if(max == prev){
            return -1;
        }

        i=prev+1;
    }

    return steps;
}