public int divide(int dividend, int divisor) {
    if(dividend == Integer.MIN_VALUE && divisor == -1){
        return Integer.MAX_VALUE;
    }
    if(dividend == Integer.MIN_VALUE && divisor == 1){
        return Integer.MIN_VALUE;
    }
    
    int quotient = 0;
    int upper = dividend;
    int lower = divisor;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    
    while(dividend - divisor >= 0){
        int currentPow = 0;
        while(dividend - (1 << currentPow)*divisor >= 0){
            currentPow++;
        }
        quotient += (1 << currentPow-1);
        dividend -= (1 << currentPow-1)*divisor;
    }
    return ((upper < 0 && lower < 0) || (upper > 0 && lower > 0))?
    quotient :
    -1*quotient;
    
}