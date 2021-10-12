static int findPosition(int N) {
    int ans = 0;
    if(N == 0){
        return -1;
    }
    while(N > 0){
        if(N % 2 != 0 && N != 1){
            return -1;
        }
        N/=2;
        ans++;
    }
    return ans;
}