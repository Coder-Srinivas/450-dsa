public static int countBitsFlip(int a, int b){
    int ans = 0;
    for(int i=0; i<32; i++){
        int aBit = (a>>i)&1;
        int bBit = (b>>i)&1;
        
        if(aBit != bBit){
            ans++;
        }
    }
    return ans;
}