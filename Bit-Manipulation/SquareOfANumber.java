public static int calculateSquare(int num) {
    num = Math.abs(num);
    int temp = num;
    int ans = 0;
    int i = 0;
    while(temp > 0){
        if((temp & 1) != 0){
            ans += (num << i);
        }
        temp = (temp>>1);
        i++;
    }
    
    return ans;
}