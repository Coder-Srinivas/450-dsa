public static int countSetBits(int n){
    
    // 01   ->  1
    // 10   ->  2
    // 11   ->  3
    // 100  ->  4
    // 101  ->  5
    // 110  ->  6
    // 111  ->  7
    if(n <= 1){
        return n;
    }
    
    int pow = get2Pow(n);
    
    return (int)(Math.pow(2, pow-1))*pow + (n + 1 - (int)(Math.pow(2, pow))) + 
    countSetBits(n - (int)(Math.pow(2, pow)));
}

public static int get2Pow(int n){
    
    int pow = 0;
    while((1 << pow) <= n){
        pow++;
    }
    return pow-1;
}