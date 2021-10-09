public long findMinDiff (ArrayList<Long> a, long n, long m){

    Collections.sort(a);
    long diff = Integer.MAX_VALUE;
    for(int i=0; i<=n-m; i++){
        diff = Math.min(diff, a.get((int)(i+m-1)) - a.get(i));
    }
    
    return diff;
}