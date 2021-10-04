static class Pair {
    int min;
    int max;

    Pair(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }
}

static Pair getMinMax(int arr[], int n) {
    Pair minmax = new  Pair();

    for(int i : arr){
        minmax.min = Math.min(i, minmax.min);
        minmax.max = Math.max(i, minmax.max);
    }
    
    return minmax;
}
